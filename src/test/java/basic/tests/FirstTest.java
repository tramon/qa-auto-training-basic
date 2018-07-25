package basic.tests;

import basic.Locators;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.containsString;


public class FirstTest {

    private WebDriver driver;

    public FirstTest() {
        //        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void verifySearchQueryOnUi() {
        driver.get("https://google.com.ua");
        driver.findElement(By.id(Locators.SEARCH_INPUT_ID)).clear();
        driver.findElement(By.id(Locators.SEARCH_INPUT_ID)).sendKeys("Hello World");
        driver.findElement(By.id(Locators.SEARCH_INPUT_ID)).sendKeys(Keys.ENTER);
        WebElement firstLink = driver.findElements(By.xpath(Locators.FIRST_LINK_WITH_TEXT_HELLO_WORLD)).get(0);
        Assert.assertThat("Page does not contain string Hello", firstLink.getText(), containsString("Hello"));
        Assert.assertThat("Page does not contain string World", firstLink.getText(), containsString("World"));
    }


}
