package p552Wg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Wg.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C8852n implements InterfaceC8855q {

    /* JADX INFO: renamed from: a */
    public final String f27107a;

    public C8852n(String name) {
        AbstractC16544l.m18094g(name, "name");
        this.f27107a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8852n) && AbstractC16544l.m18089b(this.f27107a, ((C8852n) obj).f27107a);
    }

    public final int hashCode() {
        return this.f27107a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
