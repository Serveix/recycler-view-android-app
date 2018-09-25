package com.mistareastecmi.eli.recycleviewappp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import com.mistareastecmi.eli.recycleviewappp.models.User;

public class MainActivity extends AppCompatActivity {

    ArrayList<User> usersList;
    RecyclerView usersRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usersList = new ArrayList<>();
        usersRecycler = findViewById(R.id.rv);
        usersRecycler.setLayoutManager(new LinearLayoutManager(this));

        fillUsers();
        UserAdapter adapter = new UserAdapter(usersList);
        usersRecycler.setAdapter(adapter);
    }

    private void fillUsers() {
        usersList.add(new User("Carlos", "Lopez", 19));
        usersList.add(new User("Serguei", "Brin", 32));
        usersList.add(new User("Sundar", "Pichai", 53));
        usersList.add(new User("Larry", "Page", 19));
    }
}
