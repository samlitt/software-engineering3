public class BMI {
    double bmi;
    int massInKg = 80;
    double heightInM = 1.80;
    public BMI() {

    }
    public void calcBMI(){
        bmi = massInKg/(heightInM*heightInM);
    }
}
