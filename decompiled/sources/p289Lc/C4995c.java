package p289Lc;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17309l;
import p1081wc.C20887f;
import p1081wc.InterfaceC20904w;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: Lc.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4995c implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC20904w f16304Y;

    /* JADX INFO: renamed from: Z */
    public Thread.UncaughtExceptionHandler f16305Z;

    public C4995c(InterfaceC20904w analyticsService) {
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f16304Y = analyticsService;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t10, Throwable e10) {
        String strMo4448c;
        AbstractC16544l.m18094g(t10, "t");
        AbstractC16544l.m18094g(e10, "e");
        try {
            InterfaceC20904w interfaceC20904w = this.f16304Y;
            C20887f c20887f = C20887f.f66531f;
            C17309l c17309l = new C17309l("thread", t10.getName());
            Class<?> cls = e10.getClass();
            C16527D c16527d = AbstractC16526C.f51263a;
            String strMo4448c2 = c16527d.mo5693b(cls).mo4448c();
            String str = "Unknown";
            if (strMo4448c2 == null) {
                strMo4448c2 = "Unknown";
            }
            C17309l c17309l2 = new C17309l("exception_type", strMo4448c2);
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            C17309l c17309l3 = new C17309l("exception_message", message);
            Throwable cause = e10.getCause();
            if (cause != null && (strMo4448c = c16527d.mo5693b(cause.getClass()).mo4448c()) != null) {
                str = strMo4448c;
            }
            interfaceC20904w.mo21447a(c20887f, AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, new C17309l("exception_cause_type", str)));
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f16305Z;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(t10, e10);
            }
        }
    }
}
