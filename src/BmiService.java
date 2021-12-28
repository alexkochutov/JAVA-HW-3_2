public class BmiService {
    public float calculate(float height, float weight){

        float bmiValue = weight / (height * height);   // расчет индекса по формуле
        return bmiValue;                            // возвращаем индекс в класс main

    }
}
