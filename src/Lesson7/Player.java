package Lesson7;

public abstract class Player implements ControlPlay, Positioning {

    @Override
    public void walking() {
        System.out.println("Игрок идет");
    }

    @Override
    public void run() {
        System.out.println("Игрок бежит");
    }

    @Override
    public void leftTurn() {
        System.out.println("Игрок повернул на лево");
    }

    @Override
    public void rightTurn() {
        System.out.println("Игрок повернул на право");
    }

    public void swim(){
        System.out.println("Игрок плавает");
    }

    public void fire(){
        System.out.println("Игрок стреляет");
    }
}
