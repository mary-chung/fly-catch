package game.model;

import game.exceptions.InvalidDirectionException;

public class Fly {
    private static final int SIZE = 0;
    private static final int ROTATE_SPEED = 0;

    public int x;
    public int y;
    public Direction direction;

    public Fly(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    //EFFECTS: rotates fly clockwise if rotateDirection is CW, rotates fly counter-clockwise if rotateDirection is CCW
    public void rotate(String rotateDirection) throws InvalidDirectionException {
        if (rotateDirection.equals("CW")) {
            rotateClockwise();
        }
        else if (rotateDirection.equals("CCW")) {
            rotateCounterclockwise();
        }
    }

    //EFFECTS: rotates fly clockwise
    //MODIFIES: this
    private void rotateClockwise() {
        if (direction == Direction.NORTH) {
            direction = Direction.EAST;
        }
        else if (direction == Direction.EAST) {
            direction = Direction.SOUTH;
        }
        else if (direction == Direction.SOUTH) {
            direction = Direction.WEST;
        }
        else if (direction == Direction.WEST) {
            direction = Direction.NORTH;
        }
    }

    //EFFECTS: rotates fly counterclockwise
    //MODIFIES: this
    private void rotateCounterclockwise() {
        if (direction == Direction.NORTH) {
            direction = Direction.WEST;
        }
        else if (direction == Direction.WEST) {
            direction = Direction.SOUTH;
        }
        else if (direction == Direction.SOUTH){
            direction = Direction.EAST;
        }
        else if (direction == Direction.EAST) {
            direction = Direction.NORTH;
        }
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
