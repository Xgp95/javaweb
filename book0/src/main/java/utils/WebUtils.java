package utils;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

/**
 * @author: Xugp
 * @date: 2022/1/27 17:21
 * @description:
 */
public class WebUtils {
    public static <T> T copyParamToBean(T bean, Map map) {
        try {
            BeanUtils.populate(bean, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    public static Integer parseInt(String str, Integer defaultValue) {
        if (str != null) {
            int i = Integer.parseInt(str);
            return i;
        }

        return defaultValue;
    }
}
