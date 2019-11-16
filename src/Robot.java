public class Robot {
    int x=0;
    int y=0;
    Direction direction;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public Direction getDirection(){
        System.out.println(direction);
        return direction;
    }

    public void turnLeft() {
        System.out.println("поворот налево ");
        if (direction == Direction.UP) {
            direction = Direction.LEFT;
            System.out.println("направление влево");
            return;

        }
        if (direction == Direction.DOWN) {
            direction = Direction.RIGHT;
            System.out.println("направление вправо");
            return;


        }
        if (direction == Direction.LEFT) {
            direction = Direction.DOWN;
            System.out.println("направление вниз");
            return;

        }
        if (direction == Direction.RIGHT) {
            direction = Direction.UP;
            System.out.println("направление вверх");
            return;

        }
    }

    public void turnRight() {
        System.out.println("поворот направо");
        if (direction == Direction.UP) {
            direction = Direction.RIGHT;
            return;


        }
        if (direction == Direction.RIGHT) {
            direction = Direction.DOWN;
            return;


        }
        if (direction == Direction.DOWN) {
            direction = Direction.LEFT;
            return;


        }
        if (direction == Direction.LEFT) {
            direction = Direction.UP;
            return;

        }

    }


    public void stepForward() {
        if (direction == Direction.UP) {
            y = y + 1;
            System.out.println("stepForward");
            return;
        }
        if (direction == Direction.DOWN) {
            y = y - 1;
            System.out.println("stepForward");
            return;
        }
        if (direction == Direction.LEFT) {
            x = x - 1;
            System.out.println("stepForward");
            return;
        }
        if (direction == Direction.RIGHT) {
            x = x + 1;
            System.out.println("stepForward");
            return;
        }
    }
}
