package p977r0;

import androidx.compose.foundation.layout.AbstractC10842a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.C0295v;
import p013Ab.C0420b;
import p032B4.C0806a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21083f0;
import p153Fn.C2925c;
import p225Im.InterfaceC3771s;
import p349O0.C5996c0;
import p473T7.AbstractC7262c;
import p492U1.C7536a;
import p544W9.AbstractC8461D;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9388w4;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9567s;
import p774h1.InterfaceC14324B;
import p860l0.EnumC16673F0;
import p909nm.AbstractC17678l;
import p911o0.InterfaceC17763i0;
import p953q0.AbstractC18551I;
import p953q0.C18558P;
import p953q0.C18561T;

/* JADX INFO: renamed from: r0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C18841m extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C18852x f59981Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18847s f59982Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC3771s f59983o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC17763i0 f59984p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f59985q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ float f59986r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C2925c f59987s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC14324B f59988t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18841m(C18852x c18852x, C18847s c18847s, InterfaceC3771s interfaceC3771s, InterfaceC17763i0 interfaceC17763i0, boolean z6, float f10, C2925c c2925c, InterfaceC14324B interfaceC14324B) {
        super(2);
        this.f59981Y = c18852x;
        this.f59982Z = c18847s;
        this.f59983o0 = interfaceC3771s;
        this.f59984p0 = interfaceC17763i0;
        this.f59985q0 = z6;
        this.f59986r0 = f10;
        this.f59987s0 = c2925c;
        this.f59988t0 = interfaceC14324B;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18848t c18848t;
        boolean z6;
        int iM7715d;
        C18558P c18558p = (C18558P) obj;
        long j10 = ((C7536a) obj2).f23888a;
        C18852x c18852x = this.f59981Y;
        c18852x.f60061t.getValue();
        AbstractC8461D.m9084a(j10, EnumC16673F0.f53401Y);
        C18847s c18847s = this.f59982Z;
        if (c18847s.f60028d != null && C7536a.m7848c(c18847s.f60026b, j10) && c18847s.f60027c == c18558p.f59128Z.getDensity()) {
            C18848t c18848t2 = c18847s.f60028d;
            AbstractC16544l.m18091d(c18848t2);
            c18848t = c18848t2;
        } else {
            c18847s.f60026b = j10;
            c18847s.f60027c = c18558p.f59128Z.getDensity();
            C18848t c18848t3 = (C18848t) c18847s.f60025a.invoke(c18558p, new C7536a(j10));
            c18847s.f60028d = c18848t3;
            c18848t = c18848t3;
        }
        C18834f c18834f = (C18834f) this.f59983o0.invoke();
        c18558p.f59128Z.getLayoutDirection();
        boolean z10 = this.f59985q0;
        InterfaceC17763i0 interfaceC17763i0 = this.f59984p0;
        float fMo19473b = z10 ? interfaceC17763i0.mo19473b() : interfaceC17763i0.mo19475d();
        InterfaceC21083f0 interfaceC21083f0 = c18558p.f59128Z;
        int iMo7866k0 = interfaceC21083f0.mo7866k0(fMo19473b);
        interfaceC21083f0.getLayoutDirection();
        int iMo7866k1 = interfaceC21083f0.mo7866k0(z10 ? interfaceC17763i0.mo19475d() : interfaceC17763i0.mo19473b());
        int iMo7866k2 = interfaceC21083f0.mo7866k0(AbstractC10842a.m11228f(interfaceC17763i0, interfaceC21083f0.getLayoutDirection()));
        int iM7853h = (C7536a.m7853h(j10) - iMo7866k0) - iMo7866k1;
        long jM9631a = AbstractC9101A4.m9631a(iMo7866k2, iMo7866k0);
        int iMo7866k3 = interfaceC21083f0.mo7866k0(AbstractC10842a.m11227e(interfaceC17763i0, interfaceC21083f0.getLayoutDirection()) + AbstractC10842a.m11228f(interfaceC17763i0, interfaceC21083f0.getLayoutDirection()));
        int iMo7866k4 = interfaceC21083f0.mo7866k0(interfaceC17763i0.mo19473b() + interfaceC17763i0.mo19475d());
        List listM19926g = AbstractC18551I.m19926g(c18834f, c18852x.f60058q, c18852x.f60050i);
        long jM7847b = C7536a.m7847b(j10, AbstractC9388w4.m9965h(iMo7866k3, j10), 0, AbstractC9388w4.m9964g(iMo7866k4, j10), 0, 10);
        int iMo7866k5 = interfaceC21083f0.mo7866k0(this.f59986r0);
        C2925c c2925c = this.f59987s0;
        boolean z11 = this.f59985q0;
        C18852x c18852x2 = this.f59981Y;
        C18839k c18839k = new C18839k(c18852x2, listM19926g, c18834f, c18848t, jM7847b, true, c18558p, iM7853h, jM9631a, iMo7866k0, iMo7866k1, z11, iMo7866k5, c2925c, this.f59988t0);
        C0806a c0806a = c18852x2.f60042a;
        int[] iArr = (int[]) c0806a.f2237c;
        Object obj3 = c0806a.f2241g;
        Integer numM19319z = AbstractC17678l.m19319z(iArr, 0);
        int iM19928i = AbstractC18551I.m19928i(numM19319z != null ? numM19319z.intValue() : 0, obj3, c18834f);
        if (!AbstractC17678l.m19300g(iArr, iM19928i)) {
            ((C18561T) c0806a.f2242h).m19939c(iM19928i);
            AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
            InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
            AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
            try {
                iArr = (int[]) ((C0295v) c0806a.f2236b).invoke(Integer.valueOf(iM19928i), Integer.valueOf(iArr.length));
                AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
                c0806a.f2237c = iArr;
                ((C5996c0) c0806a.f2238d).m6413h(C0806a.m1840c(iArr));
            } catch (Throwable th2) {
                AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
                throw th2;
            }
        }
        int[] iArr2 = (int[]) c0806a.f2239e;
        int length = iArr.length;
        int i10 = c18839k.f59977r;
        if (length == i10) {
            z6 = true;
        } else {
            C0420b c0420b = c18839k.f59976q;
            c0420b.m1039B();
            int[] iArr3 = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 >= iArr.length || (iM7715d = iArr[i11]) == -1) {
                    if (i11 == 0) {
                        iM7715d = 0;
                    } else {
                        iM7715d = AbstractC7262c.m7715d((((long) 0) << 32) | (((long) i11) & 4294967295L), iArr3) + 1;
                    }
                }
                iArr3[i11] = iM7715d;
                c0420b.m1041D(iM7715d, i11);
            }
            z6 = true;
            iArr = iArr3;
        }
        if (iArr2.length != i10) {
            int[] iArr4 = new int[i10];
            int i12 = 0;
            while (i12 < i10) {
                iArr4[i12] = i12 < iArr2.length ? iArr2[i12] : i12 == 0 ? 0 : iArr4[i12 - 1];
                i12++;
            }
            iArr2 = iArr4;
        }
        C18842n c18842nM7716e = AbstractC7262c.m7716e(c18839k, Math.round(c18852x2.f60054m), iArr, iArr2, z6);
        c18852x.m20150f(c18842nM7716e, false);
        return c18842nM7716e;
    }
}
