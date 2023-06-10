import java.security.PublicKey;

public class RewardValue {
   double getCash;
   double getMile;
    public RewardValue(int cash) {
        getCash = cash;

    }

    public RewardValue(double mile){
        getMile = mile;
    }
    public double getCashValue(){
        double cash = getMile*0.0035;
        return cash;
    }
    public double getMilesValue(){
        double mile = getMile/0.0035;
          return mile;
    }




}
