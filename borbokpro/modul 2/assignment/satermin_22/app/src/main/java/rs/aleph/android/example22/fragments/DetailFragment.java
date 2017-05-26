package rs.aleph.android.example22.fragments;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

import rs.aleph.android.example22.R;
import rs.aleph.android.example22.model.Category;
import rs.aleph.android.example22.model.Product;
import rs.aleph.android.example22.provider.CategoryProvider;
import rs.aleph.android.example22.provider.ProductProvider;

public class DetailFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private static int NOTIFICATION_ID = 1;

    private Product product = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (product == null) { product = ProductProvider.getProductById(0); }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null) {
            product = new Product();
            product.setId(savedInstanceState.getInt("id"));
            product.setName(savedInstanceState.getString("name"));
            product.setDescription(savedInstanceState.getString("description"));
            product.setRating(savedInstanceState.getFloat("rating"));
            int categoryId = savedInstanceState.getInt("category_id");
            Category category = CategoryProvider.getCategoryById(categoryId);
            product.setCategory(category);
            product.setImage(savedInstanceState.getString("image"));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        if (savedInstanceState != null) {
            savedInstanceState.putInt("id", product.getId());
            savedInstanceState.putString("name", product.getName());
            savedInstanceState.putString("description", product.getDescription());
            savedInstanceState.putFloat("rating", product.getRating());
            savedInstanceState.putInt("category_id", product.getCategory().getId());
            savedInstanceState.putString("image", product.getImage());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.v("DetailFragment", "onCreateView()");

        View view = inflater.inflate(R.layout.detail_fragment, container, false);

        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(product.getName());

        TextView description = (TextView) view.findViewById(R.id.description);
        description.setText(product.getDescription());

        RatingBar ratingBar = (RatingBar) view.findViewById(R.id.rating);
        ratingBar.setRating(product.getRating());

        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        InputStream is = null;
        try {
            is = getActivity().getAssets().open(product.getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            imageView.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Spinner category = (Spinner) view.findViewById(R.id.category);
        String[] categories = getActivity().getResources().getStringArray(R.array.category_names);
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, categories);
        category.setAdapter(adapter);
        category.setSelection(product.getCategory().getId());

        return view;
    }

    public void setProduct(int id) {
        product = ProductProvider.getProductById(id);
    }

    public void updateProduct(int id) {
        product = ProductProvider.getProductById(id);

        TextView name = (TextView) getActivity().findViewById(R.id.name);
        name.setText(product.getName());

        TextView description = (TextView) getActivity().findViewById(R.id.description);
        description.setText(product.getDescription());

        RatingBar ratingBar = (RatingBar) getActivity().findViewById(R.id.rating);
        ratingBar.setRating(product.getRating());

        ImageView imageView = (ImageView) getActivity().findViewById(R.id.image);
        InputStream is = null;
        try {
            is = getActivity().getAssets().open(product.getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            imageView.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Spinner category = (Spinner) getActivity().findViewById(R.id.category);
        category.setSelection(product.getCategory().getId());
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        // You can retrieve the selected item using
        //product.setCategory(CategoryProvider.getCategoryById((int)id));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //product.setCategory(null);
    }
}
