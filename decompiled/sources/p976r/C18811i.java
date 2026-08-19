package p976r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: r.i */
/* JADX INFO: loaded from: classes.dex */
public final class C18811i extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final MenuC18814l f59838a;

    /* JADX INFO: renamed from: b */
    public int f59839b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f59840c;

    /* JADX INFO: renamed from: d */
    public final boolean f59841d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f59842e;

    /* JADX INFO: renamed from: f */
    public final int f59843f;

    public C18811i(MenuC18814l menuC18814l, LayoutInflater layoutInflater, boolean z6, int i10) {
        this.f59841d = z6;
        this.f59842e = layoutInflater;
        this.f59838a = menuC18814l;
        this.f59843f = i10;
        m20118a();
    }

    /* JADX INFO: renamed from: a */
    public final void m20118a() {
        MenuC18814l menuC18814l = this.f59838a;
        C18816n c18816n = menuC18814l.f59866v;
        if (c18816n != null) {
            menuC18814l.m20125i();
            ArrayList arrayList = menuC18814l.f59854j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((C18816n) arrayList.get(i10)) == c18816n) {
                    this.f59839b = i10;
                    return;
                }
            }
        }
        this.f59839b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C18816n getItem(int i10) {
        ArrayList arrayListM20126l;
        MenuC18814l menuC18814l = this.f59838a;
        if (this.f59841d) {
            menuC18814l.m20125i();
            arrayListM20126l = menuC18814l.f59854j;
        } else {
            arrayListM20126l = menuC18814l.m20126l();
        }
        int i11 = this.f59839b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (C18816n) arrayListM20126l.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM20126l;
        MenuC18814l menuC18814l = this.f59838a;
        if (this.f59841d) {
            menuC18814l.m20125i();
            arrayListM20126l = menuC18814l.f59854j;
        } else {
            arrayListM20126l = menuC18814l.m20126l();
        }
        return this.f59839b < 0 ? arrayListM20126l.size() : arrayListM20126l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z6 = false;
        if (view == null) {
            view = this.f59842e.inflate(this.f59843f, viewGroup, false);
        }
        int i11 = getItem(i10).f59876b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f59876b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f59838a.mo20103m() && i11 != i13) {
            z6 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z6);
        InterfaceC18827y interfaceC18827y = (InterfaceC18827y) view;
        if (this.f59840c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC18827y.mo11126c(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m20118a();
        super.notifyDataSetChanged();
    }
}
