package app.rojoyazul.com.android_app_project_movile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLesion extends AppCompatActivity {
    Button mbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesion);

        mbutton = (Button) findViewById(R.id.Btn_Leccion1);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLesion.this, Lesson1_Subject1_Level1.class);
                startActivity(intent);
            }
        });

    }//fin del metodo
}//fin de la clase
