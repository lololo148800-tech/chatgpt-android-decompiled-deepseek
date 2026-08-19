package p812ii;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16643b;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: ii.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C15015o.class)
public final class C15006f {
    public static final C15005e Companion = new C15005e();

    /* JADX INFO: renamed from: a */
    public final EnumC15004d f46696a;

    /* JADX INFO: renamed from: b */
    public final C15012l f46697b;

    /* JADX INFO: renamed from: c */
    public final AbstractC16643b f46698c;

    /* JADX INFO: renamed from: d */
    public final String f46699d;

    /* JADX INFO: renamed from: e */
    public final Integer f46700e;

    public C15006f(EnumC15004d enumC15004d, C15012l c15012l, AbstractC16643b abstractC16643b, String str, Integer num) {
        this.f46696a = enumC15004d;
        this.f46697b = c15012l;
        this.f46698c = abstractC16643b;
        this.f46699d = str;
        this.f46700e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15006f)) {
            return false;
        }
        C15006f c15006f = (C15006f) obj;
        return this.f46696a == c15006f.f46696a && AbstractC16544l.m18089b(this.f46697b, c15006f.f46697b) && AbstractC16544l.m18089b(this.f46698c, c15006f.f46698c) && AbstractC16544l.m18089b(this.f46699d, c15006f.f46699d) && AbstractC16544l.m18089b(this.f46700e, c15006f.f46700e);
    }

    public final int hashCode() {
        EnumC15004d enumC15004d = this.f46696a;
        int iHashCode = (enumC15004d == null ? 0 : enumC15004d.hashCode()) * 31;
        C15012l c15012l = this.f46697b;
        int iHashCode2 = (iHashCode + (c15012l == null ? 0 : c15012l.f46706a.hashCode())) * 31;
        AbstractC16643b abstractC16643b = this.f46698c;
        int iHashCode3 = (iHashCode2 + (abstractC16643b == null ? 0 : abstractC16643b.hashCode())) * 31;
        String str = this.f46699d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f46700e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
