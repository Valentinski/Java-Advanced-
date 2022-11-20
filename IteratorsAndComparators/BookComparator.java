package IteratorsAndComparators;

import java.util.Comparator;
import java.util.Iterator;

public class BookComparator implements Comparator<Book>  {

    @Override
    public int compare (Book f, Book s){
        int result = f.getTitle().compareTo(s.getTitle());

        if(result == 0){
            result = Integer.compare(f.getYear(), s.getYear());
        }

        return  result;
    }
}