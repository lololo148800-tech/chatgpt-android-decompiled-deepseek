package com.openai.feature.voice.impl.quicktile;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.service.quicksettings.TileService;
import com.openai.voice.assistant.AssistantActivity;
import gd.C13924c1;
import gd.C13938g;
import gd.C13969n2;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import ni.C17632f;
import ni.C17633g;
import p092Dc.C1996m;
import p1081wc.C20887f;
import p195Hh.C3430e;
import p318Mh.C5431w;
import p318Mh.EnumC5421r;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p523V9.AbstractC8223w5;
import p571X9.AbstractC9405z3;
import p728ei.C13406b;
import p909nm.AbstractC17681o;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/voice/impl/quicktile/QuickTileService;", "Landroid/service/quicksettings/TileService;", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class QuickTileService extends TileService {

    /* JADX INFO: renamed from: Y */
    public final C3430e f40267Y = AbstractC8168p6.m8749b("QuickTileService", null);

    /* JADX INFO: renamed from: a */
    public final void m14384a(C1996m c1996m) {
        InterfaceC13849E interfaceC13849EMo3166d = c1996m.mo3166d();
        C13969n2 c13969n2Mo3167e = c1996m.mo3167e();
        Intent intentM9981a = ((Boolean) ((C13406b) c1996m.f5940c.f6041e0.get()).f42469c.f6797Y.getValue()).booleanValue() ? AbstractC9405z3.m9981a(this, C5431w.m5902f(C5431w.f17746g, EnumC5421r.f17710Z, null, false, false, 14), AbstractC17681o.m19382k(268435456, 131072)) : new Intent(this, (Class<?>) AssistantActivity.class).addFlags(268435456).addFlags(134217728).addFlags(8388608).addFlags(1073741824);
        if (intentM9981a != null) {
            if (((C14005w2) interfaceC13849EMo3166d).m15481a(C13924c1.f43974c)) {
                intentM9981a.putExtra("gizmoId", (String) c13969n2Mo3167e.m15477a(C13938g.f43988d));
            }
            if (Build.VERSION.SDK_INT >= 34) {
                startActivityAndCollapse(PendingIntent.getActivity(this, 0, intentM9981a, 67108864));
            } else {
                startActivityAndCollapse(intentM9981a);
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        try {
            return super.onBind(intent);
        } catch (Exception e10) {
            AbstractC8160o6.m8731f(this.f40267Y, "QuickTileService onBind failed", e10, null, 4);
            return null;
        }
    }

    public final void onClick() {
        AbstractC8223w5.m8851c().mo21447a(C20887f.f66530e, C17690x.f56481Y);
        try {
            Object objM19235b = C17632f.f56419a.m19235b(C1996m.class);
            if (objM19235b == null) {
                throw new C17633g("No " + C1996m.class.getName() + " in " + C17632f.m19233c());
            }
            C1996m c1996m = (C1996m) objM19235b;
            boolean z6 = c1996m.f5936a.f58773a.f58783b;
            if (!z6) {
                m14384a(c1996m);
                return;
            }
            if (z6) {
                Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                AbstractC16544l.m18091d(launchIntentForPackage);
                if (Build.VERSION.SDK_INT >= 34) {
                    startActivityAndCollapse(PendingIntent.getActivity(this, 0, launchIntentForPackage, 67108864));
                } else {
                    startActivityAndCollapse(launchIntentForPackage);
                }
            }
        } catch (C17633g unused) {
            Intent launchIntentForPackage2 = getPackageManager().getLaunchIntentForPackage(getPackageName());
            AbstractC16544l.m18091d(launchIntentForPackage2);
            if (Build.VERSION.SDK_INT >= 34) {
                startActivityAndCollapse(PendingIntent.getActivity(this, 0, launchIntentForPackage2, 67108864));
            } else {
                startActivityAndCollapse(launchIntentForPackage2);
            }
        }
    }

    public final void onTileAdded() {
        AbstractC8223w5.m8851c().mo21447a(C20887f.f66528c, C17690x.f56481Y);
    }

    public final void onTileRemoved() {
        AbstractC8223w5.m8851c().mo21447a(C20887f.f66537l, C17690x.f56481Y);
    }
}
