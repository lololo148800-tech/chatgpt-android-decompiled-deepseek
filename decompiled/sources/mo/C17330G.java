package mo;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mo.G */
/* JADX INFO: loaded from: classes2.dex */
public final class C17330G {

    /* JADX INFO: renamed from: a */
    public final C17334a f55191a;

    /* JADX INFO: renamed from: b */
    public final Proxy f55192b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f55193c;

    public C17330G(C17334a c17334a, Proxy proxy, InetSocketAddress socketAddress) {
        AbstractC16544l.m18094g(socketAddress, "socketAddress");
        this.f55191a = c17334a;
        this.f55192b = proxy;
        this.f55193c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17330G) {
            C17330G c17330g = (C17330G) obj;
            if (AbstractC16544l.m18089b(c17330g.f55191a, this.f55191a) && AbstractC16544l.m18089b(c17330g.f55192b, this.f55192b) && AbstractC16544l.m18089b(c17330g.f55193c, this.f55193c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f55193c.hashCode() + ((this.f55192b.hashCode() + ((this.f55191a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f55193c + '}';
    }
}
