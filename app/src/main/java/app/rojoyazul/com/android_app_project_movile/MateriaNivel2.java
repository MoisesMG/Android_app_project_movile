package app.rojoyazul.com.android_app_project_movile;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.stephentuso.welcome.WelcomeHelper;

public class MateriaNivel2 extends AppCompatActivity {
    WelcomeHelper welcomeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materia_nivel2);

        welcomeScreen = new WelcomeHelper(this, MyWelcomeActivity.class);
        welcomeScreen.show(savedInstanceState);

        FloatingActionButton Button_NavN2 = (FloatingActionButton) findViewById(R.id.ButtonNavN2);
        Button_NavN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                welcomeScreen.forceShow();
            }
        });
    }//fin del metodo
}//fin de la clase
