package com.example.winner.apphoro2018;



        import java.util.ArrayList;




public class AData {


    private static AData sInstance;

    public ArrayList<A> alList;

    public static AData getInstance() {
        if (sInstance == null) {
            sInstance = new AData();
        }
        return sInstance;
    }

}