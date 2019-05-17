package abc;

public class Gun_Property {

    private int atış_hızı;
    private int mermi_sayısı;
    private int şarjör_yenileme_süresi;
    private String atış_modu;
    private int mühimmat_türü;

    public Gun_Property(int atış_hızı, int mermi_sayısı, int şarjör_yenileme_süresi, String atış_modu, int mühimmat_türü) {
        this.atış_hızı = atış_hızı;
        this.mermi_sayısı = mermi_sayısı;
        this.şarjör_yenileme_süresi = şarjör_yenileme_süresi;
        this.atış_modu = atış_modu;
        this.mühimmat_türü = mühimmat_türü;
    }

    public int getAtış_hızı() {
        return atış_hızı;
    }

    public void setAtış_hızı(int atış_hızı) {
        this.atış_hızı = atış_hızı;
    }

    public int getMermi_sayısı() {
        return mermi_sayısı;
    }

    public void setMermi_sayısı(int mermi_sayısı) {
        this.mermi_sayısı = mermi_sayısı;
    }

    public int getŞarjör_yenileme_süresi() {
        return şarjör_yenileme_süresi;
    }

    public void setŞarjör_yenileme_süresi(int şarjör_yenileme_süresi) {
        this.şarjör_yenileme_süresi = şarjör_yenileme_süresi;
    }

    public String getAtış_modu() {
        return atış_modu;
    }

    public void setAtış_modu(String atış_modu) {
        this.atış_modu = atış_modu;
    }

    public int getMühimmat_türü() {
        return mühimmat_türü;
    }

    public void setMühimmat_türü(int mühimmat_türü) {
        this.mühimmat_türü = mühimmat_türü;
    }

    public void bilgileriGoster() {
        System.out.println("Atış Hızı : " + atış_hızı);
        System.out.println("Mermi Sayısı : " + mermi_sayısı);
        System.out.println("Şarjör Yenileme Süresi : " + şarjör_yenileme_süresi);
        System.out.println("Atış Modu : " + atış_modu);
        System.out.println("Mühimmat Türü : " + mühimmat_türü);
    }

    boolean bilgileriGoster(int secim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
