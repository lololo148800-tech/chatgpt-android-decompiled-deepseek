package p046Bk;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Bk.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C1316B implements InterfaceC1318C {

    /* JADX INFO: renamed from: a */
    public final InternalErrorInfo f3480a;

    public C1316B(InternalErrorInfo errorInfo) {
        AbstractC16544l.m18094g(errorInfo, "errorInfo");
        this.f3480a = errorInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1316B) && AbstractC16544l.m18089b(this.f3480a, ((C1316B) obj).f3480a);
    }

    public final int hashCode() {
        return this.f3480a.hashCode();
    }

    public final String toString() {
        return "Error(errorInfo=" + this.f3480a + Separators.RPAREN;
    }
}
