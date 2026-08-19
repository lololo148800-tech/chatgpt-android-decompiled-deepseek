package p890mb;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ParameterNames;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: mb.i */
/* JADX INFO: loaded from: classes.dex */
public final class C17212i {

    /* JADX INFO: renamed from: a */
    public final C17220q f54943a;

    /* JADX INFO: renamed from: b */
    public final int f54944b;

    /* JADX INFO: renamed from: c */
    public final int f54945c;

    public C17212i(int i10, int i11, Class cls) {
        this(C17220q.m18953a(cls), i10, i11);
    }

    /* JADX INFO: renamed from: a */
    public static C17212i m18950a(Class cls) {
        return new C17212i(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17212i)) {
            return false;
        }
        C17212i c17212i = (C17212i) obj;
        return this.f54943a.equals(c17212i.f54943a) && this.f54944b == c17212i.f54944b && this.f54945c == c17212i.f54945c;
    }

    public final int hashCode() {
        return ((((this.f54943a.hashCode() ^ 1000003) * 1000003) ^ this.f54944b) * 1000003) ^ this.f54945c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f54943a);
        sb2.append(", type=");
        int i10 = this.f54944b;
        if (i10 == 1) {
            str = ParameterNames.REQUIRED;
        } else {
            str = i10 == 0 ? ParameterNames.OPTIONAL : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f54945c;
        if (i11 == 0) {
            str2 = "direct";
        } else if (i11 == 1) {
            str2 = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(AbstractC10763a.m11048f(i11, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return AbstractC9306j0.m9891j(str2, "}", sb2);
    }

    public C17212i(C17220q c17220q, int i10, int i11) {
        this.f54943a = c17220q;
        this.f54944b = i10;
        this.f54945c = i11;
    }
}
