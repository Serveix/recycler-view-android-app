package com.mistareastecmi.eli.recycleviewappp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mistareastecmi.eli.recycleviewappp.models.User;
import java.util.List;
import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolderUsers>{

    List<User> usersList;

    public UserAdapter(ArrayList<User> usersList) {
        this.usersList = usersList;
    }

    @Override
    public ViewHolderUsers onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,null,false);
        return new ViewHolderUsers(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderUsers holder, int position) {
        holder.AUName.setText(usersList.get(position).getName());
        holder.AULastName.setText(usersList.get(position).getLastName());
        holder.AUAge.setText(usersList.get(position).getAge());
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public class ViewHolderUsers extends RecyclerView.ViewHolder {

        TextView AUName, AULastName, AUAge;

        public ViewHolderUsers(View itemView) {
            super(itemView);
            AUName = itemView.findViewById(R.id.idName);
            AULastName = itemView.findViewById(R.id.idLastName);
            AUAge = itemView.findViewById(R.id.idAge);
        }
    }
}