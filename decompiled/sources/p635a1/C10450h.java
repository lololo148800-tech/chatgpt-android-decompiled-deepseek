package p635a1;

import com.google.protobuf.AbstractC12107L1;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: a1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10450h {

    /* JADX INFO: renamed from: a */
    public final float f30951a;

    public C10450h(float f10) {
        this.f30951a = f10;
    }

    /* JADX INFO: renamed from: a */
    public final int m10926a(int i10, int i11) {
        return AbstractC3794B0.m4492q(1, this.f30951a, (i11 - i10) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10450h) && Float.compare(this.f30951a, ((C10450h) obj).f30951a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f30951a);
    }

    public final String toString() {
        return AbstractC12107L1.m13825p(new StringBuilder("Vertical(bias="), this.f30951a, ')');
    }
}
