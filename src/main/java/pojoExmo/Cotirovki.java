package pojoExmo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Cotirovki {
    @SerializedName("site")
    @Expose
    private String site;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("elementPureHtml")
    @Expose
    private String elementPureHtml;

    Cotirovki(){}

    public Cotirovki(String site, String name, String desc, String link, String elementPureHtml) {
        this.site = site;
        this.name = name;
        this.desc = desc;
        this.link = link;
        this.elementPureHtml = elementPureHtml;
    }

    public Cotirovki(String site, String name, String desc, String link) {
        this.site = site;
        this.name = name;
        this.desc = desc;
        this.link = link;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getElementPureHtml() {
        return elementPureHtml;
    }

    public void setElementPureHtml(String elementPureHtml) {
        this.elementPureHtml = elementPureHtml;
    }

    @Override
    public String toString() {
        return "Cotirovki{" +
                "site='" + site + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", link='" + link + '\'' +
                ", elementPureHtml='" + elementPureHtml + '\'' +
                '}';
    }
}
