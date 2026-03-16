
package ui.pages;

import com.microsoft.playwright.Page;

public class EcommercePage {

 private Page page;

 public EcommercePage(Page page){

  this.page = page;

 }

 public void openStore(){

  page.navigate("https://www.saucedemo.com");

 }

 public void login(){

  page.fill("#user-name","standard_user");
  page.fill("#password","secret_sauce");
  page.click("#login-button");

 }

 public void addProduct(){

  page.click("text=Add to cart");

 }

 public void openCart(){

  page.click(".shopping_cart_link");

 }

 public void checkout(){

  page.click("#checkout");

 }

 public void fillCheckout(){

  page.fill("#first-name","QA");
  page.fill("#last-name","Automation");
  page.fill("#postal-code","00000");
  page.click("#continue");

 }

 public void finish(){

  page.click("#finish");

 }

}
