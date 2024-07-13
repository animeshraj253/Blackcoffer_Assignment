package raj.animesh.internshipprogramapp1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import raj.animesh.internshipprogramapp1.databinding.RecyclerviewEachItemsBinding;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private ArrayList<listType> arrayList;
    private Context context;

    public MyAdapter(ArrayList<listType> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerviewEachItemsBinding binding = RecyclerviewEachItemsBinding.inflate(
                                LayoutInflater.from(context),
                                    parent,
                                false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        listType listType = arrayList.get(position);

        holder.recyclerviewEachItemsBinding.nameTXT.setText(listType.getName());

        holder.recyclerviewEachItemsBinding.locationTXT.setText(listType.getLocation());

        holder.recyclerviewEachItemsBinding.distanceTXT.setText(listType.getDistance());

        holder.recyclerviewEachItemsBinding.progressBar.setProgress(listType.getProgress());
        holder.recyclerviewEachItemsBinding.profileScoreTXT.setText("Profile Score - " + listType.getProgress() + " %");

        holder.recyclerviewEachItemsBinding.activityTXT.setText(listType.getActivity());

        holder.recyclerviewEachItemsBinding.statusTxt.setText(listType.getStatus());

        if ( listType.getImage() != 0){
            holder.recyclerviewEachItemsBinding.profileImageItem.setImageResource(listType.getImage());
            holder.recyclerviewEachItemsBinding.cardNameTxt.setVisibility(View.INVISIBLE);
        }else {
            holder.recyclerviewEachItemsBinding.cardNameTxt.setText(listType.getCardName());
            holder.recyclerviewEachItemsBinding.profileImageItem.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        RecyclerviewEachItemsBinding recyclerviewEachItemsBinding;

        public MyViewHolder(RecyclerviewEachItemsBinding recyclerviewEachItemsBinding){
            super(recyclerviewEachItemsBinding.getRoot());
            this.recyclerviewEachItemsBinding = recyclerviewEachItemsBinding;
        }
    }
}
