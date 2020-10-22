package com.javatunes.catalog.test;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;

import java.util.Collection;

public class InMemoryCatalogTest
{
    public static void main(String[] args)
    {
        //testFindById();
        testFindByCategory();

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
        MusicCategory testCategory = MusicCategory.POP;
        Collection<MusicItem> matchingMusicItem = catalog.findByCategory(testCategory);
        for (MusicItem musicItem : matchingMusicItem) {
            System.out.println(musicItem);
        }
    }
}
