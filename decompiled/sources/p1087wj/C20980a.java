package p1087wj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: wj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20980a extends AbstractC20982c {

    /* JADX INFO: renamed from: a */
    public final InternalErrorInfo.NetworkErrorInfo f66804a;

    public C20980a(InternalErrorInfo.NetworkErrorInfo cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f66804a = cause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20980a) && AbstractC16544l.m18089b(this.f66804a, ((C20980a) obj).f66804a);
    }

    public final int hashCode() {
        return this.f66804a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.f66804a + Separators.RPAREN;
    }
}
