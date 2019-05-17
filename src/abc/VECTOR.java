/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

public class VECTOR extends Gun_Property {

    public VECTOR(int atış_hızı, int mermi_sayısı, int şarjör_yenileme_süresi, String atış_modu, int mühimmat_türü) {
        super(atış_hızı, mermi_sayısı, şarjör_yenileme_süresi, atış_modu, mühimmat_türü);

    }
    private String Tür_adı;

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Silah Türünün Adı" + Tür_adı);
    }
}
