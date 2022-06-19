package globalsqa;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends CommonApi {

    @Test
    public void ContactUsTest(){
        hoverOver("//*[@id=\"menu-item-1561\"]/a");
        String expectedResult = "";
        String actualResult = getElementText("//*[@id=\"logo\"]/div/a/img");
        Assert.assertEquals(expectedResult, actualResult);
    }
}
