/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskedaikopi;

/**
 *
 * @author fajar
 */
public class fungsiMenu {
    private String namaMenu;
    private int harga;
    
    public fungsiMenu(String MnamaMenu, int Mharga) {
        namaMenu = MnamaMenu;
        harga = Mharga;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public String getNamaMenu(){
        return namaMenu;
    }
    
}
