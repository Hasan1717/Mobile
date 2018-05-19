package Home;

import base.MobileAPI;

public class HomePage extends MobileAPI {
      public void media() {
          clickByXpath("//android.widget.TextView[@content-desc=\"Media\"]");
    }
}
