package Lesson8.Exeptions;

public class AdulthoodExeption extends RuntimeException {

    /**
     * Исключение выбрасываемо в случае, если возраст не соответствует достижения совершеннолетия
     */

    private int age;

    public AdulthoodExeption(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }





}
