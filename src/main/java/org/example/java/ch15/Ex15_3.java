package org.example.java.ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex15_3 {

  public static void main(String[] args){
    byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
    byte[] outSrc = {};
    byte[] temp = new byte[4];

    ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    //System.out.println(Arrays.toString(inSrc));

      try {
        while(input.available() > 0) {
//          input.read(temp);
//          output.write(temp);

          int len = input.read(temp);
          output.write(temp, 0, len);

          outSrc = output.toByteArray();
          printArrays(temp, outSrc);
        }
      } catch (IOException e) {
        throw new RuntimeException(e);
      }

  }//end of main

  static void printArrays(byte[] temp, byte[] outSrc) {
    System.out.println("temp= " +Arrays.toString(temp));
    System.out.println("outSrc= " + Arrays.toString(outSrc));
  }

}
