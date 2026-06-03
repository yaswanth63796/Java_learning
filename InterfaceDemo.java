
interface A{

    int age=10;
    String name="Krishnagiri";
void show();
void config();
}


class B implements A{

     public void show(){
        System.out.println("it is show");
     }
    
     public void config(){
        System.out.println("it is config");
     }
}





public class InterfaceDemo {
     public static void main(String[] args) {
        
        A obj=new B();
        obj.show();
        obj.config();
        System.out.println(A.age);
        System.out.println(A.name);
        
}
}
