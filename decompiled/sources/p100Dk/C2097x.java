package p100Dk;

import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Dk.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C2097x extends AbstractC2099z {

    /* JADX INFO: renamed from: a */
    public final String f6445a;

    /* JADX INFO: renamed from: b */
    public final InternalErrorInfo.NetworkErrorInfo f6446b;

    public C2097x(String str, InternalErrorInfo.NetworkErrorInfo cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f6445a = str;
        this.f6446b = cause;
    }
}
