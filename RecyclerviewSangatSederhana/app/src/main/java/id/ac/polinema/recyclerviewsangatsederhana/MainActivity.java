package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class MainActivity extends AppCompatActivity {
    //instansiasi RecycleView
    RecyclerView rvSuperHero;
    //instansiasi ListSuperHero
    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan rvSuperHero ke Layout
        rvSuperHero = findViewById(R.id.rvSuperHero);

        //membuat objek baru
        SuperHero hero = new SuperHero("Petruk");

        //menambah SuperHero ke listSuperHero
        listSuperHero.add(hero);

        //membuat objek baru
        hero = new SuperHero("Gareng");

        //menambah SuperHero ke listSuperHero
        listSuperHero.add(hero);

        //instansiasi Adapter
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);

        //set adapter dan layourmanager
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}
