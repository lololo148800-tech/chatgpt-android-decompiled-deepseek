package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.I1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0937I1 extends AbstractC0888A0 {
    public static final C0931H1 Companion = new C0931H1();

    /* JADX INFO: renamed from: a */
    public final Integer f2685a;

    /* JADX INFO: renamed from: b */
    public final Integer f2686b;

    /* JADX INFO: renamed from: c */
    public final String f2687c;

    /* JADX INFO: renamed from: d */
    public final String f2688d;

    /* JADX INFO: renamed from: e */
    public final String f2689e;

    /* JADX INFO: renamed from: f */
    public final Boolean f2690f;

    /* JADX INFO: renamed from: g */
    public final boolean f2691g;

    /* JADX INFO: renamed from: h */
    public final String f2692h;

    public C0937I1(int i10, Integer num, Integer num2, String str, String str2, String str3, Boolean bool, boolean z6, String str4) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C0925G1.f2671a.getDescriptor());
            throw null;
        }
        this.f2685a = num;
        this.f2686b = num2;
        this.f2687c = str;
        if ((i10 & 8) == 0) {
            this.f2688d = null;
        } else {
            this.f2688d = str2;
        }
        if ((i10 & 16) == 0) {
            this.f2689e = null;
        } else {
            this.f2689e = str3;
        }
        if ((i10 & 32) == 0) {
            this.f2690f = null;
        } else {
            this.f2690f = bool;
        }
        if ((i10 & 64) == 0) {
            this.f2691g = false;
        } else {
            this.f2691g = z6;
        }
        if ((i10 & 128) == 0) {
            this.f2692h = "url_citation";
        } else {
            this.f2692h = str4;
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0937I1 m1964e(C0937I1 c0937i1) {
        Integer num = c0937i1.f2685a;
        Integer num2 = c0937i1.f2686b;
        String url = c0937i1.f2687c;
        String str = c0937i1.f2688d;
        String str2 = c0937i1.f2689e;
        Boolean bool = c0937i1.f2690f;
        String type = c0937i1.f2692h;
        c0937i1.getClass();
        AbstractC16544l.m18094g(url, "url");
        AbstractC16544l.m18094g(type, "type");
        return new C0937I1(num, num2, url, str, str2, bool, true, type);
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f2686b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f2685a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f2692h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0937I1)) {
            return false;
        }
        C0937I1 c0937i1 = (C0937I1) obj;
        return AbstractC16544l.m18089b(this.f2685a, c0937i1.f2685a) && AbstractC16544l.m18089b(this.f2686b, c0937i1.f2686b) && AbstractC16544l.m18089b(this.f2687c, c0937i1.f2687c) && AbstractC16544l.m18089b(this.f2688d, c0937i1.f2688d) && AbstractC16544l.m18089b(this.f2689e, c0937i1.f2689e) && AbstractC16544l.m18089b(this.f2690f, c0937i1.f2690f) && this.f2691g == c0937i1.f2691g && AbstractC16544l.m18089b(this.f2692h, c0937i1.f2692h);
    }

    public final int hashCode() {
        Integer num = this.f2685a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2686b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f2687c);
        String str = this.f2688d;
        int iHashCode2 = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2689e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f2690f;
        return this.f2692h.hashCode() + ((((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + (this.f2691g ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C0937I1(Integer num, Integer num2, String url, String str, String str2, Boolean bool, boolean z6, String type) {
        AbstractC16544l.m18094g(url, "url");
        AbstractC16544l.m18094g(type, "type");
        this.f2685a = num;
        this.f2686b = num2;
        this.f2687c = url;
        this.f2688d = str;
        this.f2689e = str2;
        this.f2690f = bool;
        this.f2691g = z6;
        this.f2692h = type;
    }

    public /* synthetic */ C0937I1(Integer num, Integer num2, String str, String str2, Boolean bool, int i10) {
        this(num, num2, str, (i10 & 8) != 0 ? null : str2, null, (i10 & 32) != 0 ? null : bool, false, "url_citation");
    }
}
