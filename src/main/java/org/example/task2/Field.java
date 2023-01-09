package org.example.task2;

public class Field {
    private static int iid = 1;
    private int id = iid++;
    private String gcsPath;
    private String texts;

    public Field(String gcsPath, String text) {
        this.gcsPath = gcsPath;
        this.texts = text;
    }

    public void save(){
        Database database = Database.getInstance();
        database.executeQuery(String.format("insert into field (gcsPath, texts) values ('%s', '%s')", gcsPath, texts));
    }
}
