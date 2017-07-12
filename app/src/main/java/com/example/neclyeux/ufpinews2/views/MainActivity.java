package com.example.neclyeux.ufpinews2.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.neclyeux.ufpinews2.R;
import com.example.neclyeux.ufpinews2.controller.adapter.ListViewAdapter;
import com.example.neclyeux.ufpinews2.controller.core.News;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public  final static String POSITION_NEWS = "com.exemple.neclyeux.ufpinews2.POSITION_NEWS";

    private TextView mTextMessage;
    private ListView listView;
    private ListViewAdapter adapter;
    public static ArrayList<News> arrayNews;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayNews = new ArrayList<News>();
        listView = (ListView) findViewById(R.id.listview_news);
        adapter = new ListViewAdapter(getApplicationContext());

        for (int i = 0; i < 3; i++){
            noticia1();
            noticia2();
            noticia3();
            noticia4();
        }
        /*mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);*/
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent detailNews = new Intent(getApplicationContext(), NewsDetail.class);
                detailNews.putExtra(POSITION_NEWS, position);
                startActivity(detailNews);
            }
        });
    }

    public void noticia1(){
        News news = new News();
        news.setImage(R.drawable.image_noticia1);
        news.setTitle("Parceria entre UFPI e FUNASA é apresentada em reunião");
        news.setDescription("Integrar a sociedade nos espaços da Universidade Federal do Piauí (UFPI) é uma das propostas em execução da gestão atual. E por meio desse pensamento, na manhã desta quarta (12), a Reitora em exercício, Profª. Drª. Nadir do Nascimento Nogueira, recebeu o representante do setor administrativo da Fundação Nacional da Saúde (FUNASA-PI), Fábio Santana; e o Educador Físico Manoel Meneses para tratar de futura parceria com a UFPI. A demanda é para a Instituição disponibilizar o espaço do Setor de Esportes para a realização de atividades físicas dos servidores administrativos da FUNASA." + "\n" +
                            "O projeto tem como objetivo o desenvolvimento de atividades físicas como ginástica laboral, natação e atletismo entre outras. Inicialmente seriam realizadas com integrantes do setor de administração da FUNASA, podendo se estender aos demais servidores do órgão. Foi solicitado também o apoio logístico da Universidade através das instalações do Setor de Esportes e apoio técnico viabilizando professores e estudantes do Curso de Educação Física para ministrar e orientar as atividades." + "\n" +
                            "Para o chefe do Departamento de Educação Física, Prof. Raul Feitosa, a proposta trará benefícios para ambas as partes e que o projeto deve ser estudado." + "\n" +
                            " “A partir do momento que nos apresentarem o projeto será possível debater e aprofundar como desenvolver as atividades. Dentro dessa perspectiva, existe a possibilidade de nossos alunos  atuarem como bolsistas. Isso faz parte do nosso currículo, em que  os alunos devem ter esse contato e,  a partir do 5º período, é um momento deles conseguirem as horas complementares, assim como conhecer a realidade do curso  através da prática, além do auxilio da bolsa.”" + "\n" +
                            "A Reitora em exercício falou sobre as relações da UFPI para além da comunidade acadêmica. “A Universidade sempre esteve de braços abertos para fortalecer laços com outros órgãos públicos e a sociedade civil de maneira geral. Essa proposta do projeto seria mais uma atividade de aproximação entre a comunidade universitária da UFPI e a sociedade.” ressaltou Profª. Drª. Nadir Nogueira." + "\n");

        arrayNews.add(news);
        adapter.addItem(news);

    }

    public void noticia2(){
        News news = new News();
        news.setImage(R.drawable.logo_ufpi);
        news.setTitle("SEBTT: retificação do resultado das homologações da seleção de bolsistas Mediotec");
        news.setDescription("A Superintendência de Ensino Básico, Técnico e Tecnológico (SEBTT), da Universidade Federal Piauí (UFPI), torna pública a retificação do resultado das homologações referentes ao Edital n° 02/2017-SEBTT/UFPI, publicado no dia 21/06/2017." + "\n" +
                            "Confira aqui.");

        arrayNews.add(news);
        adapter.addItem(news);
    }

    public void noticia3(){
        News news = new News();
        news.setImage(R.drawable.image_noticia3);
        news.setTitle("Seminário Estadual de Alfabetização: PNAIC em Foco acontecerá nesta sexta-feira (14)");
        news.setDescription("A Fundação Cultural e de Fomento à Pesquisa, Ensino, Extensão e Inovação (Fadex), da Universidade Federal do Piauí (UFPI), em parceria com a Secretaria de Estado da Educação (SEDUC), convida a todos para o Seminário Estadual de Alfabetização: Pacto Nacional pela Alfabetização na Idade Certa - PNAIC em Foco, que traz a temática “Formação Continuada de Alfabetuzadores: Ações do PNAIC no Piauí\"." + "\n" +
                            "O evento acontecerá nesta sexta-feira (14), no Atlantic City, com a participação de 750 professores dos municípios piauienses. " + "\n" +
                            "Confira a programação.");

        arrayNews.add(news);
        adapter.addItem(news);
    }

    public void noticia4(){
        News news = new News();
        news.setImage(R.drawable.image_noticia4);
        news.setTitle("Inscrições prorrogadas para o Curso de Especialização em Histologia e Embriologia");
        news.setDescription("A Universidade Federal do Piauí (UFPI), por meio da Pró-Reitoria de Ensino de Pós-Graduação e da Coordenadoria de Pós-Graduação comunica que as inscrições para o Curso de Especialização em Histologia e Embriologia foram prorrogadas até o dia 18 de agosto." + "\n" +
                            "As inscrições são feitas em duas etapas. A primeira pelo Sistema Integrado de Gestão de Atividades Acadêmicas (SIGAA) onde será feito o cadastro.  Em seguida o candidato deve levar o comprovante de inscrição no sigaa, comprovante de pagamento e toda a documentação (inclusive comprovação do currículo) para a secretaria do setor de histologia (no departamento de morfologia)");

        arrayNews.add(news);
        adapter.addItem(news);

    }


}
