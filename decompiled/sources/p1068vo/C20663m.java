package p1068vo;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: vo.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C20663m implements InterfaceC20664n {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20662l f65545a;

    /* JADX INFO: renamed from: b */
    public InterfaceC20664n f65546b;

    public C20663m(InterfaceC20662l interfaceC20662l) {
        this.f65545a = interfaceC20662l;
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: a */
    public final boolean mo21201a(SSLSocket sSLSocket) {
        return this.f65545a.mo21205a(sSLSocket);
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: b */
    public final boolean mo21202b() {
        return true;
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: c */
    public final String mo21203c(SSLSocket sSLSocket) {
        InterfaceC20664n interfaceC20664nM21211e = m21211e(sSLSocket);
        if (interfaceC20664nM21211e != null) {
            return interfaceC20664nM21211e.mo21203c(sSLSocket);
        }
        return null;
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: d */
    public final void mo21204d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC16544l.m18094g(protocols, "protocols");
        InterfaceC20664n interfaceC20664nM21211e = m21211e(sSLSocket);
        if (interfaceC20664nM21211e != null) {
            interfaceC20664nM21211e.mo21204d(sSLSocket, str, protocols);
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized InterfaceC20664n m21211e(SSLSocket sSLSocket) {
        try {
            if (this.f65546b == null && this.f65545a.mo21205a(sSLSocket)) {
                this.f65546b = this.f65545a.mo21206b(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f65546b;
    }
}
