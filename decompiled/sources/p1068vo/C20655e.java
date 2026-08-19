package p1068vo;

import javax.net.ssl.SSLSocket;
import p1113xn.AbstractC21329w;

/* JADX INFO: renamed from: vo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C20655e implements InterfaceC20662l {
    @Override // p1068vo.InterfaceC20662l
    /* JADX INFO: renamed from: a */
    public final boolean mo21205a(SSLSocket sSLSocket) {
        return AbstractC21329w.m21734u(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // p1068vo.InterfaceC20662l
    /* JADX INFO: renamed from: b */
    public final InterfaceC20664n mo21206b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C20656f(superclass);
    }
}
