class Hewan {
    public void suaraHewan() {
        System.out.println("Hewan bersuara");
    }
}

class Ayam extends Hewan{
    public void suaraHewan() {
        System.out.println("Ayam bersuara: Kukuruyukkkk....");
    }
}

class Kucing extends Hewan{
    public void suaraHewan() {
        System.out.println("Kucing bersuara: meonggggg");
    }
}

class Polymorphisme {
    public static void main(String[] args) {
        Hewan hewanku = new Hewan();
        Hewan kucingku = new Kucing();
        Hewan ayamku = new Ayam();

        hewanku.suaraHewan();
        kucingku.suaraHewan();
        ayamku.suaraHewan();
    }
}
