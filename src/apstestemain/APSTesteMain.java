package apstestemain;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author luana
 */
public class APSTesteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ArrayList<Cliente> cli = new ArrayList();
        
      
        
        JOptionPane.showMessageDialog(
                null, 
                "Estacionamento APS",
                "Bem Vindo",
                JOptionPane.WARNING_MESSAGE);
        
       int senha;
  
        String s = JOptionPane.showInputDialog(
                null,
                "Informe a senha: ");
        
         senha = Integer.parseInt(s);
        
         Autenticavel a = new Adm(senha);
        
        SistemaInterno si =  new SistemaInterno();
  
        
        if(si.login(a)){
        
            JOptionPane.showMessageDialog(
                null, 
                "Logado Com sucesso",
                "",
                JOptionPane.INFORMATION_MESSAGE);
            
            
        }else{
             JOptionPane.showMessageDialog(
                null, 
                "Senha Invalida",
                "Tente novamente",
                JOptionPane.WARNING_MESSAGE);
             
        }
        
    
       
        
        
        int op=0;
        do{
            
            System.out.println("::::::::::::::::::::::::::ESTACIONAMNETO::::::::::::::::::::::::::");
            System.out.println("1 - Cadastro Cliente");
            System.out.println("2 - Lavagem");
            System.out.println("3 - SERVIÇOS");
            System.out.println("4 - Listagem");
            System.out.println("5 - Excluir");
            System.out.println("0 - Sair");
            System.out.println("Digite a opção: ");
            op = ler.nextInt();
            ler.nextLine();
            
            switch(op){
                case 1:
                    Endereco end = new Endereco();

                    System.out.println("*****************Cadastro Cliente*****************");
                    System.out.println("Informe o nome do cliente: ");
                    String nome = ler.nextLine();
                    System.out.println("Informe o telefone do cliente: ");
                    String telefone = ler.nextLine();
                    System.out.println("Informe a rua do cliente: ");
                    end.setRua(ler.nextLine());
                    System.out.println("Informe o numero da rua do cliente: ");
                    end.setNumero(ler.nextInt());
                    ler.nextLine();
                    System.out.println("Informe a cidade do cliente: ");
                    end.setCidade(ler.nextLine());
                    System.out.println("Informe o cep do cliente: ");
                    end.setCep(ler.nextInt());
                    System.out.println("");
                    
                    Cliente c1 = new Cliente(0,nome, telefone, end);
                    c1.setEndereco(end);
                    //cli.add(c1);
                    
                    System.out.println("Deseja cadastrar o carro? ");
                    System.out.println("1 - SIM");
                    System.out.println("2 - NÃO");
                    System.out.println("Digite a opção: ");
                    int car = ler.nextInt();
                    ler.nextLine();
                    
                    String marca=""; 
                    String modelo=""; 
                    String cor="";
                    if(car == 1){
                        System.out.println("*****************Cadastro Carro*****************");
                        System.out.println("Marca: ");
                        marca = ler.nextLine();
                        System.out.println("Modelo: ");
                        modelo = ler.nextLine();
                        System.out.println("Cor: ");
                        cor = ler.nextLine();
                    }
                    Automovel auto = new Automovel(modelo, cor, marca, 0, nome, telefone, end);
                    cli.add(auto);
                    
                    JOptionPane.showMessageDialog(
                            null, 
                            "Cadastro realizado com sucesso!", 
                            "MENU", 
                            JOptionPane.INFORMATION_MESSAGE);
                    
                break;
                
                case 2:
                    if(cli.isEmpty()){
                            JOptionPane.showMessageDialog(
                                    null, 
                                    "Nenhum cliente cadastrado!", 
                                    "LAVAGEM", 
                                    JOptionPane.ERROR_MESSAGE);
                        }else{
                        System.out.println("*****************LAVAGEM*****************");
                        
                        
                        
                    }
                break;    
                
                case 3:
                    //if(cli.isEmpty()){
                         JOptionPane.showMessageDialog(
                                null, 
                                "Nenhum cliente cadastrado!", 
                                "GARAGEM", 
                                JOptionPane.ERROR_MESSAGE);
                        //}else{
                        System.out.println("*****************SERVIÇOS*****************");
                        System.out.println("1 - LAVAGEM");
                        System.out.println("2 - GARAGEM");
                        System.out.println("3 - AMBOS");
                         op = ler.nextInt();
                         if(op == 1){
                             Lavagem lav = new Lavagem(car, nome, telefone, end);
                             lav.setValorLav(10);
                              System.out.println("Valor R$" +lav.valorServicos());
                             
                         } else if (op == 2){
                             System.out.println("INFORME A QUANTIDADE DE HORAS");
                             double horas = ler.nextDouble(); 
                            Lavagem lav = new Lavagem();
                            lav.setQtdHoras(horas);
                            
                             System.out.println("VALOR DA GARAGEM: R$ " +lav.valorServicos());
                            
                        }else{
                                 System.out.println("INFORME A QUANTIDADE DE HORAS");
                             double horas = ler.nextDouble(); 
                            Lavagem lav = new Lavagem();
                            lav.setQtdHoras(horas);
                            lav.setValorLav(10);
                             System.out.println("Valor de total R$" +lav.valorServicos());
                                }
                        
                        
                   // }
                break;
                
                case 4:
                    if(cli.isEmpty()){
                            JOptionPane.showMessageDialog(
                                    null, 
                                    "Nenhum cliente cadastrado!", 
                                    "LISTA", 
                                    JOptionPane.ERROR_MESSAGE);
                        }else{
                            for(Cliente cliente: cli){
                                System.out.println("*****************LISTAGEM*****************");
                                cliente.exibirCliente();
                                System.out.println("*********************************************");
                            }
                        }
                    
                break;
                
                case 5:
                    String busca;
                    
                    System.out.println("Informe o nome do cliente para excluir: ");
                    busca = ler.nextLine();
                    
                    if(cli.isEmpty()){
                         JOptionPane.showMessageDialog(
                                null, 
                                "Nenhum cliente cadastrado!", 
                                "MENU", 
                                JOptionPane.ERROR_MESSAGE);
                    }else{
                        for(Cliente clien: cli){
                            if(busca.equals(clien.getNome())){
                                cli.remove(clien);
                                JOptionPane.showMessageDialog(
                                                null, 
                                                "Cliente removido realizado com sucesso!", 
                                                "MENU", 
                                                 JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }   
                    }
                break;
                
                case 0:
                     JOptionPane.showMessageDialog(
                            null, 
                            "Saindo do sistema!", 
                            "MENU", 
                            JOptionPane.INFORMATION_MESSAGE);
                break; 
                
                default:
                    JOptionPane.showMessageDialog(
                            null, 
                            "Opção do menu inválida!", 
                            "MENU", 
                            JOptionPane.ERROR_MESSAGE);
            }
        }while(op != 0);
    }
    
}
