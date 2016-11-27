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
    private int levelCode;
    private int subjectsCodes[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjectseleccion);

        welcomeScreen = new WelcomeHelper(this, MyWelcomeActivity.class);
        welcomeScreen.show(savedInstanceState);

        /**************** guardar informacion enviada de MainActivity *****************/
        Bundle recieved = getIntent().getExtras();
        levelCode = recieved.getInt("code");
        DefineSubjectTitles(levelCode);
        /*************************************/

        /*******+ obtener codigo de la materias **************/
        DefineSubjectsCodes(levelCode);
        /***********************************************/

        /************ buscar por id **************/
        btnMateria2 = (Button) findViewById(R.id.Btn_Materia2);
        btnMateria3 = (Button)findViewById(R.id.Btn_Materia3);
        btnMateria4 = (Button)findViewById(R.id.Btn_Materia4);
        Btn_Materia1 = (Button) findViewById(R.id.Btn_Materia1);
        /************************************/

        /***** eventos onClicl *******/
        Btn_Materia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SubjectSelectionActivity.this, ActivityLesion.class);
                Bundle bundle = new Bundle();
                bundle.putInt("levelCode", levelCode);
                bundle.putInt("subjectCode", subjectsCodes[0]);
                i.putExtras(bundle);
                startActivityForResult(i, 10000);
            }
        });

        btnMateria2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SubjectSelectionActivity.this, ActivityLesion.class);
                Bundle bundle = new Bundle();
                bundle.putInt("levelCode", levelCode);
                bundle.putInt("subjectCode", subjectsCodes[1]);
                i.putExtras(bundle);
                startActivityForResult(i, 10000);
            }
        });

        btnMateria3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SubjectSelectionActivity.this, ActivityLesion.class);
                Bundle bundle = new Bundle();
                bundle.putInt("levelCode", levelCode);
                bundle.putInt("subjectCode", subjectsCodes[2]);
                i.putExtras(bundle);
                startActivityForResult(i, 10000);
            }
        });

        btnMateria4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (SubjectSelectionActivity.this, ActivityLesion.class);
                Bundle bundle = new Bundle();
                bundle.putInt("levelCode", levelCode);
                bundle.putInt("subjectCode", subjectsCodes[3]);
                i.putExtras(bundle);
                startActivityForResult(i, 10000);
            }
        });
        /****************************************/

        /************ boton flotante ***************/
        FloatingActionButton Button_Nav = (FloatingActionButton) findViewById(R.id.ButtonNav);
        Button_Nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                welcomeScreen.forceShow();
            }
        });
        /****************************************/


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

    public void DefineSubjectsCodes(int levelCode){
        if(levelCode == ContentAplication.LEVELS[0]){
            subjectsCodes = new int[ContentAplication.SUBJECTS_LV1.length];
            for(int i=0; i<subjectsCodes.length; i++){
                subjectsCodes[i] = ContentAplication.SUBJECTS_LV1[i];
            }//fin de for
        }//fin de if

        if(levelCode == ContentAplication.LEVELS[1]){
            subjectsCodes = new int [ContentAplication.SUBJECTS_LV2.length];
            for(int i=0; i<subjectsCodes.length; i++){
                subjectsCodes[i] = ContentAplication.SUBJECTS_LV2[i];
            }//fin de for
        }//fin de if

        if(levelCode == ContentAplication.LEVELS[2]){
            subjectsCodes = new int [ContentAplication.SUBJECTS_LV3.length];
            for(int i=0; i<subjectsCodes.length; i++){
                subjectsCodes[i] = ContentAplication.SUBJECTS_LV3[i];
            }//fin de for
        }//fin de if

        if(levelCode == ContentAplication.LEVELS[3]){
            subjectsCodes = new int [ContentAplication.SUBJECTS_LV4.length];
            for(int i=0; i<subjectsCodes.length; i++){
                subjectsCodes[i] = ContentAplication.SUBJECTS_LV4[i];
            }//fin de for
        }//fin de if
    }//fin del metodo

}//fin de la clase
