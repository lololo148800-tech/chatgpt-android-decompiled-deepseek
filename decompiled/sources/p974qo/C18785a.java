package p974qo;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17327D;
import mo.C17356w;
import mo.InterfaceC17350q;
import mo.InterfaceC17351r;
import p005A3.C0326m;
import ro.C19261e;
import ro.InterfaceC19259c;

/* JADX INFO: renamed from: qo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C18785a implements InterfaceC17351r {

    /* JADX INFO: renamed from: a */
    public static final C18785a f59692a = new C18785a();

    @Override // mo.InterfaceC17351r
    public final C17327D intercept(InterfaceC17350q interfaceC17350q) throws IOException {
        C19261e c19261e = (C19261e) interfaceC17350q;
        C18792h call = c19261e.f61053a;
        call.getClass();
        synchronized (call) {
            try {
                if (!call.f59734z0) {
                    throw new IllegalStateException("released");
                }
                if (call.f59733y0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (call.f59732x0) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C18788d finder = call.f59728t0;
        AbstractC16544l.m18091d(finder);
        C17356w client = call.f59721Y;
        AbstractC16544l.m18094g(client, "client");
        try {
            InterfaceC19259c interfaceC19259cM20079k = finder.m20056a(c19261e.f61058f, c19261e.f61059g, c19261e.f61060h, client.f55362r0, !AbstractC16544l.m18089b(c19261e.f61057e.f55380b, "GET")).m20079k(client, c19261e);
            AbstractC16544l.m18094g(call, "call");
            AbstractC16544l.m18094g(finder, "finder");
            C0326m c0326m = new C0326m();
            c0326m.f1140b = call;
            c0326m.f1141c = finder;
            c0326m.f1142d = interfaceC19259cM20079k;
            c0326m.f1143e = interfaceC19259cM20079k.getConnection();
            call.f59731w0 = c0326m;
            call.f59719B0 = c0326m;
            synchronized (call) {
                call.f59732x0 = true;
                call.f59733y0 = true;
            }
            if (call.f59718A0) {
                throw new IOException("Canceled");
            }
            return C19261e.m20334a(c19261e, 0, c0326m, null, 61).m20335b(c19261e.f61057e);
        } catch (IOException e10) {
            finder.m20058c(e10);
            throw new C18796l(e10);
        } catch (C18796l e11) {
            finder.m20058c(e11.f59756Z);
            throw e11;
        }
    }
}
