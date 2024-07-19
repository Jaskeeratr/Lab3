package ca.ucalgary.ensf380;

public class MyBook {
    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("Author One", "Address One", 50);
        Author author2 = new Author("Author Two", "Address Two", 45);

        // Print author details
        System.out.println("Author 1: " + author1.getName() + ", " + author1.getAddress() + ", " + author1.getAge());
        System.out.println("Author 2: " + author2.getName() + ", " + author2.getAddress() + ", " + author2.getAge());

        // Create a publisher
        Publisher publisher1 = new Publisher("Publisher One", "Address One");

        // Print publisher details
        System.out.println("Publisher: " + publisher1.getName() + ", " + publisher1.getAddress());

        // Create a classic book
        Classic classicBook = new Classic();
        classicBook.setTheAuthor(author1);
        classicBook.setBookPublisher(new Publisher[]{publisher1});
        classicBook.setOrigPubYear(1900);

        // Print classic book details
        System.out.println("Classic Book: Author - " + classicBook.getTheAuthor().getName() + ", Original Publication Year - " + classicBook.getOrigPubYear());
        for (Publisher pub : classicBook.getBookPublisher()) {
            System.out.println("Publisher: " + pub.getName() + ", " + pub.getAddress());
        }

        // Create an anthology
        Anthology anthology = new Anthology();
        Story story = new Story();
        story.setTheAuthor(new Author[]{author1, author2});
        anthology.setStory(new Story[]{story});

        // Print anthology details
        System.out.println("Anthology Stories:");
        for (Story s : anthology.getStory()) {
            for (Author a : s.getTheAuthor()) {
                System.out.println("Story Author: " + a.getName() + ", " + a.getAddress() + ", " + a.getAge());
            }
        }

        // Create a contract
        Contract contract = new Contract("2024-07-18", publisher1, new Author[]{author1, author2});

        // Print contract details
        System.out.println("Contract: Date - " + contract.getDate() + ", Publisher - " + contract.getPublisherInfo().getName());
        for (Author a : contract.getAuthorInfo()) {
            System.out.println("Contract Author: " + a.getName() + ", " + a.getAddress() + ", " + a.getAge());
        }

        // Print details of method calls
        System.out.println(contract.printContract());
        System.out.println(anthology.storyOrder());
        System.out.println(classicBook.createNotes());
    }
}
