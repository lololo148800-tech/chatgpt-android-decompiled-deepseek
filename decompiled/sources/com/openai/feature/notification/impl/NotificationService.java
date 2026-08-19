package com.openai.feature.notification.impl;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import bo.C11527o;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import gd.C13906X0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import ni.C17627a;
import ni.C17632f;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p092Dc.C1996m;
import p1081wc.C20899r;
import p1081wc.InterfaceC20904w;
import p117Eb.C2390t;
import p195Hh.C3430e;
import p481Tf.AbstractC7410o;
import p481Tf.C7409n;
import p481Tf.C7411p;
import p505Uf.EnumC7643d;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9186P;
import p692d0.C12966e;
import p728ei.C13406b;
import p896n2.C17465r;
import p909nm.AbstractC17660E;
import p929oi.AbstractC18201b;
import p948pi.C18418a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/notification/impl/NotificationService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NotificationService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: A0 */
    public boolean f38993A0;

    /* JADX INFO: renamed from: t0 */
    public C7409n f38994t0;

    /* JADX INFO: renamed from: u0 */
    public C17627a f38995u0;

    /* JADX INFO: renamed from: v0 */
    public C18418a f38996v0;

    /* JADX INFO: renamed from: w0 */
    public InterfaceC13849E f38997w0;

    /* JADX INFO: renamed from: x0 */
    public InterfaceC20904w f38998x0;

    /* JADX INFO: renamed from: y0 */
    public C13406b f38999y0;

    /* JADX INFO: renamed from: z0 */
    public final C3430e f39000z0 = AbstractC8168p6.m8749b("NotificationTokenService", null);

    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:39:0x0127  */
    /* JADX WARN: Code duplicated, block: B:41:0x012d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0133 A[ORIG_RETURN, RETURN] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: c */
    public final void mo13715c(C2390t c2390t) {
        String str;
        String str2;
        String str3;
        Notification notificationM19164a;
        InterfaceC20904w interfaceC20904w;
        C20899r c20899r;
        C13406b c13406b;
        if (this.f38993A0) {
            C18418a c18418a = this.f38996v0;
            if (c18418a == null) {
                AbstractC16544l.m18103p("accountSession");
                throw null;
            }
            if (c18418a.f58773a.f58783b) {
                return;
            }
            InterfaceC13849E interfaceC13849E = this.f38997w0;
            if (interfaceC13849E == null) {
                AbstractC16544l.m18103p("experimentManager");
                throw null;
            }
            if (((C14005w2) interfaceC13849E).m15481a(C13906X0.f43956c) && (str = (String) ((C12966e) c2390t.m3501b()).get("channel_id")) != null) {
                C11527o c11527o = AbstractC18201b.f58034a;
                c11527o.getClass();
                int i10 = AbstractC7410o.f23474a[((EnumC7643d) c11527o.m12903b(str, EnumC7643d.Companion.serializer())).ordinal()];
                if (i10 == 1) {
                    String str4 = (String) ((C12966e) c2390t.m3501b()).get("conversation_id");
                    if (str4 != null && (str2 = (String) ((C12966e) c2390t.m3501b()).get(UiComponentConfig.Title.type)) != null && (str3 = (String) ((C12966e) c2390t.m3501b()).get("body")) != null) {
                        Intent intent = new Intent();
                        AbstractC9186P.m9748b(intent, "https://chat.com/c/".concat(str4));
                        intent.putExtra("TAP_NOTIFICATION", true);
                        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 1140850688);
                        Intent intent2 = new Intent(this, (Class<?>) NotificationBroadcastReceiver.class);
                        intent2.putExtra("DISMISS_NOTIFICATION", true);
                        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent2, 201326592);
                        C17465r c17465r = new C17465r(this, "jawbone");
                        c17465r.f55827e = C17465r.m19163b(str2);
                        c17465r.f55828f = C17465r.m19163b(str3);
                        c17465r.f55832j = 1;
                        c17465r.f55839q = 1;
                        c17465r.f55842t.icon = R.drawable.ic_notification_small_icon;
                        c17465r.m19165c(16, true);
                        c17465r.f55829g = activity;
                        c17465r.f55842t.deleteIntent = broadcast;
                        notificationM19164a = c17465r.m19164a();
                    }
                    if (notificationM19164a != null) {
                        interfaceC20904w = this.f38998x0;
                        if (interfaceC20904w != null) {
                            AbstractC16544l.m18103p("analyticsService");
                            throw null;
                        }
                        c20899r = C20899r.f66617d;
                        c13406b = this.f38999y0;
                        if (c13406b != null) {
                            AbstractC16544l.m18103p("foregroundDetector");
                            throw null;
                        }
                        interfaceC20904w.mo21447a(c20899r, AbstractC17660E.m19258c(new C17309l("is_in_foreground", c13406b.f42469c.f6797Y.getValue())));
                        Object systemService = getSystemService("notification");
                        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                        ((NotificationManager) systemService).notify((int) System.currentTimeMillis(), notificationM19164a);
                    }
                }
                if (i10 != 2) {
                    throw new C0644w();
                }
                AbstractC8160o6.m8731f(this.f39000z0, "Received notification for unknown channel ".concat(str), null, null, 6);
                notificationM19164a = null;
                if (notificationM19164a != null) {
                    interfaceC20904w = this.f38998x0;
                    if (interfaceC20904w != null) {
                        AbstractC16544l.m18103p("analyticsService");
                        throw null;
                    }
                    c20899r = C20899r.f66617d;
                    c13406b = this.f38999y0;
                    if (c13406b != null) {
                        AbstractC16544l.m18103p("foregroundDetector");
                        throw null;
                    }
                    interfaceC20904w.mo21447a(c20899r, AbstractC17660E.m19258c(new C17309l("is_in_foreground", c13406b.f42469c.f6797Y.getValue())));
                    Object systemService2 = getSystemService("notification");
                    AbstractC16544l.m18092e(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
                    ((NotificationManager) systemService2).notify((int) System.currentTimeMillis(), notificationM19164a);
                }
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: d */
    public final void mo13716d(String token) {
        AbstractC16544l.m18094g(token, "token");
        if (!this.f38993A0) {
            AbstractC8160o6.m8728c(this.f39000z0, "Received new token but dependencies not injected. No action taken.", null, null, 6);
            return;
        }
        C17627a c17627a = this.f38995u0;
        if (c17627a != null) {
            AbstractC0575H.m1156D(c17627a, null, null, new C7411p(this, token, null), 3);
        } else {
            AbstractC16544l.m18103p("scope");
            throw null;
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C1996m c1996m = (C1996m) C17632f.f56419a.m19235b(C1996m.class);
        if (c1996m == null) {
            AbstractC8160o6.m8731f(this.f39000z0, "AccountUserScope not available. Skipping token registration.", null, null, 6);
            return;
        }
        C7409n repository = (C7409n) c1996m.f5978v.get();
        AbstractC16544l.m18094g(repository, "repository");
        this.f38994t0 = repository;
        this.f38995u0 = c1996m.f5938b;
        C18418a accountSession = c1996m.f5936a;
        AbstractC16544l.m18094g(accountSession, "accountSession");
        this.f38996v0 = accountSession;
        InterfaceC13849E experimentManager = (InterfaceC13849E) c1996m.f5964o.get();
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        this.f38997w0 = experimentManager;
        InterfaceC20904w analyticsService = (InterfaceC20904w) c1996m.f5962n.get();
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f38998x0 = analyticsService;
        C13406b foregroundDetector = (C13406b) c1996m.f5940c.f6041e0.get();
        AbstractC16544l.m18094g(foregroundDetector, "foregroundDetector");
        this.f38999y0 = foregroundDetector;
        this.f38993A0 = true;
    }
}
