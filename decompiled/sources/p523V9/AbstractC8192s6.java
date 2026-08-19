package p523V9;

import android.os.Build;
import com.statsig.androidsdk.StatsigOptions;
import com.statsig.androidsdk.Tier;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1155zi.EnumC21895B;
import p124Ei.C2535p;
import p196Hi.AbstractC3453w;
import p196Hi.C3435e;
import p196Hi.C3445o;
import p196Hi.C3446p;
import p229J0.AbstractC3984T1;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: V9.s6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8192s6 {
    /* JADX INFO: renamed from: a */
    public static final void m8792a(int i10, InterfaceC1426a interfaceC1426a, InterfaceC1436k onMinimizeAssistant, C6021p c6021p) {
        InterfaceC1426a interfaceC1426a2;
        AbstractC16544l.m18094g(onMinimizeAssistant, "onMinimizeAssistant");
        c6021p.m6526U(-302057306);
        int i11 = i10 | 6;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onMinimizeAssistant) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC1426a2 = interfaceC1426a;
        } else {
            C3435e c3435e = C3435e.f10459o0;
            c6021p.m6524S(-1553865108);
            boolean z6 = (i11 & 14) == 4;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C2535p(4, c3435e);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4682a((InterfaceC1426a) objM6514H, AbstractC8411c.m8969c(-1628231330, c6021p, new C3445o(0, onMinimizeAssistant)), null, AbstractC8411c.m8969c(-1210342628, c6021p, new C3445o(1, onMinimizeAssistant)), null, AbstractC3453w.f10504c, null, null, 0L, 0L, 0L, 0L, 0.0f, null, c6021p, 199728, 0, 16340);
            interfaceC1426a2 = c3435e;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3446p(interfaceC1426a2, onMinimizeAssistant, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Map m8793b(boolean z6) {
        return AbstractC17659D.m19244f(new C17309l("client_type", "android"), new C17309l("version_code", 2500706), new C17309l("auth_status", z6 ? "logged_in" : "logged_out"), new C17309l("manufacturer", Build.MANUFACTURER));
    }

    /* JADX INFO: renamed from: c */
    public static final StatsigOptions m8794c(EnumC21895B enumC21895B, String str) {
        Tier tier;
        StatsigOptions statsigOptions = new StatsigOptions("https://ab.chatgpt.com/v1", "https://ab.chatgpt.com/v1", false, false, 0L, false, str, false, null, false, null, null, null, null, false, false, 65468, null);
        int iOrdinal = enumC21895B.ordinal();
        if (iOrdinal == 0) {
            tier = Tier.DEVELOPMENT;
        } else if (iOrdinal == 1) {
            tier = Tier.STAGING;
        } else {
            if (iOrdinal != 2) {
                throw new C0644w();
            }
            tier = Tier.PRODUCTION;
        }
        statsigOptions.setTier(tier);
        return statsigOptions;
    }
}
