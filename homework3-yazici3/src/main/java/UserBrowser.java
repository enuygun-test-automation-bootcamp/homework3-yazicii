import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UserBrowser {

    public static void main(String[] args) {
        Utility.setDriverProps(DriverType.CHROME);
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("user-data-dirC:\\Users\\Monster\\AppData\\Local\\Google\\Chrome\\User Data");
        WebDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://www.enuygun.com/");
        System.out.println(chromeDriver.getTitle());

    }
}
