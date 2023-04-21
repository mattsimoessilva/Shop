import java.util.ArrayList;
import java.util.Iterator;

public class Empresa {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Grupo> grupos = new ArrayList<>();
    private ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    private ArrayList<Fabricante> fabricantes = new ArrayList<>();

    public Empresa() {

    }

    public Empresa(ArrayList<Produto> produtos, ArrayList<Grupo> grupos, ArrayList<Fornecedor> fornecedores, ArrayList<Fabricante> fabricantes) {
        this.produtos = produtos;
        this.grupos = grupos;
        this.fornecedores = fornecedores;
        this.fabricantes = fabricantes;
    }

    public void removerProduto(String codigo) {
        this.produtos.removeIf(produto -> produto.getCodigo().equals(codigo));
        // Iterator<Produto> iterator = this.produtos.iterator();
        // while(iterator.hasNext()) {
        //    Produto next = iterator.next();
        //    if(next.getCodigo().equals(codigo)) {
        //        iterator.remove();
        //    }
        // }
    }

    public String listarProdutos() {
        String s = "";

        int i = 0;
        for (Produto produto : this.produtos) {
            s += i + " - Código: " + produto.getCodigo() + ", Descrição: " + produto.getDescProd() + "\n ";
            i++;
        }

        return s;
    }

    public String listarGrupos() {
        String s = "";

        int i = 0;
        for (Grupo grupo : this.grupos) {
            s += i + " - " + grupo.getNome() + "\n ";
            i++;
        }

        return s;
    }

    public String listarFornecedores() {
        String s = "";

        int i = 0;
        for (Fornecedor fornecedor : this.fornecedores) {
            s += i + " - " + fornecedor.getNome() + "\n ";
            i++;
        }

        return s;
    }

    public String listarFabricantes() {
        String s = "";

        int i = 0;
        for (Fabricante fabricante : this.fabricantes) {
            s += i + " - " + fabricante.getNome() + "\n ";
            i++;
        }

        return s;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void adicionarGrupo(Grupo grupo) {
        this.grupos.add(grupo);
    }

    public void adicionarFornecedor(Fornecedor fornecedor) {
        this.fornecedores.add(fornecedor);
    }

    public void adicionarFabricante(Fabricante fabricante) {
        this.fabricantes.add(fabricante);
    }

    public Produto getProduto(String codigo) {
        for (Produto produto : this.produtos) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }

        return null;
    }

    public Grupo getGrupo(int indice) {
        return this.grupos.get(indice);
    }

    public Fornecedor getFornecedor(int indice) {
        return this.fornecedores.get(indice);
    }

    public Fabricante getFabricante(int indice) {
        return this.fabricantes.get(indice);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public ArrayList<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public ArrayList<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public void setFornecedores(ArrayList<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    public void setFabricantes(ArrayList<Fabricante> fabricantes) {
        this.fabricantes = fabricantes;
    }
    

}
