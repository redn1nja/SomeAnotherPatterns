package org.example.task2;

public class CashedDocument implements Document{
    private Document document;
    private String gcsPath;
    private Database db = Database.getInstance();

    public CashedDocument(Document document) {
        this.document = document;
        this.gcsPath = document.getGcsPath();
    }

    @Override
    public String parse() {
        if (db.searchQuery(String.format("SELECT * FROM FIELD WHERE gcsPath = '%s'", gcsPath))==null){
            String text = document.parse().replace("'", "");
            Field field = new Field(gcsPath, text);
            field.save();
            return text;
        }
        return db.searchQuery(String.format("SELECT * FROM FIELD WHERE gcsPath = '%s'", gcsPath));
    }

    @Override
    public String getGcsPath() {
        return gcsPath;
    }
}
