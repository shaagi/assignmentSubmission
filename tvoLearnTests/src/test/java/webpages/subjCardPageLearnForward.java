package webpages;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class subjCardPageLearnForward {
	private WebDriver driver;
	

	// 'Resources for Learning' quick link Button
	@FindBy(how = How.LINK_TEXT, using = "Resources for Learning")
	private WebElement quickLinkButton;
	
	// 'third tab from the left button
	@FindBy(how = How.ID, using = "tab2")
	private WebElement tab2LearningActivity;
	
	// after clicking on k-8 -> grade 7 -> language -> writing tab the first learning activity
	// is 'Procedural Writing'. Button for that
	@FindBy(how = How.LINK_TEXT, using = "Procedural Writing")
	private WebElement learningActivity1UnderWritingButton;
	
	// button for first video among several videos displayed at the bottom
	@FindBy(xpath = "(//p[@class='title'])[1]")
	private WebElement firstMediaLiteracyVideoButton;
	
	//Constructor 
	public subjCardPageLearnForward(WebDriver driver) {
		this.driver = driver;
		//Initialize Elements
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnQuickLink() {
		quickLinkButton.click();
	}
	
	public void clickOnTabAndSelectLearningActivity() {		
		tab2LearningActivity.click();
		//perhaps put an explicit wait here that waits for learningActivity1.. button to show
		Assert.assertTrue(learningActivity1UnderWritingButton.getText().toString().contains("Procedural Writing"));
		learningActivity1UnderWritingButton.click();
	}
	
	public void clickOnVideo() {
		firstMediaLiteracyVideoButton.click();
	}
}
