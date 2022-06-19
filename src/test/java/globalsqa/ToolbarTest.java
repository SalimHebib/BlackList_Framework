package globalsqa;
import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolbarTest extends CommonApi {

    @Test
    public void ToolbarTest() {
        hoverOver("//*[@id=\"post-2715\"]/div[2]/div/div/div[2]/div[3]/ul/li[4]/a");
        //click("//*[@id=\"zoom-button\"]/span[2]");
        //click("//*[@id=\"ui-id-6\"]");
        String expectedResult = "";
        String actualResult = getElementText("//*[@id=\"logo\"]/div/a/img");
        Assert.assertEquals(expectedResult, actualResult);
    }

}
