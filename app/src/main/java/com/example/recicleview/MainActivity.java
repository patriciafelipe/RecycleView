package com.example.recicleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

//https://developer.android.com/guide/topics/ui/layout/recyclerview

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerview = (RecyclerView) findViewById(R.id.NossoRecycleView);

        List<Aluno> listAlunos = new ArrayList<>();
        Aluno huguinho = new Aluno();
        huguinho.setNome("Patrícia");
        huguinho.setIdade(10);

        Aluno zezinho = new Aluno();
        zezinho.setNome("João");
        zezinho.setIdade(9);

        Aluno luizinho = new Aluno();
        luizinho.setNome("Paulo");
        luizinho.setIdade(8);

        listAlunos.add(huguinho);
        listAlunos.add(zezinho);
        listAlunos.add(luizinho);

        recyclerview.setAdapter(new NossoRecicleViewListDeAlunosAdapter(listAlunos, this));

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        recyclerview.setLayoutManager(layoutManager);
    }
}