class Lead {
    private int size;
    private float thickness;
    private String hardness;

    public Lead(float thickness,String hardness,int size) {
        this.thickness = thickness;
        this.size = size;
        this.hardness = hardness;
    }

    public int usagePerSheet() {
        if(this.hardness.equals("HB")) {
            return 1;
        }
        if(this.hardness.equals("2B")) {
            return 2;
        }
        if(this.hardness.equals("4B")) {
            return 4;
        }
        if(this.hardness.equals("6B")) {
            return 6;
        }
        return 0;
    }

    public String getHardness() {
        return this.hardness;
    }
    public int getSize() {
        return this.size;
    }
    public float getThickness() {
        return this.thickness;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public String toString() {
        return "[" + this.thickness + ":" + this.hardness + ":" + this.size + "]";
    }
}