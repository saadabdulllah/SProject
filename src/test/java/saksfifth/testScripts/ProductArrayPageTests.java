package saksfifth.testScripts;

import org.testng.annotations.Test;
import saksfifth.framework.base.ScriptBase;


public class ProductArrayPageTests extends ScriptBase {

    @Test
    public void test1(){
        saksFifth.homepage().naviageteToHomepage();
        saksFifth.homepage().varifyHomepage();
        saksFifth.homepage().closePopup();
        saksFifth.homepage().navigateToProductPages("MEN", "Apparel".toUpperCase());
        saksFifth.homepage().validateProductPage("SHOP ALL");
        saksFifth.productArrayPage().clickFirstItem();
        saksFifth.productDetailPage().validateFirstItem();
    }

    @Test
    public void test2(){
        saksFifth.homepage().naviageteToHomepage();
        saksFifth.homepage().varifyHomepage();
        saksFifth.homepage().closePopup();
        saksFifth.homepage().search("0402262675604");
        saksFifth.productDetailPage().addToBag();
        saksFifth.productDetailPage().addToShoppingBag();
        saksFifth.bagPage().clickCheckout();

        //0475788624012
    }

    @Test
    public void test3(){
        saksFifth.homepage().naviageteToHomepage();
        saksFifth.homepage().varifyHomepage();
        saksFifth.homepage().closePopup();
        saksFifth.homepage().search("0475788624012");


        //0475788624012
        //0402288171661
    }

    @Test
    public void test4(){
        saksFifth.homepage().naviageteToHomepage();
        saksFifth.homepage().varifyHomepage();
        saksFifth.homepage().closePopup();
        saksFifth.homepage().search("0402229864423");
        saksFifth.productDetailPage().addToBag();
        saksFifth.bagPage().clickCheckout();
    }
}
