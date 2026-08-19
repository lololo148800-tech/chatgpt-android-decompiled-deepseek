package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.y4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1201y4 {
    public static final C1195x4 Companion = new C1195x4();

    /* JADX INFO: renamed from: a */
    public final String f3158a;

    /* JADX INFO: renamed from: b */
    public final String f3159b;

    /* JADX INFO: renamed from: c */
    public final String f3160c;

    /* JADX INFO: renamed from: d */
    public final String f3161d;

    public /* synthetic */ C1201y4(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C1189w4.f3142a.getDescriptor());
            throw null;
        }
        this.f3158a = str;
        this.f3159b = str2;
        this.f3160c = str3;
        this.f3161d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1201y4)) {
            return false;
        }
        C1201y4 c1201y4 = (C1201y4) obj;
        return AbstractC16544l.m18089b(this.f3158a, c1201y4.f3158a) && AbstractC16544l.m18089b(this.f3159b, c1201y4.f3159b) && AbstractC16544l.m18089b(this.f3160c, c1201y4.f3160c) && AbstractC16544l.m18089b(this.f3161d, c1201y4.f3161d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(this.f3158a.hashCode() * 31, 31, this.f3159b), 31, this.f3160c);
        String str = this.f3161d;
        return iM527p + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C1201y4(String type, String originalGenId, String str, String str2) {
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(originalGenId, "originalGenId");
        this.f3158a = type;
        this.f3159b = originalGenId;
        this.f3160c = str;
        this.f3161d = str2;
    }
}
