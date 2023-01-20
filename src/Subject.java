public class Subject {
    int x; //attribute
    public Subject(){
        x=5;//set inital value for class Subject
    }
    public Subject(int y){
        x=y;
    }

    public static void main(String[] args) {
        Subject subject = new Subject();//to call constructor
        System.out.println(subject.x);//print value of x
        Subject subject1 = new Subject(4);
        System.out.println("cons with "+ subject1.x);

    }
}
