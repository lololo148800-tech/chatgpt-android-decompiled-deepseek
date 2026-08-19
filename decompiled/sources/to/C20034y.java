package to;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: to.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C20034y {

    /* JADX INFO: renamed from: a */
    public int f63452a;

    /* JADX INFO: renamed from: b */
    public final int[] f63453b = new int[10];

    /* JADX INFO: renamed from: a */
    public final int m20855a() {
        if ((this.f63452a & 128) != 0) {
            return this.f63453b[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: b */
    public final void m20856b(C20034y other) {
        AbstractC16544l.m18094g(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (((1 << i10) & other.f63452a) != 0) {
                m20857c(i10, other.f63453b[i10]);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20857c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f63453b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f63452a = (1 << i10) | this.f63452a;
            iArr[i10] = i11;
        }
    }
}
