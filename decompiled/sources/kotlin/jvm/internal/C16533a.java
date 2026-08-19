package kotlin.jvm.internal;

import java.io.Serializable;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: kotlin.jvm.internal.a */
/* JADX INFO: loaded from: classes3.dex */
public class C16533a implements InterfaceC16539g, Serializable {

    /* JADX INFO: renamed from: Y */
    public final Object f51270Y;

    /* JADX INFO: renamed from: Z */
    public final Class f51271Z;

    /* JADX INFO: renamed from: o0 */
    public final String f51272o0;

    /* JADX INFO: renamed from: p0 */
    public final String f51273p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f51274q0;

    /* JADX INFO: renamed from: r0 */
    public final int f51275r0;

    /* JADX INFO: renamed from: s0 */
    public final int f51276s0;

    public C16533a(int i10, Class cls, String str, String str2, int i11) {
        this(i10, i11, cls, AbstractC16535c.NO_RECEIVER, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16533a)) {
            return false;
        }
        C16533a c16533a = (C16533a) obj;
        return this.f51274q0 == c16533a.f51274q0 && this.f51275r0 == c16533a.f51275r0 && this.f51276s0 == c16533a.f51276s0 && AbstractC16544l.m18089b(this.f51270Y, c16533a.f51270Y) && AbstractC16544l.m18089b(this.f51271Z, c16533a.f51271Z) && this.f51272o0.equals(c16533a.f51272o0) && this.f51273p0.equals(c16533a.f51273p0);
    }

    @Override // kotlin.jvm.internal.InterfaceC16539g
    public final int getArity() {
        return this.f51275r0;
    }

    public final int hashCode() {
        Object obj = this.f51270Y;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f51271Z;
        return ((((AbstractC0168G.m527p(AbstractC0168G.m527p((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.f51272o0), 31, this.f51273p0) + (this.f51274q0 ? 1231 : 1237)) * 31) + this.f51275r0) * 31) + this.f51276s0;
    }

    public final String toString() {
        return AbstractC16526C.f51263a.mo5701j(this);
    }

    public C16533a(int i10, int i11, Class cls, Object obj, String str, String str2) {
        this.f51270Y = obj;
        this.f51271Z = cls;
        this.f51272o0 = str;
        this.f51273p0 = str2;
        this.f51274q0 = false;
        this.f51275r0 = i10;
        this.f51276s0 = i11 >> 1;
    }
}
