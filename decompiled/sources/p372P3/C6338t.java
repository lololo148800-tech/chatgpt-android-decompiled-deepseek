package p372P3;

import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p418R3.C6800b;
import p418R3.C6803e;
import p658b5.C11234e;

/* JADX INFO: renamed from: P3.t */
/* JADX INFO: loaded from: classes.dex */
public class C6338t implements InterfaceC6310B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20562a;

    /* JADX INFO: renamed from: b */
    public final long f20563b;

    /* JADX INFO: renamed from: c */
    public final Object f20564c;

    public /* synthetic */ C6338t(Object obj, long j10, int i10) {
        this.f20562a = i10;
        this.f20564c = obj;
        this.f20563b = j10;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: d */
    public final boolean mo6853d() {
        switch (this.f20562a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: j */
    public final C6309A mo6854j(long j10) {
        switch (this.f20562a) {
            case 0:
                C6339u c6339u = (C6339u) this.f20564c;
                AbstractC20800b.m21321i(c6339u.f20575k);
                C11234e c11234e = c6339u.f20575k;
                long[] jArr = (long[]) c11234e.f34001Z;
                int iM21404e = AbstractC20817s.m21404e(jArr, AbstractC20817s.m21409j((((long) c6339u.f20569e) * j10) / 1000000, 0L, c6339u.f20574j - 1), false);
                long j11 = iM21404e == -1 ? 0L : jArr[iM21404e];
                long[] jArr2 = (long[]) c11234e.f34002o0;
                long j12 = iM21404e != -1 ? jArr2[iM21404e] : 0L;
                int i10 = c6339u.f20569e;
                long j13 = (j11 * 1000000) / ((long) i10);
                long j14 = this.f20563b;
                C6311C c6311c = new C6311C(j13, j12 + j14);
                if (j13 == j10 || iM21404e == jArr.length - 1) {
                    return new C6309A(c6311c, c6311c);
                }
                int i11 = iM21404e + 1;
                return new C6309A(c6311c, new C6311C((jArr[i11] * 1000000) / ((long) i10), j14 + jArr2[i11]));
            case 1:
                return (C6309A) this.f20564c;
            default:
                C6800b c6800b = (C6800b) this.f20564c;
                C6309A c6309aM7237b = c6800b.f21817i[0].m7237b(j10);
                int i12 = 1;
                while (true) {
                    C6803e[] c6803eArr = c6800b.f21817i;
                    if (i12 >= c6803eArr.length) {
                        return c6309aM7237b;
                    }
                    C6309A c6309aM7237b2 = c6803eArr[i12].m7237b(j10);
                    if (c6309aM7237b2.f20441a.f20445b < c6309aM7237b.f20441a.f20445b) {
                        c6309aM7237b = c6309aM7237b2;
                    }
                    i12++;
                }
                break;
        }
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: l */
    public final long mo4938l() {
        switch (this.f20562a) {
            case 0:
                return ((C6339u) this.f20564c).m6954b();
            case 1:
                return this.f20563b;
            default:
                return this.f20563b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6338t(long j10) {
        this(j10, 0L);
        this.f20562a = 1;
    }

    public C6338t(long j10, long j11) {
        this.f20562a = 1;
        this.f20563b = j10;
        C6311C c6311c = j11 == 0 ? C6311C.f20443c : new C6311C(0L, j11);
        this.f20564c = new C6309A(c6311c, c6311c);
    }
}
