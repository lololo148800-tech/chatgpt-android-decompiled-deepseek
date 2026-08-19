package p758g0;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: g0.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13793v0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC13784r f43569a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13798z f43570b;

    /* JADX INFO: renamed from: c */
    public final int f43571c;

    public C13793v0(AbstractC13784r abstractC13784r, InterfaceC13798z interfaceC13798z, int i10) {
        this.f43569a = abstractC13784r;
        this.f43570b = interfaceC13798z;
        this.f43571c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13793v0)) {
            return false;
        }
        C13793v0 c13793v0 = (C13793v0) obj;
        return AbstractC16544l.m18089b(this.f43569a, c13793v0.f43569a) && AbstractC16544l.m18089b(this.f43570b, c13793v0.f43570b) && this.f43571c == c13793v0.f43571c;
    }

    public final int hashCode() {
        return ((this.f43570b.hashCode() + (this.f43569a.hashCode() * 31)) * 31) + this.f43571c;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f43569a + ", easing=" + this.f43570b + ", arcMode=" + ((Object) ("ArcMode(value=" + this.f43571c + ')')) + ')';
    }
}
