package Lesson7;

public class GameCharacter extends Player {

    public GameCharacter() {
    }

    @Override
    public void walking() {
        super.walking();
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void crawl() {
        System.out.println("Игрое ползет");
    }

    @Override
    public void bounce() {
        System.out.println("Игрое прыгает");
    }

    @Override
    public void leftTurn() {

    }

    @Override
    public void rightTurn() {
        super.rightTurn();
    }

    @Override
    public void up() {
        System.out.println("Игрок лезет вверх");
    }

    @Override
    public void down() {
        System.out.println("Игрое лезет вниз");
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void fire() {
        super.fire();
    }
}
