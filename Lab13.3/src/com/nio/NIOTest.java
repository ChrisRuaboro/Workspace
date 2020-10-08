/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class NIOTest {

  public static void main(String[] args)
  throws Exception {
    /**
     * TODO: read the lab copyright file and dump its contents to stdout.
     * It's directly under C:\StudentWork [if you extracted the LabSetup.zip to C:\].
     */
    Path copyright = null;  // TODO: initialize 'copyright' variable
    Stream<String> lines = Files.lines(copyright);
    lines.forEach(System.out::println);
    
    /**
     * TODO: make a backup copy of the copyright file, name the backup whatever you want.
     * Make sure you can run this test repeatedly, i.e., doesn't fail if file already exists.
     */
    
    
    /**
     * TODO: set an attribute on the backup file to be readonly.
     * See Javadoc for Files.setAttribute() - the actual attribute name is "dos:readonly".
     * See also Javadoc for java.nio.file.attribute.DosFileAttributeView.
     */
    
  }
}