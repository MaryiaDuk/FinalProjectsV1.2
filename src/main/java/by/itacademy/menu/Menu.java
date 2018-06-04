package by.itacademy.menu;

import by.itacademy.annotations.Bean;
import by.itacademy.exceptions.InputException;

@Bean(name = "Главное меню")
public class Menu extends InputChoice implements MenuSkin {
    private Operations operations = new Operations();

    public void start() throws InputException {
        while (true)
            operations.getOperationMap(skin());
    }

    @Override
    public int skin() {
        System.out.println("1.Показать погоду.");
        System.out.println("2.Поиск.");
        System.out.println("3.Статистика.");
        System.out.println("4. Информация о классах");
        System.out.println("0.Выход.");
        return input();
    }
}
