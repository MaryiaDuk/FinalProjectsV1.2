package by.itacademy.annotations;

import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AnalysesAnnotations {
    public void show() {
        Reflections reflections = new Reflections("by.itacademy");
        Set<Class<?>> beanAnnotations = reflections.getTypesAnnotatedWith(Bean.class);
        List<Class<?>> list = new ArrayList<>();
        list.addAll(beanAnnotations);
        for (Class<?> aList : list) {
            System.out.println(aList.getAnnotation(Bean.class).name());
        }
        System.out.println("Классов с аннотацией Bean: " + list.size());
    }
}