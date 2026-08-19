package p949pj;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17312o;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: pj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18455b {

    /* JADX INFO: renamed from: a */
    public final Object f58897a;

    /* JADX INFO: renamed from: b */
    public final boolean f58898b;

    public C18455b(Object obj, boolean z6) {
        this.f58897a = obj;
        this.f58898b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18455b)) {
            return false;
        }
        C18455b c18455b = (C18455b) obj;
        return AbstractC16544l.m18089b(this.f58897a, c18455b.f58897a) && this.f58898b == c18455b.f58898b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        Object obj = this.f58897a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        boolean z6 = this.f58898b;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iHashCode + r6;
    }

    public final String toString() {
        return AbstractC14376f.m15823B(AbstractC10763a.m11058p("AnalyzerResult(result=", C17312o.m18980b(this.f58897a), ", isActiveAnalyzer="), this.f58898b, Separators.RPAREN);
    }
}
