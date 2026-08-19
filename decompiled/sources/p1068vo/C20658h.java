package p1068vo;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC16544l;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p1048uo.C20398e;
import p1048uo.C20407n;
import p885m4.C17152b;

/* JADX INFO: renamed from: vo.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C20658h implements InterfaceC20664n {

    /* JADX INFO: renamed from: a */
    public static final C20657g f65540a = new C20657g();

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: a */
    public final boolean mo21201a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: b */
    public final boolean mo21202b() {
        boolean z6 = C20398e.f64509d;
        return C20398e.f64509d;
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: c */
    public final String mo21203c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : AbstractC16544l.m18089b(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: d */
    public final void mo21204d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC16544l.m18094g(protocols, "protocols");
        if (mo21201a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C20407n c20407n = C20407n.f64525a;
            parameters.setApplicationProtocols((String[]) C17152b.m18910g(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
