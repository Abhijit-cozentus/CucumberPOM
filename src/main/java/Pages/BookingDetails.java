package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BookingDetails {

	private WebDriver driver;
	JavascriptExecutor jse = (JavascriptExecutor)driver;

	private By agent = By.xpath("//input[@data-placeholder='Agent']");
	private By pol = By.xpath("//input[@data-placeholder='POL']");
	private By pod = By.xpath("//input[@data-placeholder='POD']");
	private By incoTerm = By.xpath("//components-generic-select[@placeholder='Inco Term']");
	private By saveBtn = By.xpath("//div[@fxlayout='row']//div[1]//button[1]");
	private By sailingIcon = By.xpath("//mat-icon[normalize-space()='directions_boat']");
	private By addNewSailing = By.xpath("//div[contains(text(),'Add new')]");
	private By vessel = By.xpath("//input[@data-placeholder='Vessel']");
	private By voyage = By.xpath("//input[@id='voyage']");
	private By carrier = By.xpath("//input[@data-placeholder='Carrier']");
	private By ETD = By.xpath("//control-date-picker[@placeholder='ETD']//input[@class='mat-datepicker-input mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored']");
	private By ETA = By.xpath("//control-date-picker[@placeholder='ETA']//input[@class='mat-datepicker-input mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored']");
	private By sailingSave = By.xpath("//mat-icon[normalize-space()='save']");
	private By euipmentDetails20gp = By.xpath("//input[@data-placeholder='20GP']");
	private By euipmentDetailsLcl = By.xpath("//input[@data-placeholder='LCL']");
	private By itemDetails = By.xpath("//div[contains(text(),'Item Details')]");
	private By addNewOrder = By.xpath("//button[@class='mat-focus-indicator mat-micro mat-mini-fab mat-button-base mat-primary']");
	private By orderNumber = By.xpath("//input[@data-placeholder='Order Number']");
	private By carierRef = By.xpath("//input[@data-placeholder='Carrier Ref']");
	private By markAndNumbers = By.xpath("//input[@data-placeholder='Marks and numbers']");
	private By cbm = By.xpath("//input[@data-placeholder='Cbm']");
	private By weight = By.xpath("//input[@data-placeholder='weight']");
	private By cartons = By.xpath("//input[@data-placeholder='Cartons']");
	private By sa = By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-accent']");
	private By sendToSa = By.xpath("//body//app-root//div[@fxlayout='row']//div[@fxlayout='row']//div[1]//button[1]");
	private By selectSailing=By.xpath("//button[@matbadgeposition='above before']");
	private By approve = By.xpath("//body/div/div[@dir='ltr']/div/mat-dialog-container[@role='dialog']/ship-approval-placeholder-sa-approval/div/div/div[@fxlayout='row']/button[1]");
    private By headerDetail= By.xpath("//div[contains(text(),'Header Details')]");
    private By refId = By.xpath("//body/app-root/block-ui/app-main-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-edit-booking/mat-card/mat-card-content/div[1]");





	public BookingDetails(WebDriver driver) {
		this.driver = driver;

	}


	public void enterAgent(String agentValue) throws InterruptedException {
		WebElement Agent =driver.findElement(agent);
		Agent.click();
		Agent.sendKeys(agentValue);
		Thread.sleep(2000);
		Agent.sendKeys(Keys.ARROW_DOWN);
		Agent.sendKeys(Keys.ENTER);
	}

	public void enterPol(String polValue) throws InterruptedException {
		WebElement POL =driver.findElement(pol);
		POL.click();
		POL.sendKeys(polValue);
		Thread.sleep(2000);
		POL.sendKeys(Keys.ARROW_DOWN);
		POL.sendKeys(Keys.ENTER);

	}

	public void enterPod(String podValue) throws InterruptedException {

		WebElement POD =driver.findElement(pod);
		POD.click();
		POD.sendKeys(podValue);
		Thread.sleep(2000);
		POD.sendKeys(Keys.ARROW_DOWN);
		POD.sendKeys(Keys.ARROW_DOWN);
		POD.sendKeys(Keys.ENTER);

	}

	public void enterIncoterm() {
		WebElement inco= driver.findElement(incoTerm);
		inco.click();	
		driver.findElement(By.xpath("//body/div/div[@dir='ltr']/div/div/div[@role='listbox']/mat-option[1]/span[1]")).click();		
	}

	public void clickSave() {
		driver.findElement(saveBtn).click();
	}

	public void clickSailingIcon() {
		//jse.executeScript("arguments[0].scrollIntoView(true)", sailingIcon);
		//	jse.executeScript("window.scroll(0,12000)");

		driver.findElement(sailingIcon).click();;


	}

	public void clickAddnewSailing() {	
		driver.findElement(addNewSailing).click();

	}

	public void selectVessel(String vesselValue) throws InterruptedException {
		WebElement vesselElement=driver.findElement(vessel);
		vesselElement.click();
		vesselElement.sendKeys(vesselValue);
		Thread.sleep(3000);
		vesselElement.sendKeys(Keys.ARROW_DOWN);
		vesselElement.sendKeys(Keys.ENTER);

	}

	public void enterVoyage(String vayageValue) {

		driver.findElement(voyage).sendKeys(vayageValue);

	}

	public void selectCarrier(String carrierVlaue) throws InterruptedException {
		WebElement carrierElement = driver.findElement(carrier);
		carrierElement.click();
		carrierElement.sendKeys(carrierVlaue);
		Thread.sleep(3000);
		carrierElement.sendKeys(Keys.ARROW_DOWN);
		carrierElement.sendKeys(Keys.ENTER);


	}
	public void selectEta(String EtaDate) {
		WebElement etaElement= driver.findElement(ETA);
		etaElement.sendKeys(EtaDate);

	}

	public void selectEtd(String EtdDate) {
		WebElement etdElement= driver.findElement(ETD);
		etdElement.sendKeys(EtdDate);

	}

	public void clickSailingSave() {
		driver.findElement(sailingSave).click();
	}


	public void fillEquipmentDetails() {
		WebElement gp =driver.findElement(euipmentDetails20gp);	
		gp.clear();
		gp.sendKeys("1");
		WebElement lcl =driver.findElement(euipmentDetailsLcl);
		lcl.clear();
		lcl.sendKeys("1");

	}

	public void clickItemDetails() {
//jse.executeScript("window.scrollBy(0,-1000)", "");
		driver.findElement(itemDetails).click();

	}

	public void clickAddNewOrder() {
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//WebElement addNewOrderBtn=wait.until(ExpectedConditions.visibilityOfElementLocated(addNewOrder));
		//addNewOrderBtn.click();
		
		driver.findElement(addNewOrder).click();

	}

	public void fillUpOrderDetails() {
		driver.findElement(orderNumber).sendKeys("order1234");
		driver.findElement(carierRef).sendKeys("Test Carrier ref");
		driver.findElement(markAndNumbers).sendKeys("12345");
		driver.findElement(cbm).sendKeys("1");
		driver.findElement(weight).sendKeys("2");
		driver.findElement(cartons).sendKeys("1");

	}

	public void clickHeaderDetail() {
		driver.findElement(headerDetail).click();
		
	}
	
	public void clickSendtoSa() {		
		driver.findElement(sendToSa).click();

	}

	public void clickSa() {
		driver.findElement(sa).click();
	}

	public void clickSailing() {
		driver.findElement(selectSailing).click();
	}
	public void clickApprover() {
		driver.findElement(approve).click();

	}

    public String getStatus() {
    String ref = driver.findElement(refId).getText(); 
    System.out.println("id of the booking is:  " + ref );
    	return ref;
    	
    	
    }

}


