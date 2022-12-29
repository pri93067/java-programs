class MyException extends Exception
   {
    MyException()
     {
      super("marks less than 45!");
   }
}

class Exception
   {
   private String id;
  private String name;
    private int avg;
Student(String id,String name,int avg)
     {
      this.id=id;
        this.name=name;
       this.avg=avg;
     }
int showavg()
 {
   return avg;
  

 }
  void display
    {
   System.out.println("name:"+name);
   System.out.println("id:"+id);
   System.out.println("avg:"+avg);
}
}

public class Catch
{
 public static void main(String[] args)
   {
     Exception obj1= new Exception("1cs","sita",20);
     Exception obj2= new Exception("2cs","rita",30);
     Exception obj1= new Exception("3cs","gita",10);
    
     Exception [] a = new Exception[]{obj1,obj2,obj3};
              for(Exception x: a) 
                 {
                    if(Exception x.showavg() < 45)
                              try
                               {
                                 throw new
                MyException();
                        }
                         catch(MyException e)
                      {
                 
                        System.out.println(e.getmessage());
                          }
                        }
                      else{
                            x.display();
              }
        }
      }
   }
          
