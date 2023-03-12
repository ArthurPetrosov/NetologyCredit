public class CreditPaymentService {
    public double calculate(double yearPr, int mouths, int summa) {
        double mouthPr = yearPr / 12 / 100;
        double mouthPay = (int) (summa * (mouthPr * ((Math.pow((1 + mouthPr), mouths)) / ((Math.pow((1 + mouthPr), mouths) - 1)))));

        return mouthPay;
    }

}
