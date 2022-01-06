public class BmiService {
    public double calculate(double massa, double height) {
        double bodymassindex;
        bodymassindex = massa/(height*height);
        return bodymassindex;
    }
}
