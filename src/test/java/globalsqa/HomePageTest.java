package globalsqa;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends CommonApi {
    @Test
    public void HomePageTest(){
        hoverOver("//*[@id=\"menu-item-1513\"]/a");
        String expectedResult = "";
        String actualResult = getElementText("//*[@id=\"logo\"]/div/a/img");
        Assert.assertEquals(expectedResult, actualResult);
    }
}
