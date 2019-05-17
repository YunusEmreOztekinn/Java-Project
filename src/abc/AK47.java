/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

public class AK47 extends Gun_Property {

    
    private String Tür_adı;
    
    public AK47(int atış_hızı, int mermi_sayısı, int şarjör_yenileme_süresi, String atış_modu, int mühimmat_türü) {
        super(atış_hızı, mermi_sayısı, şarjör_yenileme_süresi, atış_modu, mühimmat_türü);
        this.Tür_adı = Tür_adı;
    }
    
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Silah Türünün Adı" + Tür_adı);
    }
}
