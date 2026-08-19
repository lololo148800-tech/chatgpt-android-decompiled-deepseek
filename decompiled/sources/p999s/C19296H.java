package p999s;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: s.H */
/* JADX INFO: loaded from: classes.dex */
public final class C19296H implements ListAdapter, SpinnerAdapter {

    /* JADX INFO: renamed from: a */
    public SpinnerAdapter f61140a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f61141b;

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f61141b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f61140a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f61140a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i10, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        SpinnerAdapter spinnerAdapter = this.f61140a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i10);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        SpinnerAdapter spinnerAdapter = this.f61140a;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i10);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i10) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        return getDropDownView(i10, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f61140a;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i10) {
        ListAdapter listAdapter = this.f61141b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i10);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f61140a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f61140a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
