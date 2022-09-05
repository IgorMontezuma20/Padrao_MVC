package com.example.padraomvc.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.padraomvc.R;
import com.example.padraomvc.model.MyModel;

public class MainActivity extends AppCompatActivity {


    //------------------Padrão MVC--------------
    //View: TextView
    //Model: MyModel class
    //Controller: Main Activity


    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Precisa ser criado um botão que quando o usuário clicar
        // irá setar um texto para o TextView

        // 1 - Implementando o padrão MVC

        getComponents();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayAppText(view);
            }
        });

    }



    public MyModel GetAppFromMyModel(){


        return new MyModel("Estudo do padrão MVC",
                90000, 4);

    }


    public void displayAppText(View view){

        textView.setText(GetAppFromMyModel().getAppName() + "Downloads: " +
                GetAppFromMyModel().getAppDownloads() + "Rating: " +
                GetAppFromMyModel().getAppRating());

    }

    public void getComponents(){

        textView = findViewById(R.id.textView);
        btn = findViewById(R.id.button);

    }
    

    
}