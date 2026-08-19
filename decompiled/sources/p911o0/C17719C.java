package p911o0;

import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.AbstractC21069X;
import p492U1.EnumC7546k;
import p635a1.C10450h;

/* JADX INFO: renamed from: o0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C17719C extends AbstractC17758g {

    /* JADX INFO: renamed from: h */
    public final C10450h f56577h;

    public C17719C(C10450h c10450h) {
        this.f56577h = c10450h;
    }

    @Override // p911o0.AbstractC17758g
    /* JADX INFO: renamed from: c */
    public final int mo19456c(int i10, EnumC7546k enumC7546k, AbstractC21069X abstractC21069X, int i11) {
        return this.f56577h.m10926a(0, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17719C) && AbstractC16544l.m18089b(this.f56577h, ((C17719C) obj).f56577h);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f56577h.f30951a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f56577h + ')';
    }
}
