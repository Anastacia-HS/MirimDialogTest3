package kr.hs.e_mirim.s2019s04.mirimdialogtest3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    View view;
    RadioGroup rg;
    RadioButton radioBerry, radioBeer, radioBlueberry, radioLeaf;
    Button btnLook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.rg);
        radioBerry = findViewById(R.id.radio_Berry);
        radioBeer = findViewById(R.id.radio_Beer);
        radioBlueberry = findViewById(R.id.radio_Blueberry);
        radioLeaf = findViewById(R.id.radio_Leaf);
        btnLook = findViewById(R.id.btn_look);
        btnLook.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int selectedId = 0;
            String selectedTitle = "";

            switch(rg.getCheckedRadioButtonId()) {
                case R.id.radio_Berry:
                    selectedId = R.drawable.berry;
                    selectedTitle = radioBerry.getText().toString();
                    break;

                case R.id.radio_Beer:
                    selectedId = R.drawable.beer;
                    selectedTitle = radioBeer.getText().toString();
                    break;

                case R.id.radio_Blueberry:
                    selectedId = R.drawable.blueberry;
                    selectedTitle = radioBlueberry.getText().toString();
                    break;

                case R.id.radio_Leaf:
                    selectedId = R.drawable.leaf;
                    selectedTitle = radioLeaf.getText().toString();
                    break;

            }

            AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
            dlg.setTitle(selectedTitle);
            dlg.setPositiveButton("닫기", null);
            dlg.show();
        }
    };
}