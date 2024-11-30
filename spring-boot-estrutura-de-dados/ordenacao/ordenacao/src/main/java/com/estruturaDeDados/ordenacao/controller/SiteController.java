package com.estruturaDeDados.ordenacao.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.estruturaDeDados.ordenacao.services.SortService;

@Controller
public class SiteController {
	
	// pagina principal
	@GetMapping("/")
	public String home() {
		return "index";
	}

	// pagina escolha do metodo historia
	@GetMapping("/historia")
	public String historia() {
		return "historia/escolhaHistoria";
	}

	// pagina historia do metodo selection
	@GetMapping("/historia/selection")
	public String historiaSelection() {
		return "historia/historia-selection";
	}

	// pagina historia do metodo merge
	@GetMapping("/historia/merge")
	public String historiaMerge() {
		return "historia/historia-merge";
	}

	// pagina escolha tipo de lista para demonstrar
	@GetMapping("/demonstracao")
	public String demonstracao() {
		return "/demonstracao/demonstracao";
	}

	// pagina escolha metodo para ordenar lista padrão
	@GetMapping("/demonstracao/padrao")
	public String padrao() {
		return "/demonstracao/padrao/escolhaPadrao";
	}

	// pagina demonstrar lista padrão por selection sort
	@GetMapping("/demonstracao/padrao/selection")
  	public ModelAndView listPadraoSelection() {
    ModelAndView mv = new ModelAndView("demonstracao/padrao/demonstracao-selection-default");
	List <Integer> listaOrdenada = SortService.listaDefaultSelection();
	long tempoExecucao = SortService.getTempoFinal();
    mv.addObject("listaNumeroSelection", listaOrdenada);
    mv.addObject("tempoExecucao", "Tempo de Execução: " + tempoExecucao + " ns");
    return mv;
  	}

	// pagina demonstrar lista padrão por merge sort
	@GetMapping("/demonstracao/padrao/merge")
  	public ModelAndView listPadraoMerge() {
    ModelAndView mv = new ModelAndView("demonstracao/padrao/demonstracao-merge-default");
	List <Integer> listaOrdenada = SortService.listaDefaultMerge();
	long tempoExecucao = SortService.getTempoFinal();
    mv.addObject("listaNumeroMerge", listaOrdenada);
    mv.addObject("tempoExecucao", "Tempo de Execução: " + tempoExecucao + " ns");
    return mv;
  	}

	// pagina escolher metodo para demonstrar lista de n valores
	@GetMapping("/demonstracao/n-valores")
	public String nValores() {
		return "/demonstracao/n-valores/escolhaNvalores";
	}

	// pagina demonstrar lista n valores por selection sort
	@GetMapping("/demonstracao/n-valores/selection")
  	public ModelAndView listNvaloresSelection() {
    ModelAndView mv = new ModelAndView("demonstracao/n-valores/demonstracao-selection-Nvalores");
	List <Integer> listaOrdenada = SortService.listaXNumerosSelection();
	long tempoExecucao = SortService.getTempoFinal();
    mv.addObject("listaNumeroSelection", listaOrdenada);
    mv.addObject("tempoExecucao", "Tempo de Execução: " + tempoExecucao + " ms");
    return mv;
  	}

	// pagina demonstrar lista n valores por merge sort
	@GetMapping("/demonstracao/n-valores/merge")
  	public ModelAndView listNvaloresMerge() {
    ModelAndView mv = new ModelAndView("demonstracao/n-valores/demonstracao-merge-Nvalores");
	List <Integer> listaOrdenada = SortService.listaXNumerosMerge();
	long tempoExecucao = SortService.getTempoFinal();
    mv.addObject("listaNumeroMerge", listaOrdenada);
    mv.addObject("tempoExecucao", "Tempo de Execução: " + tempoExecucao + " ms");
    return mv;
  	}

	// pagina escolher metodo para demonstrar lista de palavras
	@GetMapping("/demonstracao/palavras")
	public String palavras() {
		return "/demonstracao/palavras/escolhaPalavras";
	}

	// pagina demonstrar lista palavras por selection sort
	@GetMapping("/demonstracao/palavras/selection")
  	public ModelAndView listPalavrasSelection() {
    ModelAndView mv = new ModelAndView("demonstracao/palavras/demonstracao-selection-palavras");
	List <String> listaOrdenada = SortService.listaPalavrasSelection();
	long tempoExecucao = SortService.getTempoFinal();
    mv.addObject("listaPalavraSelection", listaOrdenada);
    mv.addObject("tempoExecucao", "Tempo de Execução: " + tempoExecucao + " ns");
    return mv;
  	}

	// pagina demonstrar lista palavras por merge sort
	@GetMapping("/demonstracao/palavras/merge")
  	public ModelAndView listPalavrasMerge() {
    ModelAndView mv = new ModelAndView("demonstracao/palavras/demonstracao-merge-palavras");
	List <String> listaOrdenada = SortService.listaPalavrasMerge();
	long tempoExecucao = SortService.getTempoFinal();
    mv.addObject("listaPalavraMerge", listaOrdenada);
    mv.addObject("tempoExecucao", "Tempo de Execução: " + tempoExecucao + " ns");
    return mv;
  	}
}
