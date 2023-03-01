public class App1 {
    public static void main(String[] args) {
        Point starPoint = new Point(2, 6);
        Point[] finishPoint = {new Point(7,6), new Point(9,6)};

        StaticMap area = new StaticMap();
        area.setStart(starPoint);
        area.setFinish(finishPoint);
        var map = area.getMap();
        Printer pr = new Printer(map, starPoint, finishPoint);
        WaveAlgorithm wa = new WaveAlgorithm(map);
        wa.startAlgorithm(starPoint, finishPoint);
        System.out.println();
        System.out.println();
        System.out.println();
        var pr2 = new Printer(map, starPoint, finishPoint);
        var way = wa.getWay();
        System.out.println();
        System.out.println();
        System.out.println();
        
        pr2.printWay(map, starPoint, finishPoint, way);
        
             
    }    
}