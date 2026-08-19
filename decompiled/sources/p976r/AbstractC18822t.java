package p976r;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: r.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18822t implements InterfaceC18800B, InterfaceC18826x, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: Y */
    public Rect f59911Y;

    /* JADX INFO: renamed from: m */
    public static int m20140m(ListAdapter listAdapter, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m20141u(MenuC18814l menuC18814l) {
        int size = menuC18814l.f59850f.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = menuC18814l.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: d */
    public final boolean mo20115d(C18816n c18816n) {
        return false;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: j */
    public final boolean mo20116j(C18816n c18816n) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo20090l(MenuC18814l menuC18814l);

    /* JADX INFO: renamed from: n */
    public abstract void mo20091n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo20092o(boolean z6);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C18811i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C18811i) listAdapter).f59838a.m20128q((MenuItem) listAdapter.getItem(i10), this, !(this instanceof ViewOnKeyListenerC18808f) ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo20093p(int i10);

    /* JADX INFO: renamed from: q */
    public abstract void mo20094q(int i10);

    /* JADX INFO: renamed from: r */
    public abstract void mo20095r(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: s */
    public abstract void mo20096s(boolean z6);

    /* JADX INFO: renamed from: t */
    public abstract void mo20097t(int i10);

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: k */
    public final void mo20117k(Context context, MenuC18814l menuC18814l) {
    }
}
