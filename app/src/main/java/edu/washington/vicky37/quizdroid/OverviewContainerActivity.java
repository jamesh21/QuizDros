package edu.washington.vicky37.quizdroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OverviewContainerActivity extends AppCompatActivity implements MathMainFragment.OnFragmentInteractionListener ,
                PhysicsMainFragment.OnFragmentInteractionListener, ComputerMainFragment.OnFragmentInteractionListener,
                MarvelMainFragment.OnFragmentInteractionListener, MathQuestionFragment.OnFragmentInteractionListener,
                AnswerFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview_container);
        String value = getIntent().getStringExtra("value");
        System.out.println("the value is " +value);
        switch(value) {
            case "math":
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.overview_container, new MathMainFragment())
                        .commit();
                break;
            case "physics":
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.overview_container, new PhysicsMainFragment())
                        .commit();
                break;
            case "computer":
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.overview_container, new ComputerMainFragment())
                        .commit();
                break;
            case "marvel":
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.overview_container, new MarvelMainFragment())
                        .commit();
                break;
        }
    }

    @Override
    public void onFragmentInteraction(int button) {
        switch (button) {
            case R.id.mathToQuestionButton:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.overview_container, new MathQuestionFragment())
                        .commit();
                break;
            case R.id.mathSummitButton:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.overview_container, new AnswerFragment())
                        .commit();
                break;
            case R.id.finishButton:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
        }
    }
}
