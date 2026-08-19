package p804i8;

import android.app.Activity;
import android.os.Handler;
import com.auth0.android.request.internal.RunnableC11843b;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p042Bf.C1268j;
import p087D7.AbstractC1976c;
import p236J7.AbstractC4281e;
import p236J7.AbstractC4283g;
import p236J7.C4277a;
import p236J7.C4278b;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC7933L4;
import p523V9.AbstractC8042a0;
import p523V9.AbstractC8119j5;
import p523V9.AbstractC8127k5;
import p544W9.AbstractC8595Z2;
import p592Y7.C9673h;
import p592Y7.EnumC9668c;
import p592Y7.InterfaceC9670e;
import p592Y7.InterfaceC9672g;
import p604Yk.C10077b;
import p661b7.EnumC11255b;
import p677c8.C11691c;
import p714e0.C13254b;
import p722e8.C13291A;
import p722e8.C13292B;
import p722e8.C13293C;
import p722e8.C13294D;
import p722e8.C13295E;
import p722e8.C13296F;
import p722e8.C13297G;
import p722e8.C13323g;
import p722e8.C13324h;
import p722e8.C13325i;
import p722e8.C13326j;
import p722e8.C13327k;
import p722e8.C13328l;
import p722e8.C13330n;
import p722e8.C13331o;
import p722e8.C13333q;
import p722e8.C13334r;
import p722e8.C13336t;
import p722e8.C13337u;
import p722e8.C13341y;
import p722e8.C13342z;
import p741f5.RunnableC13542a;
import p743f7.InterfaceC13575a;
import p765g7.InterfaceC13823a;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;
import p849k7.C16360m;
import p887m7.C17176b;
import p902n8.InterfaceC17524k;
import p909nm.AbstractC17659D;
import p909nm.C17689w;
import p909nm.C17690x;
import p944p8.C18309a;
import p984r8.C18888b;
import p984r8.C18889c;
import p984r8.C18890d;

/* JADX INFO: renamed from: i8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C14943b implements InterfaceC9670e, InterfaceC14942a {

    /* JADX INFO: renamed from: j */
    public static final long f46554j = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: a */
    public final InterfaceC13823a f46555a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13575a f46556b;

    /* JADX INFO: renamed from: c */
    public final Handler f46557c;

    /* JADX INFO: renamed from: d */
    public final C18889c f46558d;

    /* JADX INFO: renamed from: e */
    public final ExecutorService f46559e;

    /* JADX INFO: renamed from: f */
    public final C13323g f46560f;

    /* JADX INFO: renamed from: g */
    public final RunnableC13542a f46561g;

    /* JADX INFO: renamed from: h */
    public final C9673h f46562h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f46563i;

    public C14943b(InterfaceC13823a interfaceC13823a, float f10, boolean z6, boolean z10, InterfaceC13575a interfaceC13575a, Handler handler, C18889c c18889c, C15384c c15384c, C13254b firstPartyHostHeaderTypeResolver, InterfaceC17524k cpuVitalMonitor, InterfaceC17524k memoryVitalMonitor, InterfaceC17524k frameRateVitalMonitor, InterfaceC9672g sessionListener, ExecutorService executorService) {
        AbstractC16544l.m18094g(firstPartyHostHeaderTypeResolver, "firstPartyHostHeaderTypeResolver");
        AbstractC16544l.m18094g(cpuVitalMonitor, "cpuVitalMonitor");
        AbstractC16544l.m18094g(memoryVitalMonitor, "memoryVitalMonitor");
        AbstractC16544l.m18094g(frameRateVitalMonitor, "frameRateVitalMonitor");
        AbstractC16544l.m18094g(sessionListener, "sessionListener");
        AbstractC16544l.m18094g(executorService, "executorService");
        this.f46555a = interfaceC13823a;
        this.f46556b = interfaceC13575a;
        this.f46557c = handler;
        this.f46558d = c18889c;
        this.f46559e = executorService;
        this.f46560f = new C13323g(interfaceC13823a, f10, z6, z10, firstPartyHostHeaderTypeResolver, cpuVitalMonitor, memoryVitalMonitor, frameRateVitalMonitor, c15384c, new C10077b(new InterfaceC9672g[]{sessionListener, c18889c}, 2));
        RunnableC13542a runnableC13542a = new RunnableC13542a(this, 3);
        this.f46561g = runnableC13542a;
        this.f46562h = new C9673h(this);
        handler.postDelayed(runnableC13542a, f46554j);
        this.f46563i = new ConcurrentHashMap();
        new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: v */
    public static C11691c m16109v(Map map) {
        Object obj = map.get("_dd.timestamp");
        Long l4 = obj instanceof Long ? (Long) obj : null;
        if (l4 == null) {
            return new C11691c();
        }
        long jLongValue = l4.longValue();
        return new C11691c(jLongValue, TimeUnit.MILLISECONDS.toNanos(jLongValue - System.currentTimeMillis()) + System.nanoTime());
    }

    @Override // p804i8.InterfaceC14942a
    /* JADX INFO: renamed from: a */
    public final void mo16099a(long j10, String target) {
        AbstractC16544l.m18094g(target, "target");
        m16110w(new C13328l(j10, target));
    }

    @Override // p804i8.InterfaceC14942a
    /* JADX INFO: renamed from: b */
    public final void mo16100b() {
        m16110w(new C13297G());
    }

    @Override // p804i8.InterfaceC14942a
    /* JADX INFO: renamed from: c */
    public final void mo16101c(AbstractC4283g abstractC4283g) {
        m16110w(new C13296F(abstractC4283g));
    }

    @Override // p804i8.InterfaceC14942a
    /* JADX INFO: renamed from: d */
    public final void mo16102d(String str, AbstractC8595Z2 abstractC8595Z2) {
        if (abstractC8595Z2 instanceof C14945d) {
            m16110w(new C13325i(str, ((C14945d) abstractC8595Z2).f46564a));
            return;
        }
        if (abstractC8595Z2 instanceof C14949h) {
            m16110w(new C13337u(str));
            return;
        }
        if (abstractC8595Z2 instanceof C14946e) {
            m16110w(new C13331o(str));
        } else if (abstractC8595Z2 instanceof C14948g) {
            m16110w(new C13334r(str, false));
        } else if (abstractC8595Z2 instanceof C14947f) {
            m16110w(new C13334r(str, true));
        }
    }

    @Override // p804i8.InterfaceC14942a
    /* JADX INFO: renamed from: e */
    public final void mo16103e(C18309a c18309a, int i10, String str, Map attributes) {
        AbstractC14376f.m15825D(i10, "method");
        AbstractC16544l.m18094g(attributes, "attributes");
        m16110w(new C13342z(c18309a, str, i10, AbstractC17659D.m19254p(attributes), m16109v(attributes)));
    }

    @Override // p804i8.InterfaceC14942a
    /* JADX INFO: renamed from: f */
    public final void mo16104f(C18309a c18309a, String str, Throwable th2) {
        C17690x c17690x = C17690x.f56481Y;
        AbstractC14376f.m15825D(1, "source");
        m16110w(new C13294D(c18309a, null, str, th2, AbstractC17659D.m19254p(c17690x)));
    }

    @Override // p804i8.InterfaceC14942a
    /* JADX INFO: renamed from: g */
    public final void mo16105g(String str, AbstractC8595Z2 abstractC8595Z2) {
        if (abstractC8595Z2 instanceof C14945d) {
            m16110w(new C13324h(str));
            return;
        }
        if (abstractC8595Z2 instanceof C14949h) {
            m16110w(new C13336t(str));
            return;
        }
        if (abstractC8595Z2 instanceof C14946e) {
            m16110w(new C13330n(str));
        } else if (abstractC8595Z2 instanceof C14948g) {
            m16110w(new C13333q(str, false));
        } else if (abstractC8595Z2 instanceof C14947f) {
            m16110w(new C13333q(str, true));
        }
    }

    @Override // p804i8.InterfaceC14942a
    /* JADX INFO: renamed from: h */
    public final void mo16106h(C18309a c18309a, Integer num, Long l4, int i10, LinkedHashMap linkedHashMap) {
        AbstractC14376f.m15825D(i10, "kind");
        m16110w(new C13293C(c18309a, Long.valueOf(num.intValue()), l4, i10, AbstractC17659D.m19254p(linkedHashMap), m16109v(linkedHashMap)));
    }

    @Override // p804i8.InterfaceC14942a
    /* JADX INFO: renamed from: i */
    public final void mo16107i(String message, Throwable throwable, ArrayList arrayList) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC14376f.m15825D(2, "source");
        AbstractC16544l.m18094g(throwable, "throwable");
        C11691c c11691c = new C11691c();
        m16110w(new C13326j(message, 2, throwable, null, true, C17690x.f56481Y, c11691c, null, 0, arrayList, Long.valueOf(c11691c.f35477b - this.f46555a.mo15453i()), 384));
    }

    @Override // p804i8.InterfaceC14942a
    /* JADX INFO: renamed from: j */
    public final void mo16108j() {
        m16110w(new C13296F(C4278b.f13943a));
    }

    @Override // p592Y7.InterfaceC9670e
    /* JADX INFO: renamed from: k */
    public final Map mo10255k() {
        return this.f46563i;
    }

    @Override // p592Y7.InterfaceC9670e
    /* JADX INFO: renamed from: l */
    public final void mo10256l(Activity key, String name, Map map) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(name, "name");
        m16110w(new C13291A(AbstractC8127k5.m8633b(key, name), AbstractC17659D.m19254p(map), m16109v(map)));
    }

    @Override // p592Y7.InterfaceC9670e
    /* JADX INFO: renamed from: m */
    public final void mo10257m(Map attributes, Object key) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(attributes, "attributes");
        m16110w(new C13295E(AbstractC8127k5.m8633b(key, null), AbstractC17659D.m19254p(attributes), m16109v(attributes)));
    }

    @Override // p592Y7.InterfaceC9670e
    /* JADX INFO: renamed from: n */
    public final void mo10258n(String str, String str2, Map map) {
        AbstractC14376f.m15825D(4, "source");
        C11691c c11691cM16109v = m16109v(map);
        Object obj = map.get("_dd.error_type");
        String strM534w = null;
        String str3 = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("_dd.error.source_type");
        String str4 = obj2 instanceof String ? (String) obj2 : null;
        if (str4 != null) {
            Locale locale = Locale.US;
            strM534w = AbstractC0168G.m534w(locale, "US", str4, locale, "toLowerCase(...)");
        }
        int i10 = 1;
        if (strM534w != null) {
            switch (strM534w.hashCode()) {
                case -861391249:
                    strM534w.equals("android");
                    break;
                case -760334308:
                    if (strM534w.equals("flutter")) {
                        i10 = 4;
                    }
                    break;
                case -380982102:
                    if (strM534w.equals("ndk+il2cpp")) {
                        i10 = 6;
                    }
                    break;
                case 108917:
                    if (strM534w.equals("ndk")) {
                        i10 = 5;
                    }
                    break;
                case 150940456:
                    if (strM534w.equals("browser")) {
                        i10 = 2;
                    }
                    break;
                case 828638245:
                    if (strM534w.equals("react-native")) {
                        i10 = 3;
                    }
                    break;
            }
        }
        m16110w(new C13326j(str, 4, null, str2, false, AbstractC17659D.m19254p(map), c11691cM16109v, str3, i10, C17689w.f56480Y, null, 1024));
    }

    @Override // p592Y7.InterfaceC9670e
    /* JADX INFO: renamed from: o */
    public final void mo10259o(EnumC9668c type, LinkedHashMap linkedHashMap) {
        AbstractC16544l.m18094g(type, "type");
        m16110w(new C13292B(type, AbstractC17659D.m19254p(linkedHashMap), m16109v(linkedHashMap)));
    }

    @Override // p592Y7.InterfaceC9670e
    /* JADX INFO: renamed from: p */
    public final void mo10260p(EnumC9668c enumC9668c, String str, Map map) {
        m16110w(new C13341y(enumC9668c, str, false, AbstractC17659D.m19254p(map), m16109v(map)));
    }

    @Override // p592Y7.InterfaceC9670e
    /* JADX INFO: renamed from: q */
    public final C9673h mo10261q() {
        return this.f46562h;
    }

    @Override // p592Y7.InterfaceC9670e
    /* JADX INFO: renamed from: r */
    public final void mo10262r(String str, int i10, Throwable th2, Map map) {
        AbstractC14376f.m15825D(i10, "source");
        C11691c c11691cM16109v = m16109v(map);
        Object obj = map.get("_dd.error_type");
        String str2 = obj instanceof String ? (String) obj : null;
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(map);
        Object objRemove = linkedHashMapM19256r.remove("_dd.error.threads");
        List list = objRemove instanceof List ? (List) objRemove : null;
        m16110w(new C13326j(str, i10, th2, null, false, linkedHashMapM19256r, c11691cM16109v, str2, 0, list == null ? C17689w.f56480Y : list, null, 1280));
    }

    @Override // p592Y7.InterfaceC9670e
    /* JADX INFO: renamed from: s */
    public final void mo10263s(LinkedHashMap linkedHashMap) {
        m16110w(new C13341y(EnumC9668c.f29149Z, "", true, AbstractC17659D.m19254p(linkedHashMap), m16109v(linkedHashMap)));
    }

    @Override // p592Y7.InterfaceC9670e
    /* JADX INFO: renamed from: t */
    public final void mo10264t(Object value, String name) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        m16110w(new C13327k(name, value));
    }

    @Override // p592Y7.InterfaceC9670e
    /* JADX INFO: renamed from: u */
    public final void mo10265u(Object obj, String key) {
        AbstractC16544l.m18094g(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f46563i;
        if (obj == null) {
            concurrentHashMap.remove(key);
        } else {
            concurrentHashMap.put(key, obj);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m16110w(AbstractC8119j5 abstractC8119j5) {
        if ((abstractC8119j5 instanceof C13326j) && ((C13326j) abstractC8119j5).f42282f) {
            synchronized (this.f46560f) {
                this.f46560f.mo14927b(abstractC8119j5, this.f46556b);
            }
            return;
        }
        if (!(abstractC8119j5 instanceof C13296F)) {
            this.f46557c.removeCallbacks(this.f46561g);
            if (this.f46559e.isShutdown()) {
                return;
            }
            AbstractC1976c.m3152i(this.f46559e, "Rum event handling", this.f46555a.mo15463s(), new RunnableC11843b(this, 7, abstractC8119j5));
            return;
        }
        C18889c c18889c = this.f46558d;
        C13296F c13296f = (C13296F) abstractC8119j5;
        InterfaceC13575a interfaceC13575a = this.f46556b;
        if (c18889c.f60217Z.m12504H()) {
            AbstractC4283g abstractC4283g = c13296f.f42030b;
            if (!(abstractC4283g instanceof C4277a) || c18889c.f60218o0.m12504H()) {
                C18890d c18890dM8416d = AbstractC8042a0.m8416d(abstractC4283g);
                boolean z6 = abstractC4283g instanceof AbstractC4281e;
                EnumC11255b enumC11255b = EnumC11255b.f34099Z;
                LinkedHashSet linkedHashSet = c18889c.f60222s0;
                InterfaceC13823a interfaceC13823a = c18889c.f60216Y;
                if (z6 && linkedHashSet.contains(c18890dM8416d)) {
                    AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 3, enumC11255b, new C17176b(c18890dM8416d, 12), null, false, 56);
                    return;
                }
                if (c18889c.f60223t0 >= c18889c.f60220q0) {
                    AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 3, enumC11255b, C18888b.f60213Z, null, false, 56);
                    return;
                }
                linkedHashSet.add(AbstractC8042a0.m8416d(abstractC4283g));
                c18889c.f60223t0++;
                C16360m c16360mMo15458n = interfaceC13823a.mo15458n("rum");
                if (c16360mMo15458n != null) {
                    AbstractC7933L4.m8226d(c16360mMo15458n, new C1268j(c13296f, abstractC4283g, c18889c, interfaceC13575a, 19));
                }
            }
        }
    }
}
