package Lesson5;

public class Cat extends Animals{
    public boolean run (int distance){
        if(distance==200){
            return true;
        }else {
            return false;
        }
    } public boolean jump (double height){
        if(height==2){
            return true;
        }else {
            return false;
        }
    } public void swim (int distance){
        if(distance>0){
            System.out.println("Cat can not swimm");
        }
    }
}
