package p126Ek;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ek.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2569b extends AbstractC2571d {

    /* JADX INFO: renamed from: a */
    public final InternalErrorInfo.NetworkErrorInfo f8000a;

    public C2569b(InternalErrorInfo.NetworkErrorInfo cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f8000a = cause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2569b) && AbstractC16544l.m18089b(this.f8000a, ((C2569b) obj).f8000a);
    }

    public final int hashCode() {
        return this.f8000a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.f8000a + Separators.RPAREN;
    }
}
