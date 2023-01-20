public class Car {
    int modelYear;
    String modelName;
    String undfind;
    public void fullThrottle(){
        System.out.println("The car id gone");
    }
    public void speed(int max){
        System.out.println("The car is on its speed "+max);
    }
    public Car(int mmy,String mmn){
        modelName = mmn;
        modelYear = mmy;

    }
    public Car(int m1){
        modelYear = m1;
    }
    public Car(int m3, String name, String gog){
        modelYear=m3;
        modelName=name;
        undfind=gog;
    }

    public static void main(String[] args) {
        Car myCar = new Car(2090,"TOYOTA");
       myCar.speed(200);
       myCar.fullThrottle();
        Car myCar4 = new Car(2099,"TOYOTA max");
        System.out.println("car name "+myCar4.modelName+" \n"+"car year " + myCar4.modelYear);


        System.out.println("      .....     ");
        Car myCar2 = new Car(5674);
        System.out.println("car name "+myCar.modelName+" \n"+"car year " + myCar.modelYear);

        System.out.println("     .....    ");
        System.out.println("model car"+myCar2.modelYear);
        Car mycar3 = new Car(675,"Yaris","uknown");
        System.out.println("     .....     ");
        System.out.println("model car 7 "+ mycar3.modelName+ "\n"+ "ewwww = "+ mycar3.undfind);

    }

}
