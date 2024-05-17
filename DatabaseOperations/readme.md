# Öğrenci Yönetim Sistemi
Bu Java tabanlı Öğrenci Yönetim Sistemi, kullanıcıların bir öğrenci veritabanında CRUD (Oluşturma, Okuma, Güncelleme, Silme) işlemlerini gerçekleştirmesine olanak tanır. Uygulama, MySQL veritabanına bağlanmak için JDBC kullanır.

## Öğrenci Yönetim Sistemi aşağıdaki işlevleri sağlar:
- Yeni bir öğrenci ekleme
- Öğrenci numarasına göre öğrenci bilgilerini getirme
- Mevcut öğrenci bilgilerini güncelleme
- Bir öğrenciyi silme

## Gereksinimler
Bu projeyi çalıştırmak için ihtiyacınız olanlar:
- Java Geliştirme Kiti (JDK) 8 veya üstü
- MySQL sunucusu
- Eclipse gibi bir IDE
- MySQL JDBC Sürücüsü

## Kurulum
- Depoyu yerel makinenize klonlayın.
- MySQL veritabanını kurun:
- Projeyi IDE'nizde (Eclipse) açın.
- MySQL JDBC sürücüsünü projenizin yapı yoluna ekleyin:
 - Eclipse'te projeye sağ tıklayın.
 - Build Path > Configure Build Path yolunu izleyin.
 - Add External JARs seçeneğine tıklayın ve MySQL JDBC sürücüsü JAR dosyasını seçin.

## Kullanım
- CRUD işlemlerini gerçekleştirmek için StartUp sınıfını çalıştırın. Bu işlemler, öğrenci kayıtlarını ekleme, güncelleme, getirme ve silmeyi içerir.

## StudentDAO
Bu sınıf, Student varlığı ile ilgili tüm veritabanı işlemlerini yönetir.


## Student
Bu sınıf Student varlığını temsil eder.


## StartUp
Bu sınıf uygulamanın başlangıç noktasıdır ve CRUD işlemlerini gerçekleştirir.


## Lisans
Bu proje MIT Lisansı ile lisanslanmıştır - ayrıntılar için LICENSE dosyasına bakın.
![image](https://github.com/esmanur-karatas/JDBC_JavaDatabase/assets/83882274/d18cef7f-c47b-41de-b76a-8869d53bd52b)
