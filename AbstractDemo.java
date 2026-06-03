 abstract class Car{
    abstract public void drive();

    public void playMusic(){
        System.out.println("Playing music");
    }
}

class WagonR extends Car{
    public void drive(){
        System.out.println("Driving WagonR");
    }
    
}


public class AbstractDemo {
    public static void main(String[]args){
        Car car=new WagonR();
        car.drive();
        car.playMusic();

    }
}
