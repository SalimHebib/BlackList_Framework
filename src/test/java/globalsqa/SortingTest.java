package globalsqa;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingTest extends CommonApi {

    @Test
    public void SortingTest(){
        hoverOver("//*[@id=\"post-2715\"]/div[2]/div/div/div[2]/div[3]/ul/li[2]/a");
        String expectedResult = "";
        String actualResult = getElementText("//*[@id=\"logo\"]/div/a/img");
        Assert.assertEquals(expectedResult, actualResult);


    }
}
