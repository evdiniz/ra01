class Fila {
    private Node frente;
    private Node tras;

    Fila() {
        this.frente = null;
        this.tras = null;
    }

    void enqueue(Elemento e) {
        Node novoNode = new Node(e);
        if (tras == null) {
            frente = novoNode;
            tras = novoNode;
        } else {
            tras.proximo = novoNode;
            tras = novoNode;
        }
    }

    Elemento dequeue() {
        if (frente == null) {
            return null;
        }
        Elemento elemento = frente.elemento;
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
        return elemento;
    }
}
