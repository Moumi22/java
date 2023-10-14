import java.util.Scanner;
public class Carparking
{
  public static void main(String argu[])
  {
     Scanner sc=new Scanner(System.in);
     Parking pa=new Parking();
     int choice;
     int car=0,bike=0,rikshaw=0;
     while (true)
      {
         System.out.println(&quot;Press 1 to enter car&quot;);
         System.out.println(&quot;Press 2 to enter bike&quot;);
         System.out.println(&quot;Press 3 to enter rikshaw&quot;);
         System.out.println(&quot;Press 4 to view data&quot;);
         System.out.println(&quot;Press 5 to delete data&quot;);
         System.out.println(&quot;Press 6 to exit&quot;);
         choice=sc.nextInt();
         switch (choice)
           {
              case 1:
              car++;
              pa.setCar(car);
              System.out.println(car+ "cars is added");
              break;

              case 2:
              bike++;
              pa.setBike(bike);
              System.out.println(bike+ "bikes is added");
              break;

              case 3:
              rikshaw++;
              pa.setRikshaw(rikshaw);
              System.out.println(rikshaw+ "rikshaws is added");
              break;

              case 4:
              System.out.println("Cars:"+pa.getCar());
              System.out.println("Bikes:"+pa.getBike());
              System.out.println("Rikshaws:" +pa.getRikshaw());
              break;

              case 5:
              pa.delete();
              System.out.println("All record is deleted");
              break;

              case 6:
              System.exit(0);
              break;
            }
        }  
    }
}