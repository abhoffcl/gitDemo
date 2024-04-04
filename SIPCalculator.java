
public class SIPCalculator {
    public static double calculate (int amount, int noofSips, double rate, int time){
        double totalAmount = 0;
        double monthlyRate =rate / 100 / noofSips;
        int totalPeriods =time * noofSips;
        for (int i=0; i < totalPeriods; i++) {
            totalAmount += amount;
            totalAmount *= (1 + monthlyRate);
        }
        return totalAmount;
    }
}
