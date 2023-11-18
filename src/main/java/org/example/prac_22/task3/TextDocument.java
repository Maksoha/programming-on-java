package org.example.prac_22.task3;

import java.io.IOException;

public class TextDocument implements IDocument
{
    public TextDocument() {
        try {
            Runtime.getRuntime().exec("notepad");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
