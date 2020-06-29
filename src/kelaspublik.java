public class kelaspublik {
    int npm;
    String nama;
    String matkul;
    int sks;
    dosen;
    uts;
    uas;

    kelaspublik () {}

    kelaspublik (int npm, String nama) {
        this.npm = npm;
        this.nama = nama;
    }
    kelaspublik (String matkul, int sks) {
        this.matkul = matkul;
        this.sks = sks;
    }
    kelaspublik (String dosen) {
        this.dosen = dosen;
    }
    kelaspublik (uts, uas) {
        this.uts = uts;
        this.uas = uas;
    }
    kelaspublik isiData () {
        System.out.println ("Sistem Akademik");
        System.out.println ("---------------");
    }
}
