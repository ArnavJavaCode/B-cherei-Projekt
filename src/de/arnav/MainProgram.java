package de.arnav;

public class MainProgram {

    public static Buch[] buecher = new Buch[] {
            new Thriller("Buch 1", "Francesco Lupo", 0, null, new String[]{ "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet." }),
            new Drama("Buch 2", "Francesco Lupo", 0, null, new String[]{ "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet." }),

    };

    public static void main(String[] args) {
        for (int i = 0; i < buecher.length; i++) {
            System.out.println(buecher[i].getTitel());
            System.out.println(buecher[i].getAutor());
            for (int j = 0; j < buecher[i].content.length; j++) {
                System.out.println("Seite " + j + ":");
                System.out.println(buecher[i].getContent()[j]);
                System.out.println();
            }
        }

    }
}
