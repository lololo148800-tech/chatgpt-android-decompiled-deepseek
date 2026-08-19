package p084D4;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: D4.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1948x extends AbstractC1905b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1876A f5766a;

    public C1948x(C1876A c1876a) {
        this.f5766a = c1876a;
    }

    @Override // p084D4.AbstractC1905b0
    /* JADX INFO: renamed from: b */
    public final void mo3015b(RecyclerView recyclerView, int i10, int i11) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C1876A c1876a = this.f5766a;
        int iComputeVerticalScrollRange = c1876a.f5443s.computeVerticalScrollRange();
        int i12 = c1876a.f5442r;
        int i13 = iComputeVerticalScrollRange - i12;
        int i14 = c1876a.f5425a;
        c1876a.f5444t = i13 > 0 && i12 >= i14;
        int iComputeHorizontalScrollRange = c1876a.f5443s.computeHorizontalScrollRange();
        int i15 = c1876a.f5441q;
        boolean z6 = iComputeHorizontalScrollRange - i15 > 0 && i15 >= i14;
        c1876a.f5445u = z6;
        boolean z10 = c1876a.f5444t;
        if (!z10 && !z6) {
            if (c1876a.f5446v != 0) {
                c1876a.m2857g(0);
                return;
            }
            return;
        }
        if (z10) {
            float f10 = i12;
            c1876a.f5436l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
            c1876a.f5435k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (c1876a.f5445u) {
            float f11 = iComputeHorizontalScrollOffset;
            float f12 = i15;
            c1876a.f5439o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
            c1876a.f5438n = Math.min(i15, (i15 * i15) / iComputeHorizontalScrollRange);
        }
        int i16 = c1876a.f5446v;
        if (i16 == 0 || i16 == 1) {
            c1876a.m2857g(1);
        }
    }
}
