public class MyClass {
    //field variables
    final int x = 100;
    int y = 2;
    static void myStaticMethod(){
        System.out.println("call static method with out creating obj");
    }
    public void myPublicMethod(){
        System.out.println("call public method by crating objects");

    }

    public static void main(String[] args) {
        myStaticMethod();
        MyClass obj = new MyClass();
        obj.myPublicMethod();



    }
}
