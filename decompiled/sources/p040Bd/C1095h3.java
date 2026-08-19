package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.h3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1095h3 {
    public static final C1088g3 Companion = new C1088g3();

    /* JADX INFO: renamed from: a */
    public final String f2993a;

    /* JADX INFO: renamed from: b */
    public final String f2994b;

    /* JADX INFO: renamed from: c */
    public final Integer f2995c;

    /* JADX INFO: renamed from: d */
    public final String f2996d;

    public /* synthetic */ C1095h3(int i10, Integer num, String str, String str2, String str3) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C1081f3.f2936a.getDescriptor());
            throw null;
        }
        this.f2993a = str;
        this.f2994b = str2;
        if ((i10 & 4) == 0) {
            this.f2995c = null;
        } else {
            this.f2995c = num;
        }
        if ((i10 & 8) == 0) {
            this.f2996d = null;
        } else {
            this.f2996d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1095h3)) {
            return false;
        }
        C1095h3 c1095h3 = (C1095h3) obj;
        return AbstractC16544l.m18089b(this.f2993a, c1095h3.f2993a) && AbstractC16544l.m18089b(this.f2994b, c1095h3.f2994b) && AbstractC16544l.m18089b(this.f2995c, c1095h3.f2995c) && AbstractC16544l.m18089b(this.f2996d, c1095h3.f2996d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f2993a.hashCode() * 31, 31, this.f2994b);
        Integer num = this.f2995c;
        int iHashCode = (iM527p + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f2996d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C1095h3(String name, String str, Integer num, String str2) {
        AbstractC16544l.m18094g(name, "name");
        this.f2993a = name;
        this.f2994b = str;
        this.f2995c = num;
        this.f2996d = str2;
    }
}
