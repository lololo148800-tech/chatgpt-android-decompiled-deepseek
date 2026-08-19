package kg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: kg.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C16417w implements InterfaceC16418x {

    /* JADX INFO: renamed from: a */
    public final String f50944a;

    public C16417w(String code) {
        AbstractC16544l.m18094g(code, "code");
        this.f50944a = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16417w) && AbstractC16544l.m18089b(this.f50944a, ((C16417w) obj).f50944a);
    }

    public final int hashCode() {
        return this.f50944a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
