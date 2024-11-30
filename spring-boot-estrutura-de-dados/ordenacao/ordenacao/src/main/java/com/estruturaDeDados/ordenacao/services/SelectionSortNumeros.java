package com.estruturaDeDados.ordenacao.services;

import java.util.*;

public class SelectionSortNumeros {

    public static List<Integer> sortSelection(List<Integer> lista) {
        int n = lista.size();

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (lista.get(j) < lista.get(minIdx)) {
                    minIdx = j;
                }
            }
            // Troca
            int temp = lista.get(minIdx);
            lista.set(minIdx, lista.get(i));
            lista.set(i, temp);
        }
        // System.out.println(lista);
        return lista;
    }

}