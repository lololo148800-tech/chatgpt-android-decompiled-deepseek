package p598Ye;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Ye.o */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10044o {
    public static final C10034e Companion = new C10034e();

    /* JADX INFO: renamed from: k */
    public static final KSerializer[] f29748k = {null, null, null, null, new C11158d(C11181o0.f33827a, 0), null, null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final String f29749a;

    /* JADX INFO: renamed from: b */
    public final C10037h f29750b;

    /* JADX INFO: renamed from: c */
    public final String f29751c;

    /* JADX INFO: renamed from: d */
    public final String f29752d;

    /* JADX INFO: renamed from: e */
    public final List f29753e;

    /* JADX INFO: renamed from: f */
    public final C5551u f29754f;

    /* JADX INFO: renamed from: g */
    public final C10043n f29755g;

    /* JADX INFO: renamed from: h */
    public final String f29756h;

    /* JADX INFO: renamed from: i */
    public final String f29757i;

    /* JADX INFO: renamed from: j */
    public final C5551u f29758j;

    public /* synthetic */ C10044o(int i10, String str, C10037h c10037h, String str2, String str3, List list, C5551u c5551u, C10043n c10043n, String str4, String str5, C5551u c5551u2) {
        if (1007 != (i10 & 1007)) {
            AbstractC11153a0.m12389l(i10, 1007, C10030a.f29726a.getDescriptor());
            throw null;
        }
        this.f29749a = str;
        this.f29750b = c10037h;
        this.f29751c = str2;
        this.f29752d = str3;
        if ((i10 & 16) == 0) {
            this.f29753e = C17689w.f56480Y;
        } else {
            this.f29753e = list;
        }
        this.f29754f = c5551u;
        this.f29755g = c10043n;
        this.f29756h = str4;
        this.f29757i = str5;
        this.f29758j = c5551u2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10044o)) {
            return false;
        }
        C10044o c10044o = (C10044o) obj;
        return AbstractC16544l.m18089b(this.f29749a, c10044o.f29749a) && AbstractC16544l.m18089b(this.f29750b, c10044o.f29750b) && AbstractC16544l.m18089b(this.f29751c, c10044o.f29751c) && AbstractC16544l.m18089b(this.f29752d, c10044o.f29752d) && AbstractC16544l.m18089b(this.f29753e, c10044o.f29753e) && AbstractC16544l.m18089b(this.f29754f, c10044o.f29754f) && AbstractC16544l.m18089b(this.f29755g, c10044o.f29755g) && AbstractC16544l.m18089b(this.f29756h, c10044o.f29756h) && AbstractC16544l.m18089b(this.f29757i, c10044o.f29757i) && AbstractC16544l.m18089b(this.f29758j, c10044o.f29758j);
    }

    public final int hashCode() {
        int iHashCode = (this.f29750b.hashCode() + (this.f29749a.hashCode() * 31)) * 31;
        String str = this.f29751c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f29752d;
        int iM15858x = AbstractC14376f.m15858x(this.f29753e, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        C5551u c5551u = this.f29754f;
        int iHashCode3 = (iM15858x + (c5551u == null ? 0 : c5551u.f18004Y.hashCode())) * 31;
        C10043n c10043n = this.f29755g;
        int iHashCode4 = (iHashCode3 + (c10043n == null ? 0 : c10043n.hashCode())) * 31;
        String str3 = this.f29756h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f29757i;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C5551u c5551u2 = this.f29758j;
        return iHashCode6 + (c5551u2 != null ? c5551u2.f18004Y.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
