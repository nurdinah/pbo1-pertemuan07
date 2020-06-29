public class nilai {
    nilai akhir = 0,0;
    char angka;

    nilai publik (double uts, double uas) {
        super (uts, uas);
    }

    public void hitungNilai () {
        nilai akhir = (uts + uas) / 2;
        jika (nilai akhir> 80)
                angka = 'A';
        jika (nilai akhir> 70)
        angka = 'B';
        jika (nilai akhir> 60)
        angka = 'C';
    }
    kelaspublik isiData () {
        System.out.println ("Nilai UTS:" + uts);
        System.out.println ("Nilai UAS:" + uas);
        System.out.println ("Nilai akhir:" + nilai akhir);
        System.out.println ("Angka Mutu:" + angka);
    }
}
