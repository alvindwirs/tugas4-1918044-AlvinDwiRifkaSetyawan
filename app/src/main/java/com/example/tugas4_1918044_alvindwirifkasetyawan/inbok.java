package com.example.tugas4_1918044_alvindwirifkasetyawan;

public class inbok {
    private String nama,chat;
    private int pic;
    public inbok(String nama, String chat,int pic){
        this.nama = nama;
        this.chat = chat;
        this.pic = pic;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getChat(){
        return chat;
    }
    public void setChat(String chat){
        this.chat = chat;
    }
    public int getpic(){

        return pic;
    }
    public void setpic(int pic){
        this.pic = pic;
    }
}
