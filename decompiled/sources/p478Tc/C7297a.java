package p478Tc;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Tc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C7297a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1426a f23105a;

    public C7297a(InterfaceC1426a onClick) {
        AbstractC16544l.m18094g(onClick, "onClick");
        this.f23105a = onClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7297a)) {
            return false;
        }
        C7297a c7297a = (C7297a) obj;
        c7297a.getClass();
        return AbstractC16544l.m18089b(this.f23105a, c7297a.f23105a);
    }

    public final int hashCode() {
        return this.f23105a.hashCode() - 1855603548;
    }

    public final String toString() {
        return "█";
    }
}
