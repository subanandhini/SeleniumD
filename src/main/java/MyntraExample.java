import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/selectable/");

		driver.manage().window().maximize();
		WebElement frameElement = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frameElement);
		Actions builder=new Actions(driver);
		builder.keyDown(Keys.CONTROL);
		builder.click().click();

	}

}
