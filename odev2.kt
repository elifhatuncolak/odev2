package com.example.kotlindersleri.elifhatuncolakk

fun dereceToFahrenheit(celcius : Double) : Double{
        return celcius * 1.8 + 32

}

fun dikdortgenCevresi(kenar1: Int, kenar2: Int): {
       return 2 * (kenar1 + kenar2)



}

fun faktoriyelesapla(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc

}

fun aHarfiSayisi(kelime: String): Int {
    var sayac = 0
    for (harf in kelime) {
        if (harf == 'a' || harf == 'A') {
            sayac++
        }

       }
          return sayac

    }

   }


fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180





}
fun kotaUcretiHesapla(kotaGb: Int): Int {
    return if (kotaGb <= 50 ) {
        100
    } else {
        100 + (kotaGb - 50) * 4

    }
  }

fun maasHesapla(gunSayisi:  Int): Int {
    val calismaSaati = gunSayisi * 8
    return if (calismaSaati <= 160)
    {

    calismaSaati * 10
    } else {
        (160 * 10) + ((calismaSaati - 160) * 20)
    }

       }





}