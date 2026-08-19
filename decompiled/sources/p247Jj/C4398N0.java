package p247Jj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Jj.N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4398N0 extends AbstractC4402P0 {

    /* JADX INFO: renamed from: a */
    public final InternalErrorInfo.NetworkErrorInfo f14285a;

    public C4398N0(InternalErrorInfo.NetworkErrorInfo cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f14285a = cause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4398N0) && AbstractC16544l.m18089b(this.f14285a, ((C4398N0) obj).f14285a);
    }

    public final int hashCode() {
        return this.f14285a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.f14285a + Separators.RPAREN;
    }
}
