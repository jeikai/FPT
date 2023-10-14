package Interface;

import java.util.Scanner;

interface IDocument {
    public void input();
    public void show();
}

abstract class Book implements IDocument {
    private int id;
    private String bookName;
    private String authorName;
    private float price;

    Book() {
        id = 0;
        bookName = "";
        authorName = "";
        price = 0;
    }

    Book (int _id, String _bookName, String _authorName, float _price) {
        id = _id;
        bookName = _bookName;
        authorName = _authorName;
        price = _price;
    }

    public void input() {
        id = new Scanner(System.in).nextInt();
        bookName = new Scanner(System.in).nextLine();
        authorName = new Scanner(System.in).nextLine();
        price = new Scanner(System.in).nextFloat();
    }

    public void show() {
        System.out.println(id + " "+ bookName + " " + authorName + " " + price);
    }
}
abstract class DocumentManager implements IDocument {
    public void addDocument() {
        int n = new Scanner(System.in).nextInt();
    }
}