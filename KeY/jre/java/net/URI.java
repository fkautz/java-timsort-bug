/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.net;

public final class URI extends java.lang.Object implements java.lang.Comparable, java.io.Serializable
{
   final static long serialVersionUID = -6052424284110960213L;
   final static boolean $assertionsDisabled;


   /*@ requires true; ensures true; assignable \everything; signals (java.net.URISyntaxException e) true; */
   public URI(java.lang.String arg0) throws java.net.URISyntaxException;

   /*@ requires true; ensures true; assignable \everything; signals (java.net.URISyntaxException e) true; */
   public URI(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, int arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6) throws java.net.URISyntaxException;

   /*@ requires true; ensures true; assignable \everything; signals (java.net.URISyntaxException e) true; */
   public URI(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.net.URISyntaxException;

   /*@ requires true; ensures true; assignable \everything; signals (java.net.URISyntaxException e) true; */
   public URI(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.net.URISyntaxException;

   /*@ requires true; ensures true; assignable \everything; signals (java.net.URISyntaxException e) true; */
   public URI(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.net.URISyntaxException;

   /*@ requires true; ensures true; assignable \everything; */
   public static java.net.URI create(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; signals (java.net.URISyntaxException e) true; */
   public java.net.URI parseServerAuthority() throws java.net.URISyntaxException;

   /*@ requires true; ensures true; assignable \everything; */
   public java.net.URI normalize();

   /*@ requires true; ensures true; assignable \everything; */
   public java.net.URI resolve(java.net.URI arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.net.URI resolve(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.net.URI relativize(java.net.URI arg0);

   /*@ requires true; ensures true; assignable \everything; signals (java.net.MalformedURLException e) true; */
   public java.net.URL toURL() throws java.net.MalformedURLException;

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getScheme();

   /*@ requires true; ensures true; assignable \everything; */
   public boolean isAbsolute();

   /*@ requires true; ensures true; assignable \everything; */
   public boolean isOpaque();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getRawSchemeSpecificPart();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getSchemeSpecificPart();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getRawAuthority();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getAuthority();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getRawUserInfo();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getUserInfo();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getHost();

   /*@ requires true; ensures true; assignable \everything; */
   public int getPort();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getRawPath();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getPath();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getRawQuery();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getQuery();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getRawFragment();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getFragment();

   /*@ requires true; ensures true; assignable \everything; */
   public boolean equals(java.lang.Object arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int hashCode();

   /*@ requires true; ensures true; assignable \everything; */
   public int compareTo(java.net.URI arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String toString();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String toASCIIString();

   /*@ requires true; ensures true; assignable \everything; */
   public int compareTo(java.lang.Object arg0);
}