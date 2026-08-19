package io.ktor.utils.p815io;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import p025An.AbstractC0575H;
import p025An.InterfaceC0648y;

/* JADX INFO: renamed from: io.ktor.utils.io.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C15071G {

    /* JADX INFO: renamed from: a */
    public final Throwable f46834a;

    /* JADX WARN: Multi-variable type inference failed */
    public C15071G(Throwable th2) {
        Throwable iOException;
        if (th2 == 0) {
            iOException = null;
        } else if (th2 instanceof CancellationException) {
            if (th2 instanceof InterfaceC0648y) {
                iOException = ((InterfaceC0648y) th2).mo1152a();
            } else {
                String message = ((CancellationException) th2).getMessage();
                iOException = AbstractC0575H.m1172a(message == null ? "Channel was cancelled" : message, th2);
            }
        } else if ((th2 instanceof IOException) && (th2 instanceof InterfaceC0648y)) {
            iOException = ((InterfaceC0648y) th2).mo1152a();
        } else {
            String message2 = th2.getMessage();
            iOException = new IOException(message2 == null ? "Channel was closed" : message2, th2);
        }
        this.f46834a = iOException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final Throwable m16195a() {
        Throwable thMo1152a;
        Throwable th2 = this.f46834a;
        if (th2 == 0) {
            return null;
        }
        if (th2 instanceof IOException) {
            if (th2 instanceof InterfaceC0648y) {
                return ((InterfaceC0648y) th2).mo1152a();
            }
            thMo1152a = new IOException(((IOException) th2).getMessage(), th2);
        } else {
            if (!(th2 instanceof InterfaceC0648y)) {
                return AbstractC0575H.m1172a(th2.getMessage(), th2);
            }
            thMo1152a = ((InterfaceC0648y) th2).mo1152a();
            if (thMo1152a == null) {
                return AbstractC0575H.m1172a(th2.getMessage(), th2);
            }
        }
        return thMo1152a;
    }
}
