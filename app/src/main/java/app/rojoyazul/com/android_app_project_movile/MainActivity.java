package app.rojoyazul.com.android_app_project_movile;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.stephentuso.welcome.WelcomeHelper;

public class MainActivity extends AppCompatActivity {
    WelcomeHelper welcomeScreen;
    Button Btn_Nivel1;
    Button Btn_Nivel2;
    Button Btn_Nivel3;
    Button Btn_Nivel4;

    /********************codigos de los niveles *********/

    /***********************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        welcomeScreen = new WelcomeHelper(this, MyWelcomeActivity.class);
        welcomeScreen.show(savedInstanceState);


        //llamado de la actividad MATERIAS (clase SubjetcSelectionActivity) del NIVEL 1
        Btn_Nivel1 = (Button) findViewById(R.id.Btn_Nivel1);
        Btn_Nivel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(MainActivity.this, SubjectSelectionActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("sub1","Matematicas 1");
                bundle.putString("sub2","Lengua y literatura 1");
                bundle.putString("sub3","Ciencias sociales 1");
                bundle.putString("sub4","Cienciaas naturales 1");
                bundle.putInt("cod",10000);
                i.putExtras(bundle);
                startActivityForResult(i,10000);
            }
        });

        //llamado de la actividad MATERIAS (clase MateriaNivel2) del NIVEL 2
        Btn_Nivel2 =(Button) findViewById(R.id.Btn_Nivel2);
        Btn_Nivel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //Llamado de la actividad MATERIAS (clase MateriaNivel3) del NIVEL 3
        Btn_Nivel3 = (Button) findViewById(R.id.Btn_Nivel3);
        Btn_Nivel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //Llamado de la actividad MATERIAS (clase MateriaNivel4) del NIVEL 4
        Btn_Nivel4 = (Button) findViewById(R.id.Btn_Nivel4);
        Btn_Nivel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





        //Llamado de la ayuda de la Aplicación
        FloatingActionButton ButtonNav = (FloatingActionButton) findViewById(R.id.ButtonNav);
        ButtonNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                welcomeScreen.forceShow();
            }
        });
    }//fin del metodo

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        welcomeScreen.onSaveInstanceState(outState);
    }//fin del metodo

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }//fin del metodo

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_help:
                //aqui debera dirigir hacia la actividad de ayuda
                Toast.makeText(this,"Se presiona el boton de ayuda del action bar",Toast.LENGTH_LONG);
            default:
                return super.onOptionsItemSelected(item);
        }
    }//fin del metodo



}//fin de la clase
