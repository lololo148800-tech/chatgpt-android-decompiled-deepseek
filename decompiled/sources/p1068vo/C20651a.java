package p1068vo;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC16544l;
import p1048uo.C20407n;
import p885m4.C17152b;

/* JADX INFO: renamed from: vo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C20651a implements InterfaceC20664n {
    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: a */
    public final boolean mo21201a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: b */
    public final boolean mo21202b() {
        C20407n c20407n = C20407n.f64525a;
        return C17152b.m18912i() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: c */
    public final String mo21203c(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: d */
    public final void mo21204d(SSLSocket sSLSocket, String str, List protocols) throws IOException {
        AbstractC16544l.m18094g(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C20407n c20407n = C20407n.f64525a;
            sSLParameters.setApplicationProtocols((String[]) C17152b.m18910g(protocols).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
