package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * @author cbo
     * @version 1.0
     * </br> //Aplicación que muestra el típico ejemplo Hola Mundo
     * <ol>
     *       <li>He visto como se crean recursos en XML</li>
     *       <li>He instanciado en Java un objeto TextView</li>
     *       <li>Se ha personalizado la imagen de la aplicación</i>
     * </ol>*/
    private TextView tvMessage;
    private TextView textV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tvMessage = findViewById(R.id.tvMessage);
         textV = findViewById(R.id.textView);
         tvMessage.setTextColor(getColor(R.color.white));
         textV.setText(R.string.messageOptimistText);
    }
}