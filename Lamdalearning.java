
@FunctionalInterface
interface A{
    void show(int i);
}







public class Lamdalearning{
    public static void main(String[]args){
         A obj=(i)->System.out.println("value of i is "+i);
         obj.show(5);
    }
}