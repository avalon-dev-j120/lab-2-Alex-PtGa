package ru.avalon.java.j20.labs.models;

import java.io.BufferedReader;
import java.text.ParseException;

/**
 * Модель представления о стране.
 */
public class Country {

//    public static String valueOf(BufferedReader bR) {
//    
//    }
    /**
     * Код страны.
     */
    private final String code;
    /**
     * Название страны.
     */
    private final String name;

    /**
     * Основное конструктор класса.
     *
     * @param code код страны
     * @param name название страны
     */
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Возвращает код страны.
     *
     * @return строковый код страны
     */
    public String getCode() {
        return code;
    }

    /**
     * Возвращает название страны.
     *
     * @return название страны
     */
    public String getName() {
        return name;
    }

    /*
     * TODO(Студент): для класса Country переопределить методы equals и hashCode
     */
    /**
     * Возвращает экземпляр страны созданный из переданного текста в формате
     * 'Код:Название'.
     *
     * @param text текст в формате 'Код:Название'
     * @return новый экземпляр типа {@Link Country}.
     * @throws ParseException в случае, если переданная строка имеет неверный
     * формат.
     */
    public static Country valueOf(String text) throws ParseException {
        /*
         * TODO(Студент): Реализовать метод valueOf класса Country
         */

        Country strana = null;
        String code = null, name = null;
        String text1 = code + ":" + name;
        if (text.equals(text1)) // преобразование String в Country
        {
            strana = Country.valueOf(text);
        }
        return strana;
    }
}
