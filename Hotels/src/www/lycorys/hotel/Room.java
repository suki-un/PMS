package www.lycorys.hotel;

import java.util.Objects;

public class Room {
    //房间id
    private int roomId;
    //房间类型
    private String leiXing;
    //房间状态，true就是空闲，false就是占用。
    private boolean zhuangTi;

    public Room() {
    }

    public Room(int roomId, String leiXing, boolean zhuangTi) {
        this.roomId = roomId;
        this.leiXing = leiXing;
        this.zhuangTi = zhuangTi;
    }

    //get和set方法
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getLeiXing() {
        return leiXing;
    }

    public void setLeiXing(String leiXing) {
        this.leiXing = leiXing;
    }

    public boolean getZhuangTi() {
        return zhuangTi;
    }

    public void setZhuangTi(boolean zhuangTi) {
        this.zhuangTi = zhuangTi;
    }

    //toString方法

    @Override
    public String toString() {
        return "Room{" +
                "房间号=" + roomId +
                ", 房间类型='" + leiXing +
                ", 状态=" + (zhuangTi ? "空闲":"占用") +
                '}';
    }

    //equals方法

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomId == room.roomId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId);
    }
}
