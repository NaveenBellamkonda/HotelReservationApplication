package model;

public class Room implements IRoom{
    String roomNumber;
    Double price;
    RoomType roomType;
    Boolean free;

    public Room(){
        //super();
        this.roomNumber=roomNumber;
        this.price=price;
        this.roomType=roomType;
    }

    public String getRoomNumber(){
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber){
        this.roomNumber=roomNumber;
    }
    public Double getRoomPrice(){
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public RoomType getRoomType(){
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Boolean isFree() {
        return free;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", roomType=" + roomType +
                ", free=" + free +
                '}';
    }
}
