package com.example.demotrial.services;

import com.example.demotrial.models.Matrix;
import com.example.demotrial.repositories.MatrixRepository;
import org.springframework.stereotype.Service;

@Service
public class ImpMatrixService implements MatrixService {
    MatrixRepository matrixRepository;

    public ImpMatrixService(MatrixRepository matrixRepository) {
        this.matrixRepository = matrixRepository;
    }

    public void save(Matrix matrix) {
        matrixRepository.save(matrix);
    }

    @Override
    public void create(String inputMatrix) {
        inputMatrix = inputMatrix.replaceAll(" ", "");
        String[] stringArray = inputMatrix.split("\r\n");
        int[][] matrixArray = new int[stringArray.length][stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray.length; j++) {
                matrixArray[i][j] = Character.getNumericValue(stringArray[i].charAt(j));
            }
        }

        Matrix matrix = new Matrix(matrixArray);
        matrixRepository.save(matrix);
    }
}
