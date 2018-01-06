package saksfifth.framework.base;

import com.paxovision.execution.reporter.listener.ReporterTestListener;
import com.paxovision.execution.reporter.service.ReporterService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import saksfifth.framework.extendReport.ExtentTestNGITestListener;
import saksfifth.framework.utils.ApplicationFactory;
import saksfifth.framework.utils.DriverFactory;
import saksfifth.framework.utils.ExplicitWaitUtils;

import java.util.concurrent.TimeUnit;

/** Extend Report Listener*/
//@Listeners({ExtentTestNGITestListener.class})

/** Paxo report Listener*/
@Listeners({ReporterTestListener.class, ExtentTestNGITestListener.class})
public class ScriptBase {

    protected ReporterService reporter = ReporterService.reporter();
    protected ApplicationController saksFifth;

    @BeforeClass
    public void beforeClass(){

    }

    @BeforeMethod
    public void setup(){
        DriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        DriverFactory.getInstance().getDriver().manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        DriverFactory.getInstance().getDriver().manage().window().maximize();
        saksFifth = ApplicationFactory.getInstance().getApplicationController();

        reporter.setReportPath(System.getProperty("user.dir") + "/test-output/htmlReport/");
        reporter.setReportName("Saks Fifth Avenue Report");
        reporter.setReportTitle("Saks Fifth Functional Test");
        reporter.setCreateUniqueFileName(true);

    }

    @AfterMethod
    public void teardown(){
        //DriverFactory.getInstance().closeDriver();
        //DriverFactory.getInstance().quitDriver();
        //ApplicationFactory.getInstance().remove();
        //saksFifth = null;

    }
}

