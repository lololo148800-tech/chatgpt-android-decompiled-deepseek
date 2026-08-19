package p084D4;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: D4.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1939s0 extends AbstractC1905b0 {

    /* JADX INFO: renamed from: a */
    public boolean f5726a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1890N f5727b;

    public C1939s0(C1890N c1890n) {
        this.f5727b = c1890n;
    }

    @Override // p084D4.AbstractC1905b0
    /* JADX INFO: renamed from: a */
    public final void mo3014a(RecyclerView recyclerView, int i10) {
        if (i10 == 0 && this.f5726a) {
            this.f5726a = false;
            this.f5727b.m2897f();
        }
    }

    @Override // p084D4.AbstractC1905b0
    /* JADX INFO: renamed from: b */
    public final void mo3015b(RecyclerView recyclerView, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f5726a = true;
    }
}
