package pojoExmo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Exmo {
    @SerializedName("BTC_USD")
    @Expose
    private BTCUSD bTCUSD;

    /**
     * No args constructor for use in serialization
     *
     */
    public Exmo() {
    }

    /**
     *
     * @param bTCUSD
     */
    public Exmo(BTCUSD bTCUSD) {
        super();
        this.bTCUSD = bTCUSD;
    }

    public BTCUSD getBTCUSD() {
        return bTCUSD;
    }

    public void setBTCUSD(BTCUSD bTCUSD) {
        this.bTCUSD = bTCUSD;
    }

    @Override
    public String toString() {
        return "Exmo{" +
                "bTCUSD=" + bTCUSD +
                '}';
    }
}
