package com.example.randomjoke;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView setup,punchLine;
    TextView type;
    Button button;
    ImageView imageView;
    String gett;
    Boolean types=false;
    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        setup =findViewById(R.id.tv_setup);
        type =findViewById(R.id.type);
        punchLine=findViewById(R.id.tv_punch_line);
        imageView=findViewById(R.id.imageView);
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                type.setText(gett);
                types=true;
                imageView.setImageResource(R.drawable.barn);
                c=1;
                return false;
            }
        });
    }
    public void generate(View view) {
        if(c==0) {
            button.setText("Another Lame Joke");
            imageView.setImageResource(R.drawable.laugh);
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Api.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            Api api = retrofit.create(Api.class);
            Call<Joke> call = api.getJoke();
            call.enqueue(new Callback<Joke>() {
                @Override
                public void onResponse(Call<Joke> call, Response<Joke> response) {

                    Log.v("Api", call.request().url().toString());

                    Joke joke = response.body();
                    setup.setText(joke.getSetup());
                    punchLine.setText(joke.getPunchline());
                    if (types)
                        type.setText(joke.getType());
                        else
                        gett = (joke.getType());


                }

                @Override
                public void onFailure(Call<Joke> call, Throwable t) {
                    Log.v("Api", "Api Failed");
                }


            });
        }
        c=0;

    }
}
