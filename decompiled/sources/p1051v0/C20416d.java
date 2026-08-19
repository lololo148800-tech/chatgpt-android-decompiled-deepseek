package p1051v0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8096g6;
import p759g1.C13801c;
import p759g1.C13802d;
import p759g1.C13803e;
import p774h1.AbstractC14332J;
import p774h1.C14330H;
import p774h1.C14331I;
import p774h1.InterfaceC14339Q;

/* JADX INFO: renamed from: v0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C20416d implements InterfaceC14339Q {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC20413a f64535Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC20413a f64536Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC20413a f64537o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC20413a f64538p0;

    public C20416d(InterfaceC20413a interfaceC20413a, InterfaceC20413a interfaceC20413a2, InterfaceC20413a interfaceC20413a3, InterfaceC20413a interfaceC20413a4) {
        this.f64535Y = interfaceC20413a;
        this.f64536Z = interfaceC20413a2;
        this.f64537o0 = interfaceC20413a3;
        this.f64538p0 = interfaceC20413a4;
    }

    /* JADX INFO: renamed from: a */
    public static C20416d m21078a(C20416d c20416d, C20414b c20414b, C20414b c20414b2, C20414b c20414b3, C20414b c20414b4, int i10) {
        InterfaceC20413a interfaceC20413a = c20414b;
        if ((i10 & 1) != 0) {
            interfaceC20413a = c20416d.f64535Y;
        }
        InterfaceC20413a interfaceC20413a2 = c20414b2;
        if ((i10 & 2) != 0) {
            interfaceC20413a2 = c20416d.f64536Z;
        }
        InterfaceC20413a interfaceC20413a3 = c20414b3;
        if ((i10 & 4) != 0) {
            interfaceC20413a3 = c20416d.f64537o0;
        }
        InterfaceC20413a interfaceC20413a4 = c20414b4;
        if ((i10 & 8) != 0) {
            interfaceC20413a4 = c20416d.f64538p0;
        }
        c20416d.getClass();
        return new C20416d(interfaceC20413a, interfaceC20413a2, interfaceC20413a3, interfaceC20413a4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20416d)) {
            return false;
        }
        C20416d c20416d = (C20416d) obj;
        if (!AbstractC16544l.m18089b(this.f64535Y, c20416d.f64535Y)) {
            return false;
        }
        if (!AbstractC16544l.m18089b(this.f64536Z, c20416d.f64536Z)) {
            return false;
        }
        if (AbstractC16544l.m18089b(this.f64537o0, c20416d.f64537o0)) {
            return AbstractC16544l.m18089b(this.f64538p0, c20416d.f64538p0);
        }
        return false;
    }

    public final int hashCode() {
        return this.f64538p0.hashCode() + ((this.f64537o0.hashCode() + ((this.f64536Z.hashCode() + (this.f64535Y.hashCode() * 31)) * 31)) * 31);
    }

    @Override // p774h1.InterfaceC14339Q
    /* JADX INFO: renamed from: o */
    public final AbstractC14332J mo4178o(long j10, EnumC7546k enumC7546k, InterfaceC7537b interfaceC7537b) {
        float fMo21077a = this.f64535Y.mo21077a(j10, interfaceC7537b);
        float fMo21077a2 = this.f64536Z.mo21077a(j10, interfaceC7537b);
        float fMo21077a3 = this.f64537o0.mo21077a(j10, interfaceC7537b);
        float fMo21077a4 = this.f64538p0.mo21077a(j10, interfaceC7537b);
        float fM15332d = C13803e.m15332d(j10);
        float f10 = fMo21077a + fMo21077a4;
        if (f10 > fM15332d) {
            float f11 = fM15332d / f10;
            fMo21077a *= f11;
            fMo21077a4 *= f11;
        }
        float f12 = fMo21077a2 + fMo21077a3;
        if (f12 > fM15332d) {
            float f13 = fM15332d / f12;
            fMo21077a2 *= f13;
            fMo21077a3 *= f13;
        }
        if (fMo21077a < 0.0f || fMo21077a2 < 0.0f || fMo21077a3 < 0.0f || fMo21077a4 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fMo21077a + ", topEnd = " + fMo21077a2 + ", bottomEnd = " + fMo21077a3 + ", bottomStart = " + fMo21077a4 + ")!").toString());
        }
        if (fMo21077a + fMo21077a2 + fMo21077a3 + fMo21077a4 == 0.0f) {
            return new C14330H(AbstractC8096g6.m8568b(0L, j10));
        }
        C13801c c13801cM8568b = AbstractC8096g6.m8568b(0L, j10);
        EnumC7546k enumC7546k2 = EnumC7546k.f23904Y;
        float f14 = enumC7546k == enumC7546k2 ? fMo21077a : fMo21077a2;
        long jM8484a = AbstractC8072d6.m8484a(f14, f14);
        if (enumC7546k == enumC7546k2) {
            fMo21077a = fMo21077a2;
        }
        long jM8484a2 = AbstractC8072d6.m8484a(fMo21077a, fMo21077a);
        float f15 = enumC7546k == enumC7546k2 ? fMo21077a3 : fMo21077a4;
        long jM8484a3 = AbstractC8072d6.m8484a(f15, f15);
        if (enumC7546k != enumC7546k2) {
            fMo21077a4 = fMo21077a3;
        }
        return new C14331I(new C13802d(c13801cM8568b.f43586a, c13801cM8568b.f43587b, c13801cM8568b.f43588c, c13801cM8568b.f43589d, jM8484a, jM8484a2, jM8484a3, AbstractC8072d6.m8484a(fMo21077a4, fMo21077a4)));
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f64535Y + HJrCuD.ZUHBuydjDJ + this.f64536Z + ", bottomEnd = " + this.f64537o0 + ", bottomStart = " + this.f64538p0 + ')';
    }
}
