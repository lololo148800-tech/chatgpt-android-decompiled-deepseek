package p1092wo;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: wo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C21037a extends ProxySelector {

    /* JADX INFO: renamed from: a */
    public static final C21037a f66919a = new C21037a();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return AbstractC9393x3.m9974d(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
