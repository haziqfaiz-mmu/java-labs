class TestLibrary {
    public static void main(String[] args) {

        Library libMedia = new Library();
        
        Book b = new Book ("Java Programming", "1111-28735");
        libMedia.add (b);
        System.out.println (libMedia.retrieveLast());
        
        Video v = new Video ("Lord of the Rings", 150.0);
        libMedia.add (v);
        System.out.println (libMedia.retrieveLast());
        
        int postcode = 63000;
        libMedia.add (postcode);
        System.out.println (libMedia.retrieveLast());
        
        }
    }