import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override

    public String toString(){
        return "Student{name="+name+",age="+age+"}";

    }
   
    @Override
    public int compareTo(Student that){
       return  Integer.compare(this.age, that.age);
    }


}


public class ComparatorDemo {
    public static void main(String args[]){


        

        List<Student>list=new ArrayList<>();
        list.add(new Student(20,"Alice"));
        list.add(new Student(22,"Bob"));
        list.add(new Student(19,"Charlie"));
        list.add(new Student(21,"David"));

        Collections.sort(list);


        for(Student s:list){
            System.out.println(s);
        }
    }
}