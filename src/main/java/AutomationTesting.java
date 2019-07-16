import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class AutomationTesting {

	public void runner() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("DemoSalesManager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();
		// driver.navigate().back();
		driver.findElementById("label").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("altimetrik");
		driver.findElementById("createLeadForm_firstName").sendKeys("Nandhini");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kuppusamy");
		/*
		 * WebElement month = driver.findElementById("month");
		 * 
		 * Select dropdown=new Select(month);
		 * 
		 * dropdown.selectByVisibleText("Mar"); Thread.sleep(2000);
		 * dropdown.selectByValue("5"); Thread.sleep(2000); dropdown.selectByIndex(8);
		 */

		WebElement createLeadForm_dataSourceId = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(createLeadForm_dataSourceId);
		dropdown.selectByVisibleText("Cold Call");

		WebElement createLeadForm_marketingCampaignId = driver.findElementById("createLeadForm_marketingCampaignId");
		Select createLeadForm_marketingCampaignIdDrop = new Select(createLeadForm_marketingCampaignId);
		createLeadForm_marketingCampaignIdDrop.selectByVisibleText("Affiliate Sites");

		WebElement createLeadForm_industryEnumId = driver.findElementById("createLeadForm_industryEnumId");
		Select createLeadForm_industryEnumIddropdown = new Select(createLeadForm_industryEnumId);
		createLeadForm_industryEnumIddropdown.selectByVisibleText("Aerospace");
		
		
		driver.findElementByName("submitButton").click();
		
		
		
		
		

	}

}
