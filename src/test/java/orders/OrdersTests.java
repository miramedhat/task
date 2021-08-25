package orders;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class OrdersTests extends BaseTests {

    @Test
    public void testSuccessfulCheckOutwithRegisteredUser() throws InterruptedException {
        AuthenticationPage authenticationPage = homePage.clickOnSignInBtn();
        authenticationPage.login();
        BlousesPage blousesPage = homePage.clickBlouses();
        SelectedProductPage selectedProductPage = blousesPage.selectBlouse();
        ShoppingCartPage shoppingCartPage = selectedProductPage.addToCart();
        AddressPage addressPage = shoppingCartPage.proceedToCheckOut();
        ShippingPage shippingPage = addressPage.proceedToCheckOut();
        PaymentPage paymentPage = shippingPage.ProceedToCheckOut();
        ConfirmationPage confirmationPage = paymentPage.selectPaymentMethod();
        confirmationPage.confirmMyOrder();
        Assert.assertEquals(confirmationPage.getSuccessMessage(), "Your order on My Store is complete.");

    }

    @Test
    public void testSuccessfulCheckOutwithNewUserAccount() throws InterruptedException {
        AuthenticationPage authenticationPage = homePage.clickOnSignInBtn();
        SignUpPage signUpPage = authenticationPage.createAccount();
        signUpPage.fillSignUpFields("Mira", "Medhat", "Mira@123", "123 test", "Maadi",
                "Cairo", "Alabama", "12345", "01226278675");
        BlousesPage blousesPage = homePage.clickBlouses();
        SelectedProductPage selectedProductPage = blousesPage.selectBlouse();
        ShoppingCartPage shoppingCartPage = selectedProductPage.addToCart();
        AddressPage addressPage = shoppingCartPage.proceedToCheckOut();
        ShippingPage shippingPage = addressPage.proceedToCheckOut();
        PaymentPage paymentPage = shippingPage.ProceedToCheckOut();
        ConfirmationPage confirmationPage = paymentPage.selectPaymentMethod();
        confirmationPage.confirmMyOrder();
        Assert.assertEquals(confirmationPage.getSuccessMessage(), "Your order on My Store is complete.");

    }


}
