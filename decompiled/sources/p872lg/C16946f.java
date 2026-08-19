package p872lg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: lg.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16946f {
    public static final C16945e Companion = new C16945e();

    /* JADX INFO: renamed from: a */
    public final String f54394a;

    /* JADX INFO: renamed from: b */
    public final String f54395b;

    /* JADX INFO: renamed from: c */
    public final String f54396c;

    /* JADX INFO: renamed from: d */
    public final String f54397d;

    public /* synthetic */ C16946f(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C16944d.f54393a.getDescriptor());
            throw null;
        }
        this.f54394a = str;
        this.f54395b = str2;
        this.f54396c = str3;
        this.f54397d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16946f)) {
            return false;
        }
        C16946f c16946f = (C16946f) obj;
        return AbstractC16544l.m18089b(this.f54394a, c16946f.f54394a) && AbstractC16544l.m18089b(this.f54395b, c16946f.f54395b) && AbstractC16544l.m18089b(this.f54396c, c16946f.f54396c) && AbstractC16544l.m18089b(this.f54397d, c16946f.f54397d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f54394a.hashCode() * 31, 31, this.f54395b);
        String str = this.f54396c;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f54397d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C16946f(String id2, String label, String str, String str2) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(label, "label");
        this.f54394a = id2;
        this.f54395b = label;
        this.f54396c = str;
        this.f54397d = str2;
    }
}
