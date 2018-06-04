package by.itacademy.threads;

import by.itacademy.exceptions.ReadingOnlineBaseException;
import by.itacademy.parsing.parsingXML.ParsingXML;
import by.itacademy.weathers.Weather;

import java.util.ArrayList;
import java.util.List;

public class ParseXMLThread implements Runnable {
    private Thread thread;
    private List<Weather> list = new ArrayList<>();

    public ParseXMLThread() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            list.addAll(new ParsingXML().read());
        } catch (ReadingOnlineBaseException e) {
            e.printStackTrace();
        }
    }

    public List<Weather> getList() {
        return list;
    }

    public Thread getThread() {
        return thread;
    }
}
