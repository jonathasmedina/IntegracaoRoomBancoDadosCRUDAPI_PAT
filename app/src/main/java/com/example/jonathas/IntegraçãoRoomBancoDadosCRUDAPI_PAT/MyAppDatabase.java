package com.example.jonathas.IntegraçãoRoomBancoDadosCRUDAPI_PAT;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = Usuario.class, version=1 )
public abstract class MyAppDatabase extends RoomDatabase {
    public abstract MyDAO myDAO();
}
