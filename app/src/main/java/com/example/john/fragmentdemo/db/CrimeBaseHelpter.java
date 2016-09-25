package com.example.john.fragmentdemo.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ZheWei on 2016/9/25.
 */
public class CrimeBaseHelpter extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "crimeBase.db";

    public CrimeBaseHelpter(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + CrimeDbSchma.CrimeTable.NAME + "(" +
                "_id integer primary key autoincrement, " +
                CrimeDbSchma.CrimeTable.Cols.UUID   + ", " +
                CrimeDbSchma.CrimeTable.Cols.TITLE  + ", " +
                CrimeDbSchma.CrimeTable.Cols.DATE   + ", " +
                CrimeDbSchma.CrimeTable.Cols.SOLVED +
                ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}