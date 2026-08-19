package p026Ao;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: Ao.K */
/* JADX INFO: loaded from: classes2.dex */
public final class C0662K extends C0672f {

    /* JADX INFO: renamed from: m */
    public final Socket f1936m;

    public C0662K(Socket socket) {
        this.f1936m = socket;
    }

    @Override // p026Ao.C0672f
    /* JADX INFO: renamed from: k */
    public final void mo1385k() {
        Socket socket = this.f1936m;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (!AbstractC0668b.m1406f(e10)) {
                throw e10;
            }
            AbstractC0652A.f1907a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        } catch (Exception e11) {
            AbstractC0652A.f1907a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }

    /* JADX INFO: renamed from: l */
    public final IOException m1386l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
