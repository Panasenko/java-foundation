package Lesson8;

import Lesson8.Exeptions.AdulthoodExeption;
import Lesson8.Exeptions.DateRangeExeption;

public class AgeVerification {

    private int age;
    public final int ADULTHOOD = 16;
    public final int MIN_YEARS = 0;
    public final int MAX_YEARS = 80;

    public void setAge(int age) throws AdulthoodExeption, DateRangeExeption {

      if (MIN_YEARS >= age || age > MAX_YEARS) {
            throw new DateRangeExeption(age);
        } else if (age <= ADULTHOOD) {
            throw new AdulthoodExeption(age);
        }

        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
