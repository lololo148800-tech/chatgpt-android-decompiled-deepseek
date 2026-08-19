package p776h3;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p492U1.C7540e;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: h3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C14399m {

    /* JADX INFO: renamed from: a */
    public final float f45140a;

    /* JADX INFO: renamed from: b */
    public final List f45141b;

    static {
        new C14399m(3, 0.0f);
    }

    public C14399m(float f10, List list) {
        this.f45140a = f10;
        this.f45141b = list;
    }

    /* JADX INFO: renamed from: a */
    public final C14399m m15897a(C14399m c14399m) {
        return new C14399m(this.f45140a + c14399m.f45140a, AbstractC17680n.m19361k0(c14399m.f45141b, this.f45141b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14399m)) {
            return false;
        }
        C14399m c14399m = (C14399m) obj;
        return C7540e.m7873a(this.f45140a, c14399m.f45140a) && AbstractC16544l.m18089b(this.f45141b, c14399m.f45141b);
    }

    public final int hashCode() {
        return this.f45141b.hashCode() + (Float.floatToIntBits(this.f45140a) * 31);
    }

    public final String toString() {
        return "PaddingDimension(dp=" + ((Object) C7540e.m7874b(this.f45140a)) + ", resourceIds=" + this.f45141b + ')';
    }

    public C14399m(int i10, float f10) {
        this((i10 & 1) != 0 ? 0 : f10, C17689w.f56480Y);
    }
}
