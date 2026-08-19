package p1087wj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: wj.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C20973D extends AbstractC20975F {

    /* JADX INFO: renamed from: a */
    public final InternalErrorInfo.NetworkErrorInfo f66785a;

    public C20973D(InternalErrorInfo.NetworkErrorInfo cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f66785a = cause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20973D) && AbstractC16544l.m18089b(this.f66785a, ((C20973D) obj).f66785a);
    }

    public final int hashCode() {
        return this.f66785a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.f66785a + Separators.RPAREN;
    }
}
