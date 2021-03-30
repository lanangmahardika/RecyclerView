package com.example.tugasrecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private ArrayList<Mahasiswa> listMahasiswa;

    public MahasiswaAdapter(ArrayList<Mahasiswa> listMahasiswa) {
        this.listMahasiswa = listMahasiswa;
    }

    @NonNull
    @Override
    public MahasiswaAdapter.MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaAdapter.MahasiswaViewHolder holder, int position) {
        holder.tvNama.setText(listMahasiswa.get(position).getNama());
        holder.tvNIM.setText(listMahasiswa.get(position).getNim());
        holder.tvKelas.setText(listMahasiswa.get(position).getKelas());

    }

    @Override
    public int getItemCount() {
        return (listMahasiswa!=null) ? listMahasiswa.size() : 0 ;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{

        private TextView tvNama, tvNIM, tvKelas;

        public MahasiswaViewHolder (View view){
            super(view);
            tvNama = view.findViewById(R.id.tv_nama);
            tvNIM = view.findViewById(R.id.tv_nim);
            tvKelas= view.findViewById(R.id.tv_kelas);

        }
    }
}
