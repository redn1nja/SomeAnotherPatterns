package org.example.task2;

import javax.print.Doc;

public class TimedDocument implements Document{
    private final Document document;

    public TimedDocument(Document document){
        this.document = document;
    }
    @Override
    public String parse() {
        long startTime = System.currentTimeMillis();
        String text = document.parse();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        return text;
    }
}
