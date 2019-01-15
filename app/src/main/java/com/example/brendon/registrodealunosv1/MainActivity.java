package com.example.brendon.registrodealunosv1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
<<<<<<< HEAD
import android.support.v7.app.AppCompatDialogFragment;
=======
>>>>>>> cab9b3693451e98914e40a13bfc0755cc70a6543
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


<<<<<<< HEAD
import com.example.brendon.registrodealunosv1.Fragments.AlunosDiplomadosFragment;
=======
>>>>>>> cab9b3693451e98914e40a13bfc0755cc70a6543
import com.example.brendon.registrodealunosv1.Fragments.AlunosFragment;
import com.example.brendon.registrodealunosv1.Fragments.FaculdadesFragment;
import com.example.brendon.registrodealunosv1.Fragments.InicioFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView =  findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        fragmentManager.beginTransaction().replace(R.id.main, new InicioFragment()).commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressLint("CommitTransaction")
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_inicio) {
            fragmentManager.beginTransaction().replace(R.id.main, new InicioFragment()).commit();

        } else if (id == R.id.nav_aluno) {
            fragmentManager.beginTransaction().replace(R.id.main, new AlunosFragment()).commit();

<<<<<<< HEAD
        } else if (id == R.id.nav_faculdades) {
            fragmentManager.beginTransaction().replace(R.id.main, new FaculdadesFragment()).commit();

        } else if (id == R.id.nav_alunos_diplomado) {
            fragmentManager.beginTransaction().replace(R.id.main, new AlunosDiplomadosFragment()).commit();

=======

        } else if (id == R.id.nav_faculdades) {
            fragmentManager.beginTransaction().replace(R.id.main, new FaculdadesFragment()).commit();

        } else if (id == R.id.nav_manage) {
>>>>>>> cab9b3693451e98914e40a13bfc0755cc70a6543

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
