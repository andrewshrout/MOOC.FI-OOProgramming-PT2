
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Mikael");
        System.out.println("");
        printWithSmileys("Arto");
        System.out.println("");
        printWithSmileys("Matti");
    }
    
    private static void printWithSmileys(String characterString)
    {
        int totalWidth = characterString.length();
        if ( totalWidth <= 4 )
        {
            totalWidth += (totalWidth / 4);
        }
        else if ( totalWidth <= 5 )
        {
            totalWidth += (totalWidth / 5);
        }
        printRepeat(totalWidth, ":)");
        System.out.println("");
        smileyWrap(characterString);
        System.out.println("");
        printRepeat(totalWidth, ":)");
    }
    
    private static void printRepeat(int numberOfTimes, String whatsPrinted)
    {
        for ( int i = 0; i < numberOfTimes; i++ )
        {
            System.out.print(whatsPrinted);
        }
    }
    
    private static void smileyWrap(String wrapped)
    {
        int width = ( (wrapped.length() / 2) - 2 );
        if (width <= 1)
                {
                    width = 1;
                }
        System.out.print(":)");
        printRepeat(width," ");
        System.out.print(wrapped);
        if (wrapped.length() % 2 == 1)
        {
            printRepeat(width + 1," ");
        }
        else
        {
            printRepeat(width," ");
        }
        System.out.print(":)");
    }
}