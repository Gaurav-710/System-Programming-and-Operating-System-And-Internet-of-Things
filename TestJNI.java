class TestJNI
{
    static 
    {
    
          System.loadLibrary("cal");
    
    
    }
     public native int add(int n1,int n2);
    public static void main(String args[])
    {
         TestJNI obj=new TestJNI();
        System.out.println("Addition is:"+obj.add(10,20));
    
    }


}
/*
javac TestJNI.java -h .
javah -jni TestJNI 
gcc -Fpic -I . -I . -o libcal.so  -shared TestJNI.c
java -Djava.library.path=. TestJNI