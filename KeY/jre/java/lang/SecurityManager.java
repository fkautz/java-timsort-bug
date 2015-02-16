/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.lang;

public class SecurityManager extends java.lang.Object
{
   protected boolean inCheck;


   /*@ requires true; ensures true; assignable \everything; */
   public boolean getInCheck();

   /*@ requires true; ensures true; assignable \everything; */
   public SecurityManager();

   /*@ requires true; ensures true; assignable \everything; */
   protected java.lang.Class[] getClassContext();

   /*@ requires true; ensures true; assignable \everything; */
   protected java.lang.ClassLoader currentClassLoader();

   /*@ requires true; ensures true; assignable \everything; */
   protected java.lang.Class currentLoadedClass();

   /*@ requires true; ensures true; assignable \everything; */
   protected int classDepth(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   protected int classLoaderDepth();

   /*@ requires true; ensures true; assignable \everything; */
   protected boolean inClass(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   protected boolean inClassLoader();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.Object getSecurityContext();

   /*@ requires true; ensures true; assignable \everything; */
   public void checkPermission(java.security.Permission arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkPermission(java.security.Permission arg0, java.lang.Object arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkCreateClassLoader();

   /*@ requires true; ensures true; assignable \everything; */
   public void checkAccess(java.lang.Thread arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkAccess(java.lang.ThreadGroup arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkExit(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkExec(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkLink(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkRead(java.io.FileDescriptor arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkRead(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkRead(java.lang.String arg0, java.lang.Object arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkWrite(java.io.FileDescriptor arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkWrite(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkDelete(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkConnect(java.lang.String arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkConnect(java.lang.String arg0, int arg1, java.lang.Object arg2);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkListen(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkAccept(java.lang.String arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkMulticast(java.net.InetAddress arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkMulticast(java.net.InetAddress arg0, byte arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkPropertiesAccess();

   /*@ requires true; ensures true; assignable \everything; */
   public void checkPropertyAccess(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean checkTopLevelWindow(java.lang.Object arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkPrintJobAccess();

   /*@ requires true; ensures true; assignable \everything; */
   public void checkSystemClipboardAccess();

   /*@ requires true; ensures true; assignable \everything; */
   public void checkAwtEventQueueAccess();

   /*@ requires true; ensures true; assignable \everything; */
   public void checkPackageAccess(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkPackageDefinition(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkSetFactory();

   /*@ requires true; ensures true; assignable \everything; */
   public void checkMemberAccess(java.lang.Class arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public void checkSecurityAccess(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.ThreadGroup getThreadGroup();
}