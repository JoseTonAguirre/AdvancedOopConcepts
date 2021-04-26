public class BookArray
{
    public static void main(String[] args)
    {
        Book[] books = new Book[10];

        books[0] = new Fiction("Harry Potter and the Philosopher's Stone");
        books[1] = new NFiction("Hidden Figures: The True Story of Four Black Women and the Space Race");
        books[2] = new Fiction("The Hunger Games");
        books[3] = new NFiction("Locomotive");
        books[4] = new Fiction("Winnie-the-Pooh");
        books[5] = new NFiction("Mama Built a Little Nest");
        books[6] = new Fiction("Northern Lights");
        books[7] = new NFiction("Moonshot: The Flight of Apollo 11");
        books[8] = new Fiction("The Lion, the Witch and the Wardrobe");
        books[9] = new NFiction("Freedom in Congo Square");

        for(int x = 0; x < books.length; ++x)
        {
            System.out.println("Title of Book: " + books[x].getTitle() + "cost: $" + books[x].getPrice());
        }
    }
}