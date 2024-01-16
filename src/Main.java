public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 12");
        System.out.println();

        Author jackLondon = new Author("Jack", "London");
        Author johnSteinbeck = new Author("John", "Steinbeck");

        Book loveOfLife = new Book("Love of Life", jackLondon, 1905);
        Book theGrapesOfWrath = new Book("The Grapes of Wrath", johnSteinbeck, 1939);

        System.out.println("         Проверка 1");
        System.out.println();

        System.out.println("            Книга 1");
        System.out.println("Автор: " + jackLondon.getName() + " " + jackLondon.getLastName());
        System.out.println("Наименование: " + loveOfLife.getName());
        System.out.println("Год издания: " + loveOfLife.getYearPublication());
        System.out.println();
        System.out.println("            Книга 2");
        System.out.println("Автор: " + johnSteinbeck.getName() + " " + johnSteinbeck.getLastName());
        System.out.println("Наименование: " + theGrapesOfWrath.getName());
        System.out.println("Год издания: " + theGrapesOfWrath.getYearPublication());
        System.out.println();

        System.out.println("         Проверка 2 - новый год издания");
        System.out.println();

        System.out.println("            Книга 1");
        loveOfLife.setYearPublication(1907);
        System.out.println("Автор: " + jackLondon.getName() + " " + jackLondon.getLastName());
        System.out.println("Наименование: " + loveOfLife.getName());
        System.out.println("Год издания: " + loveOfLife.getYearPublication());
        System.out.println();
        System.out.println("            Книга 2");
        theGrapesOfWrath.setYearPublication(1940);
        System.out.println("Автор: " + johnSteinbeck.getName() + " " + johnSteinbeck.getLastName());
        System.out.println("Наименование: " + theGrapesOfWrath.getName());
        System.out.println("Год издания: " + theGrapesOfWrath.getYearPublication());
    }
}