package com.formpenilaian.formpenilaian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private RadioGroup radiogroup,radiogroup2,radiogroup3,radiogroup4,radiogroup5;
    private RadioButton radiobutton,radiobutton2,radiobutton3,radiobutton4,radiobutton5;
    private Button submitbutton;
    private EditText nama,nrp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        func_button();
    }

    public void func_button() {
        nama =(EditText)findViewById(R.id.inputnama);
        nrp =(EditText)findViewById(R.id.inputnrp);
        final String[] hasilnama = {" "};
        final String[] hasilnrp = {" "};
        radiogroup =(RadioGroup)findViewById(R.id.radioGroup1);
        radiogroup2 =(RadioGroup)findViewById(R.id.radioGroup2);
        radiogroup3 =(RadioGroup)findViewById(R.id.radioGroup3);
        radiogroup4 =(RadioGroup)findViewById(R.id.radioGroup4);
        radiogroup5 =(RadioGroup)findViewById(R.id.radioGroup5);
        submitbutton =(Button)findViewById(R.id.btnSubmit);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilnama[0] = nama.getText().toString();
                hasilnrp[0] = nrp.getText().toString();

                int selectid = radiogroup.getCheckedRadioButtonId();
                String nilaihuruf = "";
                int nilaiangka = 0,nilaiangka2 = 0,nilaiangka3 = 0,nilaiangka4 = 0,nilaiangka5 = 0;
                if(selectid != -1) {
                    radiobutton = (RadioButton)findViewById(selectid);
                    nilaihuruf = radiobutton.getText().toString();
                    if (nilaihuruf.equals("A")) {
                        nilaiangka = 4;
                    } else if (nilaihuruf.equals("B")) {
                        nilaiangka = 3;
                    } else if (nilaihuruf.equals("C")) {
                        nilaiangka = 2;
                    } else if (nilaihuruf.equals("D")) {
                        nilaiangka = 1;
                    }
                }
                int selectid2 = radiogroup2.getCheckedRadioButtonId();
                if(selectid2 != -1){
                    radiobutton2 =(RadioButton)findViewById(selectid2);
                    nilaihuruf = radiobutton2.getText().toString();
                    if (nilaihuruf.equals("A")){
                        nilaiangka2 = 4;
                    }
                    else if (nilaihuruf.equals("B")){
                        nilaiangka2 = 3;
                    }
                    else if (nilaihuruf.equals("C")){
                        nilaiangka2 = 2;
                    }
                    else if (nilaihuruf.equals("D")){
                        nilaiangka2 = 1;
                    }

                }
                int selecetid3 = radiogroup3.getCheckedRadioButtonId();
                if(selecetid3 != -1){
                    radiobutton3=(RadioButton)findViewById(selecetid3);
                    nilaihuruf = radiobutton3.getText().toString();
                    if (nilaihuruf.equals("A")){
                        nilaiangka3 = 4;
                    }
                    else if (nilaihuruf.equals("B")){
                        nilaiangka3 = 3;
                    }
                    else if (nilaihuruf.equals("C")){
                        nilaiangka3 = 2;
                    }
                    else if (nilaihuruf.equals("D")){
                        nilaiangka3 = 1;
                    }
                }
                int selectid4 = radiogroup4.getCheckedRadioButtonId();
                if(selectid4 != -1){
                    radiobutton4=(RadioButton)findViewById(selectid4);
                    nilaihuruf = radiobutton4.getText().toString();
                    if (nilaihuruf.equals("A")){
                        nilaiangka4 = 4;
                    }
                    else if (nilaihuruf.equals("B")){
                        nilaiangka4 = 3;
                    }
                    else if (nilaihuruf.equals("C")){
                        nilaiangka4 = 2;
                    }
                    else if (nilaihuruf.equals("D")){
                        nilaiangka4 = 1;
                    }
                }
                int selectid5 = radiogroup5.getCheckedRadioButtonId();
                if (selectid5 != -1){
                    radiobutton5=(RadioButton)findViewById(selectid5);
                    nilaihuruf = radiobutton5.getText().toString();
                    if (nilaihuruf.equals("A")){
                        nilaiangka5 = 4;
                    }
                    else if (nilaihuruf.equals("B")){
                        nilaiangka5 = 3;
                    }
                    else if (nilaihuruf.equals("C")){
                        nilaiangka5 = 2;
                    }
                    else if (nilaihuruf.equals("D")){
                        nilaiangka5 = 1;
                    }
                }
                Toast.makeText(MainActivity.this,hasilnama[0]+" "+hasilnrp[0]+" "+(nilaiangka+nilaiangka2+nilaiangka3+nilaiangka4+nilaiangka5)/5,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
