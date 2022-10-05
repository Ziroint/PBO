public class Biodata1 {
    private String nim;
    private String nama;
    private int umur;
    private String jeniskelamin;

    public void setNim(String nim){
        this.nim = nim;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void setJeniskelamin(String jeniskelamin){
        this.jeniskelamin= jeniskelamin;
    }
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public int getUmur(){
        return umur;
    }
    public String getJeniskelamin(){
        String jkel = "Perempuan";
        if(this.jeniskelamin=="L"){
            jkel = "Laki-laki";
        }
        return jkel;
    }
    // jika mau langsung, klik code, kemudian generate, klik getter and setter terus oke
    public static void main(String[] args) {
        Biodata1 biodata = new Biodata1();
        biodata.setNim("2021071033");
        biodata.setNama("Dido");
        biodata.setUmur(18);
        biodata.setJeniskelamin("L");

        System.out.println("Nim: " + biodata.getNim());
        System.out.println("Nama: " + biodata.getNama());
        System.out.println("Umur: " + biodata.getUmur() + " tahun");
        System.out.println("Jenis kelamin: " + biodata.getJeniskelamin() );
    }
}