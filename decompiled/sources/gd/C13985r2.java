package gd;

import android.app.Application;
import com.statsig.androidsdk.IStatsigCallback;
import com.statsig.androidsdk.InitializationDetails;
import com.statsig.androidsdk.StatsigClient;
import com.statsig.androidsdk.StatsigOptions;
import com.statsig.androidsdk.StatsigUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mm.C17309l;
import p025An.InterfaceC0571F;
import p071Ch.C1676g;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1130yi.AbstractC21544c;
import p1130yi.EnumC21542a;
import p195Hh.C3430e;
import p313Mc.C5317a;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17682p;
import p909nm.C17690x;

/* JADX INFO: renamed from: gd.r2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13985r2 implements IStatsigCallback {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0571F f44045a;

    /* JADX INFO: renamed from: b */
    public final C2153Q0 f44046b = AbstractC2124C.m3204c(Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public final C3430e f44047c;

    /* JADX INFO: renamed from: d */
    public final C5317a f44048d;

    /* JADX INFO: renamed from: e */
    public final StatsigClient f44049e;

    public C13985r2(StatsigUser statsigUser, StatsigOptions statsigOptions, Application application, C1676g c1676g, InterfaceC0571F interfaceC0571F) {
        Map<String, String> linkedHashMap;
        this.f44045a = interfaceC0571F;
        C3430e c3430eM8749b = AbstractC8168p6.m8749b("StatsigInstance", "Experimentation");
        this.f44047c = c3430eM8749b;
        C5317a c5317aM5877a = AbstractC21544c.m21827a().m5877a(EnumC21542a.f68236o0, null);
        this.f44048d = c5317aM5877a;
        StatsigClient statsigClient = new StatsigClient();
        AbstractC8160o6.m8726a(c3430eM8749b, "Statsig initialization for " + statsigUser, null, 6);
        c5317aM5877a.m5876b();
        String strM2506a = c1676g.m2506a();
        Map<String, String> customIDs = statsigUser.getCustomIDs();
        customIDs = customIDs == null ? C17690x.f56481Y : customIDs;
        List list = EnumC13855G.f43892Z.f43894Y;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C17309l((String) it.next(), strM2506a));
        }
        if (customIDs.isEmpty()) {
            linkedHashMap = AbstractC17659D.m19253o(arrayList);
        } else {
            linkedHashMap = new LinkedHashMap<>(customIDs);
            AbstractC17659D.m19251m(linkedHashMap, arrayList);
        }
        statsigUser.setCustomIDs(linkedHashMap);
        statsigClient.initializeAsync(application, "client-zUdXdSTygXJdzoE0sWTkP8GKTVsUMF2IRM7ShVO2JAG", statsigUser, this, statsigOptions);
        this.f44049e = statsigClient;
    }

    @Override // com.statsig.androidsdk.IStatsigCallback
    public final void onStatsigInitialize(InitializationDetails initializationDetails) {
        IStatsigCallback.DefaultImpls.onStatsigInitialize(this, initializationDetails);
    }

    @Override // com.statsig.androidsdk.IStatsigCallback
    public final void onStatsigInitialize() {
        AbstractC8160o6.m8726a(this.f44047c, "Statsig initialized", null, 6);
        Boolean bool = Boolean.TRUE;
        C2153Q0 c2153q0 = this.f44046b;
        c2153q0.getClass();
        c2153q0.m3251l(null, bool);
        this.f44048d.m5875a();
    }

    @Override // com.statsig.androidsdk.IStatsigCallback
    public final void onStatsigUpdateUser() {
    }
}
