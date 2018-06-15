package com.gomar.parcial2_00011616.Entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "table_players")

public class PlayersEntity {

    @PrimaryKey

    @NonNull
    @ColumnInfo(name = "_id")
    private String _id;
    @NonNull
    @ColumnInfo(name = "name")
    private String name;
    @NonNull
    @ColumnInfo(name = "biografia")
    private String biografia;
    @NonNull
    @ColumnInfo(name = "avatar")
    private String avatar;
    @NonNull
    @ColumnInfo(name = "game")
    private String game;

    public PlayersEntity() {
    }

    @NonNull
    public String get_id() {
        return _id;
    }

    public void set_id(@NonNull String _id) {
        this._id = _id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(@NonNull String biografia) {
        this.biografia = biografia;
    }

    @NonNull
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(@NonNull String avatar) {
        this.avatar = avatar;
    }

    @NonNull
    public String getGame() {
        return game;
    }

    public void setGame(@NonNull String game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Player{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", biografia='" + biografia + '\'' +
                ", avatar='" + avatar + '\'' +
                ", game='" + game + '\'' +
                '}';
    }
    }
