package globalsqa;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends CommonApi{

    @Test
    public void DropDownTest(){
        hoverOver("//*[@id=\"post-2715\"]/div[2]/div/div/div[2]/div[2]/ul/li[6]/a");
        //selectFromDropdown("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select", "Bangladesh");
        //
        String expectedResults="";
        String actualResult = getElementText("//*[@id=\"logo\"]/div/a/img");
        Assert.assertEquals(expectedResults,actualResult  );


    }
}
