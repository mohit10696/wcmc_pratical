package com.example.wcmc_praticals;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {
    static String dbname = "wcmc";
    String tblname = "login";
    String col1 = "ID";
    String col2 = "PASSWORD";
    String col3 = "NAME";
    public database(@Nullable Context context) {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + tblname +" (ID TEXT ,PASSWORD TEXT,NAME TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       // db.execSQL("DROP TABLE IF EXISTS "+tblname);
        onCreate(db);
    }

    public boolean insertData(String ID,String PASSWORD,String NAME) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col1,ID);
        contentValues.put(col2,PASSWORD);
        contentValues.put(col3,NAME);
        long result = db.insert(tblname,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getData(String ID) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+tblname + " where ID = "+"'"+ ID+"'",null);
        return res;
    }
}
