package org.example.task2;

import lombok.Getter;
import lombok.Setter;

public interface Document {
    @Getter
    public String gcsPath = null;
    String parse();

    String getGcsPath();
}
