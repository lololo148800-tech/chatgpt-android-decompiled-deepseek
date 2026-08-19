package p858ko;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p492U1.C7540e;

/* JADX INFO: renamed from: ko.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C16505h implements InterfaceC16509l {

    /* JADX INFO: renamed from: b */
    public final EnumC16506i f51195b;

    /* JADX INFO: renamed from: c */
    public final float f51196c;

    public C16505h(EnumC16506i direction, float f10) {
        AbstractC16544l.m18094g(direction, "direction");
        this.f51195b = direction;
        this.f51196c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16505h)) {
            return false;
        }
        C16505h c16505h = (C16505h) obj;
        return this.f51195b == c16505h.f51195b && C7540e.m7873a(this.f51196c, c16505h.f51196c);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f51196c) + (this.f51195b.hashCode() * 31);
    }

    public final String toString() {
        return "Pan(direction=" + this.f51195b + ", panOffset=" + C7540e.m7874b(this.f51196c) + Separators.RPAREN;
    }
}
