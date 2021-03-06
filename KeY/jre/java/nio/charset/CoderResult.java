/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.nio.charset;

public class CoderResult extends java.lang.Object
{
   public final static java.nio.charset.CoderResult UNDERFLOW;
   public final static java.nio.charset.CoderResult OVERFLOW;
   final static boolean $assertionsDisabled;


   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String toString();

   /*@ requires true; ensures true; assignable \everything; */
   public boolean isUnderflow();

   /*@ requires true; ensures true; assignable \everything; */
   public boolean isOverflow();

   /*@ requires true; ensures true; assignable \everything; */
   public boolean isError();

   /*@ requires true; ensures true; assignable \everything; */
   public boolean isMalformed();

   /*@ requires true; ensures true; assignable \everything; */
   public boolean isUnmappable();

   /*@ requires true; ensures true; assignable \everything; */
   public int length();

   /*@ requires true; ensures true; assignable \everything; */
   public static java.nio.charset.CoderResult malformedForLength(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.nio.charset.CoderResult unmappableForLength(int arg0);

   /*@ requires true; ensures true; assignable \everything; signals (java.nio.charset.CharacterCodingException e) true; */
   public void throwException() throws java.nio.charset.CharacterCodingException;
}
