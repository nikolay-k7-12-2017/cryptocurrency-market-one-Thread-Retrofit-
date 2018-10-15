package pojoExmo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BTCUSD {


    @SerializedName("ask_quantity")
    @Expose
    private double askQuantity;
    @SerializedName("ask_amount")
    @Expose
    private double askAmount;
    @SerializedName("ask_top")
    @Expose
    private double askTop;
    @SerializedName("bid_quantity")
    @Expose
    private double bidQuantity;
    @SerializedName("bid_amount")
    @Expose
    private double bidAmount;
    @SerializedName("bid_top")
    @Expose
    private double bidTop;
    @SerializedName("ask")
    @Expose
    private List<List<Double>> ask = null;
    @SerializedName("bid")
    @Expose
    private List<List<Double>> bid = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public BTCUSD() {
    }

    public double getAskQuantity() {
        return askQuantity;
    }

    public void setAskQuantity(int askQuantity) {
        this.askQuantity = askQuantity;
    }

    public double getAskAmount() {
        return askAmount;
    }

    public void setAskAmount(int askAmount) {
        this.askAmount = askAmount;
    }

    public double getAskTop() {
        return askTop;
    }

    public void setAskTop(double askTop) {
        this.askTop = askTop;
    }

    public double getBidQuantity() {
        return bidQuantity;
    }

    public void setBidQuantity(int bidQuantity) {
        this.bidQuantity = bidQuantity;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(int bidAmount) {
        this.bidAmount = bidAmount;
    }

    public double getBidTop() {
        return bidTop;
    }

    public void setBidTop(int bidTop) {
        this.bidTop = bidTop;
    }

    public List<List<Double>> getAsk() {
        return ask;
    }

    public void setAsk(List<List<Double>> ask) {
        this.ask = ask;
    }

    public List<List<Double>> getBid() {
        return bid;
    }

    public void setBid(List<List<Double>> bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "BTCUSD{" +
                "askQuantity=" + askQuantity +
                ", askAmount=" + askAmount +
                ", askTop=" + askTop +
                ", bidQuantity=" + bidQuantity +
                ", bidAmount=" + bidAmount +
                ", bidTop=" + bidTop +
                ", ask=" + ask +
                ", bid=" + bid +
                '}';
    }
}
