import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

public class Dom4jTest {
    @Test
    public void dom4jTest() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document dom = saxReader.read("lib/books.xml");
        System.out.println(dom);
    }
    
    @Test
    public void dom4jTest1() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document dom = saxReader.read("books.xml");
        Element rootElement = dom.getRootElement();
        List<Element> books = rootElement.elements("book");
        for (Element book:books) {
//            Element nameElement = book.element("name");
            String name = book.elementText("name");
            String price = book.elementText("price");
            String author = book.elementText("author");
            String sn = book.attributeValue("sn");
            double dp = Double.parseDouble(price);
            Books books1 = new Books(sn, name, author, dp);
            System.out.println(books1);

        }

    }
}
