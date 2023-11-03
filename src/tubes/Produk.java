/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author ZADO
 */
public class Produk {
    private String namaProduk;
    private String kodeProduk;
    private float hargaProduk;

    
    public Produk(String namaProduk, String kodeProduk, float hargaProduk) {
        this.namaProduk = namaProduk;
        this.kodeProduk = kodeProduk;
        this.hargaProduk = hargaProduk;
    }


    public String getNamaProduk() {
        return namaProduk;
    }


    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }


    public String getKodeProduk() {
        return kodeProduk;
    }


    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }


    public float getHargaProduk() {
        return hargaProduk;
    }


    public void setHargaProduk(float hargaProduk) {
        this.hargaProduk = hargaProduk;
    }


    



}
