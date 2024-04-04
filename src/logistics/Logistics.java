package logistics;

public class Logistics {

    public static int calculateWage(int deliverySuccess) {
        int basePay = 5000;
        int wage = 0;

        if (deliverySuccess > 0 && deliverySuccess < 50) {
            wage = 160 * deliverySuccess + 5000;

        } else if (deliverySuccess > 50 && deliverySuccess < 59) {
            wage = 200 * deliverySuccess + 5000;

        }   else if (deliverySuccess > 60 && deliverySuccess < 69) {
            wage = 250 * deliverySuccess + 5000;
        } else if (deliverySuccess >= 70) {
            wage = 500 * deliverySuccess + 5000;



        } return wage;
    }
}






















