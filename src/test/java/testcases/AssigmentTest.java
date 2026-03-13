package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AssigmentTest extends Base_class{
	
//	  @Test(priority = 1)
//	    public void tc01_SuccessfulSearch() {
//
//		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//summary[@aria-label='Search']//span//*[name()='svg']"))).click();
//	       WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Search-In-Modal")));
//	       searchInput.sendKeys("Hydrogen" + Keys.ENTER);
//	        
//	    // Expected String
//	        String expectedMessage = "4 results found for “Hydrogen”";
//
//	        // Wait for the element and capture the Actual String
//	        WebElement resultElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'results found')]")));
//	        String actualMessage = resultElement.getText();
//	       
//	        // 3. Compare using TestNG Assertion
//	        Assert.assertEquals(actualMessage, expectedMessage, "Search result message matches!");
//	    }
//
//	    @Test(priority = 2)
//	    public void tc02_InvalidSearch() {
//	        
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//summary[@aria-label='Search']//span//*[name()='svg']"))).click();
//	        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Search-In-Modal")));
//	        
//	        searchInput.sendKeys("xyz123!@#" + Keys.ENTER);
//	        
//	        WebElement noResultsMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@role='status'][contains(.,'No results found')]")));
//	        Assert.assertTrue(noResultsMsg.isDisplayed(), "No Results message was not displayed for invalid search.");
//	    }
//
//	    @Test(priority = 3)
//	    public void tc03_EdgeCaseLongSearch() {
//	        
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//summary[@aria-label='Search']"))).click();
//	        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Search-In-Modal")));
//	        
//	        String longString = "A".repeat(250);
//	        searchInput.sendKeys(longString + Keys.ENTER);
//	        
//	        // Verify the app is still responsive and not crashing (showing the footer is a good indicator)
//	        WebElement footer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("footer")));
//	        Assert.assertTrue(footer.isDisplayed(), "Page crashed or became unresponsive with long search string.");
//	    }
//
//	    @Test(priority = 4)
//	    public void tc04_Positive_FilterAndAddToCart() {
//
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Shop products']"))).click();
//	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='mobile-facets__open-label button-label small-hide']"))).click();
//	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//details[@id='Details-Mobile-1-template--19850788241498__product-grid']//summary[@role='button']//div"))).click();
//
//	        // 2. Select 'In stock' checkbox
//	        
//	    	wait.until(ExpectedConditions.elementToBeClickable
//	    			(By.xpath("//label[@for='Filter-filter.v.availability-mobile-1']//*[name()='svg']//*[name()='rect' and contains(@width,'16')]"))).click(); 
//	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='FacetMobile-1-template--19850788241498__product-grid']//button[@type='button'][normalize-space()='Apply']"))).click();
//	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='CardLink-template--19850788241498__product-grid-7801364349018']"))).click();
//            
//	    	// 4. Add to cart
//	    	WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='ProductSubmitButton-template--19850788667482__main']")));
//	    	addBtn.click();
//
//	    	// 5. ASSERTION: Wait for the side panel header "Your cart" to appear
//	    	// We use a broader XPath to find the text "Your cart" in the drawer
//	    	WebElement cartDrawerHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(
//	    	    By.xpath("//h2[contains(text(), 'Your cart')]")
//	    	));
//
//	    	Assert.assertTrue(cartDrawerHeader.isDisplayed(), "Cart side panel did not open!");
//
//	    	// 6. Double Check: Verify the product name is inside that drawer
//	    	WebElement drawerContent = driver.findElement(By.xpath("//cart-drawer//form")); 
//	    	String drawerText = drawerContent.getText();
//	    	System.out.println("Product in drawer: " + drawerText);
//
//	    	Assert.assertTrue(drawerText.contains("Hydrogen"), "The product 'Hydrogen' was not found in the cart drawer!");}
//
//@Test(priority = 5)
// public void tc05_Negative_Buy_it_now_btnDisabled() {
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//
//	// Locate element
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("CardLink-template--19850788503642__featured_collection-7801402425434")));
//
//		// Scroll and give it a half-second to settle
//		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
//
//		js.executeScript("arguments[0].click();", element);
//		
//	//1. Locate the Buy_it_now_btn button
//	WebElement Buy_it_now_btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Buy it now']")));
//
//	boolean isClickable = Buy_it_now_btn.isEnabled();
//
//	// 3. The Negative Assertion: 
//	Assert.assertFalse(isClickable, "Bug found: The Sold Out button is actually clickable!");
//}
//
//
//@Test(priority = 6)
//public void tc06_Edgecase_increase_Qty() {
//	
//	
//	tc04_Positive_FilterAndAddToCart();
//	
//	// 2. Locate the + button
//   WebElement plusBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='plus']")));
//   JavascriptExecutor js = (JavascriptExecutor) driver;
//
//   // 3. Perform 60 clicks
//   System.out.println("Starting 60 clicks...");
//   for (int i = 0; i < 60; i++) {
//       js.executeScript("arguments[0].click();", plusBtn);
//   }
//
//   // 4. Wait for the error message
//   try {
//       WebElement errorMsg = wait.until(ExpectedConditions.visibilityOf(
//           driver.findElement(By.xpath("//small[@class='cart-item__error-text']"))));
//       System.out.println("Error displayed: " + errorMsg.getText());
//   } catch (Exception e) {
//       System.out.println("No error message appeared, checking final quantity instead.");
//   }   
//// 5. Get the quantity element (Make sure the drawer has updated)
//WebElement qtyElement = driver.findElement(By.id("Drawer-quantity-1"));
//
//// 6. Extract the value
//String qtyString = qtyElement.getAttribute("value");
//
//if (qtyString != null && !qtyString.isEmpty()) {
//    int qtyInt = Integer.parseInt(qtyString);
//    System.out.println("DEBUG: Final quantity in cart is: " + qtyInt);
//
//    // Pass if it stays at 60, Fail if it resets to 1-10
//    if (qtyInt == 60) {
//        System.out.println("Success: Quantity correctly reached 60. No reset bug detected.");
//    } 
//    else if (qtyInt >= 1 && qtyInt <= 10) {
//        // This is where we catch the bug you found!
//        Assert.fail("Test Failed: BUG DETECTED! Quantity reset to " + qtyInt + " instead of staying at 60.");
//    } 
//    else {
//        // Handling any other unexpected numbers
//        Assert.fail("Test Failed: Unexpected quantity found: " + qtyInt);
//    }
//} else {
//    Assert.fail("Could not retrieve the quantity value (attribute was null or empty).");
//}
// 
//}}
	
	
	
	
	 @Test(priority = 1)
	    public void tc01_SuccessfulSearch() {
	        test = extent.createTest("TC01 - Successful Search", "Verify search functionality with valid keyword");
	        
	        test.info("Clicking on search icon");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//summary[@aria-label='Search']//span//*[name()='svg']"))).click();
	        
	        test.info("Entering search term 'Hydrogen'");
	        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Search-In-Modal")));
	        searchInput.sendKeys("Hydrogen" + Keys.ENTER);
	        
	        String expectedMessage ="4 results found for “Hydrogen”";
	        WebElement resultElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'results found')]")));
	        String actualMessage = resultElement.getText();
	        
	        test.info("Expected: " + expectedMessage);
	        test.info("Actual: " + actualMessage);
	        
	        Assert.assertEquals(actualMessage, expectedMessage, "Search result message matches!");
	        test.pass("Search test passed successfully");
	    }

	    @Test(priority = 2)
	    public void tc02_InvalidSearch() {
	        test = extent.createTest("TC02 - Invalid Search", "Verify behavior with invalid search term");
	        
	        test.info("Clicking on search icon");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//summary[@aria-label='Search']//span//*[name()='svg']"))).click();
	        
	        test.info("Entering invalid search term 'xyz123!@#'");
	        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Search-In-Modal")));
	        searchInput.sendKeys("xyz123!@#" + Keys.ENTER);
	        
	        test.info("Verifying 'No results found' message appears");
	        WebElement noResultsMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@role='status'][contains(.,'No results found')]")));
	        Assert.assertTrue(noResultsMsg.isDisplayed(), "No Results message was not displayed for invalid search.");
	        test.pass("Invalid search handled correctly");
	    }

	    @Test(priority = 3)
	    public void tc03_EdgeCaseLongSearch() {
	        test = extent.createTest("TC03 - Edge Case Long Search", "Verify app stability with 250 character search");
	        
	        test.info("Clicking on search icon");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//summary[@aria-label='Search']"))).click();
	        
	        test.info("Entering 250 character search string");
	        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Search-In-Modal")));
	        String longString = "A".repeat(250);
	        searchInput.sendKeys(longString + Keys.ENTER);
	        
	        test.info("Verifying page responsiveness");
	        WebElement footer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("footer")));
	        Assert.assertTrue(footer.isDisplayed(), "Page crashed or became unresponsive with long search string.");
	        test.pass("Application remained stable with long search string");
	    }

	    @Test(priority = 4)
	    public void tc04_Positive_FilterAndAddToCart() {
	        test = extent.createTest("TC04 - Filter and Add to Cart", "Verify product filtering and add to cart functionality");
	        
	        test.info("Navigating to Shop products");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Shop products']"))).click();
	        
	        test.info("Opening filters");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='mobile-facets__open-label button-label small-hide']"))).click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//details[@id='Details-Mobile-1-template--19850788241498__product-grid']//summary[@role='button']//div"))).click();

	        test.info("Selecting 'In stock' filter");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='Filter-filter.v.availability-mobile-1']//*[name()='svg']//*[name()='rect' and contains(@width,'16')]"))).click(); 
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='FacetMobile-1-template--19850788241498__product-grid']//button[@type='button'][normalize-space()='Apply']"))).click();
	        
	        test.info("Selecting product");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='CardLink-template--19850788241498__product-grid-7801364349018']"))).click();
	        
	        test.info("Adding product to cart");
	        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='ProductSubmitButton-template--19850788667482__main']")));
	        addBtn.click();

	        test.info("Verifying cart drawer opened");
	        WebElement cartDrawerHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Your cart')]")));
	        Assert.assertTrue(cartDrawerHeader.isDisplayed(), "Cart side panel did not open!");

	        test.info("Verifying product in cart");
	        WebElement drawerContent = driver.findElement(By.xpath("//cart-drawer//form")); 
	        String drawerText = drawerContent.getText();
	        Assert.assertTrue(drawerText.contains("Hydrogen"), "The product 'Hydrogen' was not found in the cart drawer!");
	        test.pass("Product successfully added to cart");
	    }

	    @Test(priority = 5)
	    public void tc05_Negative_Buy_it_now_btnDisabled() {
	        test = extent.createTest("TC05 - Buy It Now Button Disabled", "Verify sold out product cannot be purchased");
	       try { 
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        test.info("Navigating to sold out product");
	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("CardLink-template--19850788503642__featured_collection-7801402425434")));
	        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
	        js.executeScript("arguments[0].click();", element);
	        
	        test.info("Checking if 'Buy it now' button is disabled");
	        WebElement Buy_it_now_btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Buy it now']")));
	        boolean isClickable = Buy_it_now_btn.isEnabled();

	        Assert.assertFalse(isClickable, "Bug found: The Sold Out button is actually clickable!");
	        test.pass("Buy it now button correctly disabled for sold out product");
	    } catch (AssertionError e) {
            // This catches the assertion failure and logs it to ExtentReports
            test.fail("BUG DETECTED: " + e.getMessage());
            throw e; // Re-throw so TestNG marks it as failed
        } catch (Exception e) {
            // This catches any other errors (element not found, timeout, etc.)
            test.fail("TEST FAILED with exception: " + e.getMessage());
            throw e;
        }
	    }

	    @Test(priority = 6)
	    public void tc06_Edgecase_increase_Qty() {
	        test = extent.createTest("TC06 - Edge Case Quantity Increase", "Verify quantity handling when increased to 60");
	        
	        try {   
	            test.info("Adding product to cart first");
//	            tc04_Positive_FilterAndAddToCart();
	            
		        test.info("Navigating to Shop products");
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Shop products']"))).click();
		        
		        test.info("Opening filters");
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='mobile-facets__open-label button-label small-hide']"))).click();
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//details[@id='Details-Mobile-1-template--19850788241498__product-grid']//summary[@role='button']//div"))).click();

		        test.info("Selecting 'In stock' filter");
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='Filter-filter.v.availability-mobile-1']//*[name()='svg']//*[name()='rect' and contains(@width,'16')]"))).click(); 
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='FacetMobile-1-template--19850788241498__product-grid']//button[@type='button'][normalize-space()='Apply']"))).click();
		        
		        test.info("Selecting product");
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='CardLink-template--19850788241498__product-grid-7801364349018']"))).click();
		        
		        test.info("Adding product to cart");
		        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='ProductSubmitButton-template--19850788667482__main']")));
		        addBtn.click();

		        test.info("Verifying cart drawer opened");
		        WebElement cartDrawerHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Your cart')]")));
		        Assert.assertTrue(cartDrawerHeader.isDisplayed(), "Cart side panel did not open!");

		        test.info("Verifying product in cart");
		        WebElement drawerContent = driver.findElement(By.xpath("//cart-drawer//form")); 
		        String drawerText = drawerContent.getText();
		        Assert.assertTrue(drawerText.contains("Hydrogen"), "The product 'Hydrogen' was not found in the cart drawer!");
		        test.pass("Product successfully added to cart");
	            
	            test.info("Locating quantity increase button");
	            WebElement plusBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='plus']")));
	            JavascriptExecutor js = (JavascriptExecutor) driver;

	            test.info("Clicking + button 60 times");
	            for (int i = 0; i < 60; i++) {
	                js.executeScript("arguments[0].click();", plusBtn);
	            }

//	            // Check for error message (optional)
//	            try {
//	                WebElement errorMsg = wait.until(ExpectedConditions.visibilityOf(
//	                    driver.findElement(By.xpath("//small[@class='cart-item__error-text']"))));
//	                test.info("Error message displayed: " + errorMsg.getText());
//	            } catch (Exception e) {
//	                test.info("No error message appeared, checking final quantity");
//	            }   

	            // Get the final quantity
	            WebElement qtyElement = driver.findElement(By.id("Drawer-quantity-1"));
	            String qtyString = qtyElement.getAttribute("value");

	            if (qtyString != null && !qtyString.isEmpty()) {
	                int qtyInt = Integer.parseInt(qtyString);
	                test.info("Final quantity in cart: " + qtyInt);

	                // Check the quantity and fail appropriately
	                if (qtyInt == 60) {
	                    test.pass("Quantity correctly reached 60. No reset bug detected.");
	                } else if (qtyInt >= 1 && qtyInt <= 10) {
	                    // BUG DETECTED - Quantity reset!
	                    String errorMsg = "BUG DETECTED! Quantity reset to " + qtyInt + " instead of staying at 60.";
	                    test.fail(errorMsg);
	                    Assert.fail(errorMsg);  // This will be caught by outer catch block
	                } else {
	                    // Unexpected quantity
	                    String errorMsg = "Unexpected quantity found: " + qtyInt;
	                    test.fail(errorMsg);
	                    Assert.fail(errorMsg);
	                }
	            } else {
	                String errorMsg = "Could not retrieve the quantity value (attribute was null or empty)";
	                test.fail(errorMsg);
	                Assert.fail(errorMsg);
	            }
	            
	        } catch (AssertionError e) {
	            //  catches the Assert.fail() from above
	            test.fail("TEST FAILED: " + e.getMessage());
	            throw e; // Re-throw so TestNG marks it as failed
	        } catch (Exception e) {
	            //  catches any other errors (element not found, timeout, etc.)
	            test.fail("TEST FAILED with exception: " + e.getMessage());
	            throw e;
	        }
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}

	        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
