package pojoExmo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Exmo2 {
    @SerializedName("ETH_USD")
    @Expose
    private ETHUSD eTHUSD;

    /**
     * No args constructor for use in serialization
     *
     */
    public Exmo2() {
    }

    /**
     *
     * @param eTHUSD
     */
    public Exmo2(ETHUSD eTHUSD) {
        super();
        this.eTHUSD = eTHUSD;
    }

    public ETHUSD getETHUSD() {
        return eTHUSD;
    }

    public void setETHUSD(ETHUSD eTHUSD) {
        this.eTHUSD = eTHUSD;
    }
}
