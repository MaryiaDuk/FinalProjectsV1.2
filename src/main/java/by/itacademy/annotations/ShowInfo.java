package by.itacademy.annotations;

import java.util.ArrayList;
import java.util.List;

public class ShowInfo {
    private String name = "by.itacademy";
    private List<Class<?>> classes = new ArrayList<>();

    public void showAll() {
        new MakeClassesList(classes).makeList(name);
        int countClasses = 0;
        for (Class<?> aClass : classes) {
            System.out.println(aClass.toString());
            countClasses++;
        }
        System.out.println("Всего классов: " + countClasses);
    }

    public void showWithAnnotation() {
        new MakeClassesList(classes).makeList(name);
        int count = 0;
        for (Class<?> aClass : classes) {
            if (aClass.isAnnotationPresent(Bean.class)) {
                System.out.println(aClass.toString() + " - " +
                        aClass.getAnnotation(Bean.class).name());
                count++;
            }
        }
        System.out.println("Количество классов с аннотацией Bean: " + count);
    }
}