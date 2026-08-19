package p769gj;

import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: gj.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C14172n implements InterfaceC14167i {

    /* JADX INFO: renamed from: a */
    public final Object f44556a;

    /* JADX INFO: renamed from: b */
    public final String f44557b;

    /* JADX INFO: renamed from: c */
    public final String f44558c;

    public C14172n(Object wrapped, String name) {
        AbstractC16544l.m18094g(wrapped, "wrapped");
        AbstractC16544l.m18094g(name, "name");
        this.f44556a = wrapped;
        this.f44557b = name;
        if (AbstractC21322p.m21681O(name)) {
            throw new IllegalArgumentException("name must not be blank.");
        }
        InterfaceC14167i interfaceC14167i = wrapped instanceof InterfaceC14167i ? (InterfaceC14167i) wrapped : null;
        String strMo6751b = interfaceC14167i != null ? interfaceC14167i.mo6751b() : null;
        this.f44558c = AbstractC16544l.m18100m(name.length() == 0 ? "" : AbstractC16544l.m18100m(name, "+"), strMo6751b == null ? wrapped.getClass().getName() : strMo6751b);
    }

    @Override // p769gj.InterfaceC14167i
    /* JADX INFO: renamed from: b */
    public final String mo6751b() {
        return this.f44558c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14172n)) {
            return false;
        }
        C14172n c14172n = (C14172n) obj;
        return AbstractC16544l.m18089b(this.f44556a, c14172n.f44556a) && AbstractC16544l.m18089b(this.f44557b, c14172n.f44557b);
    }

    public final int hashCode() {
        return this.f44557b.hashCode() + (this.f44556a.hashCode() * 31);
    }

    public final String toString() {
        return super.toString() + ": " + this.f44558c;
    }
}
