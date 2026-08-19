package p1071w0;

import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1440o;
import p204I1.C3573D;
import p204I1.C3582M;
import p328N1.AbstractC5599o;
import p328N1.C5600p;
import p328N1.C5605u;
import p328N1.C5606v;
import p328N1.C5609y;
import p328N1.InterfaceC5598n;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p544W9.AbstractC8682o;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: w0.U */
/* JADX INFO: loaded from: classes.dex */
public final class C20731U extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65732Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f65733Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3582M f65734o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20731U(int i10, int i11, C3582M c3582m) {
        super(3);
        this.f65732Y = i10;
        this.f65733Z = i11;
        this.f65734o0 = c3582m;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6021p c6021p = (C6021p) obj2;
        ((Number) obj3).intValue();
        c6021p.m6524S(408240218);
        int i10 = this.f65732Y;
        int i11 = this.f65733Z;
        AbstractC20740b0.m21285z(i10, i11);
        C10456n c10456n = C10456n.f30959Y;
        if (i10 == 1 && i11 == Integer.MAX_VALUE) {
            c6021p.m6553p(false);
            return c10456n;
        }
        InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
        InterfaceC5598n interfaceC5598n = (InterfaceC5598n) c6021p.m6548k(AbstractC0187M0.f707i);
        EnumC7546k enumC7546k = (EnumC7546k) c6021p.m6548k(AbstractC0187M0.f710l);
        C3582M c3582m = this.f65734o0;
        boolean zM6542f = c6021p.m6542f(c3582m) | c6021p.m6542f(enumC7546k);
        Object objM6514H = c6021p.m6514H();
        C5975S c5975s = C6013l.f19514a;
        if (zM6542f || objM6514H == c5975s) {
            objM6514H = AbstractC8682o.m9379b(c3582m, enumC7546k);
            c6021p.m6537c0(objM6514H);
        }
        C3582M c3582m2 = (C3582M) objM6514H;
        boolean zM6542f2 = c6021p.m6542f(interfaceC5598n) | c6021p.m6542f(c3582m2);
        Object objM6514H2 = c6021p.m6514H();
        if (zM6542f2 || objM6514H2 == c5975s) {
            C3573D c3573d = c3582m2.f10910a;
            AbstractC5599o abstractC5599o = c3573d.f10864f;
            C5609y c5609y = c3573d.f10861c;
            if (c5609y == null) {
                c5609y = C5609y.f18155r0;
            }
            C5605u c5605u = c3573d.f10862d;
            int i12 = c5605u != null ? c5605u.f18148a : 0;
            C5606v c5606v = c3573d.f10863e;
            objM6514H2 = ((C5600p) interfaceC5598n).m5991b(abstractC5599o, c5609y, i12, c5606v != null ? c5606v.f18149a : 1);
            c6021p.m6537c0(objM6514H2);
        }
        InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) objM6514H2;
        boolean zM6542f3 = c6021p.m6542f(interfaceC5982V0.getValue()) | c6021p.m6542f(interfaceC7537b) | c6021p.m6542f(interfaceC5598n) | c6021p.m6542f(c3582m) | c6021p.m6542f(enumC7546k);
        Object objM6514H3 = c6021p.m6514H();
        if (zM6542f3 || objM6514H3 == c5975s) {
            objM6514H3 = Integer.valueOf((int) (AbstractC20778u0.m21304a(c3582m2, interfaceC7537b, interfaceC5598n, AbstractC20778u0.f65985a, 1) & 4294967295L));
            c6021p.m6537c0(objM6514H3);
        }
        int iIntValue = ((Number) objM6514H3).intValue();
        boolean zM6542f4 = c6021p.m6542f(interfaceC5982V0.getValue()) | c6021p.m6542f(interfaceC7537b) | c6021p.m6542f(interfaceC5598n) | c6021p.m6542f(c3582m) | c6021p.m6542f(enumC7546k);
        Object objM6514H4 = c6021p.m6514H();
        if (zM6542f4 || objM6514H4 == c5975s) {
            StringBuilder sb2 = new StringBuilder();
            String str = AbstractC20778u0.f65985a;
            sb2.append(str);
            sb2.append('\n');
            sb2.append(str);
            objM6514H4 = Integer.valueOf((int) (AbstractC20778u0.m21304a(c3582m2, interfaceC7537b, interfaceC5598n, sb2.toString(), 2) & 4294967295L));
            c6021p.m6537c0(objM6514H4);
        }
        int iIntValue2 = ((Number) objM6514H4).intValue() - iIntValue;
        Integer numValueOf = i10 == 1 ? null : Integer.valueOf(((i10 - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i11 != Integer.MAX_VALUE ? Integer.valueOf(((i11 - 1) * iIntValue2) + iIntValue) : null;
        InterfaceC10459q interfaceC10459qM11246f = AbstractC10844c.m11246f(c10456n, numValueOf != null ? interfaceC7537b.mo7861O(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? interfaceC7537b.mo7861O(numValueOf2.intValue()) : Float.NaN);
        c6021p.m6553p(false);
        return interfaceC10459qM11246f;
    }
}
