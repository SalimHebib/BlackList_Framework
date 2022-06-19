package globalsqa;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends CommonApi {

    @Test
    public void SliderTest(){
        hoverOver("//*[@id=\"post-2715\"]/div[2]/div/div/div[2]/div[1]/ul/li[3]/a");
        String expectedResult = "";
        String actualResult = getElementText("//*[@id=\"logo\"]/div/a/img");
        Assert.assertEquals(expectedResult, actualResult);


    }
}
