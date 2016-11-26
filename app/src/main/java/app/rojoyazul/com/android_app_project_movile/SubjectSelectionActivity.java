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
        DefineSubjectTitles(bundle.getInt("code"));

        /*************************************/
    }//fin del metodo

    public void DefineSubjectTitles(int levelcode){
        if(levelcode == ContentAplication.LEVELS[0]){
            Btn_Materia1.setText(R.string.subject1_Level1);
            btnMateria2.setText(R.string.subject2_Level1);
            btnMateria3.setText(R.string.subject3_Level1);
            btnMateria4.setText(R.string.subject4_Level1);
        }

        if(levelcode == ContentAplication.LEVELS[1]){
            Btn_Materia1.setText(R.string.subject1_Level2);
            btnMateria2.setText(R.string.subject2_Level2);
            btnMateria3.setText(R.string.subject3_Level2);
            btnMateria4.setText(R.string.subject4_Level2);
        }

        if(levelcode == ContentAplication.LEVELS[2]){
            Btn_Materia1.setText(R.string.subject1_Level3);
            btnMateria2.setText(R.string.subject2_Level3);
            btnMateria3.setText(R.string.subject3_Level3);
            btnMateria4.setText(R.string.subject4_Level3);
        }

        if(levelcode == ContentAplication.LEVELS[3]){
            Btn_Materia1.setText(R.string.subject1_Level4);
            btnMateria2.setText(R.string.subject2_Level4);
            btnMateria3.setText(R.string.subject3_Level4);
            btnMateria4.setText(R.string.subject4_Level4);
        }

    }//fin del metodo

}//fin de la clase
