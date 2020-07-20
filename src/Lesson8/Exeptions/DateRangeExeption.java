package Lesson8.Exeptions;

public class DateRangeExeption extends Exception{

    /**
     * Исключение выбрасываемо в случае, если возраст не соответствует достижения совершеннолетия
     */

    private int age;

    public DateRangeExeption(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


}
