package p1068vo;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p1048uo.AbstractC20399f;
import p1048uo.C20401h;

/* JADX INFO: renamed from: vo.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C20660j implements InterfaceC20662l {
    @Override // p1068vo.InterfaceC20662l
    /* JADX INFO: renamed from: a */
    public final boolean mo21205a(SSLSocket sSLSocket) {
        boolean z6 = C20401h.f64512d;
        return AbstractC20399f.m21067b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p1068vo.InterfaceC20662l
    /* JADX INFO: renamed from: b */
    public final InterfaceC20664n mo21206b(SSLSocket sSLSocket) {
        return new C20661k();
    }
}
