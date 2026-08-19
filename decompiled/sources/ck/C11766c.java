package ck;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ck.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11766c extends AbstractC11768e {

    /* JADX INFO: renamed from: a */
    public final InternalErrorInfo.NetworkErrorInfo f35687a;

    public C11766c(InternalErrorInfo.NetworkErrorInfo cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f35687a = cause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11766c) && AbstractC16544l.m18089b(this.f35687a, ((C11766c) obj).f35687a);
    }

    public final int hashCode() {
        return this.f35687a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.f35687a + Separators.RPAREN;
    }
}
