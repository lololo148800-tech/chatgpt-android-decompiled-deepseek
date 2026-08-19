package p857kl;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: kl.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C16438E {

    /* JADX INFO: renamed from: b */
    public static final C16438E f50984b;

    /* JADX INFO: renamed from: c */
    public static final C16438E f50985c;

    /* JADX INFO: renamed from: d */
    public static final C16438E f50986d;

    /* JADX INFO: renamed from: e */
    public static final C16438E f50987e;

    /* JADX INFO: renamed from: f */
    public static final C16438E f50988f;

    /* JADX INFO: renamed from: g */
    public static final C16438E f50989g;

    /* JADX INFO: renamed from: h */
    public static final C16438E f50990h;

    /* JADX INFO: renamed from: i */
    public static final List f50991i;

    /* JADX INFO: renamed from: a */
    public final String f50992a;

    static {
        C16438E c16438e = new C16438E("GET");
        f50984b = c16438e;
        C16438E c16438e2 = new C16438E("POST");
        f50985c = c16438e2;
        C16438E c16438e3 = new C16438E("PUT");
        f50986d = c16438e3;
        C16438E c16438e4 = new C16438E("PATCH");
        f50987e = c16438e4;
        C16438E c16438e5 = new C16438E("DELETE");
        f50988f = c16438e5;
        C16438E c16438e6 = new C16438E("HEAD");
        f50989g = c16438e6;
        C16438E c16438e7 = new C16438E(TokenNames.OPTIONS);
        f50990h = c16438e7;
        f50991i = AbstractC17681o.m19382k(c16438e, c16438e2, c16438e3, c16438e4, c16438e5, c16438e6, c16438e7);
    }

    public C16438E(String value) {
        AbstractC16544l.m18094g(value, "value");
        this.f50992a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16438E) && AbstractC16544l.m18089b(this.f50992a, ((C16438E) obj).f50992a);
    }

    public final int hashCode() {
        return this.f50992a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("HttpMethod(value="), this.f50992a, ')');
    }
}
