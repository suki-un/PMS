package www.lycorys.hotel;

public class hotel {
    private Room[][] room;
    public hotel() {
        room = new Room[3][6];
        for (int i = 0; i < room.length;i++) {
            for (int j = 0; j < room[i].length; j++) {
                if (i == 0) {
                    room[i][j] = new Room((i+1)*100+j+1,"普通套房",true);
                } else if (i == 1) {
                    room[i][j] = new Room((i+1)*100+j+1,"大床房",true);
                }else if (i == 2) {
                    room[i][j] = new Room((i+1)*100+j+1,"总统套房",true);
                }
            }
        }
    }

    //打印方法
    public void printRoom(){
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                Room r = room[i][j];
                System.out.println(r.toString());
            }
        }
    }

    //购房方法
    public void by(int roomId){
        Room ro = room[roomId/100-1][roomId % 100 - 1];
        ro.setZhuangTi(false);
        System.out.println(roomId + "购房成功");
    }

    //退房方法
    public void bye(int roomId){
        Room ro = room[roomId/100-1][roomId % 100 - 1];
        ro.setZhuangTi(true);
        System.out.println(roomId + "退房成功");
    }
}
