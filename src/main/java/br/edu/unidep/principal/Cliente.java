package br.edu.unidep.principal;

import java.util.List;
import java.util.Scanner;

import br.edu.unidep.bancoUtil.Crud;
import br.edu.unidep.model.Usuario;
import br.edu.unidep.unumeracao.Status;

public class Cliente {
	
	public static void clientes(){
		
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.println("Cadastro de Clientes\nEscolha um opção: \n1 - Cadastrar \n2 - Alterar \n3 - Ler um usuario \n4 - Ler todos os usuários \n5 - Excluir ");
	
		Integer option;
		
		try {
			option = scanner.nextInt();
		} catch (Exception ex) {
			option = -1;
			scanner.nextLine();
		}
		
		
		switch(option) {
			case 1: {
	
				System.out.println("Insinra o nome do usuario:");
				String nome = scanner.next();
				
				System.out.println("Insinra o Login:");
				String login = scanner.next();
				
				System.out.println("Insinra o Senha:");		
				String senha= scanner.next();
				
				Integer status;
				
				do {
					System.out.println("Insinra o Status: 1 = ATIVO 2 = INATIVO");		
					
					try {
						status = scanner.nextInt();
					} catch (Exception ex) {
						status = -1;
						scanner.nextLine();
					}
				}while(status == -1);
										
				Usuario usuario = new Usuario();
				usuario.setLogin(login);
				usuario.setNome(nome);
				usuario.setSenha(senha); 
				if(status == 1){
					usuario.setStatus(Status.ATIVO);
				}else {
					usuario.setStatus(Status.INATIVO);
				}
				
				Crud.inserir(usuario);
				
				break;
			}
			
			case 2: {
	
				System.out.println("Insira o código do usuario a ser alterado:");
				Integer idUsuario = scanner.nextInt();
				
				Usuario usuario = (Usuario) Crud.buscar(Usuario.class, idUsuario);
				
						if (usuario != null) {
							System.out.println("Insinra o nome do usuario:");
							String nome = scanner.next();
							
							System.out.println("Insinra o Login:");
							String login = scanner.next();
							
							System.out.println("Insinra o Senha:");		
							String senha= scanner.next();
							
							Integer status;
							
							do {
								System.out.println("Insinra o Status: 1 = ATIVO 2 = INATIVO");		
								
								try {
									status = scanner.nextInt();
								} catch (Exception ex) {
									status = -1;
									scanner.nextLine();
								}
							}while(status == -1 );
							
							
							usuario.setLogin(login);
							usuario.setNome(nome);
							usuario.setSenha(senha); 
							if(status == 1){
								usuario.setStatus(Status.ATIVO);
							}else {
								usuario.setStatus(Status.INATIVO);
							}
							
							Crud.alterar(usuario);
						}
					break;
			}
			case 3: {
				
					System.out.println("Insira o código do usuario para a pesquisa");
					Integer idUsuario = scanner.nextInt();
					Usuario usuario = (Usuario) Crud.buscar(Usuario.class, idUsuario);
					
					if(usuario != null) {
						System.out.println(usuario);
					}	
					break;
			}
			case 4: {
					
					List<Object> porraloka = Crud.buscarTodos(Usuario.class);
					
					for (Object object : porraloka) {
						System.out.println(object);
					}
							
				    break;
			}
			case 5: {

					System.out.println("Insira o código do usuario que deseja excluir");
					Integer idUsuario = scanner.nextInt();
					Usuario usuario = (Usuario) Crud.buscar(Usuario.class, idUsuario);
					
						if (usuario != null) {
								Crud.excluir(Usuario.class, idUsuario);
						}
									
				    break;
			}
		}
	}
}

