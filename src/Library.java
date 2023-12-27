import java.util.Scanner;

public class Library {
   static  Book[] books=new Book[5];
    static int index=0;
       public static void add(Book b) {

        books[index]=b;
        index++;
    }
    public static void remove(int bookId)
    {
        int delI=0;
        for(int i=0;i<index;i++)
        {
            if(books[i].bookId==bookId)
            {
                books[i]=null;
                delI=i;
                break;
            }}
            for(int j=delI;j<index;j++)
            {
              books[j]=books[j+1];
            }
            index--;

    }
    public static  void display()
    {for(int i=0;i<index;i++)
      System.out.println(books[i].bookId+" "+books[i].title+" "+books[i].author);
    }
        static Book book;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bookId;
        String title;
        String author;
        System.out.println("Enter the total number of books to be added");
        int n=s.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.println("Enter the "+i+" book details");
            bookId = s.nextInt();
            title = s.next();
            author = s.next();
            Book b = new Book(bookId, title, author);
            add(b);
        }
        System.out.println("Before removing");
        display();
        remove(2);
        System.out.println("After removing");
            display();


        }
    }

