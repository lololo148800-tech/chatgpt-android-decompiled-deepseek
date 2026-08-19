package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.L2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21938L2 {
    public static final C21922H2 Companion = new C21922H2();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f69489d = {null, EnumC21914F2.Companion.serializer(), EnumC21930J2.Companion.serializer()};

    /* JADX INFO: renamed from: a */
    public final String f69490a;

    /* JADX INFO: renamed from: b */
    public final EnumC21914F2 f69491b;

    /* JADX INFO: renamed from: c */
    public final EnumC21930J2 f69492c;

    public /* synthetic */ C21938L2(int i10, String str, EnumC21914F2 enumC21914F2, EnumC21930J2 enumC21930J2) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C21906D2.f69450a.getDescriptor());
            throw null;
        }
        this.f69490a = str;
        this.f69491b = enumC21914F2;
        this.f69492c = enumC21930J2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21938L2)) {
            return false;
        }
        C21938L2 c21938l2 = (C21938L2) obj;
        return AbstractC16544l.m18089b(this.f69490a, c21938l2.f69490a) && this.f69491b == c21938l2.f69491b && this.f69492c == c21938l2.f69492c;
    }

    public final int hashCode() {
        return this.f69492c.hashCode() + ((this.f69491b.hashCode() + (this.f69490a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
