package p291Lf;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p478Tc.AbstractC7313q;
import p492U1.C7540e;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.InterfaceC10445c;
import p911o0.AbstractC17770m;
import p911o0.C17764j;
import p911o0.InterfaceC17762i;

/* JADX INFO: renamed from: Lf.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C5026w {

    /* JADX INFO: renamed from: g */
    public static final C5026w f16429g;

    /* JADX INFO: renamed from: h */
    public static final C5026w f16430h;

    /* JADX INFO: renamed from: i */
    public static final C5026w f16431i;

    /* JADX INFO: renamed from: j */
    public static final C5026w f16432j;

    /* JADX INFO: renamed from: a */
    public final float f16433a;

    /* JADX INFO: renamed from: b */
    public final float f16434b;

    /* JADX INFO: renamed from: c */
    public final boolean f16435c;

    /* JADX INFO: renamed from: d */
    public final boolean f16436d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC10445c f16437e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17762i f16438f;

    static {
        float f10 = AbstractC5023t.f16408c;
        float f11 = AbstractC7313q.f23199d;
        float f12 = AbstractC5023t.f16412g;
        C10449g c10449g = C10444b.f30946y0;
        float f13 = 2;
        C17764j c17764jM19500g = AbstractC17770m.m19500g(f13);
        f16429g = new C5026w(f10 + f11, f12, false, true, c10449g, c17764jM19500g);
        f16430h = new C5026w(f11, f12, false, true, c10449g, c17764jM19500g);
        float f14 = 0;
        f16431i = new C5026w(f14, f14, false, false, C10444b.f30947z0, AbstractC17770m.f56728e);
        f16432j = new C5026w(f14, f14, true, false, C10444b.f30932A0, AbstractC17770m.m19500g(f13));
    }

    public C5026w(float f10, float f11, boolean z6, boolean z10, InterfaceC10445c interfaceC10445c, InterfaceC17762i verticalArrangement) {
        AbstractC16544l.m18094g(verticalArrangement, "verticalArrangement");
        this.f16433a = f10;
        this.f16434b = f11;
        this.f16435c = z6;
        this.f16436d = z10;
        this.f16437e = interfaceC10445c;
        this.f16438f = verticalArrangement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5026w)) {
            return false;
        }
        C5026w c5026w = (C5026w) obj;
        return C7540e.m7873a(this.f16433a, c5026w.f16433a) && C7540e.m7873a(this.f16434b, c5026w.f16434b) && this.f16435c == c5026w.f16435c && this.f16436d == c5026w.f16436d && this.f16437e.equals(c5026w.f16437e) && AbstractC16544l.m18089b(this.f16438f, c5026w.f16438f);
    }

    public final int hashCode() {
        return this.f16438f.hashCode() + ((this.f16437e.hashCode() + ((((AbstractC12107L1.m13819j(this.f16434b, Float.floatToIntBits(this.f16433a) * 31, 31) + (this.f16435c ? 1231 : 1237)) * 31) + (this.f16436d ? 1231 : 1237)) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
