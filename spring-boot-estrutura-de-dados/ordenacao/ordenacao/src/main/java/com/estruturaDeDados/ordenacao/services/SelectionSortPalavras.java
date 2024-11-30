package com.estruturaDeDados.ordenacao.services;

import java.util.*;

public class SelectionSortPalavras {

    public static List<String> listaPalavrasSelection(List<String> lista) {
        int n = lista.size();

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (lista.get(j).compareToIgnoreCase(lista.get(minIdx)) < 0) {
                    minIdx = j;
                }
            }
            // Troca
            String temp = lista.get(minIdx);
            lista.set(minIdx, lista.get(i));
            lista.set(i, temp);
        }
        // System.out.println(lista);
        return lista;
    }

}