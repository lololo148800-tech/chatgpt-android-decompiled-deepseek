package p1087wj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: wj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20984e extends AbstractC20986g {

    /* JADX INFO: renamed from: a */
    public final InternalErrorInfo.NetworkErrorInfo f66811a;

    public C20984e(InternalErrorInfo.NetworkErrorInfo cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f66811a = cause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20984e) && AbstractC16544l.m18089b(this.f66811a, ((C20984e) obj).f66811a);
    }

    public final int hashCode() {
        return this.f66811a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.f66811a + Separators.RPAREN;
    }
}
