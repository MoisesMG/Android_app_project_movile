package app.rojoyazul.com.android_app_project_movile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.stephentuso.welcome.WelcomeHelper;

public class SubjectSelectionActivity extends AppCompatActivity {
    WelcomeHelper welcomeScreen;
    Button Btn_Materia1;
    Button btnMateria2;
    Button btnMateria3;
    Button btnMateria4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjectseleccion);

        welcomeScreen = new WelcomeHelper(this, MyWelcomeActivity.class);
        welcomeScreen.show(savedInstanceState);

        Btn_Materia1 = (Button) findViewById(R.id.Btn_Materia1);
        Btn_Materia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (SubjectSelectionActivity.this, ActivityLesion.class);
                startActivity(intent);
            }
        });

        FloatingActionButton Button_Nav = (FloatingActionButton) findViewById(R.id.ButtonNav);
        Button_Nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                welcomeScreen.forceShow();
            }
        });

        /************ buscar por id **************/
        btnMateria2 = (Button) findViewById(R.id.Btn_Materia2);
        btnMateria3 = (Button)findViewById(R.id.Btn_Materia3);
        btnMateria4 = (Button)findViewById(R.id.Btn_Materia4);
        /************************************/


        /**************** guardar informacion enviada de MainActivity *****************/
        Bundle bundle = getIntent().getExtras();
        String [] buttonsTitles = new String[4];
        buttonsTitles[0] = bundle.getString("sub1");
        buttonsTitles[1] = bundle.getString("sub2");
        buttonsTitles[2] = bundle.getString("sub3");
        buttonsTitles[3] = bundle.getString("sub4");

        Btn_Materia1.setText(buttonsTitles[0]);
        btnMateria2.setText(buttonsTitles[1]);
        btnMateria3.setText(buttonsTitles[2]);
        btnMateria4.setText(buttonsTitles[3]);
        /*************************************/
    }//fin del metodo

}//fin de la clase
