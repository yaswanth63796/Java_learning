
import java.net.CacheRequest;

interface Computer{
     void code();
}


class Desktop implements Computer{
    public void code(){
    System.out.println("Code,compile,run in desktop");
    }
}


class Laptop implements Computer{
    public void code(){
    System.out.println("Code,compile,run in laptop");
    }
}


class Devloper{
      public void code(Computer lap){
        lap.code();
        System.out.println("Coding in java");
      }
}



public class DevloperDemo {
    

    public static void main(String[]args){
     
        Computer desk=new Desktop();
        Computer lap=new Laptop();
        Devloper dev=new Devloper();
        dev.code(lap);

         
    }
}
