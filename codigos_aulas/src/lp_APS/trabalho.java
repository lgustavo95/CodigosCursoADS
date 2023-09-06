package lp_APS;

import java.util.Scanner;

public class trabalho{

	private static String nome,matricula ;
	 
	 public static int opc;
		
	 public static double notaAP1,notaAP2,notaAPS ;
	 
	 public static int Somar (double notaAP1, double notaAP2, double notaAPS) {
		 return (int) (notaAP1 + notaAP2 + notaAPS);
	 }
	 public static double Calculo (double notaAP1, double notaAP2, double notaAPS) {
		 return (notaAP1 + notaAP2 + notaAPS)/3;
	 }
	
	public static void main(String[] args) throws InstantiationException{
		
			Scanner leitor = new Scanner(System.in);
			
			Aluno novoaluno = new Aluno(nome, matricula);

			char[][] notas = new char [3][1];
			
			 
		//trabalho aps lp 21/11/21 sistema de cadastro
			
			    System.out.println("Alunos UNIFAMETRO");
			    System.out.println("com prof: joao Leonardo");
			    System.out.println("..............................................................");
			    System.out.println("Isaac Leandro Luna Araujo              matricula: 1-2021221273");
			    System.out.println("Luiz Gustavo Silva Crispim de Lima     matricula: 1-2021221147");
			    System.out.println("Joanderson Santos Rodrigues            matricula: 1-2021221236");
			    System.out.println("Igor Araujo Pessoa                     matricula: 1-2021221592");  
			    System.out.println("Leonardo dos Santos Uchoa              matricula: 1-2021221041");
			 
			double media;    
			double total;
		//	double notaAP1,notaAP2,notaAPS; 
			do{
			    System.out.println(".................................");
			    System.out.println("        MENU ");
			    System.out.println("  Escolha uma Opcao:");
			    System.out.println(" .                  .");
			    System.out.println(" 1 - Cadastrar Aluno");
			    System.out.println(" 2 - Notas das Provas");
			    System.out.println(" 3 - Medias");
			    System.out.println(" 0 - Sair");
			    
			    opc = leitor.nextInt();
			    leitor.nextLine();
			    
			
			switch (opc){
			    
			    case 1:
			        System.out.println("seu nome ?");
			        nome = leitor.nextLine();
			        System.out.println("matricula ?");
			        matricula = leitor.nextLine();			    
	//		    novasala.inserealuno(novoaluno);			    
			    break;	
			    			    
			    case 2:
	//		    novasala.listaralunos();	
			    	 				  
			        System.out.println("Digite sua nota:");
			  System.out.println("nota AP1 ? " );
			    notaAP1 = leitor.nextDouble();			 
			  System.out.println("nota AP2 ? ");
			    notaAP2 = leitor.nextDouble();			 
			  System.out.println("nota APS ? ");
			    notaAPS = leitor.nextDouble(); 
			    break;
	
			    case 3:
			    
			    	 total = (double) Somar (notaAP1,notaAP2,notaAPS);
					    System.out.println("total: " + total);
					    
					    media = Calculo (notaAP1,notaAP2,notaAPS);
						System.out.println("Sua media: " + media );	    
			        break;
			        
			    case 0:
			    System.out.println("Saindo..............Obrigado");
			        break;
			        
			  default:
			    System.out.println("Opcao Invalida");
			    notas[0][0] = leitor.next().charAt(0);
			    notas[0][1] = leitor.next().charAt(0);
			    notas[0][2] = leitor.next().charAt(0);
			    			     
			}
									
			}while (opc != 0);
			
		}
}