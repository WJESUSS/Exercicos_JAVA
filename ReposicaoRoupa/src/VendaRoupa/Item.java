package VendaRoupa;

public interface Item {
    void venda(int quantidade);
}

public interface Acessorio extends Item {
    void venda(int quantidade);
}

public interface RoupaTamanhoUnico extends Item {
    void venda();
}

public interface RoupaPMG extends Item {
    void venda();
}

