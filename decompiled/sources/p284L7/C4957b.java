package p284L7;

import android.content.Context;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.C15358g1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p006A4.C0350k;
import p009A7.C0392b;
import p042Bf.C1268j;
import p124Ei.C2486X0;
import p197Hj.C3457c;
import p210I7.C3650b;
import p499U9.C7591u;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC7933L4;
import p571X9.AbstractC9227W;
import p658b5.C11234e;
import p658b5.C11248s;
import p661b7.EnumC11255b;
import p676c7.C11685d;
import p676c7.C11688g;
import p699d7.InterfaceC13038b;
import p699d7.InterfaceC13039c;
import p721e7.InterfaceC13290b;
import p743f7.C13577c;
import p743f7.C13578d;
import p743f7.InterfaceC13575a;
import p765g7.InterfaceC13823a;
import p817j$.util.concurrent.ConcurrentHashMap;
import p827j7.C16173a;
import p849k7.C16360m;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;

/* JADX INFO: renamed from: L7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4957b implements InterfaceC13039c, InterfaceC13038b {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC13823a f16171Y;

    /* JADX INFO: renamed from: Z */
    public final C3650b f16172Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC13575a f16173o0 = new C13578d();

    /* JADX INFO: renamed from: p0 */
    public final AtomicBoolean f16174p0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q0 */
    public String f16175q0 = "";

    /* JADX INFO: renamed from: r0 */
    public final C15358g1 f16176r0 = new C15358g1((String) null);

    /* JADX INFO: renamed from: s0 */
    public final ConcurrentHashMap f16177s0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: t0 */
    public final String f16178t0 = "logs";

    /* JADX INFO: renamed from: u0 */
    public final C17314q f16179u0 = AbstractC9227W.m9800c(new C3457c(this, 16));

    /* JADX INFO: renamed from: v0 */
    public final C13577c f16180v0 = C13577c.f42927a;

    public C4957b(InterfaceC13823a interfaceC13823a, C3650b c3650b) {
        this.f16171Y = interfaceC13823a;
        this.f16172Z = c3650b;
    }

    @Override // p699d7.InterfaceC13037a
    /* JADX INFO: renamed from: a */
    public final void mo3513a() {
        this.f16171Y.mo15455k(this.f16178t0);
        this.f16173o0 = new C13578d();
        this.f16175q0 = "";
        this.f16174p0.set(false);
        this.f16177s0.clear();
    }

    @Override // p699d7.InterfaceC13038b
    /* JADX INFO: renamed from: b */
    public final void mo5602b(Object obj) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        boolean z6 = obj instanceof C16173a;
        InterfaceC13823a interfaceC13823a = this.f16171Y;
        String str = this.f16178t0;
        if (z6) {
            C16173a c16173a = (C16173a) obj;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Map mapM19254p = AbstractC17659D.m19254p(this.f16177s0);
            C16360m c16360mMo15458n = interfaceC13823a.mo15458n(str);
            if (c16360mMo15458n != null) {
                AbstractC7933L4.m8226d(c16360mMo15458n, new C1268j(this, c16173a, mapM19254p, countDownLatch, 7));
            }
            try {
                countDownLatch.await(500L, TimeUnit.MILLISECONDS);
                return;
            } catch (InterruptedException e10) {
                AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 5, EnumC11255b.f34099Z, C4956a.f16167Z, e10, false, 48);
                return;
            }
        }
        boolean z10 = obj instanceof Map;
        EnumC11255b enumC11255b = EnumC11255b.f34098Y;
        if (!z10) {
            AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 4, enumC11255b, new C0392b(obj, 4), null, false, 56);
            return;
        }
        Map map = (Map) obj;
        if (AbstractC16544l.m18089b(map.get("type"), "ndk_crash")) {
            Object obj2 = map.get(DiagnosticsEntry.TIMESTAMP_KEY);
            Long l4 = obj2 instanceof Long ? (Long) obj2 : null;
            Object obj3 = map.get("message");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = map.get("loggerName");
            String str3 = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = map.get("attributes");
            Map map2 = obj5 instanceof Map ? (Map) obj5 : null;
            if (map2 != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    if (entry.getKey() instanceof String) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap2 = new LinkedHashMap(AbstractC17660E.m19257b(linkedHashMap3.size()));
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    Object key = entry2.getKey();
                    AbstractC16544l.m18092e(key, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap2.put((String) key, entry2.getValue());
                }
            } else {
                linkedHashMap2 = null;
            }
            Object obj6 = map.get("networkInfo");
            C11685d c11685d = obj6 instanceof C11685d ? (C11685d) obj6 : null;
            Object obj7 = map.get("userInfo");
            C11688g c11688g = obj7 instanceof C11688g ? (C11688g) obj7 : null;
            if (str3 == null || str2 == null || l4 == null || linkedHashMap2 == null) {
                AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 4, enumC11255b, C4956a.f16168o0, null, false, 56);
                return;
            }
            C16360m c16360mMo15458n2 = interfaceC13823a.mo15458n(str);
            if (c16360mMo15458n2 != null) {
                AbstractC7933L4.m8226d(c16360mMo15458n2, new C2486X0(this, str2, linkedHashMap2, l4, str3, c11688g, c11685d, 2));
                return;
            }
            return;
        }
        if (!AbstractC16544l.m18089b(map.get("type"), "span_log")) {
            AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 4, enumC11255b, new C0392b(obj, 5), null, false, 56);
            return;
        }
        Object obj8 = map.get(DiagnosticsEntry.TIMESTAMP_KEY);
        Long l10 = obj8 instanceof Long ? (Long) obj8 : null;
        Object obj9 = map.get("message");
        String str4 = obj9 instanceof String ? (String) obj9 : null;
        Object obj10 = map.get("loggerName");
        String str5 = obj10 instanceof String ? (String) obj10 : null;
        Object obj11 = map.get("attributes");
        Map map3 = obj11 instanceof Map ? (Map) obj11 : null;
        if (map3 != null) {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry3 : map3.entrySet()) {
                if (entry3.getKey() instanceof String) {
                    linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                }
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(AbstractC17660E.m19257b(linkedHashMap4.size()));
            for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                Object key2 = entry4.getKey();
                AbstractC16544l.m18092e(key2, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap5.put((String) key2, entry4.getValue());
            }
            linkedHashMap = linkedHashMap5;
        } else {
            linkedHashMap = null;
        }
        if (str5 == null || str4 == null || linkedHashMap == null || l10 == null) {
            AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 4, enumC11255b, C4956a.f16169p0, null, false, 56);
            return;
        }
        C16360m c16360mMo15458n3 = interfaceC13823a.mo15458n(str);
        if (c16360mMo15458n3 != null) {
            AbstractC7933L4.m8226d(c16360mMo15458n3, new C0350k(this, str4, linkedHashMap, l10, str5, 5));
        }
    }

    @Override // p699d7.InterfaceC13039c
    /* JADX INFO: renamed from: f */
    public final C13577c mo5603f() {
        return this.f16180v0;
    }

    @Override // p699d7.InterfaceC13037a
    public final String getName() {
        return this.f16178t0;
    }

    @Override // p699d7.InterfaceC13039c
    /* JADX INFO: renamed from: j */
    public final InterfaceC13290b mo5604j() {
        return (InterfaceC13290b) this.f16179u0.getValue();
    }

    @Override // p699d7.InterfaceC13037a
    /* JADX INFO: renamed from: k */
    public final void mo3517k(Context appContext) {
        AbstractC16544l.m18094g(appContext, "appContext");
        InterfaceC13823a interfaceC13823a = this.f16171Y;
        interfaceC13823a.mo15459o(this.f16178t0, this);
        String packageName = appContext.getPackageName();
        AbstractC16544l.m18093f(packageName, "appContext.packageName");
        this.f16175q0 = packageName;
        this.f16173o0 = new C11248s(new C11248s(new C7591u(this.f16172Z, interfaceC13823a.mo15463s()), new C11234e(interfaceC13823a.mo15463s()), false, 7), interfaceC13823a.mo15463s());
        this.f16174p0.set(true);
    }
}
