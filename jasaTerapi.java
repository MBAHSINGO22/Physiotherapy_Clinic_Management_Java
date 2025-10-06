public class jasaTerapi {
    private String jenisTerapi;
    private double tarif;
    private Terapis terapis;

    public jasaTerapi(String jenisTerapi, double tarif, Terapis terapis) {
        this.jenisTerapi = jenisTerapi;
        this.tarif = tarif;
        this.terapis = terapis;
    }

    public String getJenisTerapi() {
        return jenisTerapi;
    }

    public double getTarif() {
        return tarif;
    }

    public Terapis getTerapis() {
        return terapis;
    }
}

