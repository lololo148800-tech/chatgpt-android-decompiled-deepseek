package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.EnumC22080y1;

/* JADX INFO: renamed from: Zg.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10375j0 extends AbstractC10381m0 {

    /* JADX INFO: renamed from: a */
    public final int f30745a;

    /* JADX INFO: renamed from: b */
    public final EnumC22080y1 f30746b;

    public C10375j0(int i10, EnumC22080y1 offeringType) {
        AbstractC16544l.m18094g(offeringType, "offeringType");
        this.f30745a = i10;
        this.f30746b = offeringType;
    }

    @Override // p624Zg.AbstractC10381m0
    /* JADX INFO: renamed from: e */
    public final EnumC22080y1 mo10891e() {
        return this.f30746b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10375j0)) {
            return false;
        }
        C10375j0 c10375j0 = (C10375j0) obj;
        return this.f30745a == c10375j0.f30745a && this.f30746b == c10375j0.f30746b;
    }

    public final int hashCode() {
        return this.f30746b.hashCode() + (this.f30745a * 31);
    }

    public final String toString() {
        return "█";
    }
}
