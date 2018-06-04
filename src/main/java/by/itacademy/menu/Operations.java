package by.itacademy.menu;

import by.itacademy.exceptions.InputException;

import java.util.HashMap;
import java.util.Map;

public class Operations {
    private Map<Integer, Operation> operationMap = new HashMap<>();

    public void getOperationMap(int key) throws InputException {
        addOperations();
        operationMap.get(key).execute();
    }

    private void addOperations() {
        operationMap.put(1, new ShowOperation());
        operationMap.put(2, new FindOperation());
        operationMap.put(3, new StatisticOperation());
        operationMap.put(4, new ClassesInfoOperations());
        operationMap.put(0, new CloseOperation());
    }
}
