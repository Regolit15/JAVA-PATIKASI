

public class employer {
    String name ;
    int maas ;
    int calismaSaati;
    int baslangicYili;


    public employer(String name, int maas, int calismaSaati, int baslangicYili) {

        this.name = name;
        this.maas = maas;
        this.calismaSaati = calismaSaati;
        this.baslangicYili = baslangicYili;
    }


    public double tax () {

        if (this.maas<= 1000 ) {
            return maas;
        }else {
            double tax = maas * 0.3 ;
            return tax ;
        }
    }

    public int bonus() {
        if (this.calismaSaati > 40 ) {
            int bonus = (calismaSaati - 40) * 30;
            return bonus;
        }
        return 0;

    }

    public double calismaYiliZammi () {
        if (baslangicYili <=0 || baslangicYili > 2021 ) {
            System.out.println("Geçersiz Baişlangıç Yılı Girdiniz Kontrol ediniz");
        }else {
            int farkYıl = 2021 - baslangicYili;
            double zam ;

            if (farkYıl>0 && farkYıl < 10) {
                zam = maas * 0.05 ;
                return zam ;
            }else if (farkYıl>9 && farkYıl < 20){
                zam = maas* 0.1;
                return zam ;
            }else if (farkYıl> 19) {
                zam = maas* 0.15 ;
                return zam ;
            }else if (farkYıl == 0) {
                return 0;
            }
        }
        return 0;
    }

    public String toString () {
        double total = maas -tax() + bonus() + calismaYiliZammi();
        double tot = maas +bonus() - tax();
        System.out.println("Adı : "+name);
        System.out.println("Maaşı : "+ maas);
        System.out.println("Çalışma Saati : "+ calismaSaati);
        System.out.println("Başlangıç Yılı : "+baslangicYili);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş artışı : "+calismaYiliZammi());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+tot);
        System.out.println("Toplam Maaş : "+total);


        return null;
    }

}