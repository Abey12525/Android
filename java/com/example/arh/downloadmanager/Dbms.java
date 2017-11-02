package com.example.arh.downloadmanager;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ARH on Oct 30, 2017.
 */

public class Dbms extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="User.db";
    public static final String TABLE_NAME="User_data";
    public static final String COL_1="username";
    public static final String

    public Dbms(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
    }


    @Override
    public void oncreate(SQLiteDatabase db){

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
