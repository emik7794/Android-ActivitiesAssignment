package famaf.unc.edu.ar.activitiesassignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {

    static final int LOGIN_ACTIVITY = 1; // requestCode

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_news, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_sign_in) {
            NewsActivityFragment newsfragment = (NewsActivityFragment)
                    getSupportFragmentManager().findFragmentById(R.id.news_activity_fragment_id);
            // Creo el intent para comunicarme con la actividad LoginActivity
            Intent intentLogin = new Intent(this, LoginActivity.class);
            // startActivityForResult(Intent intent, int requestCode)
            startActivityForResult(intentLogin, LOGIN_ACTIVITY);

            TextView textView = (TextView) findViewById(R.id.loginStatusTextView);
            textView.setText("User XXXX logged in");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
