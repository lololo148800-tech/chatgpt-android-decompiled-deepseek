package p121Ef;

import kotlin.jvm.internal.AbstractC16544l;
import p072Ci.EnumC1711p;
import p098Di.InterfaceC2053b;

/* JADX INFO: renamed from: Ef.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C2430g implements InterfaceC2053b {

    /* JADX INFO: renamed from: a */
    public final EnumC1711p f7559a;

    public C2430g(EnumC1711p unit) {
        AbstractC16544l.m18094g(unit, "unit");
        this.f7559a = unit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2430g) && this.f7559a == ((C2430g) obj).f7559a;
    }

    public final int hashCode() {
        return this.f7559a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
