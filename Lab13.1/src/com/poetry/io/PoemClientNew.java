/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.poetry.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class PoemClientNew
{

  /**
   * Uncomment these after you've completed their implementations.
   */
  public static void main(String[] args) {
      readPoem();
     // writePoem();
  }
  
  /**
   * TASK: read all the lines in file 'famous-poem.txt'.
   * Avoid the temptation to open the file in Eclipse first.
   * You'll see the poem once you get your code working(!)
   * 
   * This file is in the project root directory, which is the current / working 
   * directory at runtime.  Therefore, the path to the file is just the filename.
   * 
   * Use a BufferedReader wrapped around a FileReader.
   * Use a try-with-resources to initialize the stream and auto-close it.
   */
  private static void readPoem() {
/*    try (BufferedReader reader = new BufferedReader(new FileReader("famous-poem.txt"))) {  // TODO: initialize 'reader' variable
      // here is an easy way to dump out all the lines
      // you may not have worked with Java 8 streams, so we give this to you
      // Your Option: leave those as-is, and just be left wondering ehat Stream<String> is
      // OR      change the two lines below to match session p.392
      Stream<String> lines = reader.lines();
      lines.forEach(System.out::println);


    }
    catch (IOException e) {
      e.printStackTrace();
    }*/
    // TODO use the new files class to do this much more easily
    try
    {
      // Read lines into list
      List<String> lines = Files.readAllLines(Paths.get("famous-poem.txt")); //Path object

      // Dump the list
      for (String line : lines) {
        System.out.println(line);
      }
    }
    catch(IOException e)
    {
      System.out.println(e);
    }
  }
  
  /**
   * TASK: write a poem of your own creation to file 'my-poem.txt'.
   * 
   * Use a PrintWriter wrapped around a FileWriter.
   * Use a try-with-resources to initialize the stream and auto-close it.
   */
  private static void writePoem() {






    /*// TODO
    try (PrintWriter haiku = new PrintWriter(new FileWriter("haiku.txt")))
    {
      haiku.println("Life gives you lemons");
      haiku.println("But you can't make lemonade");
      haiku.println("Throw an exception");
    }
    catch (IOException e) {
      e.printStackTrace();
    }*/


  }
}