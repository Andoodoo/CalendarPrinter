public class CalendarPrint {
  public static void main (String[] args) {
    int x = 1 ;
    String y = "";
    while (x <= 30) {
      if (x == 5 || x == 6 || x == 12 || x == 13 || x == 19 || x == 20 || x == 26 || x == 27)
        y = "-Weekend";
      else if (x == 7)
        y = "-No School(Labor Day)";
      else if (x == 25)
        y = "-End of Marking Period";
      else 
        y = "-Hell";
      System.out.println("September" + x + y );
      x++;
  }
   }
}