package p247Jj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Jj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4420b extends AbstractC4424d {

    /* JADX INFO: renamed from: a */
    public final InternalErrorInfo.NetworkErrorInfo f14339a;

    public C4420b(InternalErrorInfo.NetworkErrorInfo cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f14339a = cause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4420b) && AbstractC16544l.m18089b(this.f14339a, ((C4420b) obj).f14339a);
    }

    public final int hashCode() {
        return this.f14339a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.f14339a + Separators.RPAREN;
    }
}
