import java.util.ArrayList;
import java.util.Arrays;

public class Printer {
    public Printer(int[][] area, Point start, Point[] finish) {

        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                if(area[i][j] == -1)
                    System.out.printf((char)27 + "[31m%d \t",area[i][j]);
                else{
                    if(i==start.getY() && j == start.getX())
                        System.out.printf((char)27 + "[32m%d \t",area[i][j]);

                    else if(area[i][j] != -1 && area[i][j] != 1 && area[i][j] != 99)
                        System.out.printf((char)27 + "[0m%d \t",area[i][j]);

                    else{
                        for (int k = 0; k < finish.length; k++) {
                            if ((i==finish[k].getY() && j == finish[k].getX()))  
                            System.out.printf((char)27 + "[34m%d \t",area[i][j]);
                            }
                    }
                }                     
            }
            System.out.println();
        }
    }


    public void printWay(int[][] area, Point start, Point[] finish, ArrayList<Point> way){
        Point[] ways = new Point[way.size()];
        System.out.println(String.format("Самый короткий путь - %d",way.size() + 1));

        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                
                if(area[i][j] == -1)
                    System.out.printf((char)27 + "[31m%d \t",area[i][j]);
                else if(way.indexOf(new Point(j, i)) >= 0)
                    System.out.printf((char)27 + "[35m%d \t",area[i][j]);
                else
                    System.out.printf((char)27 + "[0m%d \t",area[i][j]);               
            }
            System.out.println();
            }
            
        }                    
    }

    
