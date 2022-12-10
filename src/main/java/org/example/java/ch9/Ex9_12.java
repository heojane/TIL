package org.example.java.ch9;

public class Ex9_12 {

  public static void main(String[] args){
    StringBuffer sb = new StringBuffer("01");

    StringBuffer sb2 = sb.append(23); //0123
    sb.append('4').append(56); //0123456

    StringBuffer sb3 = sb.append(78); //012345678
    sb3.append(9.0); //0123456789.0

    System.out.println("sb= "+sb); //0123456789.0
    System.out.println("sb2= "+sb2); //0123456789.0
    System.out.println("sb3= "+sb3); //0123456789.0

    System.out.println("sb= "+sb.deleteCharAt(10)); //01234567890
    System.out.println("sb= "+sb.delete(3,6)); //01267890
    System.out.println("sb= "+sb.insert(3, "abc")); //012abc67890
    System.out.println("sb= "+sb.replace(6, sb.length(), "END")); //012abcEND
    System.out.println("cap= "+sb.capacity()); //18
    System.out.println("len= "+sb.length()); //9

  }

}
