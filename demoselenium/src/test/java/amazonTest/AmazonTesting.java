package amazonTest;

import org.testng.annotations.Test;

public class AmazonTesting extends DriverWrapperAmazon{

    @Test
    public void TestAmazon(){
        LandingPageAmazon landingPageAmazon = new LandingPageAmazon();

        landingPageAmazon.searchInput();
        landingPageAmazon.searchButton();

    }
}
