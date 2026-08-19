package sg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sg.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C19557V implements InterfaceC19558W {

    /* JADX INFO: renamed from: a */
    public final C19569k f62113a;

    /* JADX INFO: renamed from: b */
    public final String f62114b;

    public C19557V(C19569k c19569k, String value) {
        AbstractC16544l.m18094g(value, "value");
        this.f62113a = c19569k;
        this.f62114b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19557V)) {
            return false;
        }
        C19557V c19557v = (C19557V) obj;
        return AbstractC16544l.m18089b(this.f62113a, c19557v.f62113a) && AbstractC16544l.m18089b(this.f62114b, c19557v.f62114b);
    }

    public final int hashCode() {
        return this.f62114b.hashCode() + (this.f62113a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
