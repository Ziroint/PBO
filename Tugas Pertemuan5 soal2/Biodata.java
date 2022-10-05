class Biodata {

    private String nama;
    private String Nim;

    public void inputData(String nama, String Nim) {
        this.nama = nama;
        this.Nim = Nim;
    }
    public void viewData() {
        System.out.println("Nim: " + this.Nim);
        System.out.println("Nama: " + this.nama);
    }


/*    public void setNama(String nama){

        System.out.println("Nama : "+ this.nama);
    }
    public void setNim(String Nim){

        System.out.println("Nim : "+ this.Nim);
    }

*/
}