package de.arnav.model;

public class Buch {
    protected String titel;
    protected String autor;
    protected int seitenZahl;
    protected String genre;
    protected String[] content;

    public Buch(String titel, String autor, int seitenZahl, String genre, String[] content) {
        this.titel = titel;
        this.autor = autor;
        this.seitenZahl = seitenZahl;
        this.genre = genre;
        this.content = content;
    }

    public String getTitel() {
        return this.titel;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getSeitenZahl() {
        return this.seitenZahl;
    }

    public String getGenre() {
        return this.genre;
    }

    public String[] getContent() {
        return this.content;
    }
}
