package p984r8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: r8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C18890d {

    /* JADX INFO: renamed from: a */
    public final int f60224a;

    /* JADX INFO: renamed from: b */
    public final String f60225b;

    /* JADX INFO: renamed from: c */
    public final String f60226c;

    public C18890d(int i10, String message, String str) {
        AbstractC14376f.m15825D(i10, "type");
        AbstractC16544l.m18094g(message, "message");
        this.f60224a = i10;
        this.f60225b = message;
        this.f60226c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18890d)) {
            return false;
        }
        C18890d c18890d = (C18890d) obj;
        return this.f60224a == c18890d.f60224a && AbstractC16544l.m18089b(this.f60225b, c18890d.f60225b) && AbstractC16544l.m18089b(this.f60226c, c18890d.f60226c);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0010F.m24h(this.f60224a) * 31, 31, this.f60225b);
        String str = this.f60226c;
        return iM527p + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TelemetryEventId(type=");
        switch (this.f60224a) {
            case 1:
                str = "DEBUG";
                break;
            case 2:
                str = "ERROR";
                break;
            case 3:
                str = "CONFIGURATION";
                break;
            case 4:
                str = "INTERCEPTOR_SETUP";
                break;
            case 5:
                str = "API_USAGE";
                break;
            case 6:
                str = "METRIC";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(", message=");
        sb2.append(this.f60225b);
        sb2.append(", kind=");
        return AbstractC9306j0.m9891j(this.f60226c, Separators.RPAREN, sb2);
    }
}
