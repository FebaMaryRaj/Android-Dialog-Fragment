package com.feba.dialogfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements DialogFragment.DialogFragmentListener {

    TextView usernameText, passwordText;
    Button buttonDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameText = findViewById(R.id.username_tv);
        passwordText = findViewById(R.id.password_tv);
        buttonDialog = findViewById(R.id.button_dialog);

        buttonDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    public void openDialog() {
        DialogFragment dialogFragment = new DialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "dialog fragment");
    }

    @Override
    public void applyEnteredTexts(String userName, String password) {
        usernameText.setText(userName);
        passwordText.setText(password);

    }
}
