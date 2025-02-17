class Pencil {
    private float thickness;
    private Lead tip;

    public Pencil(float thickness) {
        this.thickness = thickness;
        this.tip = null;
    }

    public boolean hasGrafite() {
        if(tip != null) {
            return true;
        }
        return false;
    }

    public boolean insert(Lead lead) {
        if(hasGrafite()) {
            System.out.println("fail: ja existe grafite");
            return false;
        }
        if(lead.getThickness() != this.thickness) {
            System.out.println("fail: calibre incompativel");
            return false;
        }
        this.tip = lead;
        return true;
    }

    public Lead remove() {
        if(!hasGrafite()) {
            System.out.println("fail: nao existe grafite");
            return null;
        }
        Lead tipRemoved = tip;
        tip = null;
        return tipRemoved;
    }

    public void writePage() {
        if(!hasGrafite()) {
            System.out.println("fail: nao existe grafite");
            return;
        }
        if(tip.getSize() <= 10) {
            System.out.println("fail: tamanho insuficiente");
            return;
        }
        if((tip.getSize() - tip.usagePerSheet()) < 10) {
            System.out.println("fail: folha incompleta");
            tip.setSize(10);
            return;
        }
        tip.setSize(tip.getSize() - tip.usagePerSheet());
        return;
    }

    public String toString() {
        return "calibre: " + this.thickness + ", grafite: " + this.tip;
    }
}