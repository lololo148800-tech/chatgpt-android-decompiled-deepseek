package p247Jj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Jj.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C4446o extends AbstractC4450q {

    /* JADX INFO: renamed from: a */
    public final String f14482a;

    /* JADX INFO: renamed from: b */
    public final InternalErrorInfo f14483b;

    public C4446o(String str, InternalErrorInfo cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f14482a = str;
        this.f14483b = cause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4446o)) {
            return false;
        }
        C4446o c4446o = (C4446o) obj;
        return AbstractC16544l.m18089b(this.f14482a, c4446o.f14482a) && AbstractC16544l.m18089b(this.f14483b, c4446o.f14483b);
    }

    public final int hashCode() {
        String str = this.f14482a;
        return this.f14483b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(debugMessage=" + this.f14482a + ", cause=" + this.f14483b + Separators.RPAREN;
    }
}
