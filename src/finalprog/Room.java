package finalprog;

import java.util.Objects;


public class Room {
        private long roomId;
        private int persons;
        private double price;
        private User userReserved;

        public Room(long roomId, int persons, double price, User userReserved) {
            this.roomId = roomId;
            this.persons = persons;
            this.price = price;
            this.userReserved = userReserved;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return roomId == room.roomId &&
                persons == room.persons &&
                Double.compare(room.price, price) == 0 &&
                Objects.equals(userReserved, room.userReserved);
    }




    public void setPrice(double price) {

            this.price = price;
        }

        public double getPrice() {

            return price;
        }

        public void setPersons(int persons) {

            this.persons = persons;
        }

        public int getPersons() {

            return persons;
        }

        public void setRoomId(long roomId) {

            this.roomId = roomId;
        }

        public long getRoomId() {

            return roomId;
        }
    }

