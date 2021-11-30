package br.edu.unidep.principal;

import java.text.ParseException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ParseException {
    	showMenu(new Scanner(System.in));
    }

	public static void showMenu(Scanner scanner) {
		Integer option;
		do {
    		
    		showMenuOptions();
    		    		
    		option = getInputUser(scanner);
    		
	    	choiceMenu(option);
    	} while(option != 0);
	}

	public static void choiceMenu(Integer option) {
		switch(option) {
		case 0:
			showGoodBye();
			break;
		case 1:
			cadastrarClientes();
			break;
		case 2:
			cadastrarLivros();
			break;
		//case 3:
		//	EmpresimoUsuario.empresimoUsuario();
		//	break;
		
		default:
			showOpcaoInvalida();
		}
	}

	public static void showMenuOptions() {
		System.out.println("Escolha um opção: \n0 - Sair\n1 - Usuario\n2 - Livro\n3 - Emprestimo/Devoluçao");
	}

	public static Integer getInputUser(Scanner scanner) {
		Integer option;
		try {
			option = scanner.nextInt();
		} catch (Exception ex) {
			option = -1;
			scanner.nextLine();
		}
		return option;
	}

	public static void showOpcaoInvalida() {
		System.out.println("Opção inválida");
	}

	public static void cadastrarClientes() {
		Cliente.clientes();
	}

	public static void cadastrarLivros() {
		CadastroLivros.cadastrarLivros();
	}

	public static void showGoodBye() {
		System.out.println("Obrigado por usar meu sistema");
	}

}
	

	
	
	
	
	
	
	
	
