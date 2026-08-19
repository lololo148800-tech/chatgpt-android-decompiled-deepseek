package p544W9;

import af.C10561Q;
import com.openai.chatgpt.R;
import gg.AbstractC14132b;
import kotlin.jvm.internal.AbstractC16544l;
import p092Dc.C1991h;
import p1149zc.C21843e;
import p1149zc.C21845g;
import p1149zc.C21846h;
import p1149zc.C21847i;
import p1149zc.C21848j;
import p1155zi.AbstractC21933K1;
import p1155zi.EnumC21895B;
import p349O0.C6018n0;
import p349O0.C6021p;
import p571X9.AbstractC9231W3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: W9.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8658k {
    /* JADX INFO: renamed from: a */
    public static final void m9347a(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        c6021p.m6526U(375602671);
        int i11 = i10 | 6;
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            AbstractC8662k3.m9350a(interfaceC10459q, null, 0L, null, false, AbstractC14132b.f44473a, c6021p, (i11 & 14) | 196608, 30);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q, i10, 12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9348b(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: c */
    public static final String m9349c(AbstractC21933K1 abstractC21933K1, C1991h resolver, EnumC21895B appType, String deviceId) {
        AbstractC16544l.m18094g(resolver, "resolver");
        AbstractC16544l.m18094g(appType, "appType");
        AbstractC16544l.m18094g(deviceId, "deviceId");
        Throwable th2 = abstractC21933K1.f69485a;
        if (th2 instanceof C21848j) {
            AbstractC16544l.m18092e(th2, "null cannot be cast to non-null type com.openai.auth.AuthError.WebAuthFailed");
            String str = ((C21848j) th2).f69314Y;
            return (str == null || str.length() == 0) ? resolver.m3161c(R.string.login_client_error_web_auth, deviceId) : str;
        }
        if (th2 instanceof C21846h) {
            return resolver.m3160b(R.string.login_save_failed);
        }
        if (th2 instanceof C21845g) {
            return resolver.m3160b(R.string.login_restore_failed);
        }
        if (th2 instanceof C21843e) {
            return resolver.m3160b(R.string.login_browser_app_not_available);
        }
        return th2 instanceof C21847i ? resolver.m3161c(R.string.login_client_error, deviceId) : AbstractC9231W3.m9804b(abstractC21933K1, resolver, appType);
    }
}
