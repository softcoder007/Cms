package com.example.cms.adepter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cms.R;
import com.example.cms.models.Contact;

import java.util.List;

public class RecyclerAdepter extends RecyclerView.Adapter<RecyclerAdepter.MyviewHolder> {
    Context context;
    List<Contact> ContactsList;


    public RecyclerAdepter(Context context, List<Contact> Contacts) {
        this.context = context;
        this.ContactsList = Contacts;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_contact,viewGroup,false);
        MyviewHolder myviewHolder = new MyviewHolder(v);
        return myviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int i) {
        holder.name.setText(ContactsList.get(i).getName());
        holder.phone.setText(ContactsList.get(i).getPhn());
        holder.image.setImageResource(ContactsList.get(i).getPhoto());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyviewHolder extends RecyclerView.ViewHolder {
        TextView name,phone;
        ImageView image;
        public MyviewHolder(View itemView) {
            super(itemView);
            name  = (TextView) itemView.findViewById(R.id.name_contact);
            phone = (TextView)itemView.findViewById(R.id.ph_number);
            image = (ImageView)itemView.findViewById(R.id.img);
        }

    }
}
