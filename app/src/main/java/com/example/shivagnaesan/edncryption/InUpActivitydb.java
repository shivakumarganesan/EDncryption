package com.example.shivagnaesan.edncryption;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ANDROID on 9/12/2016.
 */
public class InUpActivitydb extends SQLiteOpenHelper {


    public static final String DATABASE_NAME="InUpActivity.db";

    public static final String DATABASE_TABLE="InUpTable";

    public static final String DATABASE_clm1="ID";
    public static final String DATABASE_clm2="USERNAME";
    public static final String DATABASE_clm3="EMAILID";
    public static final String DATABASE_clm4="PASSWORD";
    public static final String DATABASE_clm5="CONFIRIMPASS";
    public static final String DATABASE_clm6="PRIVATEKEY";







    public InUpActivitydb(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {

    }
}
