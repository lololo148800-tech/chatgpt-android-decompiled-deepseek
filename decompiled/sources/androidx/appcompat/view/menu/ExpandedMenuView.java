package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p658b5.C11242m;
import p976r.C18816n;
import p976r.InterfaceC18813k;
import p976r.InterfaceC18828z;
import p976r.MenuC18814l;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC18813k, InterfaceC18828z, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: p0 */
    public static final int[] f32155p0 = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: o0 */
    public MenuC18814l f32156o0;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C11242m c11242mM12599G = C11242m.m12599G(context, attributeSet, f32155p0, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c11242mM12599G.f34019Z;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c11242mM12599G.m12601B(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c11242mM12599G.m12601B(1));
        }
        c11242mM12599G.m12606H();
    }

    @Override // p976r.InterfaceC18813k
    /* JADX INFO: renamed from: a */
    public final boolean mo11129a(C18816n c18816n) {
        return this.f32156o0.m20128q(c18816n, null, 0);
    }

    @Override // p976r.InterfaceC18828z
    /* JADX INFO: renamed from: b */
    public final void mo11130b(MenuC18814l menuC18814l) {
        this.f32156o0 = menuC18814l;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        mo11129a((C18816n) getAdapter().getItem(i10));
    }
}
