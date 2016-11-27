package app.rojoyazul.com.android_app_project_movile;

import android.content.Intent;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLesion extends AppCompatActivity {
    Button btnLesson1;
    Button btnLesson2;
    Button btnLesson3;
    Button btnLesson4;
    Bundle recieved;
    Bundle send;
    Intent i;
    private int levelCode;
    private int subjectCode;
    private int lessonsCodes[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesion);

        recieved = getIntent().getExtras();
        levelCode = recieved.getInt("levelCode");
        subjectCode = recieved.getInt("subjectCode");


    }//fin del metodo


}//fin de la clase
