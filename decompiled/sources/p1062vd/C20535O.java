package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;
import p403Qd.C6636i;

/* JADX INFO: renamed from: vd.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C20535O implements InterfaceC20539T {

    /* JADX INFO: renamed from: a */
    public final C6636i f65160a;

    /* JADX INFO: renamed from: b */
    public final String f65161b;

    public C20535O(C6636i c6636i, String name) {
        AbstractC16544l.m18094g(name, "name");
        this.f65160a = c6636i;
        this.f65161b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20535O)) {
            return false;
        }
        C20535O c20535o = (C20535O) obj;
        return AbstractC16544l.m18089b(this.f65160a, c20535o.f65160a) && AbstractC16544l.m18089b(this.f65161b, c20535o.f65161b);
    }

    public final int hashCode() {
        return this.f65161b.hashCode() + (this.f65160a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
