package globalsqa;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePickerTest extends CommonApi {

    @Test
    public void DatePickerTest(){

        hoverOver("//*[@id=\"post-2715\"]/div[2]/div/div/div[2]/div[3]/ul/li[5]/a");
        String expectedResult="";
        String actualResult = getElementText("//*[@id=\"logo\"]/div/a/img");
        Assert.assertEquals(expectedResult,actualResult);

    }
}
