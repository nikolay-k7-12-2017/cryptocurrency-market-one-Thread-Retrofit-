package pojoExmo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Exmo4 {

    @SerializedName("LTC_USD")
    @Expose
    private LTCUSD lTCUSD;

    /**
     * No args constructor for use in serialization
     *
     */
    public Exmo4() {
    }

    /**
     *
     * @param lTCUSD
     */
    public Exmo4(LTCUSD lTCUSD) {
        super();
        this.lTCUSD = lTCUSD;
    }

    public LTCUSD getLTCUSD() {
        return lTCUSD;
    }

    public void setLTCUSD(LTCUSD lTCUSD) {
        this.lTCUSD = lTCUSD;
    }
}
