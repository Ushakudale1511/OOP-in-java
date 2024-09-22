interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void show() {
        System.out.println("Showing document");
    }
}

 class A {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();  // Fixed to call the print() method instead of duplicate show() calls
        doc.show();   // Now correctly calls both print() and show()
    }
}
