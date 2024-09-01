import java.util.ArrayList;
import java.util.List;
public class Justification 
{
  public static List<String> fullJustify(String[] words, int maxWidth) 
  {
        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < words.length) 
        {
            int totalChars = words[index].length();
            int last = index + 1;
            while (last < words.length) 
            {
                if (totalChars + words[last].length() + 1 > maxWidth) break;
                totalChars += words[last].length() + 1;
                last++;
            }
            StringBuilder sb = new StringBuilder();
            int numWords = last - index;
            int numSpaces = maxWidth - totalChars;
            if (last == words.length || numWords == 1)
