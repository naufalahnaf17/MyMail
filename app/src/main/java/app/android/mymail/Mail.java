package app.android.mymail;

public class Mail {
    String pengirim , title , isi , waktu;
    int image;

    public Mail(String pengirim, String title, String isi, String waktu, int image) {
        this.pengirim = pengirim;
        this.title = title;
        this.isi = isi;
        this.waktu = waktu;
        this.image = image;
    }

    public Mail(){}

    public String getPengirim() {
        return pengirim;
    }

    public void setPengirim(String pengirim) {
        this.pengirim = pengirim;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
