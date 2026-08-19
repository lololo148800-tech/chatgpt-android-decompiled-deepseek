package p156G1;

import kotlin.jvm.internal.AbstractC16544l;
import mm.InterfaceC17302e;

/* JADX INFO: renamed from: G1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2954a {

    /* JADX INFO: renamed from: a */
    public final String f8837a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17302e f8838b;

    public C2954a(String str, InterfaceC17302e interfaceC17302e) {
        this.f8837a = str;
        this.f8838b = interfaceC17302e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2954a)) {
            return false;
        }
        C2954a c2954a = (C2954a) obj;
        return AbstractC16544l.m18089b(this.f8837a, c2954a.f8837a) && AbstractC16544l.m18089b(this.f8838b, c2954a.f8838b);
    }

    public final int hashCode() {
        String str = this.f8837a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC17302e interfaceC17302e = this.f8838b;
        return iHashCode + (interfaceC17302e != null ? interfaceC17302e.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f8837a + ", action=" + this.f8838b + ')';
    }
}
