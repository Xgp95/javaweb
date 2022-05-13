import org.junit.Test;

import java.util.Locale;
import java.util.Set;

/**
 * @author: Xugp
 * @date: 2022/3/8 10:19
 * @description:
 */
public class I18n {
    @Test
    public void i18nTest(){
        Locale locale = Locale.getDefault();
        System.out.println(locale);
//        String language = locale.getLanguage();
//        System.out.println(language);
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (Locale availableLocale : availableLocales) {
            System.out.println(availableLocale);
        }
    }
}
