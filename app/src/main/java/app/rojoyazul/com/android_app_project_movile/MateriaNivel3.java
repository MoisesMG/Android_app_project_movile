package app.rojoyazul.com.android_app_project_movile;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.stephentuso.welcome.WelcomeHelper;

public class MateriaNivel3 extends AppCompatActivity {
    WelcomeHelper welcomeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materia_nivel3);

        welcomeScreen = new WelcomeHelper(this, MyWelcomeActivity.class);
        welcomeScreen.show(savedInstanceState);

        FloatingActionButton Button_NavN3 = (FloatingActionButton) findViewById(R.id.ButtonNavN3);
        Button_NavN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                welcomeScreen.forceShow();
            }
        });
    }//fin del metodo
}//fin de la clase
