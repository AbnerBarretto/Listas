package estruturaDeDados;

public class Lista {
    private int[] array;
    private int indiceFim;

    public Lista(int i) {
        array = new int[i];
        indiceFim = 0;
        throw new UnsupportedOperationException("Unimplemented constructor 'ListaCircular'");
    }

    public void insereInicio(int i) {
        if (indiceFim >= array.length) {
            throw new RuntimeException("Array está cheio!");
        }
        for (int j = indiceFim - 1; j >= 0; j--) {
            array[j + 1] = array[j];
        }
        array[0] = i;
        indiceFim++;
        throw new UnsupportedOperationException("Unimplemented method 'insereInicio'");
    }

    public boolean buscaElemento(int valor) {
        for (int i = 0; i < indiceFim; i++) { // Percorre até o índice lógico
            if (valor == array[i]) {
                return true;
             }
            }
        return false;
        }

    public Object buscaIndice(int i) {

        throw new UnsupportedOperationException("Unimplemented method 'buscaIndice'");
    }

    public void insereFim(int i) {
        array[indiceFim] = i;
        indiceFim ++;
        throw new UnsupportedOperationException("Unimplemented method 'insereFim'");
    }

    public void removeInicio() {
        if (indiceFim == 0) {
            throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
        }
            for (int i = 0; i < indiceFim - 1; i++) {
                array[i] = array[i + 1];
            }
            indiceFim--;
        }


    public int removeFim() {
        int var = array[indiceFim - 1];
        indiceFim--;
        return var;
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
