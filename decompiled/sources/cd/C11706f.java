package cd;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p102Dm.AbstractC2119a;
import p1091wn.InterfaceC21029j;
import p492U1.C7543h;
import p492U1.C7544i;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9101A4;
import p587Y1.InterfaceC9595u;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: cd.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C11706f implements InterfaceC9595u {

    /* JADX INFO: renamed from: a */
    public final long f35515a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7537b f35516b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1439n f35517c;

    public C11706f(long j10, InterfaceC7537b density, InterfaceC1439n onPositionCalculated) {
        AbstractC16544l.m18094g(density, "density");
        AbstractC16544l.m18094g(onPositionCalculated, "onPositionCalculated");
        this.f35515a = j10;
        this.f35516b = density;
        this.f35517c = onPositionCalculated;
    }

    @Override // p587Y1.InterfaceC9595u
    /* JADX INFO: renamed from: a */
    public final long mo2638a(C7544i anchorBounds, long j10, EnumC7546k layoutDirection, long j11) {
        InterfaceC21029j interfaceC21029jM19297d;
        Object next;
        Object obj;
        AbstractC16544l.m18094g(anchorBounds, "anchorBounds");
        AbstractC16544l.m18094g(layoutDirection, "layoutDirection");
        long j12 = this.f35515a;
        int i10 = (int) (j12 >> 32);
        int i11 = anchorBounds.f23899a + i10;
        int i12 = anchorBounds.f23900b + ((int) (j12 & 4294967295L));
        int iMo7866k0 = this.f35516b.mo7866k0(AbstractC11707g.f35518a);
        int i13 = (int) (j11 >> 32);
        int iIntValue = i11 - i13;
        int i14 = (int) (j10 >> 32);
        int i15 = i14 - i13;
        if (i10 == -398475398) {
            interfaceC21029jM19297d = AbstractC17678l.m19297d(new Integer[]{Integer.valueOf(AbstractC2119a.m3195i((i14 / 2.0f) - (i13 / 2.0f)))});
        } else if (layoutDirection == EnumC7546k.f23904Y) {
            Integer numValueOf = Integer.valueOf(i11);
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            if (i11 < 0) {
                i15 = 0;
            }
            interfaceC21029jM19297d = AbstractC17678l.m19297d(new Integer[]{numValueOf, numValueOf2, Integer.valueOf(i15)});
        } else {
            Integer numValueOf3 = Integer.valueOf(iIntValue);
            Integer numValueOf4 = Integer.valueOf(i11);
            if (i11 <= i14) {
                i15 = 0;
            }
            interfaceC21029jM19297d = AbstractC17678l.m19297d(new Integer[]{numValueOf3, numValueOf4, Integer.valueOf(i15)});
        }
        Iterator it = interfaceC21029jM19297d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue2 = ((Number) next).intValue();
            if (iIntValue2 >= 0 && iIntValue2 + i13 <= i14) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            iIntValue = num.intValue();
        }
        int i16 = (int) (j11 & 4294967295L);
        int iIntValue3 = i12 - i16;
        int i17 = (int) (j10 & 4294967295L);
        Iterator it2 = AbstractC17678l.m19297d(new Integer[]{Integer.valueOf(Math.max(i12, iMo7866k0)), Integer.valueOf(iIntValue3), Integer.valueOf(i12 - (i16 / 2)), Integer.valueOf((i17 - i16) - iMo7866k0)}).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            Object next2 = it2.next();
            int iIntValue4 = ((Number) next2).intValue();
            if (iIntValue4 >= iMo7866k0 && iIntValue4 + i16 <= i17 - iMo7866k0) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            iIntValue3 = num2.intValue();
        }
        this.f35517c.invoke(anchorBounds, new C7544i(iIntValue, iIntValue3, i13 + iIntValue, i16 + iIntValue3));
        return AbstractC9101A4.m9631a(iIntValue, iIntValue3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11706f)) {
            return false;
        }
        C11706f c11706f = (C11706f) obj;
        return C7543h.m7880b(this.f35515a, c11706f.f35515a) && AbstractC16544l.m18089b(this.f35516b, c11706f.f35516b) && AbstractC16544l.m18089b(this.f35517c, c11706f.f35517c);
    }

    public final int hashCode() {
        long j10 = this.f35515a;
        return this.f35517c.hashCode() + ((this.f35516b.hashCode() + (((int) (j10 ^ (j10 >>> 32))) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
