package app.rojoyazul.com.android_app_project_movile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.stephentuso.welcome.BasicPage;
import com.stephentuso.welcome.TitlePage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;

public class MyWelcomeActivity extends WelcomeActivity {
    @Override
    protected WelcomeConfiguration configuration() {
        return new WelcomeConfiguration.Builder(this)
                .defaultBackgroundColor(R.color.background)
                .page(new TitlePage(R.mipmap.ic_launcher,
                        "Nombre Aplicación")
                )
                .page(new BasicPage(R.mipmap.ic_launcher,
                        "Selecciona un nivel",
                        "Selecciona el nivel de aprendizaje de las materias")
                        .background(R.color.background_two)
                )
                .page(new BasicPage(R.mipmap.ic_launcher,
                        "Selecciona un Materia",
                        "Elige la Materia a Reforzar")
                        .background(R.color.background_one)
                )
                .page(new BasicPage(R.mipmap.ic_launcher,
                        "Selecciona una Lección",
                        "Escoge la lección para los ejercicios correspondientes.")
                        .background(R.color.background_two)
                )
                .page(new BasicPage(R.mipmap.ic_launcher,
                        "Ve al ejercicio",
                        "Presiona el botón para realizar los ejercicios")
                        .background(R.color.background)
                )
                .swipeToDismiss(true)
                .build();
    }//fin del metodo
}//fin de la clase
