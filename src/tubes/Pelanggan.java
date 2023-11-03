package tubes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZADO
 */
public class Pelanggan {
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String email;
    private List<Pengiriman> listPengiriman = new ArrayList<>();



// daftar_pesanan
// daftar_pengiriman

public Pelanggan(String nama, String alamat, String nomorTelepon, String email) {
    this.nama = nama;
    this.alamat = alamat;
    this.nomorTelepon = nomorTelepon;
    this.email = email;
}



public String getNama() {
    return nama;
}



public void setNama(String nama) {
    this.nama = nama;
}



public String getAlamat() {
    return alamat;
}



public void setAlamat(String alamat) {
    this.alamat = alamat;
}



public String getNomorTelepon() {
    return nomorTelepon;
}



public void setNomorTelepon(String nomorTelepon) {
    if (isValidNomorTelepon(nomorTelepon)) {
        this.nomorTelepon = nomorTelepon;
    } else {
        System.out.println("Nomor telepon tidak valid. Harus berisi angka dan memiliki panjang antara 9 hingga 13 karakter.");
    }
}

private boolean isValidNomorTelepon(String nomorTelepon) {
    String nomorTeleponCleaned = nomorTelepon.replaceAll("\\s|-", "");

    return nomorTeleponCleaned.matches("\\d{9,13}");
}



public List<Pengiriman> getListPengiriman() {
    return listPengiriman;
}



public void addPengiriman(Pengiriman Pengiriman) {
    listPengiriman.add(Pengiriman);
}



public String getEmail() {
    return email;
}



public void setEmail(String email) {
    this.email = email;
}


    
}
