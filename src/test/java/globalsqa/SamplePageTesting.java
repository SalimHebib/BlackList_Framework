package globalsqa;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SamplePageTesting extends CommonApi {

    @Test
    public void SamplePageTesting(){
        hoverOver("//*[@id=\"post-2715\"]/div[2]/div/div/div[2]/div[4]/ul/li[2]/a");
        String expectedResult = "";
        String actualResult = getElementText("//*[@id=\"logo\"]/div/a/img");
        Assert.assertEquals(expectedResult, actualResult);
    }
}
