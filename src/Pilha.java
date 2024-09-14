class Pilha {
    private Node topo;

    Pilha() {
        this.topo = null;
    }

    void push(Elemento e) {
        Node novoNode = new Node(e);
        novoNode.proximo = topo;
        topo = novoNode;
    }

    Elemento pop() {
        if (topo == null) {
            return null;
        }
        Elemento elemento = topo.elemento;
        topo = topo.proximo;
        return elemento;
    }
}
