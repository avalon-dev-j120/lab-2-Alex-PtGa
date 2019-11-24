package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Задание №2
 *
 * <p>
 * Тема: "Потоковый ввод-вывод. Чтение и запись данных в текстовом режиме".
 */
public class Task2 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        File input = new File("assets/countries.txt");
        File output = new File("countries_text_mode_output.txt");
        String text = read(input);
        write(output, text);

        /*
         * TODO(Студент): Выполнить задание №2
         *
         * 1. Реализовать метод read.
         *
         *    При чтении файла следует пользоваться типами данных:
         *    Reader, FileReader.
         *
         *    Для сохранения прочитанных данных следует пользоваться
         *    классом StringBuilder.
         *
         * 2. Реализовать метод write.
         *
         *    При реализации метода следует пользоваться типами данных:
         *    Writer и FileWriter.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение указанного файла в текстовом режиме.
     *
     * <p>
     * Весь текст файла возвращается в виде одного экземпляра типа
     * {@link String}.
     *
     * @param file файл
     * @return содержимое файла в виде текста.
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private String read(File file) throws IOException {

        StringBuilder sB;
        System.out.println("method read");
// гарантия закрытия потоков
        try (Reader rD = new FileReader(file)) {
// создадим объект класса StringBuilder с 
// создадим так же символьный массив в который будет считываться содержимое файла
            sB = new StringBuilder();
            char[] buffer = new char[127];
            int len;
// пройдёмся циклом по содержимому файла и добавим в созданный сивольный массив
            while ((len=rD.read(buffer)) != -1) {
                sB.append(buffer, 0, len);
            }
// возврат содержимого             
            return sB.toString();
        }
    }

    /**
     * Выполняет запись текстоых данных в файл в текстовом режиме.
     *
     * @param file файл
     * @param text текст
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private void write(File file, String text) throws IOException {
        try (Writer wR = new FileWriter(file)) {
            // запишем ранее прочитанное в вновь соданный файл
            wR.write(text.toCharArray());
        }
        /**
         * почему то записывает не совесем по порядку ..
         * ET:Эфиопия
         * ZA:Южная Африка
         * GS:Южная Джорджия и Южные Сандвичевы Острова
         * JM:Ямайка
         * JP:ЯпонияГвинея         ??? - почему то не в конце Япония (не по алфавиту)
         * - предположительно из-за  применения метода "append(buffer)"
         * - проблема решилась при создани и применении переменной len,
         * - а так же применении метода "append(buffer, 0, len)"
         * - предпложительно это происходит из - за того, что не описаны четкие границы 
         * - записи и при создании экземпляра класса StringBuilder создаётся дополнительно символы
         * ER:Эритрея
         * EE:Эстония
         * ET:Эфиопия
         * ZA:Южная Африка
         * GS:Южная Джордж
         */
    }
}
