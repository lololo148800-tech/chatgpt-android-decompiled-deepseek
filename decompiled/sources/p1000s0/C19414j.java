package p1000s0;

import java.util.List;
import p1095x1.AbstractC21069X;
import p492U1.EnumC7546k;
import p635a1.C10450h;
import p635a1.InterfaceC10445c;
import p860l0.EnumC16673F0;

/* JADX INFO: renamed from: s0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C19414j {

    /* JADX INFO: renamed from: a */
    public final int f61521a;

    /* JADX INFO: renamed from: b */
    public final int f61522b;

    /* JADX INFO: renamed from: c */
    public final List f61523c;

    /* JADX INFO: renamed from: d */
    public final long f61524d;

    /* JADX INFO: renamed from: e */
    public final Object f61525e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC10445c f61526f;

    /* JADX INFO: renamed from: g */
    public final C10450h f61527g;

    /* JADX INFO: renamed from: h */
    public final EnumC7546k f61528h;

    /* JADX INFO: renamed from: i */
    public final boolean f61529i;

    /* JADX INFO: renamed from: j */
    public final boolean f61530j;

    /* JADX INFO: renamed from: k */
    public final int f61531k;

    /* JADX INFO: renamed from: l */
    public final int[] f61532l;

    /* JADX INFO: renamed from: m */
    public int f61533m;

    /* JADX INFO: renamed from: n */
    public int f61534n;

    public C19414j(int i10, int i11, List list, long j10, Object obj, EnumC16673F0 enumC16673F0, InterfaceC10445c interfaceC10445c, C10450h c10450h, EnumC7546k enumC7546k, boolean z6) {
        this.f61521a = i10;
        this.f61522b = i11;
        this.f61523c = list;
        this.f61524d = j10;
        this.f61525e = obj;
        this.f61526f = interfaceC10445c;
        this.f61527g = c10450h;
        this.f61528h = enumC7546k;
        this.f61529i = z6;
        this.f61530j = enumC16673F0 == EnumC16673F0.f53401Y;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC21069X abstractC21069X = (AbstractC21069X) list.get(i12);
            iMax = Math.max(iMax, !this.f61530j ? abstractC21069X.f66982Z : abstractC21069X.f66981Y);
        }
        this.f61531k = iMax;
        this.f61532l = new int[this.f61523c.size() * 2];
        this.f61534n = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final void m20509a(int i10) {
        this.f61533m += i10;
        int[] iArr = this.f61532l;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z6 = this.f61530j;
            if ((z6 && i11 % 2 == 1) || (!z6 && i11 % 2 == 0)) {
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20510b(int i10, int i11, int i12) {
        int i13;
        this.f61533m = i10;
        boolean z6 = this.f61530j;
        this.f61534n = z6 ? i12 : i11;
        List list = this.f61523c;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            AbstractC21069X abstractC21069X = (AbstractC21069X) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f61532l;
            if (z6) {
                InterfaceC10445c interfaceC10445c = this.f61526f;
                if (interfaceC10445c == null) {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
                iArr[i15] = interfaceC10445c.mo10924a(abstractC21069X.f66981Y, i11, this.f61528h);
                iArr[i15 + 1] = i10;
                i13 = abstractC21069X.f66982Z;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                C10450h c10450h = this.f61527g;
                if (c10450h == null) {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
                iArr[i16] = c10450h.m10926a(abstractC21069X.f66982Z, i12);
                i13 = abstractC21069X.f66981Y;
            }
            i10 += i13;
        }
    }
}
