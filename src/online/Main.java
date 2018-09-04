package online;

import java.util.Scanner;

/**
 * 阿里巴巴在线笔试编程题
 */
public class Main {

    private static final int MAX_PATH_LENGTH = 65535;


    public static void main(String[] args) {
        //输入
        Scanner scanner = new Scanner(System.in);

        int startX = scanner.nextInt();
        int startY = scanner.nextInt();
        Direction startDirection = Direction.valueOf(scanner.next());

        int endX = scanner.nextInt();
        int endY = scanner.nextInt();
        Direction endDirection = Direction.valueOf(scanner.next());

        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] map = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        //实现此函数，或 完全按照自己想法进行函数编写
        int pathLength = cal(map, startDirection,startX, startY,  endDirection, endX, endY, column);
        //输出
        System.out.print(pathLength);
    }

    private static int cal(int[][] map, Direction startDirection, int startX, int startY, Direction endDirection, int endX, int endY, int column) {
        int time = 0;
        //向X轴方向移动
        while(map[startX+1][startY] != 1 && startX<endX){
            startX++;
            time++;
            if(startX == endX){
                break;
            }
        }
        //转向
        if(startDirection.getIndex() == 2 || startDirection.getIndex() == 3){
            time++;
        }
        if(startDirection.getIndex() == 1){
            time+=2;
        }
        if(startDirection.getIndex() == 0){
        }

        //向y轴方向移动
        while(map[startX][startY+1] != 1 && startY<endY){
            startY++;
            time++;
            if(startY == endY){
                break;
            }
        }
        if(startDirection.getIndex() == 1 || startDirection.getIndex() == 2){
            time++;
        }
        if(startDirection.getIndex() == 3){
            time+=2;
        }
        if(startDirection.getIndex() == 2){
        }

        return time;
    }

    public enum Direction {

        EAST(0),
        WEST(1),
        SOUTH(2),
        NORTH(3),
        UNKNOWN(4);

        int index;

        public int getIndex() {
            return index;
        }

        Direction(int index) {
            this.index = index;
        }

        static Direction getDirectionByIndex(int index){
            for (Direction direction : Direction.values()) {
                if(direction.index == index){
                    return direction;
                }
            }
            return UNKNOWN;
        }

    }
}
