package com.example.emes.bdmusica;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataSource {

    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public static final String[] allColumns = {
            musicaOpenHelper.COLUMN_ID,
            musicaOpenHelper.COLUMN_NOMBRE,
            musicaOpenHelper.COLUMN_ALBUM,
            musicaOpenHelper.COLUMN_CANCION

    };


    public DataSource(Context context)
    {
        dbhelper = new musicaOpenHelper(context);
    }

    public void open()
    {
        database = dbhelper.getWritableDatabase();
    }

    public void close()
    {
        database.close();
    }

    public void create(producto producto)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(musicaOpenHelper.COLUMN_NOMBRE, producto.getNombre());
        contentValues.put(musicaOpenHelper.COLUMN_ALBUM, producto.getAlbum());
        contentValues.put(musicaOpenHelper.COLUMN_CANCION, producto.getCancion());
        database.insert(musicaOpenHelper.TABLE_PRODUCTS, null, contentValues);
    }
}
