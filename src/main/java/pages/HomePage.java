package pages;
import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
public class HomePage extends _TestBase {

    private SelenideElement searchQuery = $(By.xpath("//input[@name='q']"));
    private SelenideElement searchButton = $(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']"));
    private SelenideElement emailInput = $("#email");
    private SelenideElement passInput = $("#password");
    private SelenideElement loginButton = $("#loginButton");

    public void login(String email, String password) {
        emailInput.setValue(email);
        passInput.setValue(password);
        loginButton.click();
    }



}


