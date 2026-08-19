package p305M3;

import java.util.Arrays;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: M3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5285e {

    /* JADX INFO: renamed from: c */
    public int f17405c;

    /* JADX INFO: renamed from: d */
    public int f17406d;

    /* JADX INFO: renamed from: a */
    public final boolean f17403a = true;

    /* JADX INFO: renamed from: b */
    public final int f17404b = 65536;

    /* JADX INFO: renamed from: e */
    public int f17407e = 0;

    /* JADX INFO: renamed from: f */
    public C5281a[] f17408f = new C5281a[100];

    /* JADX INFO: renamed from: a */
    public final synchronized void m5823a(int i10) {
        boolean z6 = i10 < this.f17405c;
        this.f17405c = i10;
        if (z6) {
            m5824b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5824b() {
        int iMax = Math.max(0, AbstractC20817s.m21405f(this.f17405c, this.f17404b) - this.f17406d);
        int i10 = this.f17407e;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill(this.f17408f, iMax, i10, (Object) null);
        this.f17407e = iMax;
    }
}
