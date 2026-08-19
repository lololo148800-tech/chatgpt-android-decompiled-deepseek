package p1044uj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uj.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C20319V extends AbstractC20321X {

    /* JADX INFO: renamed from: a */
    public final InternalErrorInfo.NetworkErrorInfo f64230a;

    public C20319V(InternalErrorInfo.NetworkErrorInfo cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f64230a = cause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20319V) && AbstractC16544l.m18089b(this.f64230a, ((C20319V) obj).f64230a);
    }

    public final int hashCode() {
        return this.f64230a.hashCode();
    }

    public final String toString() {
        return "Errored(cause=" + this.f64230a + Separators.RPAREN;
    }
}
