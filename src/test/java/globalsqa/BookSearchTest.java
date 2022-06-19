package globalsqa;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookSearchTest extends CommonApi {


    @Test
    public void BookSearchTest(){
        type("//*[@id=\"s\"]", "Free Ebooks");
        click("//*[@id=\"subheader\"]/div/div/div[1]/form/button");
        String expectedBookTitle = "Free Ebooks";
        String actualResult = getElementText("//*[@id=\"wrapper\"]/div[1]/div[2]/div/div[2]/ol/li[1]/div/h3/a");
        Assert.assertEquals(expectedBookTitle, actualResult);
    }
}
