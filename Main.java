import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static double bigDecimalToDouble(BigDecimal bigDecimal){
        return bigDecimal.setScale(2, RoundingMode.HALF_UP).negate().doubleValue();
    }

    public  double reverseBigDecimal (BigDecimal bigDecimal){

        return bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }


    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal("35.7656");
        double result = bigDecimalToDouble (bigDecimal);
        //System.out.printf("Result bigDecimalToDouble method: %f", result);
        System.out.println( result);
    }




}//end