public class AkunBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    // Constructor
    public AkunBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Instance methods
    public void simpanUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Rp. " + jumlah + " telah disimpan. Saldo sekarang: Rp. " + this.saldo);
    }

    public void ambilUang(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup untuk mengambil Rp. " + jumlah);
        } else {
            saldo -= jumlah;
            System.out.println("Rp. " + jumlah + " telah diambil. Saldo sekarang: Rp. " + saldo);
        }
    }

    public double cekSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        // Create an AkunBank object with initial balance of Rp. 100000
        AkunBank akun = new AkunBank("312310569", "Antor", 100000);

        System.out.println("Saldo awal: Rp. " + akun.cekSaldo());

        // Call the instance methods
        akun.simpanUang(50000);
        akun.ambilUang(20000);
        akun.simpanUang(30000);
        akun.ambilUang(40000);

        System.out.println("Saldo akhir: Rp. " + akun.cekSaldo());
    }
}