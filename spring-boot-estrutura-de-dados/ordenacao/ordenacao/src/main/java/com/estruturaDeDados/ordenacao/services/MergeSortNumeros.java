package com.estruturaDeDados.ordenacao.services;

import java.util.ArrayList;
import java.util.List;

public class MergeSortNumeros {

    public static List<Integer> sortMerge(List<Integer> numeros) {
        if (numeros.size() <= 1) {
            return numeros;
        }

        int meio = numeros.size() / 2;
        List<Integer> esquerda = sortMerge(numeros.subList(0, meio));
        List<Integer> direita = sortMerge(numeros.subList(meio, numeros.size()));

        return merge(esquerda, direita);
    }

    private static List<Integer> merge(List<Integer> esquerda, List<Integer> direita) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < esquerda.size() && j < direita.size()) {
            if (esquerda.get(i) <= direita.get(j)) {
                merged.add(esquerda.get(i));
                i++;
            } else {
                merged.add(direita.get(j));
                j++;
            }
        }

        while (i < esquerda.size()) {
            merged.add(esquerda.get(i));
            i++;
        }

        while (j < direita.size()) {
            merged.add(direita.get(j));
            j++;
        }

        return merged;
    }
}
