package com.example.emes.bdmusica;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class musicaOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "musicaDB";
    private static final int DATABASE_VERSION = 1;
    public static final String LOGTAG = "LOGTAG";

    public static final String TABLE_PRODUCTS = "grupos";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOMBRE = "nombre";
    public static final String COLUMN_ALBUM = "album";
    public static final String COLUMN_CANCION = "cancion";

    public static final String CREATE_TABLE =
            "CREATE TABLE "+ TABLE_PRODUCTS + " ("+
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                    COLUMN_NOMBRE + " TEXT, "+
                    COLUMN_ALBUM + " TEXT, "+
                    COLUMN_CANCION + " TEXT)";

    public musicaOpenHelper(Context context) {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(CREATE_TABLE);
        Log.i(LOGTAG, "La tabla productos ha sido creada");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_PRODUCTS);
        onCreate(db);
    }
}
