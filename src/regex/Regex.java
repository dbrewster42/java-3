import java.util.Arrays;
import java.util.regex.*;

class Regex {
    public static void main(String[] args) {

        // 1. What does the following pattern match? (\d){36} explain in a println() statement.

        System.out.println("The following pattern ('\\d'){36} matches :any number(digit) 36 times");

        String[] TEKmentors = { "Amir Yunas", "Mark Bennet", "Rosa Garcia", "Desaree Byers", "Abram Jablonski",
                "Dylan Fellows", "Emilios Papas", "Jonathan Diamond" };

        // 2. Create a new array of the first names of the TEKmentors.  Use Regex to only grab the first name of every TEKmentor.
        //  Push the values to a new array
        String[] tekMentors = new String[8];
        for (String a : TEKmentors) {
            Pattern pattern = Pattern.compile("\\w+");
            Matcher matcher = pattern.matcher(a);
            if (matcher.find()) {
                a = matcher.group();
                System.out.println(a);
            }
        }

        // 3. Find all the occurences of any form of 'book' in the following paragraph. use regex to match the occurences
        // and store the count of books in an int.

        int bookCount = 0;
        String bookText = "Books are the keys to knowledge.  I didn't like to read books as a child, but in college I started enjoying learning and reading books. You can borrows books from the library, or you can buy them from the bookstore. I'm not sure if I prefer paperback books or hardcover books.  I'm such a nerd that I even like textbooks.  With the advent of technology, you can even buy "
                + "digital books, such as kindle-books, nook-books, or other e-books. My personal favorite book format are pdf-books, because I don't "
                + "have to carry so many books around wherever I go.  All the books are on my ipad or laptop.  When I lived abroad, they would give "
                + "books to students absolutely free.  Free books for a student of knowledge is like a kid in a candy store.  So wipe the dust off of "
                + "your books, and remember the slogan from 'reading rainbow' : 'Take a look! It's in a book! Reading Rainbow!";

        int count = 0;
        String book = "book";
        Pattern pattern2 = Pattern.compile(book);
        Matcher matcher2 = pattern2.matcher(bookText);
        boolean matchFound = matcher2.find();
        while (matchFound == matcher2.find()) {
            count++;
        }
        System.out.println(count);

        // 4.a Create an array of all the words besides the word 'sleepy'.  Each word does not have to be a separate element,
        // although you can split it that way if you wish.  We just want an array that everything that is not 'sleepy'.  

        String sleepy = "I felt sleepy because I saw the others were sleepy and because I knew I should feel sleepy, but I wasn't really sleepy.  If you're sleepy and you know it, clap your hands.  Keep on being sleepy until you actually become sleepy";
        String[] sleepArr = sleepy.split("sleepy");
        // System.out.println(sleepArr);
        // 4.b combine the array that you just created into a string
        // String not_sleepy; //punctuation marks will be here
        String not_sleepy = String.join(" ", sleepArr);
        //4.c remove the punctuation marks from the notSleepy string.
        // String notSleepy; //no punctuation marks should be here.
        String[] split = not_sleepy.split("\\W");
        String notSleepy = String.join(" ", split);
        System.out.println(notSleepy);
        //4.d Now replace all the occurences of 'sleepy' with the word 'happy'.  Call the new string happy.  
        String happy = String.join("happy", sleepArr);
        System.out.println(happy);
        // String happy;

        //BONUS : 
        //5. You are looking for unicode arrow symbols in a string.  https://jrgraphix.net/r/Unicode/2190-21FF is a selection of
        // unicode arrow symbols to aid you in your search.  Match all the codes that are arrows, and then print them out to the console.
        //  They should be printing out as the arrow images.

        String[] arrows = { "\u21FD", "\u26F7", "\u21FF", "\u21EF", "\u21EC", "\u26F9", "\u26FD", "\u26D4", "\u26A5",
                "\u21FD", "\u2190", "\u26A1", "\u21BA", "\u2196", "\u2603", "\u21FD" };

        String unicode = "\\21";
        Pattern pattern3 = Pattern.compile("\\..21");

        for (String uni : arrows) {
            System.out.println(uni);
            Matcher matcher3 = pattern3.matcher(uni);
            if (matcher3.find())
                System.out.println(uni);
        }
    }
}
