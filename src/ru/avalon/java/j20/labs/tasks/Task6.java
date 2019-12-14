package ru.avalon.java.j20.labs.tasks;

import java.io.BufferedReader;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Country;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Задание №6
 *
 * <p>
 * Тема: "Потоковый ввод-вывод. Получение объекта на основании прочитанных
 * данных".
 */
public class Task6 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        File input = new File("assets/countries.txt");
        Collection<Country> countries = read(input);
       
        for(Country c : countries) {
            System.out.println(c);
        }
        /*
         * TODO(Студент): Выполнить задание №6
         *
         * 1. Реализовать метод read.
         *
         * 2. При реализации следует пользоваться классами:
         *    BufferedReader и Country.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение коллекции объектов типа {@link Country} из указанного
     * файла.
     *
     * <p>
     * Выполняет чтение файла построчно. Преобразование из текста в объект
     * выполняется с использованием метода {@code valueOf} класса
     * {@link Country}.
     *
     * @param file файл
     * @return коллекция объектов типа {@link Country}
     * @throws IOException в случае ошибки ввода-вывода.
     */
   
    private Collection<Country> read(File file) throws IOException {
        Country s = null;
        String t;
        Collection<Country> collection = new ArrayList<>();

// гарантия закрытия потоков
        /**
         * такой способ гибкий для изменения ссылочных переменных при работе с
         * кодом try (FileReader fR = new FileReader(file); BufferedReader bR =
         * new BufferedReader(fR)) {
         */
// более компактное изложение 
        try (BufferedReader bR = new BufferedReader(new FileReader(file))) {

// создание строки для считывания
            while ((t = bR.readLine()) != null) {
                try {
                    // создается два значения и значения ложатся в поля
                    // преобразование String в Country
                    s = Country.valueOf(t);
                } catch (ParseException ex) {
                    System.out.println("Ошибка преобразования разбора строки в объект страна");
                }
                collection.add(s);
                //  System.out.println(s);
            }
        }
        return collection;
    }
}
// выводить имя и код каждой страны правильно цикл составить