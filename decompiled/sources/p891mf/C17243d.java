package p891mf;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C17243d implements InterfaceC17246g {

    /* JADX INFO: renamed from: a */
    public final String f55021a;

    /* JADX INFO: renamed from: b */
    public final boolean f55022b;

    public C17243d(String jawboneId, boolean z6) {
        AbstractC16544l.m18094g(jawboneId, "jawboneId");
        this.f55021a = jawboneId;
        this.f55022b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17243d)) {
            return false;
        }
        C17243d c17243d = (C17243d) obj;
        return AbstractC16544l.m18089b(this.f55021a, c17243d.f55021a) && this.f55022b == c17243d.f55022b;
    }

    public final int hashCode() {
        return (this.f55021a.hashCode() * 31) + (this.f55022b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
