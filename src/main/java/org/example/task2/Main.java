package org.example.task2;

public class Main {
    public static void main(String[] args) {
        SmartDocument document = new SmartDocument("gs://oop-course/Geico-2021.png");
//        document = TimedDocument(document);
        CashedDocument doc = new CashedDocument(document);
        System.out.println(doc.parse());


    }
}
