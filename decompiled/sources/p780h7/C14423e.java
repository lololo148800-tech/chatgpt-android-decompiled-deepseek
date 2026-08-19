package p780h7;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17335b;
import p003A1.AbstractC0168G;
import p641a7.EnumC10517c;
import p909nm.C17690x;

/* JADX INFO: renamed from: h7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C14423e {

    /* JADX INFO: renamed from: h */
    public static final C14422d f45330h = new C14422d(false, false, C17690x.f56481Y, 2, 2, null, C17335b.f55212b, EnumC10517c.f31167o0, 2, new C14419a(1024, C14420b.f45317Y, C14421c.f45318Y, 2), null);

    /* JADX INFO: renamed from: a */
    public final C14422d f45331a;

    /* JADX INFO: renamed from: b */
    public final String f45332b;

    /* JADX INFO: renamed from: c */
    public final String f45333c;

    /* JADX INFO: renamed from: d */
    public final String f45334d;

    /* JADX INFO: renamed from: e */
    public final String f45335e;

    /* JADX INFO: renamed from: f */
    public final boolean f45336f;

    /* JADX INFO: renamed from: g */
    public final Map f45337g;

    public C14423e(C14422d coreConfig, String str, String str2, String str3, String str4, boolean z6, Map map) {
        AbstractC16544l.m18094g(coreConfig, "coreConfig");
        this.f45331a = coreConfig;
        this.f45332b = str;
        this.f45333c = str2;
        this.f45334d = str3;
        this.f45335e = str4;
        this.f45336f = z6;
        this.f45337g = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14423e)) {
            return false;
        }
        C14423e c14423e = (C14423e) obj;
        return AbstractC16544l.m18089b(this.f45331a, c14423e.f45331a) && AbstractC16544l.m18089b(this.f45332b, c14423e.f45332b) && AbstractC16544l.m18089b(this.f45333c, c14423e.f45333c) && AbstractC16544l.m18089b(this.f45334d, c14423e.f45334d) && AbstractC16544l.m18089b(this.f45335e, c14423e.f45335e) && this.f45336f == c14423e.f45336f && AbstractC16544l.m18089b(this.f45337g, c14423e.f45337g);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f45331a.hashCode() * 31, 31, this.f45332b), 31, this.f45333c), 31, this.f45334d);
        String str = this.f45335e;
        return this.f45337g.hashCode() + ((((iM527p + (str == null ? 0 : str.hashCode())) * 31) + (this.f45336f ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Configuration(coreConfig=" + this.f45331a + ", clientToken=" + this.f45332b + ", env=" + this.f45333c + ", variant=" + this.f45334d + ", service=" + this.f45335e + ", crashReportsEnabled=" + this.f45336f + ", additionalConfig=" + this.f45337g + Separators.RPAREN;
    }
}
