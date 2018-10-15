package pojoExmo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Exmo3 {

    @SerializedName("ETH_BTC")
    @Expose
    private ETHBTC eTHBTC;

    /**
     * No args constructor for use in serialization
     *
     */
    public Exmo3() {
    }

    /**
     *
     * @param eTHBTC
     */
    public Exmo3(ETHBTC eTHBTC) {
        super();
        this.eTHBTC = eTHBTC;
    }

    public ETHBTC getETHBTC() {
        return eTHBTC;
    }

    public void setETHBTC(ETHBTC eTHBTC) {
        this.eTHBTC = eTHBTC;
    }
}
