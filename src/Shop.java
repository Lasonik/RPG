import java.awt.*;

public class Shop implements Seller{
    @Override
    public String sell(Goods goods) {
        String result = "";
        if (goods == Goods.POTION) {
            result = "potion";
        }
        return result;
    }
    public enum Goods {
        POTION
    }
}
