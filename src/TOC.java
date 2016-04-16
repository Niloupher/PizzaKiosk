/**
 * Created by voona01 on 4/16/2016.
 */
public class TOC {
    private enum typeOfCrust {THIN,THICK;};
    private static int costOfCrust;

    private typeOfCrust crustType;

    public TOC(typeOfCrust crustType) {
        this.crustType = crustType;
    }

    public static TOC getThinCrust() {
        costOfCrust = 300;
        return new TOC(typeOfCrust.THIN);
    }

    public static TOC getThickCrust() {
        costOfCrust = 400;
        return new TOC(typeOfCrust.THICK);
    }

    @Override
    public String toString() {
        return crustType +" and CostOfCrust is"+costOfCrust;
    }
}
