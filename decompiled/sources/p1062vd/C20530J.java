package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;
import p403Qd.C6636i;

/* JADX INFO: renamed from: vd.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C20530J implements InterfaceC20539T {

    /* JADX INFO: renamed from: a */
    public final C6636i f65155a;

    public C20530J(C6636i c6636i) {
        this.f65155a = c6636i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20530J) && AbstractC16544l.m18089b(this.f65155a, ((C20530J) obj).f65155a);
    }

    public final int hashCode() {
        return this.f65155a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
