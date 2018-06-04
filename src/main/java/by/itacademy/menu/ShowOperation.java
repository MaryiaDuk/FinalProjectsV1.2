package by.itacademy.menu;

import by.itacademy.annotations.Bean;
import by.itacademy.sort.DefaultSorting;
import by.itacademy.sort.SortByDescription;

@Bean(name = "Показ погоды")
public class ShowOperation extends InputChoice implements Operation, MenuSkin {

    private void show(int choice) {
        if (choice == 1) {
            new DefaultSorting().defSort();
        }
        if (choice == 2) {
            new SortByDescription().descSort();
        }
    }

    @Override
    public void execute() {
        show(skin());
    }

    @Override
    public int skin() {
        System.out.println("Сортировка по:");
        System.out.println("1 - Городам");
        System.out.println("2 - Погоде");
        return input();
    }
}