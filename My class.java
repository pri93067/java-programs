interface Age
{
   int x=20;
   void getage(int x);

static void change()
      {
       System.out.println("static area");
      }
  class InnerClass
    {


           void show()
    {
      System.out.println("default meythod");
    }
}
}
  class MyClass
    {
      public static void main(String[] args)
       {
         Age a = (x)->{System.out.println("age is"+x);};

            a.getage(20);
          Age.change();



       }
  }

