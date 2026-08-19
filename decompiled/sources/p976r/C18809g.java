package p976r;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.openai.chatgpt.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: r.g */
/* JADX INFO: loaded from: classes.dex */
public final class C18809g extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public int f59830a = -1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C18810h f59831b;

    public C18809g(C18810h c18810h) {
        this.f59831b = c18810h;
        m20113a();
    }

    /* JADX INFO: renamed from: a */
    public final void m20113a() {
        MenuC18814l menuC18814l = this.f59831b.f59834o0;
        C18816n c18816n = menuC18814l.f59866v;
        if (c18816n != null) {
            menuC18814l.m20125i();
            ArrayList arrayList = menuC18814l.f59854j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((C18816n) arrayList.get(i10)) == c18816n) {
                    this.f59830a = i10;
                    return;
                }
            }
        }
        this.f59830a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C18816n getItem(int i10) {
        C18810h c18810h = this.f59831b;
        MenuC18814l menuC18814l = c18810h.f59834o0;
        menuC18814l.m20125i();
        ArrayList arrayList = menuC18814l.f59854j;
        c18810h.getClass();
        int i11 = this.f59830a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (C18816n) arrayList.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C18810h c18810h = this.f59831b;
        MenuC18814l menuC18814l = c18810h.f59834o0;
        menuC18814l.m20125i();
        int size = menuC18814l.f59854j.size();
        c18810h.getClass();
        return this.f59830a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f59831b.f59833Z.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC18827y) view).mo11126c(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m20113a();
        super.notifyDataSetChanged();
    }
}
