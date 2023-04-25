package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Trendyol {

    public Trendyol() {

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @FindBy(xpath = "//*[@text='Erkek']")
    public MobileElement genderSelect;
    @FindBy(id = "trendyol.com:id/imageViewTooltipClose")
    public MobileElement exit;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup")
    public MobileElement insuranceExit;
    @FindBy(id = "trendyol.com:id/tab_account")
    public MobileElement hesabimIcon;
    @FindBy(xpath = "//*[@text='appiumTest']")
    public MobileElement mailText;
    @FindBy(id = "trendyol.com:id/editTextPassword")
    public MobileElement passwordTextbox;
    @FindBy(id = "trendyol.com:id/buttonLogin")
    public MobileElement loginButton;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup")
    public MobileElement exitInsuranceOffer;
    @FindBy(id = "trendyol.com:id/tab_home")
    public MobileElement homePageIcon;
    @FindBy(id = "trendyol.com:id/search_view_inner_container")
    public MobileElement searchBox;
    @FindBy(xpath = "//*[@text='Ayakkabı']")
    public MobileElement shoes;
    @FindBy(id = "trendyol.com:id/layout_search_order")
    public MobileElement order;
    @FindBy(xpath = "//*[@text='Çok Satanlar']")
    public MobileElement bestsellers;
    @FindBy(id = "trendyol.com:id/layout_search_filter")
    public MobileElement filterText;
    @FindBy(xpath = "//*[@text='Marka ']")
    public MobileElement brandText;
    @FindBy(xpath = "//*[@text='Puma']")
    public MobileElement brandTypeText;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/x1.a/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout")
    public MobileElement cinsiyetText;
    @FindBy(xpath = "//*[@text='Erkek']")
    public MobileElement erkekText;
    @FindBy(id = "trendyol.com:id/btnApplyFilter")
    public MobileElement okButton;
    @FindBy(id = "trendyol.com:id/imageLeft")
    public MobileElement leftButton;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout[1]/x1.a/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ImageView")
    public MobileElement shoesImage;
    @FindBy(xpath = "//*[@text='42']")
    public MobileElement brandSize;
    @FindBy(id = "trendyol.com:id/primaryButton")
    public MobileElement addToCartButton;
    @FindBy(id = "trendyol.com:id/buttonAddToBasketOrChooseVariant")
    public MobileElement addToCartButton2;
    @FindBy(id = "trendyol.com:id/buttonApproveBasket")
    public MobileElement approveBasketButton;
    @FindBy(id = "trendyol.com:id/textViewPaymentTypes")
    public MobileElement closeServicesSection;
    @FindBy(id = "trendyol.com:id/textViewPaymentAddEditDeliveryAddress")
    public MobileElement addEditDeliveryButton;
    @FindBy(id = "trendyol.com:id/textRightUp")
    public MobileElement addAddressButton;
    @FindBy(id = "trendyol.com:id/editTextOwnerName")
    public MobileElement nameTextBox;
    @FindBy(id = "trendyol.com:id/editTextOwnerSurname")
    public MobileElement surnameTextBox;
    @FindBy(id = "trendyol.com:id/editTextPhoneNumber")
    public MobileElement numberTextBox;
    @FindBy(id = "trendyol.com:id/editTextCity")
    public MobileElement city;
    @FindBy(xpath = "//*[@text='Çankırı']")
    public MobileElement cityText;
    @FindBy(xpath = "//*[@text='Merkez']")
    public MobileElement districtText;
    @FindBy(xpath = "//*[@text='Abdulhalik Renda Mah']")
    public MobileElement district2Text;
    @FindBy(id = "trendyol.com:id/textinput_placeholder")
    public MobileElement addressTextinput;
    @FindBy(id = "trendyol.com:id/editTextAddress")
    public MobileElement addressTextbox;
    @FindBy(id = "trendyol.com:id/editTextAddressName")
    public MobileElement addressBasligiTextBox;
    @FindBy(id = "trendyol.com:id/buttonSave")
    public MobileElement saveButton;
    @FindBy(id = "trendyol.com:id/imageViewAddressName")
    public MobileElement imageViewAddressName;
    @FindBy(id = "trendyol.com:id/viewPaymentCardInformationNewCardBackground")
    public MobileElement cardNumberTextbox;
    @FindBy(id = "trendyol.com:id/textViewPaymentCardInformationMonth")
    public MobileElement mounthTextbox;
    @FindBy(xpath = "//*[@text='04']")
    public MobileElement mounthText;
    @FindBy(xpath = "//*[@text='2025']")
    public MobileElement yearText;
    @FindBy(id = "trendyol.com:id/editTextPaymentCardInformationCVV")
    public MobileElement cvvTextbox;
    @FindBy(id = "trendyol.com:id/checkbox")
    public MobileElement checkBox;
    @FindBy(id = "trendyol.com:id/buttonPaymentSubmit")
    public MobileElement submitButton;
    @FindBy(id = "trendyol.com:id/pudoSuggestionNegativet")
    public MobileElement suggestionNegative;
    @FindBy(id = "android:id/button1")
    public MobileElement uyariTamamButton;











}
