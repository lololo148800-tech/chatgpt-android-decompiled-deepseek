package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p084D4.AbstractC1898W;

/* JADX INFO: renamed from: com.google.android.material.datepicker.j */
/* JADX INFO: loaded from: classes.dex */
public final class C12045j extends AbstractC1898W {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C12048m f36571a;

    public C12045j(C12048m c12048m) {
        this.f36571a = c12048m;
        AbstractC12060y.m13640c(null);
        AbstractC12060y.m13640c(null);
    }

    @Override // p084D4.AbstractC1898W
    /* JADX INFO: renamed from: b */
    public final void mo2916b(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof C12035A) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f36571a.getClass();
            throw null;
        }
    }
}
