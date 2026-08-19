package p624Zg;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Zg.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C10390v {

    /* JADX INFO: renamed from: a */
    public final C10337G f30791a;

    /* JADX INFO: renamed from: b */
    public final boolean f30792b;

    /* JADX INFO: renamed from: c */
    public final boolean f30793c;

    /* JADX INFO: renamed from: d */
    public final String f30794d;

    /* JADX INFO: renamed from: e */
    public final String f30795e;

    /* JADX INFO: renamed from: f */
    public final String f30796f;

    /* JADX INFO: renamed from: g */
    public final List f30797g;

    /* JADX INFO: renamed from: h */
    public final boolean f30798h;

    public C10390v(C10337G c10337g, boolean z6, boolean z10, String title, String subtitle, String purchaseCtaText, List list, boolean z11) {
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(subtitle, "subtitle");
        AbstractC16544l.m18094g(purchaseCtaText, "purchaseCtaText");
        this.f30791a = c10337g;
        this.f30792b = z6;
        this.f30793c = z10;
        this.f30794d = title;
        this.f30795e = subtitle;
        this.f30796f = purchaseCtaText;
        this.f30797g = list;
        this.f30798h = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10390v)) {
            return false;
        }
        C10390v c10390v = (C10390v) obj;
        return AbstractC16544l.m18089b(this.f30791a, c10390v.f30791a) && this.f30792b == c10390v.f30792b && this.f30793c == c10390v.f30793c && AbstractC16544l.m18089b(this.f30794d, c10390v.f30794d) && AbstractC16544l.m18089b(this.f30795e, c10390v.f30795e) && AbstractC16544l.m18089b(this.f30796f, c10390v.f30796f) && AbstractC16544l.m18089b(this.f30797g, c10390v.f30797g) && this.f30798h == c10390v.f30798h;
    }

    public final int hashCode() {
        return AbstractC14376f.m15858x(this.f30797g, AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(((((this.f30791a.hashCode() * 31) + (this.f30792b ? 1231 : 1237)) * 31) + (this.f30793c ? 1231 : 1237)) * 31, 31, this.f30794d), 31, this.f30795e), 31, this.f30796f), 31) + (this.f30798h ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
