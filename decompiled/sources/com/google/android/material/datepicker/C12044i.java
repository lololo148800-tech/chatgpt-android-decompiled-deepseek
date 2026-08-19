package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p084D4.C1925l0;

/* JADX INFO: renamed from: com.google.android.material.datepicker.i */
/* JADX INFO: loaded from: classes.dex */
public final class C12044i extends LinearLayoutManager {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f36569E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C12048m f36570F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12044i(C12048m c12048m, int i10, int i11) {
        super(i10);
        this.f36570F = c12048m;
        this.f36569E = i11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: w0 */
    public final void mo2987w0(RecyclerView recyclerView, int i10) {
        C12058w c12058w = new C12058w(recyclerView.getContext());
        c12058w.f5500a = i10;
        m2989x0(c12058w);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: z0 */
    public final void mo12242z0(C1925l0 c1925l0, int[] iArr) {
        int i10 = this.f36569E;
        C12048m c12048m = this.f36570F;
        if (i10 == 0) {
            iArr[0] = c12048m.f36583o1.getWidth();
            iArr[1] = c12048m.f36583o1.getWidth();
        } else {
            iArr[0] = c12048m.f36583o1.getHeight();
            iArr[1] = c12048m.f36583o1.getHeight();
        }
    }
}
