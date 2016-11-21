package app.rojoyazul.com.android_app_project_movile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.stephentuso.welcome.WelcomeHelper;

public class SubjectSelectionActivity extends AppCompatActivity {
    WelcomeHelper welcomeScreen;
    Button Btn_Materia1;
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
    }//fin del metodo
}//fin de la clase
