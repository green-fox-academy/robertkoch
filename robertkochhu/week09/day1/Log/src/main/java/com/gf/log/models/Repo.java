package com.gf.log.models;

public class Repo {
    Log [] arrayList;
    int entryCount;

    public Repo(Log[] arrayList) {
        this.arrayList = arrayList;
        this.entryCount =arrayList.length;
    }

    public Repo() {
    }

    public Log[] getArrayList() {
        return arrayList;
    }

    public void setArrayList(Log[] arrayList) {
        this.arrayList = arrayList;
    }

    public int getEntryCount() {
        return entryCount;
    }

    public void setEntryCount(int entryCount) {
        this.entryCount = entryCount;
    }
}
