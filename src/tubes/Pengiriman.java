/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import java.util.Date;
/**
 *
 * @author ZADO
 */
public class Pengiriman {
    
    private String nomorPengiriman;
    private Date tanggalPengiriman;
    private String statusPengiriman;
    private String alamatTujuan;


    public Pengiriman(String nomorPengiriman, Date tanggalPengiriman, String statusPengiriman, String alamatTujuan) {
        this.nomorPengiriman = nomorPengiriman;
        this.tanggalPengiriman = tanggalPengiriman;
        this.statusPengiriman = statusPengiriman;
        this.alamatTujuan = alamatTujuan;
    }


    public String getNomorPengiriman() {
        return nomorPengiriman;
    }


    public void setNomorPengiriman(String nomorPengiriman) {
        this.nomorPengiriman = nomorPengiriman;
    }


    public Date getTanggalPengiriman() {
        return tanggalPengiriman;
    }


    public void setTanggalPengiriman(Date tanggalPengiriman) {
        this.tanggalPengiriman = tanggalPengiriman;
    }


    public String getStatusPengiriman() {
        return statusPengiriman;
    }


    public void setStatusPengiriman(String statusPengiriman) {
        this.statusPengiriman = statusPengiriman;
    }


    public String getAlamatTujuan() {
        return alamatTujuan;
    }


    public void setAlamatTujuan(String alamatTujuan) {
        this.alamatTujuan = alamatTujuan;
    }

    
    
}
