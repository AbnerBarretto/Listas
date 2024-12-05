package estruturaDeDados;

public class ListaCircular {

    private static class NO {
        public NO prox;
        public int valor;


        public NO getProx() {
            return prox;
        }

        public void setProx(NO prox) {
            this.prox = prox;
        }

        public NO(int valor) {
            this.valor = valor;
            this.prox = null;

        }
    }

    private NO cabeca;


    public ListaCircular() {
        cabeca = null;

    }

    public void insereInicio(int valor) {
        NO n = new NO(valor);
        n.prox = cabeca;
        cabeca = n;
        throw new UnsupportedOperationException("Unimplemented method 'insereInicio'");
    }

    public boolean buscaElemento(int valor) {
        if (cabeca == null) {
            return false;
        }
        NO n = cabeca;
        while (n != null) {
            if (n.getvalor() == valor) {
                return true;
            }
            n = n.getprox();
        }
        return false;
        throw new UnsupportedOperationException("Unimplemented method 'buscaElemento'");
    }

    public Object buscaIndice(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscaIndice'");
    }

    public void insereFim(int i) {
        if (cabeca == null) {
            cabeca = new NO(i);
            return;
        }
        NO n = cabeca;
        while (n.getProx() != null) {
            n = n.getProx();
        }
        n.setProx(new NO(i));
    }


    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    public void removeFim() {
        if (cabeca == null) {
            throw new RuntimeException("A lista está vazia!");
        }

        if (cabeca.getProx() == null) {
            cabeca = null;
            return;
        }

        NO n = cabeca;
        while (n.getProx().getProx() != null) {
            n = n.getProx();
        }

        n.setProx(null);

    }

    public void removeIndice(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    public void insereElementoPosicao(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");
    }
}
