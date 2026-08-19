package p890mb;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: mb.q */
/* JADX INFO: loaded from: classes.dex */
public final class C17220q {

    /* JADX INFO: renamed from: a */
    public final Class f54958a;

    /* JADX INFO: renamed from: b */
    public final Class f54959b;

    public C17220q(Class cls, Class cls2) {
        this.f54958a = cls;
        this.f54959b = cls2;
    }

    /* JADX INFO: renamed from: a */
    public static C17220q m18953a(Class cls) {
        return new C17220q(InterfaceC17219p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17220q.class != obj.getClass()) {
            return false;
        }
        C17220q c17220q = (C17220q) obj;
        if (this.f54959b.equals(c17220q.f54959b)) {
            return this.f54958a.equals(c17220q.f54958a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f54958a.hashCode() + (this.f54959b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f54959b;
        Class cls2 = this.f54958a;
        if (cls2 == InterfaceC17219p.class) {
            return cls.getName();
        }
        return Separators.f31989AT + cls2.getName() + Separators.f31991SP + cls.getName();
    }
}
