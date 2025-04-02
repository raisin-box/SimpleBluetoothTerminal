package de.kai_morich.simple_bluetooth_terminal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class CommandsFragment extends Fragment{

    public CommandsFragment () {
    //required empty public constructor
    }
    
    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_commands, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<String> commands = Arrays.asList(
                "S", "N", "I", "D", "E"
        );

        CommandsAdapter adapter = new CommandsAdapter(commands);
        recyclerView.setAdapter(adapter);

        return view;

    }

}
