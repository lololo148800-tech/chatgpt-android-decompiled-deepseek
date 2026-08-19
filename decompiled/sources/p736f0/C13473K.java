package p736f0;

import kotlin.jvm.internal.AbstractC16544l;
import p758g0.InterfaceC13726B;
import p774h1.C14343V;

/* JADX INFO: renamed from: f0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C13473K {

    /* JADX INFO: renamed from: a */
    public final float f42633a;

    /* JADX INFO: renamed from: b */
    public final long f42634b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13726B f42635c;

    public C13473K(float f10, long j10, InterfaceC13726B interfaceC13726B) {
        this.f42633a = f10;
        this.f42634b = j10;
        this.f42635c = interfaceC13726B;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13473K)) {
            return false;
        }
        C13473K c13473k = (C13473K) obj;
        return Float.compare(this.f42633a, c13473k.f42633a) == 0 && C14343V.m15667a(this.f42634b, c13473k.f42634b) && AbstractC16544l.m18089b(this.f42635c, c13473k.f42635c);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.f42633a) * 31;
        int i10 = C14343V.f45024c;
        long j10 = this.f42634b;
        return this.f42635c.hashCode() + ((((int) (j10 ^ (j10 >>> 32))) + iFloatToIntBits) * 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f42633a + ", transformOrigin=" + ((Object) C14343V.m15670d(this.f42634b)) + ", animationSpec=" + this.f42635c + ')';
    }
}
