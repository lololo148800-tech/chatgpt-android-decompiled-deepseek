package p046Bk;

import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Bk.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1401p0 extends AbstractC1405r0 {

    /* JADX INFO: renamed from: a */
    public final String f3739a;

    /* JADX INFO: renamed from: b */
    public final InternalErrorInfo.NetworkErrorInfo f3740b;

    public C1401p0(String str, InternalErrorInfo.NetworkErrorInfo cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f3739a = str;
        this.f3740b = cause;
    }
}
