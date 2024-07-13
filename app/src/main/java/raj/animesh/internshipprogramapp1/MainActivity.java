package raj.animesh.internshipprogramapp1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.LabelVisibilityMode;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

import raj.animesh.internshipprogramapp1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<listType> arrayList;
    MyAdapter myAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.refinedOpenMain.setOnClickListener(v -> {
                startActivity(new Intent(this, RefineActivity.class));
                finish();
        });

        recyclerView = binding.reyclerViewMain;

        // ArrayList
        arrayList = new ArrayList<>();
        // Add default data just for reference
        addData();

        // setting adapter
        myAdapter = new MyAdapter(arrayList, this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);

    }

    private void addData() {

        // default data just for reference

        listType l1 = new listType("Animesh Raj","AR","Delhi | Student","Within: 17.9 KM", "🍵 Coffee | 💼 Business | 🫂 Friendship ", "Currerntly, I'm in my homwtown on summer break " , 10 , 0);
        listType l2 = new listType("Priyanshu Raj", "PR","Delhi | Student","Within: 17.9 KM", "🍵 Coffee | 💼 Business | 🫂 Friendship ", "Hi community! I an open to new connections ''😊'' " , 80 ,0);
        listType l3 = new listType("Riddhi Jain", "RJ ","Delhi | Student","Within: 17.9 KM", "🍵 Coffee | 💼 Business | 🫂 Friendship ", "Currerntly, I'm in my homwtown on summer break " , 58 , 0);
        listType l4 = new listType("Dhanjit Raj Gupta", "DG","Patiala | Student","Within: 19.3 KM", "🍵 Coffee | 💼 Business | 🫂 Friendship ", "Hi community! I an open to new connections ''😊'' " , 24 , 0);
        listType l5 = new listType("Kriti Katwal", "KK","Biratnagar | High School Student","Within: 20.8 KM", "🍵 Coffee | 💼 Business | 🫂 Friendship ", "Hi community! I an open to new connections ''😊'' " , 18 , 0);
        listType l6 = new listType("Aditya Poddar", "AP","Forbesganj | Student","Within: 24.4 KM", "🍵 Coffee | 💼 Business | 🫂 Friendship ", "Hi community! I an open to new connections ''😊'' " , 18 , 0);
        listType l7 = new listType("Gaurav Kumar", "GK","Maranga | Student","Within: 56.0 KM", "🍵 Coffee | 💼 Business | 🫂 Friendship ", "Hi community! I an open to new connections ''😊'' " , 50 , 0);

        arrayList.add(l1);
        arrayList.add(l2);
        arrayList.add(l3);
        arrayList.add(l4);
        arrayList.add(l5);
        arrayList.add(l6);
        arrayList.add(l7);
        arrayList.add(l1);
        arrayList.add(l2);
        arrayList.add(l3);
        arrayList.add(l4);
        arrayList.add(l5);
        arrayList.add(l6);
        arrayList.add(l7);
        arrayList.add(l1);
        arrayList.add(l2);
        arrayList.add(l3);
        arrayList.add(l4);
        arrayList.add(l5);
        arrayList.add(l6);
        arrayList.add(l7);
        arrayList.add(l1);
        arrayList.add(l2);
        arrayList.add(l3);
        arrayList.add(l4);
        arrayList.add(l5);
        arrayList.add(l6);
        arrayList.add(l7);

    }
}