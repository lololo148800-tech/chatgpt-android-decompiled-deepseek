package p189Ha;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import p109E3.C2292p;
import p658b5.C11238i;
import p985r9.C18902l;
import p985r9.ServiceConnectionC18901k;

/* JADX INFO: renamed from: Ha.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3278l implements Handler.Callback {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9995Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f9996Z;

    public /* synthetic */ C3278l(Object obj, int i10) {
        this.f9995Y = i10;
        this.f9996Z = obj;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m4156a(Message message) {
        if (message.what != 0) {
            return false;
        }
        C11238i c11238i = (C11238i) this.f9996Z;
        C3279m c3279m = (C3279m) message.obj;
        synchronized (c11238i.f34008Y) {
            if (((C3279m) c11238i.f34010o0) == c3279m || ((C3279m) c11238i.f34011p0) == c3279m) {
                c11238i.m12552X(c3279m, 2);
            }
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f9995Y) {
            case 0:
                return m4156a(message);
            default:
                int i10 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i10);
                }
                ServiceConnectionC18901k serviceConnectionC18901k = (ServiceConnectionC18901k) this.f9996Z;
                synchronized (serviceConnectionC18901k) {
                    try {
                        C18902l c18902l = (C18902l) serviceConnectionC18901k.f60259e.get(i10);
                        if (c18902l == null) {
                            AbstractC15256t.m16482t("MessengerIpcClient", "Received response for unknown request: " + i10);
                            return true;
                        }
                        serviceConnectionC18901k.f60259e.remove(i10);
                        serviceConnectionC18901k.m20211c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            c18902l.m20214b(new C2292p("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (c18902l.f60265e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    c18902l.m20215c(null);
                                    return true;
                                }
                                c18902l.m20214b(new C2292p("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                c18902l.m20215c(bundle);
                                return true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
