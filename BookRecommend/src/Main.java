public class Main {
    public static void main(String[] args) {
        Library carturesti = new Library();

        Book Enigma_Otiliei = new Book("Enigma Otiliei", 1933, "G Calinescu", 16, 27);
        Book Ion = new Book("Ion", 1920, "Liviu Rebreanu", 18, 35);
        Book Ultima_Noapte_De_Dragoste_Intaia_Noapte_De_Razboi
                = new Book("Ultima noapte de dragoste intaia noapte de razboi", 1930, "Camil Petrescu", 17, 30);
        Book FNAF = new Book("Five Nights at Freddy's", 2015, "Scott Cawthon", 20, 50);
        Book Telltale = new Book("The last of us", 2014, "Square Enix", 20, 50);
        Book Undertale = new Book("Undertale", 2015, "Toby Fox", 20, 50);

        Student Ciprian = new Student("Wang Ciprian Yue", 16);

        carturesti.addBook(Enigma_Otiliei);
        carturesti.addBook(Ion);
        carturesti.addBook(Ultima_Noapte_De_Dragoste_Intaia_Noapte_De_Razboi);
        carturesti.addBook(FNAF);
        carturesti.addBook(Telltale);
        carturesti.addBook(Undertale);

        carturesti.sortBooks();

        for(int i=0; i<(carturesti.getBooks()).length ;i++){
            System.out.println("Title: " + ((carturesti.getBooks())[i]).getTitle() + ", Price: " + ((carturesti.getBooks())[i]).getPrice() +
                    ", Year: " + ((carturesti.getBooks())[i]).getYear() + ", Recommended Age: " + ((carturesti.getBooks())[i]).getRecommendedAge());
        }

        carturesti.recommendBooksForUser(Ciprian);


    }
}
