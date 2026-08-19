package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: vd.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C20525E implements InterfaceC20539T {

    /* JADX INFO: renamed from: a */
    public final String f65152a;

    public C20525E(String str) {
        this.f65152a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20525E) {
            return AbstractC16544l.m18089b(this.f65152a, ((C20525E) obj).f65152a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f65152a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
