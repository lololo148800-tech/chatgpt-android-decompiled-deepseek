package p046Bk;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Bk.Z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1364Z0 implements InterfaceC1367a1 {

    /* JADX INFO: renamed from: a */
    public final InternalErrorInfo f3621a;

    public C1364Z0(InternalErrorInfo errorInfo) {
        AbstractC16544l.m18094g(errorInfo, "errorInfo");
        this.f3621a = errorInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1364Z0) && AbstractC16544l.m18089b(this.f3621a, ((C1364Z0) obj).f3621a);
    }

    public final int hashCode() {
        return this.f3621a.hashCode();
    }

    public final String toString() {
        return "Error(errorInfo=" + this.f3621a + Separators.RPAREN;
    }
}
