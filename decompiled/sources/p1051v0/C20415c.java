package p1051v0;

import p492U1.InterfaceC7537b;
import p759g1.C13803e;

/* JADX INFO: renamed from: v0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C20415c implements InterfaceC20413a {

    /* JADX INFO: renamed from: a */
    public final float f64534a;

    public C20415c(float f10) {
        this.f64534a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // p1051v0.InterfaceC20413a
    /* JADX INFO: renamed from: a */
    public final float mo21077a(long j10, InterfaceC7537b interfaceC7537b) {
        return (this.f64534a / 100.0f) * C13803e.m15332d(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20415c) && Float.compare(this.f64534a, ((C20415c) obj).f64534a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f64534a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f64534a + "%)";
    }
}
