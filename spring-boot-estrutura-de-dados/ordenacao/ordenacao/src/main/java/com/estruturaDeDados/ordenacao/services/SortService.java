package com.estruturaDeDados.ordenacao.services;

import org.springframework.stereotype.Service;

import java.util.*;

// import com.estruturaDeDados.ordenacao.services.SelectionSortNumeros;

@Service
public class SortService {
    private static  long tempoFinal;

    public static long getTempoFinal(){
        return tempoFinal;
    }

    public static List<Integer> listaDefaultSelection() {
        List<Integer> defaultLista = Arrays.asList(
        432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 
        62, 890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 
        9, 624, 712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 
        302, 946, 561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 
        799, 180, 628, 886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 
        681, 61, 918, 375, 692, 993, 183, 553, 846, 24, 954, 286, 647, 129);
        List<Integer> numeros = new ArrayList<>(defaultLista);

        long inicio = System.nanoTime();
        List<Integer> listaOrdenada = SelectionSortNumeros.sortSelection(numeros);
        tempoFinal = System.nanoTime() - inicio;

        // System.out.println(defaultLista);
        return listaOrdenada;
    }

    public static List<Integer> listaXNumerosSelection() {
        Random rand = new Random();
		int[]  lista = new int[100000];
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = rand.nextInt(100000000);
		}

        List<Integer> listaXNumeros = new ArrayList<>();
        for (int num : lista) {
            listaXNumeros.add(num);
        }

        long inicio = System.currentTimeMillis();

        List<Integer> listaOrdenada = SelectionSortNumeros.sortSelection(listaXNumeros);
		
		tempoFinal = System.currentTimeMillis() - inicio;

        return listaOrdenada;
    }    

    public static List<String> listaPalavrasSelection() {
        String[] listaNomes = 
            {"Zurique", "Mario", "Fabricio", "Paula", "Hugo", "Ana", "Bruno", "Samuel", "Xamueol", "yago", "Walter", "Quadribol", "Gabriel", "Indiana", "Yago", "Ernesto", "Daniel", "Raimundo", "Tarik", "Udir", "Oraculo", "Carlos", "Jonas", "Narcio", "Vanessa", "Kleber", "Lucas"};

        List<String> nomes = new ArrayList<>(Arrays.asList(listaNomes));

        long inicio = System.nanoTime();

        List<String> listaOrdenada = SelectionSortPalavras.listaPalavrasSelection(nomes);
		
		tempoFinal = System.nanoTime() - inicio;

        // System.out.println("Lista original (após ordenação): " + Arrays.toString(listaNomes));

        return listaOrdenada;
    }    

    //###################################################//
    //###################################################//
    //###################################################//
    //###################################################//
    //###################################################//
    //###################################################//

    public static List<Integer> listaDefaultMerge() {
        List<Integer> defaultLista = Arrays.asList(
        432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 
        62, 890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 
        9, 624, 712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 
        302, 946, 561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 
        799, 180, 628, 886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 
        681, 61, 918, 375, 692, 993, 183, 553, 846, 24, 954, 286, 647, 129);

        List<Integer> numeros = new ArrayList<>(defaultLista);

        long inicio = System.nanoTime();

        List<Integer> listaOrdenada = MergeSortNumeros.sortMerge(numeros);
		
		tempoFinal = System.nanoTime() - inicio;

        return listaOrdenada;
    }

    public static List<Integer> listaXNumerosMerge() {
        Random rand = new Random();
		int[]  lista = new int[100000];
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = rand.nextInt(100000000);
		}

        List<Integer> listaXNumeros = new ArrayList<>();
        for (int num : lista) {
            listaXNumeros.add(num);
        }

        long inicio = System.currentTimeMillis();

        List<Integer> listaOrdenada = MergeSortNumeros.sortMerge(listaXNumeros);
		
		tempoFinal = System.currentTimeMillis() - inicio;

        return listaOrdenada;
    }    

    public static List<String> listaPalavrasMerge() {
        String[] listaNomes = 
            {"Zurique", "Mario", "Fabricio", "Paula", "Hugo", "Ana", "Bruno", "Samuel", "Xamueol", "yago", "Walter", "Quadribol", "Gabriel", "Indiana", "Yago", "Ernesto", "Daniel", "Raimundo", "Tarik", "Udir", "Oraculo", "Carlos", "Jonas", "Narcio", "Vanessa", "Kleber", "Lucas"};

        List<String> nomes = new ArrayList<>(Arrays.asList(listaNomes));

        long inicio = System.nanoTime();

        List<String> listaOrdenada = MergeSortPalavras.mergeSort(nomes);
		
		tempoFinal = System.nanoTime() - inicio;

        // System.out.println("Lista original (após ordenação): " + Arrays.toString(listaNomes));

        return listaOrdenada;
    }

}