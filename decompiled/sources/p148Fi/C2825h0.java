package p148Fi;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.h0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2825h0 {
    public static final C2822g0 Companion = new C2822g0();

    /* JADX INFO: renamed from: a */
    public final Float f8563a;

    /* JADX INFO: renamed from: b */
    public final C2861x f8564b;

    public /* synthetic */ C2825h0(int i10, Float f10, C2861x c2861x) {
        if ((i10 & 1) == 0) {
            this.f8563a = null;
        } else {
            this.f8563a = f10;
        }
        if ((i10 & 2) == 0) {
            this.f8564b = null;
        } else {
            this.f8564b = c2861x;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2825h0)) {
            return false;
        }
        C2825h0 c2825h0 = (C2825h0) obj;
        return AbstractC16544l.m18089b(this.f8563a, c2825h0.f8563a) && AbstractC16544l.m18089b(this.f8564b, c2825h0.f8564b);
    }

    public final int hashCode() {
        Float f10 = this.f8563a;
        int iHashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
        C2861x c2861x = this.f8564b;
        return iHashCode + (c2861x != null ? c2861x.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
