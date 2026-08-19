package p887m7;

import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mo.InterfaceC17345l;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p523V9.AbstractC8128k6;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: m7.h */
/* JADX INFO: loaded from: classes.dex */
public final class C17182h implements InterfaceC17345l {

    /* JADX INFO: renamed from: e */
    public static final long f54886e;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17345l f54887b = InterfaceC17345l.f55276a;

    /* JADX INFO: renamed from: c */
    public final long f54888c = f54886e;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f54889d = new LinkedHashMap();

    static {
        C21554a c21554a = C21555b.f68260Z;
        f54886e = AbstractC8128k6.m8644j(30, EnumC21557d.MINUTES);
    }

    /* JADX INFO: renamed from: b */
    public static List m18926b(List list) {
        List listM19322C0;
        synchronized (list) {
            listM19322C0 = AbstractC17680n.m19322C0(list);
        }
        return listM19322C0;
    }

    @Override // mo.InterfaceC17345l
    /* JADX INFO: renamed from: a */
    public final List mo18927a(String hostname) {
        AbstractC16544l.m18094g(hostname, "hostname");
        C17181g c17181g = (C17181g) this.f54889d.get(hostname);
        if (c17181g != null) {
            C21554a c21554a = C21555b.f68260Z;
            if (C21555b.m21833c(AbstractC8128k6.m8645k(System.nanoTime() - c17181g.f54885c, EnumC21557d.NANOSECONDS), this.f54888c) < 0 && !c17181g.f54884b.isEmpty()) {
                synchronized (c17181g.f54884b) {
                    InetAddress inetAddress = (InetAddress) AbstractC17686t.m19396D(c17181g.f54884b);
                    if (inetAddress != null) {
                        c17181g.f54884b.add(inetAddress);
                    }
                }
                return m18926b(c17181g.f54884b);
            }
        }
        List listMo18927a = this.f54887b.mo18927a(hostname);
        this.f54889d.put(hostname, new C17181g(hostname, AbstractC17680n.m19323D0(listMo18927a)));
        return m18926b(listMo18927a);
    }
}
