package p758g0;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p729ej.C13414e;

/* JADX INFO: renamed from: g0.W */
/* JADX INFO: loaded from: classes.dex */
public final class C13746W implements InterfaceC13726B {

    /* JADX INFO: renamed from: a */
    public final float f43352a;

    /* JADX INFO: renamed from: b */
    public final float f43353b;

    /* JADX INFO: renamed from: c */
    public final Object f43354c;

    public C13746W(float f10, float f11, Object obj) {
        this.f43352a = f10;
        this.f43353b = f11;
        this.f43354c = obj;
    }

    @Override // p758g0.InterfaceC13772l
    /* JADX INFO: renamed from: a */
    public final InterfaceC13787s0 mo15214a(C13783q0 c13783q0) {
        Object obj = this.f43354c;
        return new C13414e(this.f43352a, this.f43353b, obj == null ? null : (AbstractC13784r) c13783q0.f43526a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13746W)) {
            return false;
        }
        C13746W c13746w = (C13746W) obj;
        return c13746w.f43352a == this.f43352a && c13746w.f43353b == this.f43353b && AbstractC16544l.m18089b(c13746w.f43354c, this.f43354c);
    }

    public final int hashCode() {
        Object obj = this.f43354c;
        return Float.floatToIntBits(this.f43353b) + AbstractC12107L1.m13819j(this.f43352a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ C13746W(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
