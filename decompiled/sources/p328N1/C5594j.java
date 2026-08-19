package p328N1;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: N1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5594j {

    /* JADX INFO: renamed from: a */
    public final C5576C f18125a;

    public C5594j(C5576C c5576c) {
        this.f18125a = c5576c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5594j) {
            return AbstractC16544l.m18089b(this.f18125a, ((C5594j) obj).f18125a) && AbstractC16544l.m18089b(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18125a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f18125a + ", loaderKey=null)";
    }
}
