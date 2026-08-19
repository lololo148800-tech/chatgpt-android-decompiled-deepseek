package mo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import no.AbstractC17708b;
import p228J.AbstractC3794B0;
import p571X9.AbstractC9141H2;
import p817j$.util.Objects;
import p909nm.AbstractC17680n;
import pm.C18513a;

/* JADX INFO: renamed from: mo.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C17343j {

    /* JADX INFO: renamed from: e */
    public static final C17343j f55256e;

    /* JADX INFO: renamed from: f */
    public static final C17343j f55257f;

    /* JADX INFO: renamed from: g */
    public static final C17343j f55258g;

    /* JADX INFO: renamed from: a */
    public final boolean f55259a;

    /* JADX INFO: renamed from: b */
    public final boolean f55260b;

    /* JADX INFO: renamed from: c */
    public final String[] f55261c;

    /* JADX INFO: renamed from: d */
    public final String[] f55262d;

    static {
        C17341h c17341h = C17341h.f55248r;
        C17341h c17341h2 = C17341h.f55249s;
        C17341h c17341h3 = C17341h.f55250t;
        C17341h c17341h4 = C17341h.f55242l;
        C17341h c17341h5 = C17341h.f55244n;
        C17341h c17341h6 = C17341h.f55243m;
        C17341h c17341h7 = C17341h.f55245o;
        C17341h c17341h8 = C17341h.f55247q;
        C17341h c17341h9 = C17341h.f55246p;
        C17341h[] c17341hArr = {c17341h, c17341h2, c17341h3, c17341h4, c17341h5, c17341h6, c17341h7, c17341h8, c17341h9, C17341h.f55240j, C17341h.f55241k, C17341h.f55238h, C17341h.f55239i, C17341h.f55236f, C17341h.f55237g, C17341h.f55235e};
        C17342i c17342i = new C17342i();
        c17342i.m19004d((C17341h[]) Arrays.copyOf(new C17341h[]{c17341h, c17341h2, c17341h3, c17341h4, c17341h5, c17341h6, c17341h7, c17341h8, c17341h9}, 9));
        EnumC17331H enumC17331H = EnumC17331H.TLS_1_3;
        EnumC17331H enumC17331H2 = EnumC17331H.TLS_1_2;
        c17342i.m19006f(enumC17331H, enumC17331H2);
        if (!c17342i.f55252a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c17342i.f55253b = true;
        f55256e = c17342i.m19001a();
        C17342i c17342i2 = new C17342i();
        c17342i2.m19004d((C17341h[]) Arrays.copyOf(c17341hArr, 16));
        c17342i2.m19006f(enumC17331H, enumC17331H2);
        if (!c17342i2.f55252a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c17342i2.f55253b = true;
        f55257f = c17342i2.m19001a();
        C17342i c17342i3 = new C17342i();
        c17342i3.m19004d((C17341h[]) Arrays.copyOf(c17341hArr, 16));
        c17342i3.m19006f(enumC17331H, enumC17331H2, EnumC17331H.TLS_1_1, EnumC17331H.TLS_1_0);
        if (!c17342i3.f55252a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c17342i3.f55253b = true;
        c17342i3.m19001a();
        f55258g = new C17343j(false, false, null, null);
    }

    public C17343j(boolean z6, boolean z10, String[] strArr, String[] strArr2) {
        this.f55259a = z6;
        this.f55260b = z10;
        this.f55261c = strArr;
        this.f55262d = strArr2;
    }

    /* JADX INFO: renamed from: a */
    public final List m19007a() {
        String[] strArr = this.f55261c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C17341h.f55232b.m18999d(str));
        }
        return AbstractC17680n.m19322C0(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19008b(SSLSocket sSLSocket) {
        if (!this.f55259a) {
            return false;
        }
        String[] strArr = this.f55262d;
        if (strArr != null && !AbstractC17708b.m19419k(strArr, sSLSocket.getEnabledProtocols(), C18513a.f58995Z)) {
            return false;
        }
        String[] strArr2 = this.f55261c;
        return strArr2 == null || AbstractC17708b.m19419k(strArr2, sSLSocket.getEnabledCipherSuites(), C17341h.f55233c);
    }

    /* JADX INFO: renamed from: c */
    public final List m19009c() {
        String[] strArr = this.f55262d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC9141H2.m9686a(str));
        }
        return AbstractC17680n.m19322C0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17343j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C17343j c17343j = (C17343j) obj;
        boolean z6 = c17343j.f55259a;
        boolean z10 = this.f55259a;
        if (z10 != z6) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f55261c, c17343j.f55261c) && Arrays.equals(this.f55262d, c17343j.f55262d) && this.f55260b == c17343j.f55260b);
    }

    public final int hashCode() {
        if (!this.f55259a) {
            return 17;
        }
        String[] strArr = this.f55261c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f55262d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f55260b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f55259a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append(Objects.toString(m19007a(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append(Objects.toString(m19009c(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return AbstractC3794B0.m4499x(sb2, this.f55260b, ')');
    }
}
