package org.common;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.awt.Color;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.BorderStyle;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasicFunctions {
	
	public static WebDriver driver;
	public static Actions act;
	public static FileInputStream fis = null;
	public static FileOutputStream fos = null;
	public static XSSFWorkbook workbook = null;
	public static XSSFSheet sheet = null;
	public static XSSFRow row = null;
	public static XSSFCell cell = null;
	
	public static void textSend(WebElement refName, String textValue) {
		refName.sendKeys(textValue);
	}

	public static void buttonClick(WebElement refName) {
		refName.click();

	}
	public static String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	public static String getAtrributeValue(WebElement refName, String AttributeValue) {
		String attribute = refName.getAttribute(AttributeValue);
		return attribute;

	}
	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void implicityWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void navigateTo(String url) {
		driver.navigate().to(url);

	}

	public static void navigateBack() {
		driver.navigate().back();

	}

	public static void navigateForward() {
		driver.navigate().forward();

	}

	public static void navigateRefresh() {
		driver.navigate().refresh();

	}
	public static void mouseOver(WebElement refName) {
		act = new Actions(driver);
		act.moveToElement(refName).perform();
	}
	
	public static void actionClick(WebElement refName) {
		act = new Actions(driver);
		act.click(refName).perform();
	}

	public static void rightClick(WebElement refName) {
		act = new Actions(driver);
		act.contextClick(refName).perform();

	}

	public static void doubleClick(WebElement refName) {
		act = new Actions(driver);
		act.doubleClick(refName).perform();

	}

	public static void dragAndDrop(WebElement refNameSource, WebElement refNameTarget) {
		act = new Actions(driver);
		act.dragAndDrop(refNameSource, refNameTarget).perform();

	}

	public static void keyPress(int keycode) throws AWTException {
		Robot r = new Robot();
		r.keyPress(keycode);

	}
	public static void keyRelease(int keycode) throws AWTException {
		Robot r = new Robot();
		r.keyRelease(keycode);

	}
	public static void javaScribtClick(WebElement element) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].click()", element);
	}
	public static void textSendJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].seAttribute('value','" + data + "')", element);

	}
	// getAttribute Using JavaScript
	public static void getAttributeJavaScript(WebElement refName) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		Object executeScript = jk.executeScript("return arguments[0].getttribute('value')", refName);
		System.out.println(executeScript);
	}
	// scroll Down using JavaScript
	public static void scrollDownJavaSc(WebElement element) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	// scroll Up using JavaScript
	public static void scrollUpJavaSc(WebElement element) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].scrollIntoView(false);", element);
	}
	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public static void dismissAlert() {
		driver.switchTo().alert().dismiss();

	}

	public static void promptAlert(String value) {
		Alert text = driver.switchTo().alert();
		text.sendKeys(value);
		text.accept();
	}
	
	public static void alertGetText() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);

	}
	public static void selectByIndex(WebElement refName, int string) {
		Select select = new Select(refName);
		select.selectByIndex(string);
	}
	public static void selectByValue(WebElement refName, String value) {
		Select select = new Select(refName);
		select.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement refName, String text) {
		Select select = new Select(refName);
		select.selectByVisibleText(text);
	}
	public static void screenshot(String location) throws IOException {
		TakesScreenshot tks = (TakesScreenshot) driver;
		File defaultLocation = tks.getScreenshotAs(OutputType.FILE);
		System.out.println(defaultLocation);
		FileUtils.copyFile(defaultLocation, new File(location));
	}
	
	public static void download_File(String downloadPath, WebElement refName) {
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		options.setExperimentalOption("prefs",chromePrefs);   
		
		 driver = new ChromeDriver(options);
		refName.click();
	}
	
	public static void upload_File(WebElement refName, String path) throws InterruptedException, AWTException {
		
	//	refName.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.setAutoDelay(1000);
		StringSelection selection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		// press ctrl+vsss
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		// release ctrl+v
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		// press enter
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}


	public static void webDriverWait(ExpectedCondition<WebElement> ExpectedConditions) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions);
	}

	public static void fluentWait(Class<? extends Throwable> exceptionType, Function<? super WebDriver, Object> ExpectedConditions) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).
				pollingEvery(5, TimeUnit.SECONDS).ignoring(exceptionType);
		wait.until(ExpectedConditions);
	}
	
	public static void update_Status(String sheetName, String colName, String value, String testDataIdentifier) throws IOException {
		fis = new FileInputStream(System.getProperty("user.dir")+"\\ExcelUtils\\Test_Data_Report.xlsx");
		workbook = new XSSFWorkbook(fis);
		fis.close();
		sheet = workbook.getSheet(sheetName);
		int colNum = -1;
		Row headerRow = sheet.getRow(0); // Assuming the header is in the first row
	    for (int i = 0; i < headerRow.getLastCellNum(); i++) {
	        if (headerRow.getCell(i).getStringCellValue().trim().equals(colName)) {
	            colNum = i;
	            break;
	        }
	    }

	    if (colNum == -1) {
	        System.out.println("Column not found: " + colName);
	        return;
	    }

	    // Loop through each row and update the status for the specific test data identifier
	 //   int rownum =1;
	    int rowIndex = -1;
	    for (int i = 1; i <= sheet.getLastRowNum(); i++) {
	        row = sheet.getRow(i);
	        Cell testDataIdentifierCell = row.getCell(0); // Assuming the test data identifier is in the first column
	     // Check if the cell type is numeric
	        if (testDataIdentifierCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
	            // Convert the numeric value to a string for comparison
	            String testDataIdentifierCellValue = String.valueOf((int) testDataIdentifierCell.getNumericCellValue());
	            if (testDataIdentifierCellValue.equals(testDataIdentifier)) {
	                cell = row.createCell(colNum);
	                cell.setCellValue(value);
	                rowIndex = i;
	                break;
	            }
	        } else if (testDataIdentifierCell.getCellType() == Cell.CELL_TYPE_STRING) {
	            // If the cell type is already a string, use getStringCellValue()
	            String testDataIdentifierCellValue = testDataIdentifierCell.getStringCellValue().trim();
	            if (testDataIdentifierCellValue.equals(testDataIdentifier)) {
	                cell = row.createCell(colNum);
	                cell.setCellValue(value);
	                rowIndex = i;
	                break;}
	        }
	    }


        fos = new FileOutputStream(System.getProperty("user.dir") + "\\ExcelUtils\\Test_Data_Report.xlsx");
        workbook.write(fos);
        fos.close();
	} 
	public static void SetStatus(String sheetName, int rowNum, String colName, String value) throws IOException  {
		fis = new FileInputStream(System.getProperty("user.dir")+"\\Provider_Claim_Appeal_File\\Provider_Claims_Reconciliation_Upload.xlsx");
		//C:\\Users\\BalamuruganM\\eclipse-workspace\\UAT_QIC_Medical\\Provider_Claim_Appeal_File\\Provider_Claims_Reconciliation_Upload.xlsx
		workbook = new XSSFWorkbook(fis);
		fis.close();
		int colNum = -2;
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(1);
		for (int i=1; i<row.getLastCellNum(); i++) {
			if(row.getCell(i).getStringCellValue().trim().equals(colName)) {
				colNum = i;
			}
		}
		row = sheet.getRow(rowNum);
		if(row == null)
			row = sheet.createRow(rowNum);
		
		cell = row.getCell(colNum);
				if(cell == null)
					cell = row.createCell(colNum);
				cell.setCellValue(value);
				fos = new FileOutputStream(System.getProperty("user.dir")+"\\Provider_Claim_Appeal_File\\Provider_Claims_Reconciliation_Upload.xlsx");
				workbook.write(fos);
				fos.close();
	}
	
	public static void Update_Value(String sheetName, int rowNum, int colNum, String value) throws IOException  {
		 fis = new FileInputStream(System.getProperty("user.dir")+"\\Provider_Claim_Format\\Provider_Claims_Reconciliation_Upload.xlsx");
		    // XSSFWorkbook workbook;
		 //   try ( workbook wb = new XSSFWorkbook(fis)) {
		       // workbook = (XSSFWorkbook) wb;
		     workbook = new XSSFWorkbook(fis);
		        Sheet sheet = workbook.getSheet(sheetName);
		        Row row = sheet.getRow(rowNum);
		        if (row == null) {
		            row = sheet.createRow(rowNum);
		        }

		        Cell cell = row.getCell(colNum);
		        if (cell == null) {
		            cell = row.createCell(colNum);
		        }
		     
		      //  CellStyle numberStyle = workbook.createCellStyle();
//		        DataFormat dataFormat = workbook.createDataFormat();
//		        numberStyle.setDataFormat(dataFormat.getFormat("0.00")); // Change the format as needed
//		        cell.setCellStyle(numberStyle);
//		        if (cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING) {
//                    try {
//                        // Attempt to convert the cell value to a numeric value
//                        double numericValue = Double.parseDouble(cell.getStringCellValue());
//                        // If successful, update the cell type and value
//                       
//                        cell.setCellType(Cell.CELL_TYPE_NUMERIC);
//                    } catch (NumberFormatException e) {
//                        // Handle the case where the cell value is not numeric
//                        // For example, you can log a warning or perform other actions
//                    }
//		        }
		        cell.setCellValue(value);

		        fos = new FileOutputStream(System.getProperty("user.dir")+"\\Provider_Claim_Format\\Provider_Claims_Reconciliation_Upload.xlsx");
				workbook.write(fos);
				fos.close();
	}
	
	public static void UpdateValue(String sheetName, int rowNum, int colNum, int value) throws IOException {
	     fis = new FileInputStream(System.getProperty("user.dir")+"\\Provider_Claim_Appeal_File\\Provider_Claims_Reconciliation_Upload.xlsx");
	    // XSSFWorkbook workbook;
	 //   try ( workbook wb = new XSSFWorkbook(fis)) {
	       // workbook = (XSSFWorkbook) wb;
	     workbook = new XSSFWorkbook(fis);
	        Sheet sheet = workbook.getSheet(sheetName);
	        Row row = sheet.getRow(rowNum);
	        if (row == null) {
	            row = sheet.createRow(rowNum);
	        }

	        Cell cell = row.getCell(colNum);
	        if (cell == null) {
	            cell = row.createCell(colNum);
	        }

	        CellStyle numberStyle = workbook.createCellStyle();
	      
	        DataFormat dataFormat = workbook.createDataFormat();
	        numberStyle.setDataFormat(dataFormat.getFormat("0.00")); // Change the format as needed
	        cell.setCellStyle(numberStyle);
	       
	        cell.setCellValue(value);
	        numberStyle.setBorderBottom(CellStyle.BORDER_THIN);
	        cell.setCellStyle(numberStyle);
	        fos = new FileOutputStream(System.getProperty("user.dir")+"\\Provider_Claim_Appeal_File\\Provider_Claims_Reconciliation_Upload.xlsx");
			workbook.write(fos);
			fos.close();
	}

	
	public static String readExcel(String sheetname, int rowno, int cellno) throws IOException  {
		String data=null;
		File file = new File(System.getProperty("user.dir")+"\\Provider_Claim_Appeal_File\\Provider_Claims_Reconciliation_Upload.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		int type = cell.getCellType();
		if (type == 1) {
			data = cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			data= dateFormat.format(dateCellValue);
		} else {
			double d = cell.getNumericCellValue();
			long l = (long) d;
			data = String.valueOf(l);

		}
		return data;
	}
	
}
