package p1068vo;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC16544l;
import org.conscrypt.Conscrypt;
import p1048uo.C20401h;
import p1048uo.C20407n;
import p885m4.C17152b;

/* JADX INFO: renamed from: vo.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C20661k implements InterfaceC20664n {

    /* JADX INFO: renamed from: a */
    public static final C20660j f65544a = new C20660j();

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: a */
    public final boolean mo21201a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: b */
    public final boolean mo21202b() {
        boolean z6 = C20401h.f64512d;
        return C20401h.f64512d;
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: c */
    public final String mo21203c(SSLSocket sSLSocket) {
        if (mo21201a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: d */
    public final void mo21204d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC16544l.m18094g(protocols, "protocols");
        if (mo21201a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C20407n c20407n = C20407n.f64525a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C17152b.m18910g(protocols).toArray(new String[0]));
        }
    }
}
