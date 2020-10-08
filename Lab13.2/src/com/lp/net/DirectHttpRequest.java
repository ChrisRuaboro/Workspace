/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.lp.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.stream.Stream;

public class DirectHttpRequest {
  
  /**
   * It's really cheap to 'throws Exception' from main(),
   * and no real code should ever do this, but here we just don't care.
   */
  public static void main(String[] args)
  throws Exception {
	  try (Socket socket = new Socket("learningpatterns.com", 80);  // host, port
         PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  // autoflush
         BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
      
      /**
       * Send a raw HTTP GET request to server, get response back.
       * NOTE: learningpatterns.com will return 400 Bad Request,
       * possibly because we didn't include any HTTP headers like User-Agent, Accept, etc.
       * It still shows us that the data transmission works - and it's so easy!
       */
      out.println("GET / HTTP/1.1" + "\r\n");
      Stream<String> response = in.lines();
      response.forEach(System.out::println);
    }
  }
}