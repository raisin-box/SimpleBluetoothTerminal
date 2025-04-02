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
                "S: Go to sonar mode",
                "L: Go to line following mode",
                "N: Go to manual mode",
                "M: Go to SD card reading state",
                "I: Increase which event we look at stored at in SD card", 
                "D: Decrease which even we look at stored in SD card", 
                "E: Sets robot to idle mode (stops all operation)",
                "Events in the SD card are stored in chronological order from the last sequence of operation",
                "For example, if the first thing that happens is a perimeter detection",
                "The first event you should see stored in the SD card is a log of a perimeter detection"
        );

        CommandsAdapter adapter = new CommandsAdapter(commands);
        recyclerView.setAdapter(adapter);

        return view;

    }

}
