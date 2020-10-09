package com.varlor.contentproviderdemo2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {


    public DBHelper(@Nullable Context context) {
        super(context, "cp.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.e("TAG","onCreate().....");
        //建表
        db.execSQL("create table person(_id integer primary key autoincrement,name varchar)");
        db.execSQL("insert into person (name)values('Tom')");
        }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
