package de.kai_morich.simple_bluetooth_terminal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CommandsAdapter extends RecyclerView.Adapter<CommandsAdapter.ViewHolder> {
    private final List<String> commandList;

    public CommandsAdapter(List<String> commandList) {
        this.commandList = commandList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.commandText.setText(commandList.get(position));
    }

    @Override
    public int getItemCount() {
        return commandList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView commandText;

        ViewHolder(View itemView) {
            super(itemView);
            commandText = itemView.findViewById(android.R.id.text1);
        }
    }
}
