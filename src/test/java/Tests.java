import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.testng.annotations.*;
import pages.*;
import utils.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static com.codeborne.selenide.Selenide.open;

public class Tests {
    Faker faker = new Faker();

    private static final Logger log = LogManager.getLogger(Tests.class);
    @BeforeClass
    public void setUp() throws Exception {
        Configuration.holdBrowserOpen = false;
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
    }

    @BeforeTest
    public void beforeTest() {
        log.info("staring test");
    }

    @Test(enabled = true, priority = 1, description = "Wyszukiwanie")


    public void test001() throws Exception {


        log.info("1. Przejscie na strone logowania");
        open(Constants.testurl);
        //getWebDriver().manage().window().maximize();

        new HomePage().login("login","pass");
        Thread.sleep(2000);
    }

    @AfterTest
    public void afterTest() {
        log.info("test end");
    }

    @AfterClass
    public void afterClass() {
        log.info("all tests end");
    }

}
