package entities;

import java.util.Arrays;

public class Rent {
    private String studentName, studentEmail;
    private final int[] rooms = new int[10];
    private int[] room_choice;

    // Getters
    public String getName() {
        return studentName;
    }
    public String getEmail() {
        return studentEmail;
    }

    public int[] getRoom() {
        return rooms;
    }
    public int[] getChoice() {
        return room_choice;
    }

    // Setters
    public void setName(String studentName) {
        this.studentName = studentName;
    }
    public void setEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setChoice(int[] room_choice) {
        this.room_choice = room_choice;
    }
    public void setRooms() {
        this.rooms[0] = 1;
        this.rooms[1] = 2;
        this.rooms[2] = 3;
        this.rooms[3] = 4;
        this.rooms[4] = 5;
        this.rooms[5] = 6;
        this.rooms[6] = 7;
        this.rooms[7] = 8;
        this.rooms[8] = 9;
        this.rooms[9] = 10;
    }

    // Methods
    private void roomGuard () {
        if(Arrays.compareUnsigned(getChoice(), 0, getChoice().length, getRoom(), 0, getRoom().length) == 0) {
            System.out.print("\n> This room is currently rented :(");
            System.exit(1);
        }
        if(Arrays.binarySearch(getChoice(), 0, getChoice().length, -1) > -1) {
            System.out.print("\n> This room does not exist ~_^");
            System.exit(1);
        }
        System.out.print("\n> You are good to go :)");
        // A `waiting list` can be done here :)
    }
    public String toString() { return "\n" + Arrays.toString(getChoice()) + ": " + getName() + ", " + getEmail(); }

    // Constructor
    public Rent() {
        setRooms();
        roomGuard();
    }
}