package com.example.singleton;

/**
 * @author zhanghongjian
 * @Date 2019/5/18 11:09
 * @Description
 */
public class TicketMarker{
    //private static TicketMarker ticker=new TicketMarker();
    private static TicketMarker[] ticketMarkers=new TicketMarker[]{
            new TicketMarker(1),new TicketMarker(2),new TicketMarker(3)
    };
    private int ticket=1000;
    private TicketMarker(int i){
        System.out.println("生成实例"+i);
    }
    public static TicketMarker getInstance(int i){
        return  ticketMarkers[i];
    }

    public  int getTicket(){
        return ticket++;
    }
}
