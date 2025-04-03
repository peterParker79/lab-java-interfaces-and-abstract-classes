import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public  double bigDecimalToDouble (BigDecimal bigDecimal){
        return bigDecimal.setScale(2).doubleValue();
    }

    public  double reverseBigDecimal (BigDecimal bigDecimal){
        return bigDecimal.setScale(2, RoundingMode.HALF_UP).negate().doubleValue();
    }


    public static void main(String[] args) {


    }




}//end