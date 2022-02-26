package Lesson5;

public class Dog extends Animals {
    public boolean run(int distance) {
        if (distance == 500) {
            return true;
        } else {
            return false;


        }

    }

    public boolean jump(double height) {
        if (height == 0.5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean swim(int distance) {
        if (distance == 10) {
            return true;
        } else {
            return false;
        }
    }
}
