
package ui.flows;

import ui.pages.LoginPage;
import ui.components.CartComponent;

public class PurchaseFlow {

    LoginPage loginPage = new LoginPage();
    CartComponent cart = new CartComponent();

    public void executePurchaseFlow() {

        loginPage.login("standard_user", "secret_sauce");

        cart.addProduct();
        cart.openCart();

        System.out.println("Proceeding to checkout...");
        System.out.println("Processing payment...");
    }
}
