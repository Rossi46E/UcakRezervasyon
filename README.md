# Java Nesne Tabanlı Programlama Ödevi

## Adım Adım Program
* Sınıf seçimi yapılır. 1 - Birinci Sınıf, 2 - Ekonomi Sınıfı, 3 - Çıkış seçeneklerinden birisi seçilir. Çıkış seçilir ise program kapatılır. 1, 2 veya 3 dışında bir şey girilirse tekrar seçim yapmanız istenir.
* Müşteri bilgileri girilir. TC Kimlik Numarası, Pasaport Numarası, müşteri adı, müşteri soyadı, telefon numarası, yaş bilgisi girilir.
* Not => TC Kimlik Numarası 11 haneli rakam dizisi olmalıdır. Eğer koşullar sağlanmaz ise koşullar sağlanana kadar TC Kimlik Numarası girmenizi ister.
* Not => Pasaport Numarası 7 veya 9 haneli rakam dizisi olmalıdır. Eğer koşullar sağlanmaz ise koşullar sağlanana kadar Pasaport Numarası girmenizi ister.
* Not => Telefon numarası 11 haneli rakam dizisi olmalıdır. Eğer koşullar sağlanmaz ise koşullar sağlanana kadar telefon numarası girmenizi ister.
* Not => Yaş 1 ile 100 arasında bir sayı olmalıdır. Eğer koşullar sağlanmaz ise koşullar sağlanana kadar yaş bilgisi girmenizi ister.
* Lokasyon bilgileri girilir. 53 tane lokasyon vardır. İlk önce kalkış lokasyonu seçilir daha sonra varış lokasyonu seçilir. 1 - 53 arası bir sayı girmeniz gerekir. Varış lokasyonu kalkış lokasyonu ile aynı olamaz. Eğer koşullar sağlanmaz ise koşullar sağlanana kadar veri girilmesini istenir.
* Tarih ve saat bilgisi girilir. Tarih ve saat liste numarasına göre listeden seçilir. Eğer liste numarasından küçük veya büyük değer girilir ise tekrar seçim yapmanız istenir.
* Kart bilgileri girilir. 16 haneli rakamlardan oluşan kart numarası girilir. Koşullar sağlanana kadar veri girmenizi ister. Son kullanma tarihi girilir. Önce ay seçilir. Seçim 1 - 12 arası sayı olmalıdır. Sonra yıl seçilir. Yıl o günün yıl değeri ve iki yıl sonraki yıl değeri olabilir. Örnek: 2023 - 2025. Koşullar sağlanana kadar veri girmenizi ister. 3 haneli rakamlardan oluşan güvenlik kodu girilir. Koşullar sağlanana kadar veri girmenizi ister.
* Ekrana müşteri bilgileri yazdırılır.

## Proje Yapısı
* Lokasyon Sınıfı ---> String türünde kalkisLokasyon ve varisLokasyon alanlarını içerir. Void türünde lokasyonOlustur ve lokasyonAta metodlarını içerir.
* Musteri Sınıfı ---> String türünde TC, pasaport, ad, soyad, telefon; int türünde yas alanlarını içerir. Void türünde musteriOlustur ve musteriBilgileri(int) metodlarını içerir.
* Odeme Sınıfı ---> Void türünde odemeYap metodunu içerir.
* Program Sınıfı ---> Void türünde main, birinciSinifRezervasyon ve ekonomiSinifRezervasyon metodlarını içerir.
* Ucak Sınıfı ---> Int türünde KOLTUK_SAYISI ve EKONOMI_SINIR alanlarını içerir.
* Zaman Sınıfı ---> String türünde Tarih ve Saat alanlarını içerir. Void türünde zamanOlustur, tarihSec ve saatSec metodlarını içerir.