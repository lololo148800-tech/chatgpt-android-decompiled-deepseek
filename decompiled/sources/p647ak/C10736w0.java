package p647ak;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ak.w0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10736w0 extends AbstractC10740y0 {

    /* JADX INFO: renamed from: a */
    public final InternalErrorInfo f31912a;

    public C10736w0(InternalErrorInfo cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f31912a = cause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10736w0) && AbstractC16544l.m18089b(this.f31912a, ((C10736w0) obj).f31912a);
    }

    public final int hashCode() {
        return this.f31912a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.f31912a + Separators.RPAREN;
    }
}
