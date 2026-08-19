package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: vd.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C20573w implements InterfaceC20576z {

    /* JADX INFO: renamed from: a */
    public final String f65301a;

    public C20573w(String str) {
        this.f65301a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20573w) {
            return AbstractC16544l.m18089b(this.f65301a, ((C20573w) obj).f65301a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f65301a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
