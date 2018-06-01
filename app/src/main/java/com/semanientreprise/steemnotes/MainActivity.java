package com.semanientreprise.steemnotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.semanientreprise.steemnotes.Model.userDetails;
import com.semanientreprise.steemnotes.network.ApiClient;
import com.semanientreprise.steemnotes.service.APISERVICE;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_go)
    Button btnGo;
    @BindView(R.id.input_layout_username)
    TextInputLayout inputLayoutUsername;
    private Call<userDetails> userdetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    @OnClick(R.id.btn_go)
    public void onViewClicked() {
        //method to make a call to server to get the details of the user
        APISERVICE service = ApiClient.getClient().create(APISERVICE.class);
        userdetails = service.getUserDetails(inputLayoutUsername.getEditText().getText().toString());

        userdetails.enqueue(new Callback<userDetails>() {
                @Override
                public void onResponse(Call<userDetails> call, Response<userDetails> response) {
                    if (response.code() == 200 && response.isSuccessful()) {
                        final userDetails rowListItem = response.body();

                        Log.d("USERDETAILS:",rowListItem.getName());
                        showToast(""+rowListItem.getRank());
                    }
                }

                @Override
                public void onFailure(Call<userDetails> call, Throwable t) {
                    Log.d("USERDETAILS", t.getMessage());
                }
            });
        startActivity(new Intent(this, loggedIn.class));
        }

    private void showToast(String rowListItem) {
            Toast.makeText(this,rowListItem,Toast.LENGTH_LONG).show();

    }
}
