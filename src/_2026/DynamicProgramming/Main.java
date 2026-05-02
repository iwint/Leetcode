package _2026.DynamicProgramming;

public class Main {
    public static void main(String[] args) {
//        Fibno fibSeries = new Fibno();
//        System.out.println(fibSeries.tabulationMethodFib(5));
        MaxProfit maxProfitClass = new MaxProfit();
        System.out.println(maxProfitClass.dpTabularMethod(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
