package saksfifth.testScripts;

import org.testng.annotations.Test;
import saksfifth.framework.base.ScriptBase;


public class HomepageTests extends ScriptBase {

    @Test
    public void navigateHomepageTest(){
        saksFifth.homepage().naviageteToHomepage();
        saksFifth.homepage().varifyHomepage();
        saksFifth.homepage().closePopup();
    }

    @Test

    public void navigatetoProductPages(){
        saksFifth.homepage().naviageteToHomepage();
        saksFifth.homepage().varifyHomepage();
        saksFifth.homepage().closePopup();
        saksFifth.homepage().navigateToProductPages("SHOES", "Iconic Shoes");
        saksFifth.homepage().validateProductPage("ICONIC SHOES");
    }

    @Test
    public void navigatetoProductPages2(){
        saksFifth.homepage().naviageteToHomepage();
        saksFifth.homepage().varifyHomepage();
        saksFifth.homepage().closePopup();
        saksFifth.homepage().navigateToProductPages("HANDBAGS", "Shop All Handbags");
        saksFifth.homepage().validateProductPage("Shop All");
    }

    @Test
    public void test1(){
        saksFifth.homepage().naviageteToHomepage();
        saksFifth.homepage().varifyHomepage();
        saksFifth.homepage().closePopup();
        saksFifth.homepage().navigateToProductPages("SHOES", "Exotics");
        saksFifth.homepage().validateProductPage("EXOTICS");
        saksFifth.productArrayPage().clickFirstItem();
    }

    @Test
    public void submenuLinksTest(){
        saksFifth.homepage().naviageteToHomepage();
        saksFifth.homepage().varifyHomepage();
        saksFifth.homepage().closePopup();
        saksFifth.homepage().linkCheck();
        //saksFifth.homepage().checkSubmenuLinks("DESIGNERS");
    }
}
