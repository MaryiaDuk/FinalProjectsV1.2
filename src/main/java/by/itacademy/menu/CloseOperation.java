package by.itacademy.menu;

import by.itacademy.annotations.Bean;

@Bean(name = "Выход из программы")
public class CloseOperation implements Operation {

    @Override
    public void execute() {
        System.exit(0);
    }
}
