package globalsqa;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccordionTest extends CommonApi {



        @Test
        public void AccordionTest (){
            hoverOver("//*[@id=\"post-2715\"]/div[2]/div/div/div[2]/div[2]/ul/li[4]/a");
            String expectedResult = "";
            String actualResult = getElementText("//*[@id=\"logo\"]/div/a/img");
            Assert.assertEquals(expectedResult, actualResult);
        }
}
