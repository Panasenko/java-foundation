package Lesson8;

import Lesson8.Exeptions.AdulthoodExeption;
import Lesson8.Exeptions.DateRangeExeption;

import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    static Logger LOGGER;

    /**
     * Необходимо изменить адрес нахождения файла конфигурации указав абсолютный путь
     */

    static {
        try(FileInputStream ins = new FileInputStream("/home/maks/Develop/Java/Cours_Java/HomeWork/src/Lesson8/log.config")){

            LogManager.getLogManager().readConfiguration(ins);

            LOGGER = Logger.getLogger(Main.class.getName());

        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }


    /**
     *
     * Кастомные эксепшены выбрасываются при условиях указания возраста клиента в методе av.setAge();
     * В случаях, если возраст меньше 0 или больше 80, а также, если клиенту меньше 16
     */

    public static void main(String[] args) {

        AgeVerification av = new AgeVerification();

        try {
            av.setAge(89);
            System.out.println("Клиенту " + av.getAge() + " лет.");
        }  catch (DateRangeExeption de){
            LOGGER.log(Level.WARNING,"Извините, возраст клиента не входит в необходимый диапазон! Ему - " + de.getAge() );
        } catch (AdulthoodExeption e) {
            System.out.println();
            LOGGER.log(Level.INFO,"Извините, клиент несовершеннолетний! Ему - " + e.getAge() );
        }


    }
}
