package p970qk;

import android.widget.Filter;
import java.util.List;

/* JADX INFO: renamed from: qk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18758a extends Filter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C18759b f59647a;

    public C18758a(C18759b c18759b) {
        this.f59647a = c18759b;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        List list = this.f59647a.f59648a;
        filterResults.values = list;
        filterResults.count = list.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        this.f59647a.notifyDataSetChanged();
    }
}
