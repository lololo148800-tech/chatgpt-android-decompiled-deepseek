package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import p084D4.AbstractC1900Y;

/* JADX INFO: renamed from: com.google.android.material.datepicker.h */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC12043h implements View.OnClickListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f36566Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C12056u f36567Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C12048m f36568o0;

    public /* synthetic */ ViewOnClickListenerC12043h(C12048m c12048m, C12056u c12056u, int i10) {
        this.f36566Y = i10;
        this.f36568o0 = c12048m;
        this.f36567Z = c12056u;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36566Y) {
            case 0:
                C12048m c12048m = this.f36568o0;
                int iM12226J0 = ((LinearLayoutManager) c12048m.f36583o1.getLayoutManager()).m12226J0() - 1;
                if (iM12226J0 >= 0) {
                    Calendar calendarM13638a = AbstractC12060y.m13638a(this.f36567Z.f36630d.f36552Y.f36614Y);
                    calendarM13638a.add(2, iM12226J0);
                    c12048m.m13626Q(new C12052q(calendarM13638a));
                }
                break;
            default:
                C12048m c12048m2 = this.f36568o0;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c12048m2.f36583o1.getLayoutManager();
                View viewM12228L0 = linearLayoutManager.m12228L0(0, linearLayoutManager.m2985v(), false);
                int iM2917F = (viewM12228L0 == null ? -1 : AbstractC1900Y.m2917F(viewM12228L0)) + 1;
                if (iM2917F < c12048m2.f36583o1.getAdapter().mo2898a()) {
                    Calendar calendarM13638a2 = AbstractC12060y.m13638a(this.f36567Z.f36630d.f36552Y.f36614Y);
                    calendarM13638a2.add(2, iM2917F);
                    c12048m2.m13626Q(new C12052q(calendarM13638a2));
                }
                break;
        }
    }
}
