package home.stanislavpoliakov.meet7_practice;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Класс фабрики для ViewHolder типа данных IMAGE_AND_TEXT
 */
public class ImageAndTextViewHolderFactory implements ViewHolderFactory {

    @Override
    public RecyclerView.ViewHolder createViewHolder(ViewGroup parent, LayoutInflater inflater) {
        View itemView = inflater.inflate(R.layout.image_and_text, parent, false);
        return new MyAdapter.ImageAndTextViewHolder(itemView);
    }
}
