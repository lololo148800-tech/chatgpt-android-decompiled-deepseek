package p080D0;

import com.google.protobuf.AbstractC12107L1;
import p204I1.C3578I;

/* JADX INFO: renamed from: D0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1820o {

    /* JADX INFO: renamed from: a */
    public final long f5235a;

    /* JADX INFO: renamed from: b */
    public final int f5236b;

    /* JADX INFO: renamed from: c */
    public final int f5237c;

    /* JADX INFO: renamed from: d */
    public final int f5238d;

    /* JADX INFO: renamed from: e */
    public final int f5239e;

    /* JADX INFO: renamed from: f */
    public final C3578I f5240f;

    public C1820o(long j10, int i10, int i11, int i12, int i13, C3578I c3578i) {
        this.f5235a = j10;
        this.f5236b = i10;
        this.f5237c = i11;
        this.f5238d = i12;
        this.f5239e = i13;
        this.f5240f = c3578i;
    }

    /* JADX INFO: renamed from: a */
    public final C1822p m2646a(int i10) {
        return new C1822p(AbstractC1807h0.m2606A(this.f5240f, i10), i10, this.f5235a);
    }

    /* JADX INFO: renamed from: b */
    public final int m2647b() {
        int i10 = this.f5237c;
        int i11 = this.f5238d;
        if (i10 < i11) {
            return 2;
        }
        return i10 > i11 ? 1 : 3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionInfo(id=");
        sb2.append(this.f5235a);
        sb2.append(", range=(");
        int i10 = this.f5237c;
        sb2.append(i10);
        sb2.append('-');
        C3578I c3578i = this.f5240f;
        sb2.append(AbstractC1807h0.m2606A(c3578i, i10));
        sb2.append(',');
        int i11 = this.f5238d;
        sb2.append(i11);
        sb2.append('-');
        sb2.append(AbstractC1807h0.m2606A(c3578i, i11));
        sb2.append("), prevOffset=");
        return AbstractC12107L1.m13826q(sb2, this.f5239e, ')');
    }
}
