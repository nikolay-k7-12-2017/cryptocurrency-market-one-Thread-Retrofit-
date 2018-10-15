package pojoExmo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Exmo5 {
    @SerializedName("LTC_BTC")
    @Expose
    private LTCBTC lTCBTC;

    /**
     * No args constructor for use in serialization
     *
     */
    public Exmo5() {
    }

    /**
     *
     * @param lTCBTC
     */
    public Exmo5(LTCBTC lTCBTC) {
        super();
        this.lTCBTC = lTCBTC;
    }

    public LTCBTC getLTCBTC() {
        return lTCBTC;
    }

    public void setLTCBTC(LTCBTC lTCBTC) {
        this.lTCBTC = lTCBTC;
    }
}
