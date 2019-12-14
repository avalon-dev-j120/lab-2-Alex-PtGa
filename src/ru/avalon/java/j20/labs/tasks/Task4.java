package ru.avalon.java.j20.labs.tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import ru.avalon.java.j20.labs.Task;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Задание №4
 *
 * <p>
 * Тема: "Потоковый ввод-вывод. Чтение файлов конфигурации".
 */
public class Task4 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        Properties properties = read("resources/database");

        System.out.println(properties.toString());
//      
        // stringPropertyNames() Возвращает набор ключей в этом списке свойств,
        // где ключ и его соответствующее значение являются строками, включая отдельные ключи 
        // в списке свойств по умолчанию, если ключ с таким именем еще не был найден в основном списке свойств.

        /*
         * TODO(Студент): Выполнить задание №4
         *
         * 1. Реализовать метод read.
         *
         * 2. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение файла конфигураций описанного параметром {@code path}.
     *
     * @param path путь к конфигурации
     * @return новый экземпляр типа {@link Properties}
     */
    private Properties read(String path) throws IOException {

        Properties properties = new Properties();
        try (InputStream stream = this.getClass().getResourceAsStream(path)) {
//        InputStream stream;
//        stream = new FileInputStream(path);
            properties.load(stream);

            return properties;
        }
    }
// создадим экземпляр класса InputStream через загрузчик классов
// вызвав метод для чтения ресурса с указанным именем из пути поиска, 
// используемый для загрузки классов.
    //     try (Reader stream = ClassLoader.getSystemResourceAsStream(path);) {
}
