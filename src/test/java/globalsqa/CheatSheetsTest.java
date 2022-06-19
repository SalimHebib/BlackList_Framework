package globalsqa;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheatSheetsTest extends CommonApi {
    @Test
    public void CheatSheetsTest(){
        hoverOver("//*[@id=\"menu-item-6898\"]/a");
        String expectedResult = "";
        String actualResult = getElementText("//*[@id=\"logo\"]/div/a/img");
        Assert.assertEquals(expectedResult, actualResult);
    }
}
