package p1025te;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.EnumC21968V0;
import p991rh.EnumC18991F;

/* JADX INFO: renamed from: te.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C19874e {

    /* JADX INFO: renamed from: a */
    public final EnumC18991F f63013a;

    /* JADX INFO: renamed from: b */
    public final EnumC21968V0 f63014b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC19878i f63015c;

    public C19874e(EnumC18991F enumC18991F, EnumC21968V0 enumC21968V0, InterfaceC19878i interfaceC19878i) {
        this.f63013a = enumC18991F;
        this.f63014b = enumC21968V0;
        this.f63015c = interfaceC19878i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19874e)) {
            return false;
        }
        C19874e c19874e = (C19874e) obj;
        return this.f63013a == c19874e.f63013a && this.f63014b == c19874e.f63014b && AbstractC16544l.m18089b(this.f63015c, c19874e.f63015c);
    }

    public final int hashCode() {
        int iHashCode = this.f63013a.hashCode() * 31;
        EnumC21968V0 enumC21968V0 = this.f63014b;
        return this.f63015c.hashCode() + ((iHashCode + (enumC21968V0 == null ? 0 : enumC21968V0.hashCode())) * 31);
    }

    public final String toString() {
        return "█";
    }
}
