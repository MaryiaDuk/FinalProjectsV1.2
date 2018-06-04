package by.itacademy.annotations;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MakeClassesList {
private List<Class<?>> classes = new ArrayList<Class<?>>();

    public MakeClassesList(List<Class<?>> classes) {
        this.classes = classes;
    }

    public List<Class<?>> makeList(String pkg) {
        File scannedDir = new File(new PackageFinder().find(pkg).getFile());
        for (File file : scannedDir.listFiles()) {
            classes.addAll(new ClassFinder().find(file, pkg));
        }
        return classes;
    }
}
