package p084D4;

import p720e6.C13288c;

/* JADX INFO: renamed from: D4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1916h {

    /* JADX INFO: renamed from: a */
    public final C13288c f5605a;

    /* JADX INFO: renamed from: b */
    public int f5606b = 0;

    /* JADX INFO: renamed from: c */
    public int f5607c = -1;

    /* JADX INFO: renamed from: d */
    public int f5608d = -1;

    /* JADX INFO: renamed from: e */
    public Object f5609e = null;

    public C1916h(C13288c c13288c) {
        this.f5605a = c13288c;
    }

    /* JADX INFO: renamed from: a */
    public final void m3041a() {
        int i10 = this.f5606b;
        if (i10 == 0) {
            return;
        }
        C13288c c13288c = this.f5605a;
        if (i10 == 1) {
            c13288c.m14920Z(this.f5607c, this.f5608d);
        } else if (i10 == 2) {
            c13288c.m14921a0(this.f5607c, this.f5608d);
        } else if (i10 == 3) {
            int i11 = this.f5607c;
            int i12 = this.f5608d;
            ((AbstractC1893Q) c13288c.f42001Y).f5529a.m2906d(i11, this.f5609e, i12);
        }
        this.f5609e = null;
        this.f5606b = 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m3042b(int i10, Object obj, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f5606b == 3 && i10 <= (i13 = this.f5608d + (i12 = this.f5607c)) && (i14 = i10 + i11) >= i12 && this.f5609e == obj) {
            this.f5607c = Math.min(i10, i12);
            this.f5608d = Math.max(i13, i14) - this.f5607c;
            return;
        }
        m3041a();
        this.f5607c = i10;
        this.f5608d = i11;
        this.f5609e = obj;
        this.f5606b = 3;
    }

    /* JADX INFO: renamed from: c */
    public final void m3043c(int i10, int i11) {
        m3041a();
        ((AbstractC1893Q) this.f5605a.f42001Y).f5529a.m2905c(i10, i11);
    }
}
