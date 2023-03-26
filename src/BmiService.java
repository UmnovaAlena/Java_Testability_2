public class BmiService {

    public double calculate(double weightInKg, double growthInMetr) {
        int result = (int) ((int) weightInKg / Math.pow(growthInMetr, 2));

        return result;
    }
}
