package com.example.kuis;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnggotaAdapter extends RecyclerView.Adapter<AnggotaAdapter.AanggotaViewHolder> {
    private ArrayList<Anggota> dataList;

    public AnggotaAdapter(ArrayList<Anggota> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public AnggotaAdapter.AanggotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.anggota, parent, false);
        return new AanggotaViewHolder(view);
    }

    public void onBindViewHolder(AanggotaViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNim.setText(dataList.get(position).getStatus());
        holder.srcGambar.setImageDrawable(dataList.get(position).getGambar());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class AanggotaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNim, txtAngkatan;
        private ImageView srcGambar;


        public AanggotaViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.tv_nama);
            txtNim = (TextView) itemView.findViewById(R.id. tv_status);
            srcGambar = (ImageView) itemView.findViewById(R.id.gambar);

        }
    }

}
