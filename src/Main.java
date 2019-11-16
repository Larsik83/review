
public class Main {

    public static void main(String[] args) {
        Robot robot1 = new Robot();
        robot1.x = 0;
        robot1.y = 0;
        robot1.direction = Direction.UP;
        moveRobot(robot1, -2, 1);
        System.out.println("x: " + robot1.getX());
        System.out.println("y: " + robot1.getY());
        robot1.getDirection();
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        int forwardY = toY - robot.getY();
        int forwardX = toX - robot.getX();

        if ((robot.getX() <= toX) && (robot.getY() <= toY)) { //1

            if (robot.direction == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            }
            if (robot.direction == Direction.RIGHT) {
                robot.turnLeft();
            }
            if (robot.direction == Direction.LEFT) {
                robot.turnRight();
            }


            for (int i = 0; i < forwardY; i++) {
                robot.stepForward();
            }

            robot.turnRight();
            for (int i = 0; i < forwardX; i++) {
                robot.stepForward();
            }
        } //1

        if ((robot.getX() <= toX) && (robot.getY() >= toY)) { //2
            if (robot.direction == Direction.UP) {
                robot.turnRight();
                robot.turnRight();
            }
            if (robot.direction == Direction.RIGHT) {
                robot.turnRight();
            }
            if (robot.direction == Direction.LEFT) {
                robot.turnLeft();
            }

            for (int i = 0; i < -forwardY; i++) {
                robot.stepForward();
            }
            robot.turnLeft();
            for (int i = 0; i < forwardX; i++) {
                robot.stepForward();
            }
        } //2

        if ((robot.getX() >= toX) && (robot.getY() >= toY)) {//3
            if (robot.direction == Direction.UP) {
                robot.turnRight();
                robot.turnRight();
            }
            if (robot.direction == Direction.RIGHT) {
                robot.turnRight();
            }
            if (robot.direction == Direction.LEFT) {
                robot.turnLeft();
            }

            for (int i = 0; i < -forwardY; i++) {
                robot.stepForward();
            }
            robot.turnRight();

            for (int i = 0; i < -forwardX; i++) {
                robot.stepForward();
            }
        }//3
        if ((robot.getX() >= toX) && (robot.getY() <= toY)) {//4
            if (robot.direction == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            } else if (robot.direction == Direction.RIGHT) {
                robot.turnLeft();
            } else if (robot.direction == Direction.LEFT) {
                robot.turnRight();
            }
            for (int i = 0; i < forwardY; i++) {
                robot.stepForward();
            }
            robot.turnLeft();

            for (int i = 0; i < -forwardX; i++) {
                robot.stepForward();
            }

        }//4
    }

}
