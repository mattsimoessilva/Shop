import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Empresa empresa = new Empresa();

        while (true) {
            Scanner reader = new Scanner(System.in, "CP850");

            System.out.println("""
                Bem-vindo à biblioteca. Selecione um número correspondente a uma opção do menu: \n
                - Digite 1 para cadastrar produto \n
                - Digite 2 para cadastrar grupo do produto \n
                - Digite 3 para cadastrar fornecedor \n
                - Digite 4 para cadastrar fabricante \n 
                - Digite 5 para listar todos os produtos \n
                - Digite 6 para buscar produto pelo seu código \n
                - Digite 7 para deletar produto pelo seu código \n
            """);
            int number = reader.nextInt();
            reader.nextLine();

            if (number == 1) {
                while (true) {
                    if (empresa.getGrupos().size() > 0 && empresa.getFornecedores().size() > 0 && empresa.getFabricantes().size() > 0) {
                        String suprimento;

                        System.out.println("Código:");
                        String codigo = reader.nextLine();
    
                        while (true) {
                            System.out.println("Suprimento (comprado/fabricado):");
                            suprimento = reader.nextLine().toLowerCase();
    
                            if (suprimento.equals("comprado") || suprimento.equals("fabricado")) {
                                break;
                            }
                            else {
                                System.out.println("Input incorreto");
                            }
                        }
    
                        System.out.println("Descrição do produto:");
                        String descProd = reader.nextLine();
    
                        System.out.println("Estoque mínimo:");
                        int estoqueMin = reader.nextInt();
                        reader.nextLine();
    
                        System.out.println("Unidade de medida:");
                        String unidadeMedida = reader.nextLine();

                        System.out.println(String.format("Escolha um grupo: \n %s", empresa.listarGrupos()));
                        int indiceGrupo = reader.nextInt();
                        reader.nextLine();

                        System.err.println("NCM: ");
                        int ncm = reader.nextInt();
                        reader.nextLine();

                        System.out.println(String.format("Escolha um fornecedor: \n %s", empresa.listarFornecedores()));
                        int indiceFornecedor = reader.nextInt();
                        reader.nextLine();

                        System.out.println(String.format("Escolha um fabricante: \n %s", empresa.listarFabricantes()));
                        int indiceFabricante = reader.nextInt();
                        reader.nextLine();

                        System.out.println("Preço médio:");
                        float precoMedio = reader.nextFloat();
                        reader.nextLine();

                        System.out.println("Lote:");
                        int lote = reader.nextInt();
                        reader.nextLine();

                        System.out.println("Descrição técnica:");
                        String descTec = reader.nextLine();

                        System.out.println("Observação:");
                        String observacao = reader.nextLine();

                        if (codigo.equals("") || suprimento.equals("") || descProd.equals("") || unidadeMedida.equals("") || descTec.equals("") || observacao.equals("")) {
                            System.out.println("Não foi possível cadastrar o objeto");
                            continue;
                        }
                        else {
                            Produto produto = new Produto(codigo, suprimento, descProd, estoqueMin, unidadeMedida, empresa.getGrupo(indiceGrupo), ncm, empresa.getFornecedor(indiceFornecedor), empresa.getFabricante(indiceFabricante), precoMedio, lote, descTec, observacao);
                            empresa.adicionarProduto(produto);
                            System.out.println("Produto cadastrado");
                            break;
                        }

                    } else {
                        System.out.println("Não há como cadastrar produtos");
                        break;
                    }
                }

                while (true) {
                    System.out.println("Deseja continuar no sistema? (S/N)");
                    String escolha = reader.nextLine();

                    if (escolha.toLowerCase().equals("s")) {
                        break;
                    } 
                    else if (escolha.toLowerCase().equals("n")) {
                        System.exit(0);
                    }
                }
            }
            else if (number == 2) {
                while (true) {
                    System.out.println("Nome: ");
                    String nome = reader.nextLine();

                    if(nome.equals("")) {
                        System.out.println("Não foi possível cadastrar o objeto");
                        continue;
                    } else {
                        Grupo grupo = new Grupo(nome);
                        empresa.adicionarGrupo(grupo);
                        System.out.println("Grupo cadastrado");
                        break;
                    }
                }

                while (true) {
                    System.out.println("Deseja continuar no sistema? (S/N)");
                    String escolha = reader.nextLine();

                    if (escolha.toLowerCase().equals("s")) {
                        break;
                    } 
                    else if (escolha.toLowerCase().equals("n")) {
                        System.exit(0);
                    }
                }
            }
            else if (number == 3) {
                while (true) {
                    System.out.println("Nome: ");
                    String nome = reader.nextLine();

                    if(nome.equals("")) {
                        System.out.println("Não foi possível cadastrar o objeto");
                        continue;
                    } else {
                        Fornecedor fornecedor = new Fornecedor(nome);
                        empresa.adicionarFornecedor(fornecedor);
                        System.out.println("Fornecedor cadastrado");
                        break;
                    }
                }

                while (true) {
                    System.out.println("Deseja continuar no sistema? (S/N)");
                    String escolha = reader.nextLine();

                    if (escolha.toLowerCase().equals("s")) {
                        break;
                    } 
                    else if (escolha.toLowerCase().equals("n")) {
                        System.exit(0);
                    }
                }
            }
            else if (number == 4) {
                while (true) {
                    System.out.println("Nome: ");
                    String nome = reader.nextLine();

                    if(nome.equals("")) {
                        System.out.println("Não foi possível cadastrar o objeto");
                        continue;
                    } else {
                        Fabricante fabricante = new Fabricante(nome);
                        empresa.adicionarFabricante(fabricante);
                        System.out.println("Fabricante cadastrado");
                        break;
                    }
                }

                while (true) {
                    System.out.println("Deseja continuar no sistema? (S/N)");
                    String escolha = reader.nextLine();

                    if (escolha.toLowerCase().equals("s")) {
                        break;
                    } 
                    else if (escolha.toLowerCase().equals("n")) {
                        System.exit(0);
                    }
                }
            }
            else if (number == 5) {
                if (empresa.getProdutos().size() > 0) {
                    System.out.println(empresa.listarProdutos());
                } else {
                    System.out.println("Não há produtos cadastrados");
                }

                while (true) {
                    System.out.println("Deseja continuar no sistema? (S/N)");
                    String escolha = reader.nextLine();

                    if (escolha.toLowerCase().equals("s")) {
                        break;
                    } 
                    else if (escolha.toLowerCase().equals("n")) {
                        System.exit(0);
                    }
                }
            }
            else if (number == 6) {
                while (true) {
                    if (empresa.getProdutos().size() > 0) {
                        System.out.println("Forneça um código: ");
                        String codigo = reader.nextLine();
                
                        if (codigo.equals("")){
                            System.out.println("Não foi possível encontrar o produto");
                        } else {
                            Produto produto = empresa.getProduto(codigo);

                            if (produto == null) {
                                System.out.println("Não há um produto cadastrado com esse código");
                                break;
                            } else {
                                System.out.println(produto.mostrarProduto());
                                break;
                            }
                        }
                    } else {
                        System.out.println("Não há produtos cadastrados");
                        break;
                    }
                }

                while (true) {
                    System.out.println("Deseja continuar no sistema? (S/N)");
                    String escolha = reader.nextLine();

                    if (escolha.toLowerCase().equals("s")) {
                        break;
                    } 
                    else if (escolha.toLowerCase().equals("n")) {
                        System.exit(0);
                    }
                }

            }
            else if (number == 7) {
                while (true) {
                    if (empresa.getProdutos().size() > 0) {
                        System.out.println("Forneça um código: ");
                        String codigo = reader.nextLine();
                
                        if (codigo.equals("")){
                            System.out.println("Não foi possível encontrar o produto");
                        } else {
                            Produto produto = empresa.getProduto(codigo);

                            if (produto == null) {
                                System.out.println("Não há um produto cadastrado com esse código");
                                break;
                            } else {
                                empresa.removerProduto(codigo);
                                System.out.println("Produto deletado");
                                break;
                            }
                        }
                    } else {
                        System.out.println("Não há produtos cadastrados");
                        break;
                    }
                }

                while (true) {
                    System.out.println("Deseja continuar no sistema? (S/N)");
                    String escolha = reader.nextLine();

                    if (escolha.toLowerCase().equals("s")) {
                        break;
                    } 
                    else if (escolha.toLowerCase().equals("n")) {
                        System.exit(0);
                    }
                }
            }
        }
    }
}
