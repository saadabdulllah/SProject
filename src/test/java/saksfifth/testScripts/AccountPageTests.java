package saksfifth.testScripts;

import saksfifth.framework.base.ScriptBase;

import org.testng.annotations.Test;
import saksfifth.framework.utils.Helper;


public class AccountPageTests extends ScriptBase{

    @Test
    public void accountPageTest(){
        saksFifth.homepage().naviageteToHomepage();
        saksFifth.homepage().varifyHomepage();
        saksFifth.homepage().closePopup();
        saksFifth.accountPage().createNewAccount (  "Zakir",
                                                    "Khan",
                                                    "abid@gmail.com",
                                                    "!Password1",
                                                    "!Password1",
                                                    "516-453-8976",
                                                    "12040"
                                                        );


    }


}
