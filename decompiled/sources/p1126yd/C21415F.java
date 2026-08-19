package p1126yd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: yd.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C21415F implements InterfaceC21409C {

    /* JADX INFO: renamed from: a */
    public final String f67985a;

    public C21415F(String encoding) {
        AbstractC16544l.m18094g(encoding, "encoding");
        this.f67985a = encoding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21415F) && AbstractC16544l.m18089b(this.f67985a, ((C21415F) obj).f67985a);
    }

    public final int hashCode() {
        return this.f67985a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
