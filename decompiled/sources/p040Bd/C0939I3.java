package p040Bd;

import ao.AbstractC11153a0;
import bo.C11527o;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1155zi.C21943N;
import p1155zi.C21947O;
import p1155zi.EnumC21931K;
import p559Wn.InterfaceC8975g;
import p929oi.AbstractC18201b;

/* JADX INFO: renamed from: Bd.I3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0939I3 implements InterfaceC1028X3 {
    public static final C0933H3 Companion = new C0933H3();

    /* JADX INFO: renamed from: a */
    public final String f2693a;

    /* JADX INFO: renamed from: b */
    public final int f2694b;

    /* JADX INFO: renamed from: c */
    public final String f2695c;

    /* JADX INFO: renamed from: d */
    public final String f2696d;

    /* JADX INFO: renamed from: e */
    public final C21943N f2697e;

    /* JADX INFO: renamed from: f */
    public final C21947O f2698f;

    public C0939I3(int i10, String value, int i11, String str, String str2, C21943N c21943n) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C0927G3.f2673a.getDescriptor());
            throw null;
        }
        this.f2693a = value;
        this.f2694b = i11;
        this.f2695c = str;
        this.f2696d = (i10 & 8) == 0 ? "audio_asset_pointer" : str2;
        if ((i10 & 16) == 0) {
            this.f2697e = null;
        } else {
            this.f2697e = c21943n;
        }
        AbstractC16544l.m18094g(value, "value");
        C11527o c11527o = AbstractC18201b.f58034a;
        c11527o.getClass();
        this.f2698f = new C21947O(value, i11, (EnumC21931K) c11527o.m12903b(str, EnumC21931K.Companion.serializer()), this.f2697e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0939I3)) {
            return false;
        }
        C0939I3 c0939i3 = (C0939I3) obj;
        return AbstractC16544l.m18089b(this.f2693a, c0939i3.f2693a) && this.f2694b == c0939i3.f2694b && AbstractC16544l.m18089b(this.f2695c, c0939i3.f2695c) && AbstractC16544l.m18089b(this.f2696d, c0939i3.f2696d) && AbstractC16544l.m18089b(this.f2697e, c0939i3.f2697e);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(((this.f2693a.hashCode() * 31) + this.f2694b) * 31, 31, this.f2695c), 31, this.f2696d);
        C21943N c21943n = this.f2697e;
        return iM527p + (c21943n == null ? 0 : c21943n.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
