package p247Jj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Jj.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C4434i extends AbstractC4438k {

    /* JADX INFO: renamed from: a */
    public final InternalErrorInfo.NetworkErrorInfo f14436a;

    public C4434i(InternalErrorInfo.NetworkErrorInfo cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f14436a = cause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4434i) && AbstractC16544l.m18089b(this.f14436a, ((C4434i) obj).f14436a);
    }

    public final int hashCode() {
        return this.f14436a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.f14436a + Separators.RPAREN;
    }
}
