package nyc.aisleone.weatherapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.LinkedList;
import java.util.List;
import nyc.aisleone.weatherapp.Models.PeriodsItem;

class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder> {
  List<PeriodsItem> periodsItems;

  public ForecastAdapter(List<PeriodsItem> periodsItems) {
    this.periodsItems = periodsItems;
  }

  public class ForecastViewHolder extends RecyclerView.ViewHolder {

    TextView dateTimeISO;
    TextView maxTempF;
    TextView minTempF;

    public ForecastViewHolder(View itemView) {
      super(itemView);

      dateTimeISO = itemView.findViewById(R.id.item_fore_date);
      maxTempF = itemView.findViewById(R.id.item_fore_max);
      minTempF = itemView.findViewById(R.id.item_fore_min);
    }
  }

  @NonNull @Override
  public ForecastAdapter.ForecastViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
      int viewType) {
    LayoutInflater inflater = LayoutInflater.from(parent.getContext());
    View v = inflater.inflate(R.layout.forecast_item, parent, false);
    return new ForecastViewHolder(v);
  }

  @Override
  public void onBindViewHolder(@NonNull ForecastAdapter.ForecastViewHolder holder, int position) {

    String dateTimeISO = periodsItems.get(position).getDateTimeISO();
    Integer maxTempFarens = periodsItems.get(position).getMaxTempF();
    Integer minTempFarens = periodsItems.get(position).getMinTempF();


    holder.dateTimeISO.setText("current date: "+dateTimeISO);
    holder.maxTempF.setText("current date: "+maxTempFarens);
    holder.minTempF.setText("current date: "+minTempFarens);
  }

  @Override public int getItemCount() {
    return periodsItems.size();
  }
}

