package com.google.android.material.datepicker;

import android.view.View;
import p030B2.C0794y0;
import p030B2.InterfaceC0783t;

/* JADX INFO: renamed from: com.google.android.material.datepicker.n */
/* JADX INFO: loaded from: classes.dex */
public final class C12049n implements InterfaceC0783t {

    /* JADX INFO: renamed from: Y */
    public final View f36588Y;

    /* JADX INFO: renamed from: Z */
    public int f36589Z;

    /* JADX INFO: renamed from: o0 */
    public int f36590o0;

    public C12049n(View view) {
        this.f36588Y = view;
    }

    @Override // p030B2.InterfaceC0783t
    /* JADX INFO: renamed from: l */
    public C0794y0 mo1773l(View view, C0794y0 c0794y0) {
        int i10 = c0794y0.f2209a.mo1754f(7).f60087b;
        View view2 = this.f36588Y;
        int i11 = this.f36589Z;
        if (i11 >= 0) {
            view2.getLayoutParams().height = i11 + i10;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f36590o0 + i10, view2.getPaddingRight(), view2.getPaddingBottom());
        return c0794y0;
    }

    public C12049n(View view, int i10, int i11) {
        this.f36589Z = i10;
        this.f36588Y = view;
        this.f36590o0 = i11;
    }
}
