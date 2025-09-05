package de.arnav;

public class Buch {
    protected String autor;
    protected int seitenZahl;
    protected String genre;
    protected String[] content;

    public Buch(String autor, int seitenZahl, String genre, String[] content) {
        this.autor = autor;
        this.seitenZahl = seitenZahl;
        this.genre = genre;
        this.content = content;
    }

    public String lesen(int seitenZahl) {
        this.seitenZahl = seitenZahl;
        return this.content[seitenZahl];
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
