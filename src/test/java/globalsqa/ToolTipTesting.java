package globalsqa;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTipTesting extends CommonApi {

    @Test
    public void ToolTipTesting(){

        hoverOver("//*[@id=\"post-2715\"]/div[2]/div/div/div[2]/div[1]/ul/li[4]/a");
        String expectedResult = "";
        String actualResult = getElementText("//*[@id=\"logo\"]/div/a/img");
        Assert.assertEquals(expectedResult, actualResult);
    }
}
