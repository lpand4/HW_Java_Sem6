import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class WaveAlgorithm {
    int[][] map;
    Point bestWay;
    public WaveAlgorithm(int[][] area) {
        this.map = area;
    }

    public void startAlgorithm(Point starPoint, Point[] finishPoint){
        Queue<Point> q = new LinkedList<Point>();
        q.add(starPoint);

        while(q.size() != 0){
            Point now = q.remove();
//                     1
//                  4  X  2
//                     3
            if(map[now.y - 1][now.x] == 0 || map[now.y - 1][now.x] == 99){
                q.add(new Point(now.x, now.y - 1));
                map[now.y - 1][now.x] = map[now.y][now.x] + 1;
            }

            if(map[now.y][now.x + 1] == 0 || map[now.y][now.x + 1] == 99){
                q.add(new Point(now.x + 1, now.y));
                map[now.y][now.x + 1] = map[now.y][now.x] + 1;
            }

            if(map[now.y + 1][now.x] == 0 || map[now.y + 1][now.x] == 99){
                q.add(new Point(now.x, now.y + 1));
                map[now.y + 1][now.x] = map[now.y][now.x] + 1;
            }

            if(map[now.y][now.x - 1] == 0 || map[now.y][now.x - 1] == 99){
                q.add(new Point(now.x - 1, now.y));
                map[now.y][now.x - 1] = map[now.y][now.x] + 1;
            }
            for (int i = 0; i < finishPoint.length; i++) {
                if(now.x == finishPoint[i].x && now.y == finishPoint[i].y){
                    Point bestWay = new Point(now.x, now.y);
                    this.bestWay = bestWay;
                    System.out.println(bestWay.toString());
                    System.out.println(map[bestWay.y][bestWay.x]);
                    return;
                }                                    
            }
        }
    }
    public ArrayList<Point> getWay(){
        ArrayList<Point> way = new ArrayList<Point>();
        Queue<Point> q = new LinkedList<Point>(); 
        q.add(bestWay);
        while(q.size() != 0){
            Point now = q.remove();
//                     1
//                  4  X  2
//                     3
            if(map[now.y - 1][now.x] == map[now.y][now.x] - 1 && map[now.y - 1][now.x] != -1){
                q.add(new Point(now.x, now.y - 1));
                way.add(now);
                continue;
            }

            if(map[now.y][now.x + 1] == map[now.y][now.x] - 1 && map[now.y][now.x + 1] != -1){
                q.add(new Point(now.x + 1, now.y));
                way.add(now);
                continue;
            }

            if(map[now.y + 1][now.x] == map[now.y][now.x] - 1 && map[now.y + 1][now.x] != -1){
                q.add(new Point(now.x, now.y + 1));
                way.add(now);
                continue;
            }

            if(map[now.y][now.x - 1] == map[now.y][now.x] - 1 && map[now.y][now.x - 1] != -1){
                q.add(new Point(now.x - 1, now.y));
                way.add(now);
                continue;
            }
        }
        
        return way;
    }
    
}
