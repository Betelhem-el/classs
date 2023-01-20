public class Employe {
    int id;
    String name;
   double salary;
   Employe(double sal){
       this.salary= sal;
    }
   Employe(int id2,String name2){
        this.name =name2;
        this.id=id2;
    }
    Employe(int id3,String name3, double sal){
        this.id = id3;
        this.name =name3;
        this.salary = sal;
    }

    public static void main(String[] args) {
        Employe em1 = new Employe(12.54);
        System.out.println("    ......\n"+"em1 info "+"salary "+em1.salary);
        Employe em2 = new Employe(432,"lema",78.90);
        System.out.println("    ......\n"+"em2 info\n"+"id "+em2.id+"\nname "+em2.name+"\nsalary "+em2.salary);


    }
}
