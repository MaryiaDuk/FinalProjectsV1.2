package by.itacademy.menu;

import by.itacademy.annotations.ShowInfo;
import by.itacademy.exceptions.InputException;

public class ClassesInfoOperations extends InputChoice implements Operation, MenuSkin {

    @Override
    public int skin() {
        System.out.println("1. Общее количество классов");
        System.out.println("2. Классы с аннотацией Bean");
        return input();
    }

    private void show(int choice) throws InputException {
        if (choice == 1)
            new ShowInfo().showAll();
        if (choice == 2) {
            new ShowInfo().showWithAnnotation();
        }
    }

    @Override
    public void execute() throws InputException {
        show(skin());
    }
}
