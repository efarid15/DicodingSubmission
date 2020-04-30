package com.dicoding.prakerja.umrahapps.model

import android.util.Log

object DataPaket {
    private var data = arrayOf(
        arrayOf(
            "Paket Umrah Ramadhan 2020",
            "IDR 25.000.000",
            "https://cdn.pixabay.com/photo/2018/08/07/06/03/masjid-3589193_960_720.jpg",
            "Merupakan paket perjalanan umrah di bulan suci Ramadhan selama 12 Hari. Menikmati ibadah perjalanan umrah dibulan suci ramadhan. Fasilitas : Hotel setara bintang 4, Konsumsi 3 kali sehari",
            "KTP\n"+
                    "Passpor dengan masa berlaku minimal 6 bulan\n" +
                    "Pas Foto Ukuran 3x4\n" +
                    "Kartu kuning vaksin meningitis\n"+
                    "Kartu keluarga"
        ),
        arrayOf(
            "Paket Umrah Reguler September 2020",
            "IDR 23.000.000",
            "https://i.pinimg.com/originals/02/55/87/025587e44f9a85292b15c227d23ad476.jpg",
            "Merupakan paket perjalanan umrah di bulan September 2020 selama 12 Hari. Menikmati ibadah perjalanan umrah dibulan suci ramadhan. " +
                    "Fasilitas : Tiket Pesawat PP, Hotel setara bintang 4, Konsumsi 3 kali sehari",
            "KTP\n"+
                    "Passpor dengan masa berlaku minimal 6 bulan\n" +
                    "Pas Foto Ukuran 3x4\n" +
                    "Kartu kuning vaksin meningitis\n"+
                    "Kartu keluarga"
        ),
        arrayOf(
            "Paket Umrah Plus Dubai 2020",
            "IDR 30.000.000",
            "https://cdn.pixabay.com/photo/2019/03/09/21/30/downtown-4045035_960_720.jpg",
            "Merupakan paket perjalanan umrah plus wisata halal ke dubai UEA selama 12 Hari. Menikmati ibadah perjalanan umrah dibulan suci ramadhan. " +
                    "Fasilitas : Tiket Pesawat PP, Hotel setara bintang 4, Konsumsi 3 kali sehari",
            "KTP\n"+
                    "Passpor dengan masa berlaku minimal 6 bulan\n" +
                    "Pas Foto Ukuran 3x4\n" +
                    "Kartu kuning vaksin meningitis\n"+
                    "Kartu keluarga"
        ),
        arrayOf(
            "Paket Umrah Plus Turki",
            "IDR 28.000.000",
            "https://cdn.pixabay.com/photo/2015/06/11/08/58/cappadocia-805624_960_720.jpg",
            "Merupakan paket perjalanan umrah plus wisata halal ke Turki selama 12 Hari. Menikmati ibadah perjalanan umrah dibulan suci ramadhan. " +
                    "Fasilitas : Tiket Pesawat PP, Hotel setara bintang 4, Konsumsi 3 kali sehari",
            "KTP\n"+
                    "Passpor dengan masa berlaku minimal 6 bulan\n" +
                    "Pas Foto Ukuran 3x4\n" +
                    "Kartu kuning vaksin meningitis\n"+
                    "Kartu keluarga"
        ),
        arrayOf(
            "Paket Halal Tour Japan 2020",
            "IDR 30.000.000",
            "https://cdn.pixabay.com/photo/2016/11/19/21/29/temple-1841296_960_720.jpg",
            "Merupakan paket perjalanan umrah plus wisata halal ke Jepang selama 12 Hari. Menikmati ibadah perjalanan umrah dibulan suci ramadhan. " +
                    "Fasilitas : Tiket PP, Hotel setara bintang 4, Konsumsi 3 kali sehari",
            "KTP\n"+
                    "Passpor dengan masa berlaku minimal 6 bulan\n" +
                    "Pas Foto Ukuran 3x4\n" +
                    "Kartu kuning vaksin meningitis\n"+
                    "Kartu keluarga"
        ),
        arrayOf(
            "Paket Halal Tour China 2020",
            "IDR 25.000.000",
            "https://cdn.pixabay.com/photo/2015/11/06/14/00/chinese-1028101_960_720.jpg",
            "Merupakan paket perjalanan umrah plus wisata halal ke China selama 12 Hari. Menikmati ibadah perjalanan umrah dibulan suci ramadhan. " +
                    "Fasilitas : Tiket Pesawat PP, Hotel setara bintang 4, Konsumsi 3 kali sehari",
            "KTP\n"+
                    "Passpor dengan masa berlaku minimal 6 bulan\n" +
                    "Pas Foto Ukuran 3x4\n" +
                    "Kartu kuning vaksin meningitis\n"+
                    "Kartu keluarga"
        ),
        arrayOf(
            "Paket Umrah Plus Jordan",
            "IDR 35.000.000",
            "https://cdn.pixabay.com/photo/2018/12/05/19/22/cami-3858508_960_720.jpg",
            "Merupakan paket perjalanan umrah plus wisata halal ke Jordan selama 12 Hari. Menikmati ibadah perjalanan umrah dibulan suci ramadhan. " +
                    "Fasilitas : Tiket Pesawat PP, Hotel setara bintang 4, Konsumsi 3 kali sehari",
            "KTP\n"+
                    "Passpor dengan masa berlaku minimal 6 bulan\n" +
                    "Pas Foto Ukuran 3x4\n" +
                    "Kartu kuning vaksin meningitis\n"+
                    "Kartu keluarga"
        ),
        arrayOf(
            "Paket Umrah Plus Aqsa 2020",
            "IDR 30.000.000",
            "https://cdn.pixabay.com/photo/2020/03/19/00/37/kubbetus-sahara-4945843_960_720.jpg",
            "Merupakan paket perjalanan umrah plus wisata halal ke Palestina selama 12 Hari. Menikmati ibadah perjalanan umrah dibulan suci ramadhan. " +
                    "Fasilitas : Tiket Pesawat PP, Hotel setara bintang 4, Konsumsi 3 kali sehari",
            "KTP\n"+
                    "Passpor dengan masa berlaku minimal 6 bulan\n" +
                    "Pas Foto Ukuran 3x4\n" +
                    "Kartu kuning vaksin meningitis\n"+
                    "Kartu keluarga"
        ),
        arrayOf(
            "Paket Umrah Plus Mesir",
            "IDR 30.000.000",
            "https://cdn.pixabay.com/photo/2017/04/28/00/44/egypt-2267089_960_720.jpg",
            "Merupakan paket perjalanan umrah plus wisata halal ke Mesir selama 12 Hari. Menikmati ibadah perjalanan umrah dibulan suci ramadhan. " +
                    "Fasilitas : Tiket Pesawat PP, Hotel setara bintang 4, Konsumsi 3 kali sehari",
            "KTP\n"+
                    "Passpor dengan masa berlaku minimal 6 bulan\n" +
                    "Pas Foto Ukuran 3x4\n" +
                    "Kartu kuning vaksin meningitis"
        ),
        arrayOf(
            "Paket Umrah Plus Eropa",
            "IDR 45.000.000",
            "https://cdn.pixabay.com/photo/2017/06/11/18/03/london-2393098_960_720.jpg",
            "Merupakan paket perjalanan umrah plus wisata halal ke London dan Paris. \n" +
                    "Fasilitas : Tiket PP, Hotel setara bintang 4, Konsumsi 3 kali sehari",
            "KTP\n"+
                    "Passpor dengan masa berlaku minimal 6 bulan\n" +
                    "Pas Foto Ukuran 3x4\n"
        )



    )

    val listPaket: ArrayList<PaketUmrah>
        get() {
            val list = ArrayList<PaketUmrah>()
            for (item in data) {
                val paketumrah = PaketUmrah()
                paketumrah.packagename = item[0]
                paketumrah.price = item[1]
                paketumrah.imgpackage = item[2]
                paketumrah.facility = item[3]
                paketumrah.terms = item[4]

                list.add(paketumrah)
            }
            return list

        }
}