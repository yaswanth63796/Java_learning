
class A{
    void show1(){
        System.out.println("in A show");
    }
}
class B extends A{
    void show2(){
        System.out.println("in B show");
    }

}


public class Upcast {
    public static void main(String[]args){
      //A obj=(B)new B();//upcasting

      A obj=new B();

      B obj1=(B)obj;
      obj1.show2();//downcasting



      
    }
}
