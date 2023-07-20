package android.lab8;

public class B2_FlagPage1 {
    private int imgFlag;
    private String nameCountry;

    public B2_FlagPage1(){}

    public B2_FlagPage1(int imageResource, String text) {
        this.imgFlag = imageResource;
        this.nameCountry = text;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public int getImgFlag() {
        return imgFlag;
    }

    public void setImgFlag(int imgFlag) {
        this.imgFlag = imgFlag;
    }
}
