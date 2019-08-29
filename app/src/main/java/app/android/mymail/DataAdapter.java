package app.android.mymail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MailViewHolder> {


    private ArrayList<Mail> dataList;

    public DataAdapter(ArrayList<Mail> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_layout, parent, false);
        return new MailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MailViewHolder holder, final int position) {
        holder.txtPengirim.setText(dataList.get(position).getPengirim());
        holder.txtJudul.setText(dataList.get(position).getTitle());
        holder.txtDesc.setText(dataList.get(position).getIsi());
        holder.txtJam.setText(dataList.get(position).getWaktu());
        holder.gambar.setImageResource(dataList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MailViewHolder extends RecyclerView.ViewHolder{
        private TextView txtPengirim, txtJudul , txtDesc , txtJam;
        private ImageView gambar;

        public MailViewHolder(View itemView) {
            super(itemView);
            txtPengirim = (TextView) itemView.findViewById(R.id.txtPengirim);
            txtJudul = (TextView) itemView.findViewById(R.id.txtJudul);
            txtDesc = (TextView) itemView.findViewById(R.id.txtDesc);
            txtJam = (TextView) itemView.findViewById(R.id.txtJam);
            gambar = (ImageView)itemView.findViewById(R.id.gambar);
        }
    }
}

