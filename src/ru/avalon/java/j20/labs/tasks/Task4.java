package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.IOException;
import java.io.InputStream;
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
        //      String path = "resources/database";
        //    try (InputStream input = getClass().getClassLoader().getResourceAsStream(path)) {
        //      properties.load(input);

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

// создадим экземпляр класса Properties
        Properties properties = new Properties();
// создадим экземпляр класса InputStream через загрузчик классов
// вызвав метод для чтения ресурса с указанным именем из пути поиска, 
// используемый для загрузки классов.
        try (
                InputStream stream = ClassLoader.getSystemResourceAsStream(path);) {

            //   try (InputStream stream = this.getClass().getResourceAsStream(path)) {
            properties.load(stream);

        }
        return properties;
    }
}
