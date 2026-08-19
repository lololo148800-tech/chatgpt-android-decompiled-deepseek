package com.openai.chatgpt;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import bb.AbstractC11281F;
import com.openai.feature.rootviewmodel.RootViewModel;
import io.sentry.AbstractC15152P0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import mm.C17314q;
import p003A1.AbstractC0168G;
import p017Af.C0468O;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p039Bc.C0871e;
import p039Bc.C0872f;
import p066Cc.C1626c;
import p072Ci.EnumC1696a;
import p092Dc.C1988e;
import p092Dc.C1996m;
import p092Dc.C1998o;
import p092Dc.C2005v;
import p103Dn.C2217y0;
import p1081wc.C20870P;
import p1081wc.C20873T;
import p1081wc.C20887f;
import p1081wc.C20899r;
import p1113xn.AbstractC21322p;
import p1118y2.C21371b;
import p1130yi.AbstractC21544c;
import p1130yi.EnumC21542a;
import p190Hc.C3287h;
import p190Hc.InterfaceC3283d;
import p313Mc.C5317a;
import p318Mh.C5415o;
import p318Mh.C5431w;
import p452Sc.C7103a;
import p523V9.AbstractC8170q0;
import p523V9.AbstractC8226x0;
import p537W0.C8410b;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9209T;
import p571X9.AbstractC9227W;
import p594Y9.C9895g4;
import p893n.AbstractActivityC17375g;
import p893n.AbstractC17379k;
import p909nm.AbstractC17659D;
import p925oe.C18095U;
import p972qm.C18777j;
import ug.C20221d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/chatgpt/MainActivity;", "Ln/g;", "<init>", "()V", "app_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MainActivity extends AbstractActivityC17375g {

    /* JADX INFO: renamed from: M0 */
    public final C17314q f37133M0 = AbstractC9227W.m9800c(C0871e.f2557Z);

    @Override // androidx.fragment.app.AbstractActivityC11001b, androidx.activity.AbstractActivityC10817a, p896n2.AbstractActivityC17454g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i10 = 1;
        C5317a c5317aM5877a = AbstractC21544c.m21827a().m5877a(EnumC21542a.f68234Y, null);
        try {
            c5317aM5877a.m5876b();
            m14222u();
            (Build.VERSION.SDK_INT >= 31 ? new C21371b(this) : new C9895g4(this)).mo10549A();
            super.onCreate(bundle);
            C1998o c1998oM14220s = m14220s();
            Iterator<E> it = AbstractC11281F.m12704s(3, (DefaultLifecycleObserver) c1998oM14220s.f6073u0.get(), (DefaultLifecycleObserver) c1998oM14220s.f5991A0.get(), (DefaultLifecycleObserver) c1998oM14220s.f5993B0.get()).iterator();
            while (it.hasNext()) {
                this.f55801Y.mo7806a((DefaultLifecycleObserver) it.next());
            }
            if (bundle == null) {
                Intent intent = getIntent();
                AbstractC16544l.m18093f(intent, "getIntent(...)");
                m14221t(intent, false);
                C18095U c18095u = (C18095U) m14220s().f6081y0.get();
                Intent intent2 = getIntent();
                AbstractC16544l.m18093f(intent2, "getIntent(...)");
                c18095u.m19713b(intent2);
            }
            AbstractC8170q0.m8754c(getWindow(), false);
            AbstractC0575H.m1156D(AbstractC8226x0.m8861b(this), null, null, new C1626c(this, new C8410b(new C0468O(this, i10), true, -1564889561), null), 3);
            AbstractC15152P0.m16327a("MainActivity.onCreate " + c5317aM5877a);
        } finally {
            c5317aM5877a.m5875a();
        }
    }

    @Override // androidx.activity.AbstractActivityC10817a, android.app.Activity
    public final void onNewIntent(Intent intent) {
        AbstractC16544l.m18094g(intent, "intent");
        super.onNewIntent(intent);
        m14221t(intent, true);
    }

    /* JADX INFO: renamed from: s */
    public final C1998o m14220s() {
        return (C1998o) this.f37133M0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public final void m14221t(Intent intent, boolean z6) {
        String strM21449d;
        Object[] objArr;
        C7103a c7103a = (C7103a) m14220s().f6083z0.get();
        Uri data = intent.getData();
        C5415o.f17695o0.getClass();
        List exclusionArgs = C5415o.f17697q0;
        c7103a.getClass();
        AbstractC16544l.m18094g(exclusionArgs, "exclusionArgs");
        C20870P c20870p = null;
        c20870p = null;
        if (data != null) {
            String host = data.getHost();
            List list = exclusionArgs;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        objArr = false;
                        break;
                    } else if (data.getQueryParameter((String) it.next()) != null) {
                        objArr = true;
                        break;
                    }
                }
            } else {
                objArr = false;
                break;
            }
            if (!AbstractC16544l.m18089b(host, "platform.openai.com") && ((AbstractC16544l.m18089b(data.getPath(), Separators.SLASH) || data.getPath() == null) && objArr == false)) {
                String string = data.toString();
                AbstractC16544l.m18093f(string, "toString(...)");
                Intent intent2 = new Intent();
                AbstractC9186P.m9748b(intent2, string);
                intent2.addCategory("android.intent.category.BROWSABLE");
                intent2.addFlags(268435456);
                Application application = c7103a.f22601a;
                List<ResolveInfo> listQueryIntentActivities = application.getPackageManager().queryIntentActivities(intent2, 0);
                AbstractC16544l.m18093f(listQueryIntentActivities, "queryIntentActivities(...)");
                Iterator<T> it2 = listQueryIntentActivities.iterator();
                while (it2.hasNext()) {
                    String str = ((ResolveInfo) it2.next()).activityInfo.packageName;
                    AbstractC16544l.m18091d(str);
                    if (!AbstractC21322p.m21667A(str, "chatgpt", false)) {
                        intent2.setPackage(str);
                        AbstractC9209T.m9776b(application, null, intent2);
                        return;
                    }
                }
            }
        }
        C20873T c20873t = (C20873T) m14220s().f6073u0.get();
        C5431w.f17746g.getClass();
        String queryArg = C5431w.f17757r.f17614a;
        String conversationEntryPoint = C5431w.f17758s.f17614a;
        Uri referrer = getReferrer();
        c20873t.getClass();
        AbstractC16544l.m18094g(queryArg, "queryArg");
        AbstractC16544l.m18094g(conversationEntryPoint, "conversationEntryPoint");
        if ((intent.getFlags() & 1048576) == 0) {
            String strValueOf = String.valueOf(intent.getData());
            LinkedHashSet linkedHashSet = c20873t.f66454q0;
            if (!linkedHashSet.contains(strValueOf)) {
                linkedHashSet.add(strValueOf);
                if (intent.getBooleanExtra("com.openai.feature.shortcut.impl.ShortcutInitializer.EXTRA_SHORTCUT", false)) {
                    Uri data2 = intent.getData();
                    c20870p = new C20870P(C20887f.f66534i, AbstractC17659D.m19244f(new C17309l("mode", String.valueOf(data2 != null ? data2.getQueryParameter(conversationEntryPoint) : null)), new C17309l("source", String.valueOf(referrer))));
                } else if (intent.getBooleanExtra("TAP_NOTIFICATION", false)) {
                    c20870p = new C20870P(C20899r.f66618e, AbstractC0168G.m535x("url", String.valueOf(C20873T.m21449d(intent, queryArg))));
                } else if (AbstractC16544l.m18089b(intent.getAction(), "android.intent.action.VIEW") && (strM21449d = C20873T.m21449d(intent, queryArg)) != null) {
                    c20870p = new C20870P(C20887f.f66532g, AbstractC0168G.m535x("url", strM21449d));
                }
                if (c20870p != null) {
                    c20873t.f66452o0.mo21447a(c20870p.f66439a, c20870p.f66440b);
                }
            }
        }
        if (z6) {
            ((RootViewModel) m14220s().f6055l0.get()).m14395k(new C20221d(intent));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX INFO: renamed from: u */
    public final void m14222u() {
        EnumC1696a enumC1696a;
        int i10;
        C1988e c1988e;
        C2217y0 c2217y0;
        C1996m c1996m;
        if (Build.VERSION.SDK_INT < 31) {
            InterfaceC3283d interfaceC3283d = (InterfaceC3283d) ((C3287h) m14220s().f6024S.get()).f10025s0.f6797Y.getValue();
            C2005v c2005v = interfaceC3283d instanceof C2005v ? (C2005v) interfaceC3283d : null;
            if (c2005v == null || (c1988e = (C1988e) c2005v.f6142j.get()) == null || (c2217y0 = c1988e.f5878d) == null || (c1996m = (C1996m) c2217y0.f6797Y.getValue()) == null) {
                enumC1696a = EnumC1696a.System;
            } else {
                enumC1696a = (EnumC1696a) AbstractC0575H.m1161I(C18777j.f59682Y, new C0872f(c1996m, null));
                if (enumC1696a == null) {
                    enumC1696a = EnumC1696a.System;
                }
            }
            int iOrdinal = enumC1696a.ordinal();
            if (iOrdinal != 0) {
                i10 = 1;
                if (iOrdinal != 1) {
                    i10 = 2;
                    if (iOrdinal != 2) {
                        throw new C0644w();
                    }
                }
            } else {
                i10 = -1;
            }
            AbstractC17379k.m19063l(i10);
        }
    }
}
