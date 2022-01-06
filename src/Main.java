public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int massa = 80;
        double height = 1.76;
        double bodymassindex = service.calculate(massa, height);
        System.out.println(bodymassindex);
    }
}
