package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.C21917G1;
import p1155zi.C21975X1;
import p1155zi.C22038o;
import p1155zi.InterfaceC21925I1;

/* JADX INFO: renamed from: Zg.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10365e0 {

    /* JADX INFO: renamed from: a */
    public final C22038o f30717a;

    /* JADX INFO: renamed from: b */
    public final C21975X1 f30718b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21925I1 f30719c;

    public C10365e0(C22038o c22038o, C21975X1 c21975x1, InterfaceC21925I1 availablePackages) {
        AbstractC16544l.m18094g(availablePackages, "availablePackages");
        this.f30717a = c22038o;
        this.f30718b = c21975x1;
        this.f30719c = availablePackages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10365e0)) {
            return false;
        }
        C10365e0 c10365e0 = (C10365e0) obj;
        return AbstractC16544l.m18089b(this.f30717a, c10365e0.f30717a) && AbstractC16544l.m18089b(this.f30718b, c10365e0.f30718b) && AbstractC16544l.m18089b(this.f30719c, c10365e0.f30719c);
    }

    public final int hashCode() {
        C22038o c22038o = this.f30717a;
        int iHashCode = (c22038o == null ? 0 : c22038o.hashCode()) * 31;
        C21975X1 c21975x1 = this.f30718b;
        return this.f30719c.hashCode() + ((iHashCode + (c21975x1 != null ? c21975x1.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C10365e0() {
        this(null, null, C21917G1.f69468a);
    }
}
