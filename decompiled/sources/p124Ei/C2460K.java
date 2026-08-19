package p124Ei;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2052a;
import p172Gi.C3061C;

/* JADX INFO: renamed from: Ei.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C2460K implements InterfaceC2052a {

    /* JADX INFO: renamed from: a */
    public final C3061C f7650a;

    public C2460K(C3061C c3061c) {
        this.f7650a = c3061c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2460K) && AbstractC16544l.m18089b(this.f7650a, ((C2460K) obj).f7650a);
    }

    public final int hashCode() {
        C3061C c3061c = this.f7650a;
        if (c3061c == null) {
            return 0;
        }
        return c3061c.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
