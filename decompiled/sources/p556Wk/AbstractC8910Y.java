package p556Wk;

import java.net.SocketTimeoutException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import np.InterfaceC17710b;
import p008A6.C0383c;
import p049Bm.InterfaceC1436k;
import p059C5.C1601s;
import p485Tk.AbstractC7498g;
import p523V9.AbstractC8103h5;
import p582Xk.C9526c;
import p594Y9.AbstractC9949p4;
import p754fl.C13693c;
import p754fl.C13694d;

/* JADX INFO: renamed from: Wk.Y */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8910Y {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC17710b f27266a = AbstractC8103h5.m8580a("io.ktor.client.plugins.HttpTimeout");

    /* JADX INFO: renamed from: b */
    public static final C9526c f27267b = AbstractC9949p4.m10607a("HttpTimeout", C8908W.f27261t0, new C0383c(18));

    /* JADX INFO: renamed from: a */
    public static final SocketTimeoutException m9564a(C13694d request, Throwable th2) {
        Object obj;
        AbstractC16544l.m18094g(request, "request");
        StringBuilder sb2 = new StringBuilder("Socket timeout has expired [url=");
        sb2.append(request.f43201a);
        sb2.append(", socket_timeout=");
        C8907V c8907v = (C8907V) request.m15170a();
        if (c8907v == null || (obj = c8907v.f27260c) == null) {
            obj = "unknown";
        }
        sb2.append(obj);
        sb2.append("] ms");
        String message = sb2.toString();
        AbstractC16544l.m18094g(message, "message");
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(message);
        socketTimeoutException.initCause(th2);
        return socketTimeoutException;
    }

    /* JADX INFO: renamed from: b */
    public static final void m9565b(C13693c c13693c, InterfaceC1436k interfaceC1436k) {
        C8907V c8907v = new C8907V();
        interfaceC1436k.invoke(c8907v);
        ((Map) c13693c.f43200f.m20647a(AbstractC7498g.f23799a, new C1601s(19))).put(C8906U.f27257a, c8907v);
    }
}
