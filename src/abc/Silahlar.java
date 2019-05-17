/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;


public class Silahlar {
    
    
    public Gun_Property Silahinfo(String silah_türü) {
        
        if (silah_türü.equals("AK47")){
            return new AK47(100, 30 , 3 ,"Tekli/Otomatik",7);
            
        }
        else if (silah_türü.equals("AUG A3")) {
            
          return new AUG_A3(86, 30 , 3,"Tekli/Otomatik",5);
            
        }
        else if (silah_türü.equals("M16A4")) {
            
            return new M16A4(100, 30 , 2 ,"Tekli/Seri",5);
            
        }
        else if (silah_türü.equals("MİCRO UZİ")) {
            
            return new MİCRO_UZİ(48, 25 , 3 ,"Tekli/Otomatik",9);
            
        }
        else if (silah_türü.equals("P1911")) {
            
          return new P1911(110, 7 , 2 ,"Tekli",45);
            
        }
        else if (silah_türü.equals("P92")) {
            
          return new P92(135, 15 , 2 ,"Tekli",9);
            
        }
        else if (silah_türü.equals("QBU")) {
            
          return new QBU(100, 10 , 3 ,"Yarı Otomatik",5);
            
        }
        else if (silah_türü.equals("R1895")) {
            
          return new R1895(400, 7 , 5 ,"Tekli",7);
            
        }
        else if (silah_türü.equals("S12K")) {
            
          return new S12K(250, 5 , 3 ,"Tekli",12);
            
        }
        else if (silah_türü.equals("SKS")) {
            
          return new SKS(100, 10 , 3 ,"Yarı Otomatik",7);
            
        }
         else if (silah_türü.equals("SLR")) {
            
          return new SLR(90, 10 , 4 ,"Yarı Otomatik",7);
            
        }
        else if (silah_türü.equals("UMP45")) {
            
          return new UMP45(92, 25 , 3 ,"Tekli/Seri/Otomatik",7);
            
        }
         else if (silah_türü.equals("VECTOR")) {
            
          return new VECTOR(55, 19 , 2 ,"Tekli/Seri/Otomatik",45);
            
        }

        else {
            return null;
            
        }
        
    }

    Gun_Property Silahinfo(int lem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Gun_Property Silahinfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
