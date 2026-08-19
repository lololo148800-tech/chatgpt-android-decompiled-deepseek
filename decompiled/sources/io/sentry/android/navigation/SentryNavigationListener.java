package io.sentry.android.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import androidx.navigation.AbstractC11122c;
import io.sentry.C15109B;
import io.sentry.C15138K1;
import io.sentry.C15161S1;
import io.sentry.C15164T1;
import io.sentry.C15345d;
import io.sentry.C15358g1;
import io.sentry.C15516w;
import io.sentry.EnumC15147N1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15124G;
import io.sentry.InterfaceC15159S;
import io.sentry.android.core.C15213d;
import io.sentry.protocol.EnumC15423C;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1113xn.AbstractC21322p;
import p1143z4.AbstractC21790t;
import p1143z4.InterfaceC21781k;
import p239Ja.C4307j;
import p544W9.AbstractC8471E3;
import p561X.C8990d;
import p817j$.util.concurrent.ConcurrentHashMap;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lio/sentry/android/navigation/SentryNavigationListener;", "Lz4/k;", "sentry-android-navigation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SentryNavigationListener implements InterfaceC21781k {

    /* JADX INFO: renamed from: b */
    public final boolean f47641b;

    /* JADX INFO: renamed from: c */
    public final boolean f47642c;

    /* JADX INFO: renamed from: e */
    public WeakReference f47644e;

    /* JADX INFO: renamed from: f */
    public Bundle f47645f;

    /* JADX INFO: renamed from: g */
    public InterfaceC15159S f47646g;

    /* JADX INFO: renamed from: a */
    public final InterfaceC15124G f47640a = C15109B.f47017a;

    /* JADX INFO: renamed from: d */
    public final String f47643d = "jetpack_compose";

    public SentryNavigationListener(boolean z6, boolean z10) {
        this.f47641b = z6;
        this.f47642c = z10;
        AbstractC8471E3.m9104b("NavigationListener");
        C15358g1.m16578n().m16580f("maven:io.sentry:sentry-android-navigation");
    }

    /* JADX INFO: renamed from: b */
    public static Map m16489b(Bundle bundle) {
        if (bundle == null) {
            return C17690x.f56481Y;
        }
        Set<String> setKeySet = bundle.keySet();
        AbstractC16544l.m18093f(setKeySet, "args.keySet()");
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (!AbstractC16544l.m18089b((String) obj, "android-support-nav:controller:deepLinkIntent")) {
                arrayList.add(obj);
            }
        }
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(arrayList, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(obj2, bundle.get((String) obj2));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b8 A[PHI: r2
      0x00b8: PHI (r2v27 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:25:0x0094, B:29:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p1143z4.InterfaceC21781k
    /* JADX INFO: renamed from: a */
    public final void mo1946a(AbstractC11122c controller, AbstractC21790t destination, Bundle bundle) {
        String strConcat;
        String strConcat2;
        AbstractC21790t abstractC21790t;
        AbstractC16544l.m18094g(controller, "controller");
        AbstractC16544l.m18094g(destination, "destination");
        Map mapM16489b = m16489b(bundle);
        InterfaceC15124G interfaceC15124G = this.f47640a;
        if (this.f47641b) {
            C15345d c15345d = new C15345d();
            c15345d.f47907p0 = "navigation";
            c15345d.f47909r0 = "navigation";
            WeakReference weakReference = this.f47644e;
            String str = (weakReference == null || (abstractC21790t = (AbstractC21790t) weakReference.get()) == null) ? null : abstractC21790t.f69136s0;
            if (str != null) {
                ConcurrentHashMap data = c15345d.f47908q0;
                AbstractC16544l.m18093f(data, "data");
                data.put("from", Separators.SLASH.concat(str));
            }
            Map mapM16489b2 = m16489b(this.f47645f);
            if (!mapM16489b2.isEmpty()) {
                ConcurrentHashMap data2 = c15345d.f47908q0;
                AbstractC16544l.m18093f(data2, "data");
                data2.put("from_arguments", mapM16489b2);
            }
            String str2 = destination.f69136s0;
            if (str2 != null) {
                ConcurrentHashMap data3 = c15345d.f47908q0;
                AbstractC16544l.m18093f(data3, "data");
                data3.put("to", Separators.SLASH.concat(str2));
            }
            if (!mapM16489b.isEmpty()) {
                ConcurrentHashMap data4 = c15345d.f47908q0;
                AbstractC16544l.m18093f(data4, "data");
                data4.put("to_arguments", mapM16489b);
            }
            c15345d.f47911t0 = EnumC15375i1.INFO;
            C15516w c15516w = new C15516w();
            c15516w.m16729c("android:navigationDestination", destination);
            interfaceC15124G.mo16252u(c15345d, c15516w);
        }
        Context context = controller.f33529a;
        String resourceEntryName = destination.f69136s0;
        if (resourceEntryName == null) {
            try {
                resourceEntryName = context.getResources().getResourceEntryName(destination.f69135r0);
            } catch (Resources.NotFoundException unused) {
                interfaceC15124G.mo16246j().getLogger().mo16298o(EnumC15375i1.DEBUG, "Destination id cannot be retrieved from Resources, no transaction captured.", new Object[0]);
                resourceEntryName = null;
            }
            if (resourceEntryName == null) {
                strConcat = null;
            } else {
                strConcat = Separators.SLASH.concat(AbstractC21322p.m21705m0(resourceEntryName, '/'));
            }
        } else {
            strConcat = Separators.SLASH.concat(AbstractC21322p.m21705m0(resourceEntryName, '/'));
        }
        if (strConcat != null) {
            if (interfaceC15124G.mo16246j().isEnableScreenTracking()) {
                interfaceC15124G.mo16253v(new C15213d(strConcat, 1));
            }
            if (interfaceC15124G.mo16246j().isTracingEnabled() && this.f47642c) {
                InterfaceC15159S interfaceC15159S = this.f47646g;
                if (interfaceC15159S != null) {
                    EnumC15147N1 enumC15147N1Mo16270a = interfaceC15159S.mo16270a();
                    if (enumC15147N1Mo16270a == null) {
                        enumC15147N1Mo16270a = EnumC15147N1.OK;
                    }
                    AbstractC16544l.m18093f(enumC15147N1Mo16270a, "activeTransaction?.status ?: SpanStatus.OK");
                    InterfaceC15159S interfaceC15159S2 = this.f47646g;
                    if (interfaceC15159S2 != null) {
                        interfaceC15159S2.mo16278i(enumC15147N1Mo16270a);
                    }
                    interfaceC15124G.mo16253v(new C4307j(this, 26));
                    this.f47646g = null;
                }
                if (AbstractC16544l.m18089b(destination.f69130Y, "activity")) {
                    interfaceC15124G.mo16246j().getLogger().mo16298o(EnumC15375i1.DEBUG, "Navigating to activity destination, no transaction captured.", new Object[0]);
                } else {
                    C15164T1 c15164t1 = new C15164T1();
                    c15164t1.f47221q0 = true;
                    c15164t1.f47222r0 = interfaceC15124G.mo16246j().getIdleTimeout();
                    c15164t1.f47223s0 = 30000L;
                    c15164t1.f1278Z = true;
                    InterfaceC15159S interfaceC15159SMo16251t = interfaceC15124G.mo16251t(new C15161S1(strConcat, EnumC15423C.ROUTE, "navigation", null), c15164t1);
                    AbstractC16544l.m18093f(interfaceC15159SMo16251t, "hub.startTransaction(\n  …nsactionOptions\n        )");
                    C15138K1 c15138k1Mo16288s = interfaceC15159SMo16251t.mo16288s();
                    String str3 = this.f47643d;
                    if (str3 == null || (strConcat2 = "auto.navigation.".concat(str3)) == null) {
                        strConcat2 = "auto.navigation";
                    }
                    c15138k1Mo16288s.f47152u0 = strConcat2;
                    if (!mapM16489b.isEmpty()) {
                        interfaceC15159SMo16251t.mo16280k(mapM16489b, "arguments");
                    }
                    interfaceC15124G.mo16253v(new C4307j(interfaceC15159SMo16251t, 25));
                    this.f47646g = interfaceC15159SMo16251t;
                }
            } else {
                interfaceC15124G.mo16253v(new C8990d(22));
            }
        }
        this.f47644e = new WeakReference(destination);
        this.f47645f = bundle;
    }
}
