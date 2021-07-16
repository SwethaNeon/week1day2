package week1day2;


class ChangeOddIndextoUppercase
{
    public static void main(String[] args) {
      String a = "changeme";


      System.out.println(a.substring(3,8));
      
      for (int i=1; i < a.length(); i++){
        if (i % 2 != 0)
        {
          a = a.substring(0,i-1) + " " + a.substring(i, a.length());
                   
        }
      }

      
      System.out.println(a.toUpperCase());
      
      
      

    }
} 


