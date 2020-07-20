package Lesson7;

public class Main {
    public static void main(String[] args) {
        GameCharacter gc = new GameCharacter();
        gc.walking();
        gc.run();

        ControlPlay cp = new GameCharacter();
        cp.bounce();
        cp.crawl();

        Player pl = new GameCharacter();
        pl.swim();
        pl.fire();

        System.out.println("------------------------- Используя лямбда выражения ------------------------- ");

        GamePlay gp = (Positioning[] command) -> {
            for(Positioning p : command) {
                p.down();
                p.leftTurn();
                p.rightTurn();
                p.up();
            }
        };

        Player ps = new GameCharacter();

        Positioning[] p = new Positioning[]{ps};

        gp.play(p);
    }
}
