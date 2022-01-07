public class BmiService {
    public double calculate(double massa, double height) {
        double bodyMassIndex;
        bodyMassIndex = massa / (height * height);
        return bodyMassIndex;
    }
}
