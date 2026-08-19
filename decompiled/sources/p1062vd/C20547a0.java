package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;
import p020Ai.C0515d;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: vd.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20547a0 implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final C0515d f65199a;

    public C20547a0(C0515d c0515d) {
        this.f65199a = c0515d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20547a0) && AbstractC16544l.m18089b(this.f65199a, ((C20547a0) obj).f65199a);
    }

    public final int hashCode() {
        C0515d c0515d = this.f65199a;
        if (c0515d == null) {
            return 0;
        }
        return c0515d.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
