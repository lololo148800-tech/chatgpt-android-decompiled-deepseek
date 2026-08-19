package p758g0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p414R.C6773g;
import p692d0.C12981t;
import p692d0.C12982u;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: g0.O */
/* JADX INFO: loaded from: classes.dex */
public final class C13739O implements InterfaceC13797y {

    /* JADX INFO: renamed from: a */
    public final C13738N f43328a;

    public C13739O(C13738N c13738n) {
        this.f43328a = c13738n;
    }

    @Override // p758g0.InterfaceC13797y, p758g0.InterfaceC13772l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C6773g mo15214a(C13783q0 c13783q0) {
        int[] iArr;
        Object[] objArr;
        int i10;
        C13738N c13738n = this.f43328a;
        C12982u c12982u = c13738n.f43327b;
        C12981t c12981t = new C12981t(c12982u.f41208e + 2);
        C12982u c12982u2 = new C12982u(c12982u.f41208e);
        int[] iArr2 = c12982u.f41205b;
        Object[] objArr2 = c12982u.f41206c;
        long[] jArr = c12982u.f41204a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr2[i15];
                            C13737M c13737m = (C13737M) objArr2[i15];
                            c12981t.m14684a(i16);
                            c12982u2.m14697i(i16, new C13793v0((AbstractC13784r) c13783q0.f43526a.invoke(c13737m.f43323a), c13737m.f43324b, c13737m.f43325c));
                            i10 = 8;
                        } else {
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!c12982u.m14690b(0)) {
            int i17 = c12981t.f41203b;
            if (i17 < 0) {
                throw new IndexOutOfBoundsException("Index 0 must be in 0.." + c12981t.f41203b);
            }
            c12981t.m14685b(i17 + 1);
            int[] iArr3 = c12981t.f41202a;
            int i18 = c12981t.f41203b;
            if (i18 != 0) {
                AbstractC17678l.m19303j(1, 0, i18, iArr3, iArr3);
            }
            iArr3[0] = 0;
            c12981t.f41203b++;
        }
        if (!c12982u.m14690b(c13738n.f43326a)) {
            c12981t.m14684a(c13738n.f43326a);
        }
        int i19 = c12981t.f41203b;
        if (i19 != 0) {
            int[] iArr4 = c12981t.f41202a;
            AbstractC16544l.m18094g(iArr4, "<this>");
            Arrays.sort(iArr4, 0, i19);
        }
        return new C6773g(c12981t, c12982u2, c13738n.f43326a, AbstractC13725A.f43291d);
    }
}
