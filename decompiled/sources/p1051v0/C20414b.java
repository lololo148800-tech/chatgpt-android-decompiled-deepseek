package p1051v0;

import p492U1.C7540e;
import p492U1.InterfaceC7537b;

/* JADX INFO: renamed from: v0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C20414b implements InterfaceC20413a {

    /* JADX INFO: renamed from: a */
    public final float f64533a;

    public C20414b(float f10) {
        this.f64533a = f10;
    }

    @Override // p1051v0.InterfaceC20413a
    /* JADX INFO: renamed from: a */
    public final float mo21077a(long j10, InterfaceC7537b interfaceC7537b) {
        return interfaceC7537b.mo7864b0(this.f64533a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20414b) && C7540e.m7873a(this.f64533a, ((C20414b) obj).f64533a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f64533a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f64533a + ".dp)";
    }
}
