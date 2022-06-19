package globalsqa;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DialogBoxTesting extends CommonApi {
    @Test
    public void DialogBoxTesting() {
        hoverOver("//*[@id=\"post-2715\"]/div[2]/div/div/div[2]/div[1]/ul/li[6]/a");
        String expectedResult = "";
        String actualResult = getElementText("//*[@id=\"logo\"]/div/a/img");
        Assert.assertEquals(expectedResult, actualResult);
    }
}