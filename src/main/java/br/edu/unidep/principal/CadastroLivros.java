package br.edu.unidep.principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.edu.unidep.bancoUtil.Crud;
import br.edu.unidep.model.Livro;
import br.edu.unidep.unumeracao.Status;

public class CadastroLivros {
	
	public static void cadastrarLivros(){
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cadastro de Livros \nEscolha um opção: \n1 - Cadastrar\n2 - Alterar\n3 - Ler um Livro\n4 - Ler todos os Livros\n5 - Excluir");
	
		Integer option;		

			try {
				option = scanner.nextInt();
			} catch (Exception ex) {
				option = -1;
				scanner.nextLine();
			}
			
			switch(option) {
				case 1: {
					
					System.out.println("Insinra o nome do Livro:");
					String nome = scanner.next();
					
					System.out.println("Insinra o nome do autor:");
					String autor = scanner.next();
					
					System.out.println("Insinra o nome da editora:");		
					String editora= scanner.next();
					
					SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
					Date data = null;
					do {
						
						try {

							System.out.println("Insinra a data de ediçãodd/MM/yyyy:");		
							String dataedicao= scanner.next();

							data = formato.parse(dataedicao);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.out.println("Formato invalido, inserido, null");
							scanner.nextLine();
						}
					} while(data == null);

					
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
								
					Livro livro = new Livro();
					
					livro.setNome(nome);
					livro.setAutor(autor);
					livro.setEditora(editora);
					livro.setDataedicao(data);
						if(status == 1){
							livro.setStatus(Status.ATIVO);
						}else {
							livro.setStatus(Status.INATIVO);
						}
					
					Crud.inserir(livro);
					
					break;
				}
				case 2: {
					
					System.out.println("Insira o código do Livro a ser alterado:");
					Integer idLivro = scanner.nextInt();
					
					Livro livro  = (Livro) Crud.buscar(Livro.class, idLivro);
					
							if (idLivro != null) {
								
								System.out.println("Insinra o nome do Livro:");
								String nome = scanner.next();
								
								System.out.println("Insinra o nome do autor:");
								String autor = scanner.next();
								
								System.out.println("Insinra o nome da editora:");		
								String editora= scanner.next();
																
								SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
								Date data = null;
								
								do {
									
									try {

										System.out.println("Insinra a data de ediçãodd/MM/yyyy:");		
										String dataedicao= scanner.next();

										data = formato.parse(dataedicao);
									} catch (ParseException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
										System.out.println("Formato invalido, inserido, null");
										scanner.nextLine();
									}
								} while(data == null);
								
								
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
								
								livro.setNome(nome);
								livro.setAutor(autor);
								livro.setEditora(editora);
								livro.setDataedicao(data);
									if(status == 1){
										livro.setStatus(Status.ATIVO);
									}else {
										livro.setStatus(Status.INATIVO);
									}
								
								Crud.alterar(livro);
							}
						break;
				}
				case 3: {
					
						System.out.println("Insira o código do livro para a pesquisa");
						Integer idLivro = scanner.nextInt();
						
						
						Livro livro = (Livro) Crud.buscar(Livro.class, idLivro);
						
						if(livro != null) {
							System.out.println(livro);
						}						
							
						break;
				}
				case 4: {
					
						List<Object> porraloka = Crud.buscarTodos(Livro.class);
							
							for (Object object : porraloka) {
								System.out.println(object);
							}
								
					    break;
				}
				case 5: {

						System.out.println("Insira o código do Livro que deseja excluir");
						Integer idlivro = scanner.nextInt();
						Livro livro = (Livro) Crud.buscar(Livro.class, idlivro);
						
							if (livro != null) {
									Crud.excluir(Livro.class, idlivro);
							}
										
					    break;
				}
      }
   }
}
