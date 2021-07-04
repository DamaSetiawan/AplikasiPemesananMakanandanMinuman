package info.makanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namaMakanan.add("kue");
        fotoMakanan.add("https://i1.wp.com/indobubbletea.blog/wp-content/uploads/2016/04/roti-panggang-coklat-keju-malang.jpg?fit=1316%2C588");
        infoMakanan.add("Toping Coklat atau Keju");

        namaMakanan.add("Onion Ring");
        fotoMakanan.add("https://i2.wp.com/indobubbletea.blog/wp-content/uploads/2016/04/20150412-baked-mozzarella-stuffed-onion-rings-cheese-morgan-eisenberg-thumb-1500xauto-421868.jpg?fit=1316%2C588");
        infoMakanan.add("Saus Tomat atau Cabe");

        namaMakanan.add("Kentang Goreng");
        fotoMakanan.add("https://assets-pergikuliner.com/uploads/bootsy/image/19400/medium_kentang_goreng.jpg");
        infoMakanan.add("Saus Tomat atau Cabe");

        namaMakanan.add("Jamur Enoki Goreng");
        fotoMakanan.add("https://i0.wp.com/indobubbletea.blog/wp-content/uploads/2016/04/jamur.jpg?w=746&h=385&ssl=1");
        infoMakanan.add("Saus Tomat atau Cabe");

        namaMakanan.add("Singkong Thiland");
        fotoMakanan.add("https://i1.wp.com/indobubbletea.blog/wp-content/uploads/2016/04/1185633a6b6dbb0932071_original.jpg");
        infoMakanan.add("Toping Keju, Coklat, Susu");

        namaMakanan.add("Crispy chicken");
        fotoMakanan.add("https://i2.wp.com/indobubbletea.blog/wp-content/uploads/2016/04/5973fd8d0455b6a18fd929eec548b18a.jpg");
        infoMakanan.add("Saus Tomat atau Cabe");

        namaMakanan.add("Pisang Goreng");
        fotoMakanan.add("https://i0.wp.com/indobubbletea.blog/wp-content/uploads/2016/04/170710_pisang-goreng-restoran-senayan-cafe_641_452.jpg");
        infoMakanan.add("Toping Keju, Coklat, Susu");

        namaMakanan.add("Latte");
        fotoMakanan.add("https://coffeeland.co.id/wp-content/uploads/2019/01/Untitled-1.png");
        infoMakanan.add("Ice/Hot");

        namaMakanan.add("Macchiato");
        fotoMakanan.add("https://coffeeland.co.id/wp-content/uploads/2019/01/2747e4445f8709d1c3621ec7d3dae868-510x765.jpg");
        infoMakanan.add("Ice/Hot");

        namaMakanan.add("Ice Blend");
        fotoMakanan.add("https://coffeeland.co.id/wp-content/uploads/2020/01/WhatsApp-Image-2020-01-06-at-14.20.08-510x680.jpeg");

        namaMakanan.add("Ice Drink");
        fotoMakanan.add("https://coffeeland.co.id/wp-content/uploads/2019/01/67150370a71456b060ae3eb1f696ce96-510x717.jpg");

        namaMakanan.add("Milk Shake");
        fotoMakanan.add("https://coffeeland.co.id/wp-content/uploads/2019/01/4096b026ce7d272290ea8ea592bd2ec7-510x681.jpg");

        namaMakanan.add("Fresh Juice");
        fotoMakanan.add("https://coffeeland.co.id/wp-content/uploads/2019/01/76e5647e3be3673cb69e8c0af19121b3.jpg");

        namaMakanan.add("Milk Tea");
        fotoMakanan.add("https://i1.wp.com/indobubbletea.blog/wp-content/uploads/2014/11/milktea-3.jpg?resize=444%2C333&ssl=1");

        namaMakanan.add("Mocktail");
        fotoMakanan.add("https://i2.wp.com/indobubbletea.blog/wp-content/uploads/2014/11/mocktails2.jpg?resize=580%2C381&ssl=1");

        prosesRecyclerViewAdapter();
    }
}