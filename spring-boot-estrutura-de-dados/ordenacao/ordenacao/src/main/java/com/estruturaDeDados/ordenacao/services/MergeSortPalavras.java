package com.estruturaDeDados.ordenacao.services;

import java.util.ArrayList;
import java.util.List;

public class MergeSortPalavras {

    public static List<String> mergeSort(List<String> nomes) {
        // Se a lista tiver menos de 2 elementos, já está ordenada
        if (nomes.size() < 2) {
            return nomes;
        }

        // Encontrando o meio da lista
        int indexMeio = nomes.size() / 2;

        // Dividindo a lista em duas sublistas
        List<String> metadeEsquerda = new ArrayList<>(nomes.subList(0, indexMeio));
        List<String> metadeDireita = new ArrayList<>(nomes.subList(indexMeio, nomes.size()));

        // Ordenando recursivamente as duas metades
        metadeEsquerda = mergeSort(metadeEsquerda);
        metadeDireita = mergeSort(metadeDireita);

        // Mesclando as duas metades ordenadas
        return merge(metadeEsquerda, metadeDireita);
    }

    // Método para mesclar duas listas ordenadas e retornar a lista mesclada
    private static List<String> merge(List<String> metadeEsquerda, List<String> metadeDireita) {
        List<String> resultado = new ArrayList<>();
        int i = 0, j = 0;

        // Comparando e mesclando os elementos das duas listas
        while (i < metadeEsquerda.size() && j < metadeDireita.size()) {
            if (metadeEsquerda.get(i).compareToIgnoreCase(metadeDireita.get(j)) <= 0) {
                resultado.add(metadeEsquerda.get(i));
                i++;
            } else {
                resultado.add(metadeDireita.get(j));
                j++;
            }
        }

        // Adicionando elementos restantes da metadeEsquerda, se houver
        while (i < metadeEsquerda.size()) {
            resultado.add(metadeEsquerda.get(i));
            i++;
        }

        // Adicionando elementos restantes da metadeDireita, se houver
        while (j < metadeDireita.size()) {
            resultado.add(metadeDireita.get(j));
            j++;
        }

        return resultado;
    }
}
