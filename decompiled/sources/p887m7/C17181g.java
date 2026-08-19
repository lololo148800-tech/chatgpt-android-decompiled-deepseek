package p887m7;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p582Xk.HXHG.TfazcFv;

/* JADX INFO: renamed from: m7.g */
/* JADX INFO: loaded from: classes.dex */
public final class C17181g {

    /* JADX INFO: renamed from: a */
    public final String f54883a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f54884b;

    /* JADX INFO: renamed from: c */
    public final long f54885c;

    public C17181g(String hostname, ArrayList arrayList) {
        AbstractC16544l.m18094g(hostname, "hostname");
        this.f54883a = hostname;
        this.f54884b = arrayList;
        this.f54885c = System.nanoTime();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17181g)) {
            return false;
        }
        C17181g c17181g = (C17181g) obj;
        return AbstractC16544l.m18089b(this.f54883a, c17181g.f54883a) && this.f54884b.equals(c17181g.f54884b);
    }

    public final int hashCode() {
        return this.f54884b.hashCode() + (this.f54883a.hashCode() * 31);
    }

    public final String toString() {
        return "ResolvedHost(hostname=" + this.f54883a + TfazcFv.OnJUXCZi + this.f54884b + Separators.RPAREN;
    }
}
