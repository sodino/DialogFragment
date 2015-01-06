package lab.sodino.dialogfragment;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {
    Button btnNoTitle, btnNoFrame, btnNoInput, btnNormal;
    Button btnHolo, btnHoloLight, btnHoloLightDialog;

    TextView txtChoice;

    Button btnShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNoTitle = (Button)findViewById(R.id.btnNoTitle);
        btnNoFrame = (Button)findViewById(R.id.btnNoFrame);
        btnNoInput = (Button)findViewById(R.id.btnNoInput);
        btnNormal = (Button)findViewById(R.id.btnNormal);
        btnHolo = (Button)findViewById(R.id.btnHolo);
        btnHoloLight = (Button)findViewById(R.id.btnHoloLight);
        btnHoloLightDialog = (Button)findViewById(R.id.btnHoloLightDialog);
        btnShow = (Button)findViewById(R.id.btnShow);
        txtChoice = (TextView)findViewById(R.id.txtChoice);

    }
}
