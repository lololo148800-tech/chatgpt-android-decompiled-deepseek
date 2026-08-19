package p970qk;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1110xk.AbstractC21295r;

/* JADX INFO: renamed from: qk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18759b extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    public final List f59648a;

    /* JADX INFO: renamed from: b */
    public final TextBasedComponentStyle f59649b;

    public C18759b(Context context, int i10, List list, TextBasedComponentStyle textBasedComponentStyle) {
        super(context, i10, list);
        this.f59648a = list;
        this.f59649b = textBasedComponentStyle;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new C18758a(this);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup parent) {
        AbstractC16544l.m18094g(parent, "parent");
        View view2 = super.getView(i10, view, parent);
        AbstractC16544l.m18093f(view2, "getView(...)");
        TextBasedComponentStyle textBasedComponentStyle = this.f59649b;
        if (textBasedComponentStyle != null) {
            TextView textView = view2 instanceof TextView ? (TextView) view2 : null;
            if (textView != null) {
                AbstractC21295r.m21637c(textView, textBasedComponentStyle);
            }
        }
        return view2;
    }
}
