package mo;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p903n9.C17527a;

/* JADX INFO: renamed from: mo.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C17342i {

    /* JADX INFO: renamed from: a */
    public boolean f55252a;

    /* JADX INFO: renamed from: b */
    public boolean f55253b;

    /* JADX INFO: renamed from: c */
    public Object f55254c;

    /* JADX INFO: renamed from: d */
    public Object f55255d;

    public C17342i() {
        this.f55252a = true;
    }

    /* JADX INFO: renamed from: a */
    public C17343j m19001a() {
        return new C17343j(this.f55252a, this.f55253b, (String[]) this.f55254c, (String[]) this.f55255d);
    }

    /* JADX INFO: renamed from: b */
    public C17527a m19002b() {
        return new C17527a(this.f55252a, (String) this.f55254c, (String) this.f55255d, this.f55253b, null, null, false);
    }

    /* JADX INFO: renamed from: c */
    public void m19003c(String... cipherSuites) {
        AbstractC16544l.m18094g(cipherSuites, "cipherSuites");
        if (!this.f55252a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f55254c = (String[]) cipherSuites.clone();
    }

    /* JADX INFO: renamed from: d */
    public void m19004d(C17341h... cipherSuites) {
        AbstractC16544l.m18094g(cipherSuites, "cipherSuites");
        if (!this.f55252a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (C17341h c17341h : cipherSuites) {
            arrayList.add(c17341h.f55251a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m19003c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: e */
    public void m19005e(String... tlsVersions) {
        AbstractC16544l.m18094g(tlsVersions, "tlsVersions");
        if (!this.f55252a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f55255d = (String[]) tlsVersions.clone();
    }

    /* JADX INFO: renamed from: f */
    public void m19006f(EnumC17331H... enumC17331HArr) {
        if (!this.f55252a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(enumC17331HArr.length);
        for (EnumC17331H enumC17331H : enumC17331HArr) {
            arrayList.add(enumC17331H.f55200Y);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m19005e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public C17342i(C17343j connectionSpec) {
        AbstractC16544l.m18094g(connectionSpec, "connectionSpec");
        this.f55252a = connectionSpec.f55259a;
        this.f55254c = connectionSpec.f55261c;
        this.f55255d = connectionSpec.f55262d;
        this.f55253b = connectionSpec.f55260b;
    }
}
