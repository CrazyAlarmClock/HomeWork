package ru.pavlenty.retrofit17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import ru.pavlenty.retrofit17.R;
import ru.pavlenty.retrofit17.UmoriliApi;
import ru.pavlenty.retrofit17.Controller;
import ru.pavlenty.retrofit17.AnekdotModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private static EditText totranslate;
    AnekdotModel  otvet;

    private static UmoriliApi umoriliApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totranslate=(EditText)findViewById(R.id.editText2);
        umoriliApi=Controller.getApi();
    }
    public void Click(View v) {

        umoriliApi.getIt(totranslate.getText().toString()).enqueue(new Callback<AnekdotModel>() {

            @Override
            public void onResponse(Call<AnekdotModel> call, Response<AnekdotModel> response) {
                otvet = response.body();
                totranslate.setText(" ");
                boolean firsttime = true;
                for (String h : otvet.getText()) {
                    if (firsttime) totranslate.setText(h);
                    if (!firsttime) totranslate.setText(totranslate.getText().toString() + "," + h);
                    firsttime = false;
                }

            }

            @Override
            public void onFailure(Call<AnekdotModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "An error occurred during networking", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
