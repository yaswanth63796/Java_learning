class A{
       
     public A(){
        super();
            System.out.println("A class constructor");
     }
     public A(int a){
        super();
        
     System.out.println("A class constructor"+a);
     }
}

class B extends A{
   
    public B(){
        super();
        System.out.println("B Default Constructor");

    }

    public B(int x){
        this();
        System.out.println("B Parameterized Constructor "+x);

    }
}



public class Application {
    public static void main(String []args){
           B obj=new B(5);
    }
}
