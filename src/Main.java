public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        float height = 1.88F;    // рост в метрах
        float weight = 105F;     // масса в килограммах

        System.out.println(service.calculate(height, weight));

    }
}
