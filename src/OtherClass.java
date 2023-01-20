import com.sun.security.jgss.GSSUtil;

public class OtherClass {
    static void myStatcMethod(){
        System.out.println("acess With out creatng object of class");
    }
    public void myPublicMethod(){
        System.out.println("acess With object of class");
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        System.out.println(myObj.x);
        MyClass myObj1 = new MyClass();
        myObj.y = 12;
        System.out.println("original value "+ myObj.y);
        System.out.println("value of y override "+ myObj1.y);
        OtherClass objj = new OtherClass();
        objj.myPublicMethod();
        myStatcMethod();





    }
}
