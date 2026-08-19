package ch;

import com.revenuecat.purchases.LogHandler;
import kotlin.jvm.internal.AbstractC16544l;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: ch.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C11750d implements LogHandler {

    /* JADX INFO: renamed from: a */
    public static final C11750d f35630a = new C11750d();

    /* JADX INFO: renamed from: b */
    public static final C3430e f35631b = AbstractC8168p6.m8749b("RevenueCatLogger", null);

    @Override // com.revenuecat.purchases.LogHandler
    /* JADX INFO: renamed from: d */
    public final void mo13045d(String tag, String msg) {
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16544l.m18094g(msg, "msg");
        AbstractC8160o6.m8726a(f35631b, AbstractC9306j0.m9890i(tag, ": ", msg), null, 6);
    }

    @Override // com.revenuecat.purchases.LogHandler
    /* JADX INFO: renamed from: e */
    public final void mo13046e(String tag, String msg, Throwable th2) {
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16544l.m18094g(msg, "msg");
        AbstractC8160o6.m8727b(f35631b, AbstractC9306j0.m9890i(tag, ": ", msg), th2, 4);
    }

    @Override // com.revenuecat.purchases.LogHandler
    /* JADX INFO: renamed from: i */
    public final void mo13047i(String tag, String msg) {
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16544l.m18094g(msg, "msg");
        AbstractC8160o6.m8728c(f35631b, AbstractC9306j0.m9890i(tag, ": ", msg), null, null, 6);
    }

    @Override // com.revenuecat.purchases.LogHandler
    /* JADX INFO: renamed from: v */
    public final void mo13048v(String tag, String msg) {
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16544l.m18094g(msg, "msg");
        AbstractC8160o6.m8728c(f35631b, AbstractC9306j0.m9890i(tag, ": ", msg), null, null, 6);
    }

    @Override // com.revenuecat.purchases.LogHandler
    /* JADX INFO: renamed from: w */
    public final void mo13049w(String tag, String msg) {
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16544l.m18094g(msg, "msg");
        AbstractC8160o6.m8731f(f35631b, AbstractC9306j0.m9890i(tag, ": ", msg), null, null, 6);
    }
}
