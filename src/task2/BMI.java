package task2;

public class BMI {
    double massInKg;
    double heightInM;
    public BMI(double mass, double height) {
        massInKg = mass;
        heightInM = height;
    }

    public double calcBMI(){
        try{
            System.out.println("Berechne BMI ...");
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        double bmi = massInKg/(heightInM*heightInM);
        bmi = Math.round(bmi);
        System.out.println("Der BMI ist: " + bmi);
        return bmi;
    }

    public String bestimmeGewichtsZustand(double bmi){
        try{
            Thread.sleep(2000);
            System.out.println("Bestimme Gewichtszustand aus BMI...");
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        if ( bmi <= 18.5 ) return "untergewichtig";
        if ( bmi > 18.5 && bmi <= 25 ) return "normalgewichtig";
        else return "übergewichtig";
    }
}
