package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.y0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1197y0 {
    public static final C1173u0 Companion = new C1173u0();

    /* JADX INFO: renamed from: a */
    public final String f3152a;

    /* JADX INFO: renamed from: b */
    public final String f3153b;

    /* JADX INFO: renamed from: c */
    public final String f3154c;

    /* JADX INFO: renamed from: d */
    public final String f3155d;

    /* JADX INFO: renamed from: e */
    public final C1191x0 f3156e;

    public /* synthetic */ C1197y0(int i10, String str, String str2, String str3, String str4, C1191x0 c1191x0) {
        if (31 != (i10 & 31)) {
            AbstractC11153a0.m12389l(i10, 31, C1167t0.f3111a.getDescriptor());
            throw null;
        }
        this.f3152a = str;
        this.f3153b = str2;
        this.f3154c = str3;
        this.f3155d = str4;
        this.f3156e = c1191x0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1197y0)) {
            return false;
        }
        C1197y0 c1197y0 = (C1197y0) obj;
        return AbstractC16544l.m18089b(this.f3152a, c1197y0.f3152a) && AbstractC16544l.m18089b(this.f3153b, c1197y0.f3153b) && AbstractC16544l.m18089b(this.f3154c, c1197y0.f3154c) && AbstractC16544l.m18089b(this.f3155d, c1197y0.f3155d) && AbstractC16544l.m18089b(this.f3156e, c1197y0.f3156e);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f3152a.hashCode() * 31, 31, this.f3153b), 31, this.f3154c), 31, this.f3155d);
        C1191x0 c1191x0 = this.f3156e;
        return iM527p + (c1191x0 == null ? 0 : c1191x0.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C1197y0(String url, String contentUrl, String str, String thumbnailUrl) {
        AbstractC16544l.m18094g(url, "url");
        AbstractC16544l.m18094g(contentUrl, "contentUrl");
        AbstractC16544l.m18094g(thumbnailUrl, "thumbnailUrl");
        this.f3152a = url;
        this.f3153b = contentUrl;
        this.f3154c = str;
        this.f3155d = thumbnailUrl;
        this.f3156e = null;
    }
}
