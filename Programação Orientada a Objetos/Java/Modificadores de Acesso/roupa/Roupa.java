class Roupa {
    String tamanho;

    public Roupa() {
    }

    public String toString() {
        if(tamanho == null) {
            return "size: ()";
        }
        return "size: (" + getTamanho() + ")";
    }

    public void setTamanho(String size) {
        if(size.equals("P")) {
            this.tamanho = size;
            return;
        }
        if(size.equals("PP")) {
            this.tamanho = size;
            return;
        }
        if(size.equals("M")) {
            this.tamanho = size;
            return;
        }
        if(size.equals("G")) {
            this.tamanho = size;
            return;
        }
        if(size.equals("GG")) {
            this.tamanho = size;
            return;
        }
        if(size.equals("XG")) {
            this.tamanho = size;
            return;
        }
        System.out.println("fail: Valor inválido, tente PP, P, M, G, GG ou XG");
        return;
    }

    public String getTamanho() {
        return this.tamanho;
    }
}