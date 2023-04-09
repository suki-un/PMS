package www.lycorys.hotel;

import java.util.Scanner;

/*第二题：（java软件工程师人生路上第一个小型项目。锻炼一下面向对象。）
    为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
    1、该系统的用户是：酒店前台。
    2、酒店使用一个二维数组来模拟。“Room[][] rooms;”
    3、酒店中的每一个房间应该是一个java对象：Room
    4、每一个房间Room应该有：房间编号、房间类型、房间是否空闲.
    5、系统应该对外提供的功能：
        可以预定房间：用户输入房间编号，订房。
        可以退房：用户输入房间编号，退房。
        可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。*/
public class hotelSystem {
    public static void main(String[] args) {


        hotel h = new hotel();

        //进入系统
        System.out.println("欢迎使用酒店管理系统！");


        while(true){
            System.out.println("请输入对应功能：[1]查询房间列表及状态，[2]订房，[3]，退房，[4]退出。");
            Scanner scan = new Scanner(System.in);
            System.out.print("请输入：");
            int a = scan.nextInt();
            if (a == 1) {
                h.printRoom();
            } else if (a == 2) {
                System.out.print("请输入房间号：");
                int b = scan.nextInt();
                if (b/100-1 > 3 && b/100<0) {
                    System.out.println("输入有误请仔细阅读！！");
                    return;
                }else{
                    h.by(b);
                }
            }else if (a == 3) {
                System.out.print("请输入房间号：");
                int b = scan.nextInt();
                if (b/100-1 > 3 && b/100<0) {
                    System.out.println("输入有误请仔细阅读！！");
                    return;
                }else{
                    h.bye(b);
                }
            }else if (a == 4){
                System.out.println("谢谢使用");
                break;
            }
        }

        /*hotel h = new hotel();
        h.printRoom();*/
    }
}
