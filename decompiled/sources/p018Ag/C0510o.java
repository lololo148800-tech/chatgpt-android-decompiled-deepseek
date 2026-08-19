package p018Ag;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ag.o */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0510o {
    public static final C0509n Companion = new C0509n();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f1644e = {EnumC0498c.Companion.serializer(), null, null, null};

    /* JADX INFO: renamed from: a */
    public final EnumC0498c f1645a;

    /* JADX INFO: renamed from: b */
    public final String f1646b;

    /* JADX INFO: renamed from: c */
    public final String f1647c;

    /* JADX INFO: renamed from: d */
    public final String f1648d;

    public /* synthetic */ C0510o(int i10, EnumC0498c enumC0498c, String str, String str2, String str3) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C0508m.f1643a.getDescriptor());
            throw null;
        }
        this.f1645a = enumC0498c;
        this.f1646b = str;
        this.f1647c = str2;
        this.f1648d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0510o)) {
            return false;
        }
        C0510o c0510o = (C0510o) obj;
        return this.f1645a == c0510o.f1645a && AbstractC16544l.m18089b(this.f1646b, c0510o.f1646b) && AbstractC16544l.m18089b(this.f1647c, c0510o.f1647c) && AbstractC16544l.m18089b(this.f1648d, c0510o.f1648d);
    }

    public final int hashCode() {
        int iHashCode = this.f1645a.hashCode() * 31;
        String str = this.f1646b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1647c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1648d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
