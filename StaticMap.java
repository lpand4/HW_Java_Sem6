public class StaticMap {
    int[][] map = new int[11][11];;
    
    public StaticMap(){
        
        //Стены вокруг поля для проверки
        for (int i = 0; i < map.length; i++) {
            map[0][i] = -1;
            map[map.length - 1][i] = -1;
            map[i][0] = -1;
            map[i][map.length - 1] = -1;
        }
        //Сам лабиринт статичный
        map[3][2] = -1; map[4][3] = -1; map[5][3] = -1; map[6][3] = -1; map[7][2] = -1; map[7][1] = -1;
        map[3][6] = -1; map[4][6] = -1; map[5][6] = -1; map[6][6] = -1; map[7][6] = -1; map[7][5] = -1;
        map[3][5] = -1; map[3][7] = -1; map[3][8] = -1; map[5][8] = -1; map[6][8] = -1; map[7][8] = -1;
        map[1][4] = -1;

        this.map = map;
    }    

    public int[][] getMap() {
        return map;
    }

    public void setStart(Point start){
        map[start.getY()][start.getX()] = 1;
    }
    public void setFinish(Point[] finish){
        for (Point exit : finish) {
            map[exit.getY()][exit.getX()] = 99;
        }       
    }
}
