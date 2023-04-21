public class Produto {
    private String codigo;
    private String suprimento;
    private String descProd;
    private int estoqueMin;
    private String unidadeMedida;
    private Grupo grupo;
    private int ncm;
    private Fornecedor fornecedor;
    private Fabricante fabricante;
    private float precoMedio;
    private int lote;
    private String descTec;
    private String observacao;

    public Produto(
        String codigo, 
        String suprimento, 
        String descProd, 
        int estoqueMin, 
        String unidadeMedida, 
        Grupo grupo,
        int ncm, 
        Fornecedor fornecedor, 
        Fabricante fabricante, 
        float precoMedio, 
        int lote, 
        String descTec,
        String observacao
    ) {
        this.codigo = codigo;
        this.suprimento = suprimento;
        this.descProd = descProd;
        this.estoqueMin = estoqueMin;
        this.unidadeMedida = unidadeMedida;
        this.grupo = grupo;
        this.ncm = ncm;
        this.fornecedor = fornecedor;
        this.fabricante = fabricante;
        this.precoMedio = precoMedio;
        this.lote = lote;
        this.descTec = descTec;
        this.observacao = observacao;
    }

    public String mostrarProduto() {
        String s = String.format("""
            Código: %s \n
            Suprimento: %s \n
            Descrição do produto: %s \n
            Estoque mínimo: %s \n
            Unidade de medida: %s \n
            Grupo: %s \n
            NCM: %s \n
            Fornecedor: %s \n
            Fabricante: %s \n
            Preco médio: R$%.2f \n
            Lote: %s \n
            Descrição técnica: %s \n
            Observação: %s \n
        """,
        this.getCodigo(),
        this.getSuprimento(),
        this.getDescProd(),
        this.getEstoqueMin(),
        this.getUnidadeMedida(),
        this.getGrupo().getNome(),
        this.getNcm(),
        this.getFornecedor().getNome(),
        this.getFabricante().getNome(),
        this.getPrecoMedio(),
        this.getLote(),
        this.getDescTec(),
        this.getObservacao()
        );

        return s;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getSuprimento() {
        return suprimento;
    }

    public String getDescProd() {
        return descProd;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public int getNcm() {
        return ncm;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public float getPrecoMedio() {
        return precoMedio;
    }

    public int getLote() {
        return lote;
    }

    public String getDescTec() {
        return descTec;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setSuprimento(String suprimento) {
        this.suprimento = suprimento;
    }

    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void setNcm(int ncm) {
        this.ncm = ncm;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public void setPrecoMedio(float precoMedio) {
        this.precoMedio = precoMedio;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public void setDescTec(String descTec) {
        this.descTec = descTec;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    


}
