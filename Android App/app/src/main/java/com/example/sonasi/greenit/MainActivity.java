package com.example.sonasi.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String content[][] = {{"http://fr.web.img3.acsta.net/c_215_290/pictures/17/07/10/17/13/380931.jpg", "EPOUSE-MOI MON POTE"},
                {"http://fr.web.img5.acsta.net/c_215_290/pictures/17/06/23/09/20/377670.jpg", "ÔTEZ-MOI D'UN DOUTE"},
                {"http://fr.web.img2.acsta.net/c_215_290/pictures/17/05/31/11/13/023056.jpg", "CONFIDENT ROYAL"},
                {"http://fr.web.img3.acsta.net/c_215_290/pictures/17/07/26/10/49/580251.jpg", "CAPITAINE SUPERSLIP"},
                {"http://fr.web.img2.acsta.net/c_215_290/pictures/17/03/29/14/40/513263.jpg", "ÇA"},
                {"http://fr.web.img4.acsta.net/c_215_290/pictures/17/06/02/10/02/162904.jpg", "SEVEN SISTERS"},
                {"http://fr.web.img6.acsta.net/c_215_290/pictures/17/07/12/11/50/570288.jpg", "LE SENS DE LA FÊTE"},
                {"http://fr.web.img5.acsta.net/c_215_290/pictures/17/07/12/10/33/047891.jpg", "LE PETIT SPIROU"},
                {"http://fr.web.img5.acsta.net/c_215_290/pictures/17/08/24/15/18/597734.jpg", "BLADE RUNNER 2049"},
                {"http://fr.web.img4.acsta.net/c_215_290/pictures/17/07/05/12/44/185176.jpg", "BARBARA"},
                {"http://fr.web.img3.acsta.net/c_215_290/pictures/17/06/12/09/36/489167.jpg", "MON GARÇON"},
                {"http://fr.web.img3.acsta.net/c_215_290/pictures/17/06/07/15/34/557760.jpg", "BARRY SEAL : AMERICAN TRAFFIC"},
                {"http://fr.web.img6.acsta.net/c_215_290/pictures/17/07/13/10/58/207157.jpg", "PETIT PAYSAN"},
                {"http://fr.web.img4.acsta.net/c_215_290/pictures/17/07/20/17/39/592819.jpg", "L'UN DANS L'AUTRE"},
                {"http://fr.web.img2.acsta.net/c_215_290/pictures/17/07/28/10/01/148014.jpg", "GAUGUIN - VOYAGE DE TAHITI"},
                {"http://fr.web.img6.acsta.net/c_215_290/pictures/17/07/17/12/49/199993.jpg", "LES GRANDS ESPRITS"},
                {"http://fr.web.img2.acsta.net/c_215_290/pictures/17/06/20/17/08/123241.jpg", "BIGFOOT JUNIOR"},
                {"http://fr.web.img5.acsta.net/c_215_290/pictures/17/09/08/09/41/2636970.jpg", "MOTHER!"},
                {"http://fr.web.img3.acsta.net/c_215_290/pictures/17/07/28/15/56/266725.jpg", "UN BEAU SOLEIL INTÉRIEUR"},
                {"http://fr.web.img2.acsta.net/c_215_290/pictures/17/08/02/16/51/407072.jpg", "AMERICAN ASSASSIN"},
                {"http://fr.web.img6.acsta.net/c_215_290/pictures/17/07/28/10/00/052385.jpg", "LE REDOUTABLE"}
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListAdapter(content));
    }
}
