package com.javatunes.catalog.test;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InMemoryCatalogTest
{
    public static void main(String[] args)
    {
        //testFindById();
        //testFindByCategory();
        //testFindByKeyword();
        testSize();

    }



    private static void testFindById()
    {
        InMemoryCatalog catalog = new InMemoryCatalog();
        MusicItem itemfound = catalog.findById(1L);
        System.out.println(itemfound);

        // Non existing id
        MusicItem itemNotFound = catalog.findById(69L);
        System.out.println(itemNotFound);

    }

    private static void testFindByCategory()
    {
        InMemoryCatalog catalog = new InMemoryCatalog();
        MusicCategory testCategory = MusicCategory.ALTERNATIVE;
        Collection<MusicItem> matchingMusicItem = catalog.findByCategory(testCategory);
        // System.out.println(matchingMusicItem); // Prints on one line
        printCollection(matchingMusicItem);
    }

    private static void testFindByKeyword()
    {
        InMemoryCatalog catalog = new InMemoryCatalog();
        String keyword = "seal";
        Collection<MusicItem> matchingKeyword = catalog.findByKeyword(keyword);
        if (matchingKeyword.isEmpty())
        {
            System.out.println(keyword + " did not match anything in " + catalog.getClass().getSimpleName());
        }
        else
        {
            printCollection(matchingKeyword);
        }
    }

    private static void testSize()
    {
        List<MusicItem> testCatalog = new ArrayList<>();
        System.out.println(testCatalog.size());
    }
    // Helper method
    private static void printCollection(Collection inputCollection)
    {
        for (Object musicItem : inputCollection)
        {
            System.out.println(musicItem);
        }
    }

}
