package com.example.demotrial.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Matrix {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    int [][] myMatrix;
    LocalDateTime localDateTime;

    public Matrix(int[][] myMatrix, LocalDateTime localDateTime) {
        this.myMatrix = myMatrix;
        this.localDateTime = localDateTime;
    }

    public Matrix() {
    }

    public Matrix(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Matrix(int[][] myMatrix) {
        this.myMatrix = myMatrix;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int[][] getMyMatrix() {
        return myMatrix;
    }

    public void setMyMatrix(int[][] myMatrix) {
        this.myMatrix = myMatrix;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
