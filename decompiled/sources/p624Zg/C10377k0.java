package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.EnumC22080y1;

/* JADX INFO: renamed from: Zg.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10377k0 extends AbstractC10381m0 {

    /* JADX INFO: renamed from: a */
    public final EnumC22080y1 f30749a;

    public C10377k0(EnumC22080y1 offeringType) {
        AbstractC16544l.m18094g(offeringType, "offeringType");
        this.f30749a = offeringType;
    }

    @Override // p624Zg.AbstractC10381m0
    /* JADX INFO: renamed from: e */
    public final EnumC22080y1 mo10891e() {
        return this.f30749a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10377k0) && this.f30749a == ((C10377k0) obj).f30749a;
    }

    public final int hashCode() {
        return this.f30749a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
