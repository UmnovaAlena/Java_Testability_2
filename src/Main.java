public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 98;
        double growthInMetr = 1.87;

        int bodyMassIndex = (int) (int) service.calculate(weightInKg, growthInMetr);
        System.out.println(bodyMassIndex);
    }
}