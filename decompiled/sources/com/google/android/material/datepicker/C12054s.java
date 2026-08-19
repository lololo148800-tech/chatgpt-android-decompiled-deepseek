package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: com.google.android.material.datepicker.s */
/* JADX INFO: loaded from: classes.dex */
public final class C12054s implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ MaterialCalendarGridView f36626Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C12056u f36627Z;

    public C12054s(C12056u c12056u, MaterialCalendarGridView materialCalendarGridView) {
        this.f36627Z = c12056u;
        this.f36626Y = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        MaterialCalendarGridView materialCalendarGridView = this.f36626Y;
        C12053r c12053rM13625a = materialCalendarGridView.m13625a();
        if (i10 < c12053rM13625a.m13635a() || i10 > c12053rM13625a.m13637c()) {
            return;
        }
        if (materialCalendarGridView.m13625a().getItem(i10).longValue() >= ((C12048m) this.f36627Z.f36631e.f29409Y).f36578j1.f36554o0.f36561Y) {
            throw null;
        }
    }
}
