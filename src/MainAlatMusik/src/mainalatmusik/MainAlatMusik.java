package mainalatmusik;

import java.util.Scanner;

public class MainAlatMusik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pil;
        String nada;
        System.out.println("=============== >> PENJELASAN PROGRAM << ================");
        System.out.println("Program ini digunakan untuk melakukan uji nada alat musik");
        System.out.println("dan mengetahui material dari alat-alat musik tersebut");
        System.out.println("");
        System.out.println("====== >> MENU PROGRAM << ======");
        System.out.println("1. Alat Musik Tiup");
        System.out.println("");
        System.out.println("2. Alat Musik Petik");
        System.out.println("");
        System.out.print("Pilih jenis alat musik : ");
        pil = in.nextInt();
        switch (pil) {
            case 1:
                System.out.println("=== >> ALAT MUSIK TIUP << ===");
                System.out.println("1. Saxofone");
                System.out.println("");
                System.out.println("2. Klarinet");
                System.out.println("");
                System.out.print("Pilih Alat Musik : ");
                pil = in.nextInt();
                switch (pil) {
                    case 1:
                        for (;;) {
                            System.out.println("");
                            System.out.println(">> MENU <<");
                            System.out.println("1. Coba Nada");
                            System.out.println("2. Lihat Material");
                            System.out.println("3. Keluar Program");
                            System.out.print("Masukkan pilihan : ");
                            pil = in.nextInt();
                            Saxofone a = new Saxofone();
                            switch (pil) {
                                case 1:
                                    System.out.println("Contoh nada : do , re, mi , fa , so, la , si");
                                    System.out.print("Masukkan salah satu nada diatas : ");
                                    nada = in.next();
                                    a.setNada(nada);
                                    a.tampilkanNada();
                                    break;
                                case 2:
                                    a.tampilkanMaterial();
                                    break;
                                case 3:
                                    System.exit(0);
                                default:
                                    System.out.println("Masukkan pilihan yang benar...");
                                    break;
                            }
                        }
                    case 2:
                        for (;;) {
                            System.out.println(">> MENU <<");
                            System.out.println("1. Coba Nada");
                            System.out.println("2. Lihat Material");
                            System.out.println("3. Keluar Program");
                            System.out.print("Masukkan pilihan : ");
                            pil = in.nextInt();
                            Klarinet b = new Klarinet();
                            switch (pil) {
                                case 1:
                                    System.out.println("Contoh nada : do , re, mi , fa , so, la , si");
                                    System.out.print("Masukkan salah satu nada diatas : ");
                                    nada = in.next();
                                    b.setNada(nada);
                                    b.tampilkanNada();
                                    break;
                                case 2:
                                    b.tampilkanMaterial();
                                    break;
                                case 3:
                                    System.exit(0);
                                default:
                                    System.out.println("Masukkan pilihan yang benar...");
                                    break;
                            }
                        }
                    default:
                        System.out.println("Masukkan pilihan yang benar...");
                        break;
                }
            case 2:
                System.out.println("=== >> ALAT MUSIK PETIK << ===");
                System.out.println("1. Gitar");
                System.out.println("");
                System.out.println("2. Bass");
                System.out.println("");
                System.out.print("Pilih Alat Musik : ");
                pil = in.nextInt();
                switch (pil) {
                    case 1:
                        for (;;) {
                            System.out.println(">> MENU <<");
                            System.out.println("1. Coba Nada");
                            System.out.println("2. Lihat Material");
                            System.out.println("3. Keluar Program");
                            System.out.print("Masukkan pilihan : ");
                            pil = in.nextInt();
                            Gitar c = new Gitar();
                            switch (pil) {
                                case 1:
                                    System.out.println("Contoh nada : do , re, mi , fa , so, la , si");
                                    System.out.print("Masukkan salah satu nada diatas : ");
                                    nada = in.next();
                                    c.setNada(nada);
                                    c.tampilkanNada();
                                    break;
                                case 2:
                                    c.tampilkanMaterial();
                                    break;
                                case 3:
                                    System.exit(0);
                                default:
                                    System.out.println("Masukkan pilihan yang benar...");
                                    break;
                            }
                        }
                    case 2:
                        for (;;) {
                            System.out.println(">> MENU <<");
                            System.out.println("1. Coba Nada");
                            System.out.println("2. Lihat Material");
                            System.out.println("3. Keluar Program");
                            System.out.print("Masukkan pilihan :");
                            pil = in.nextInt();
                            Bass d = new Bass();
                            switch (pil) {
                                case 1:
                                    System.out.println("Contoh nada : do , re, mi , fa , so, la , si");
                                    System.out.print("Masukkan salah satu nada diatas : ");
                                    nada = in.next();
                                    d.setNada(nada);                                 
                                    d.tampilkanNada();
                                    break;
                                case 2:
                                    d.tampilkanMaterial();
                                    break;
                                case 3:
                                    System.exit(0);
                                default:
                                    System.out.println("Masukkan pilihan yang benar...");
                                    break;
                            }
                        }
                    default:
                        System.out.println("Masukkan pilihan yang benar...");
                        break;

                }

        }
    }
}
