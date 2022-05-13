package utils;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;


public class JdbcUtils {

    private static DruidDataSource dataSource;
    private static ThreadLocal<Connection> connectionThreadLocal = new ThreadLocal<>();

    @Test
    public void connTest() {
//        System.out.println(JdbcUtils.getConnection());
        System.out.println(JdbcUtils.class.getResource("/").getPath());

    }

    static {
        try {
            Properties properties = new Properties();
            // 读取 jdbc.properties属性配置文件
            InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
//            InputStream inputStream = ClassLoader.getSystemResourceAsStream("jdbc.properties");
//            InputStream inputStream = new FileInputStream(JdbcUtils.class.getResource("/").getPath() + "jdbc.properties");

//            System.out.println(inputStream);
            // 从流中加载数据
            properties.load(inputStream);
            // 创建 数据库连接 池
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 提交事务并且关闭
     */
    public static void commitAndClose() {
        Connection conn = connectionThreadLocal.get();
        if (conn != null) {
            try {
                conn.commit();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        connectionThreadLocal.remove();
    }

    /**
     * 回滚事务并且关闭
     */
    public static void rollbackAndClose() {
        Connection conn = connectionThreadLocal.get();
        if (conn != null) {
            try {
                conn.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        connectionThreadLocal.remove();
    }

    /**
     * 获取数据库连接池中的连接
     *
     * @return 如果返回null, 说明获取连接失败<br />有值就是获取连接成功
     */
    public static Connection getConnection() {

        Connection conn = connectionThreadLocal.get();

        if (conn == null) {
            try {
                conn = dataSource.getConnection();
                connectionThreadLocal.set(conn);
                conn.setAutoCommit(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    /**
     * 关闭连接，放回数据库连接池
     *
     * @param conn
     */
    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
