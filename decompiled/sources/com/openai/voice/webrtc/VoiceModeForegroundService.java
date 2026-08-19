package com.openai.voice.webrtc;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import androidx.core.graphics.drawable.IconCompat;
import com.openai.chatgpt.R;
import io.sentry.AbstractC15152P0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17314q;
import p103Dn.C2153Q0;
import p152Fm.AbstractC2922d;
import p195Hh.C3430e;
import p341Ni.AbstractC5803w;
import p341Ni.C5804x;
import p341Ni.EnumC5802v;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9227W;
import p709di.C13174b;
import p728ei.C13406b;
import p896n2.AbstractC17453f;
import p896n2.AbstractC17458k;
import p896n2.AbstractC17466s;
import p896n2.AbstractC17473z;
import p896n2.C17459l;
import p896n2.C17465r;
import p896n2.C17469v;
import p909nm.AbstractC17680n;
import p913o2.AbstractC17807h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m18067d2 = {"Lcom/openai/voice/webrtc/VoiceModeForegroundService;", "Landroid/app/Service;", "<init>", "()V", "W9/k4", "Ni/v", "voice-webrtc_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VoiceModeForegroundService extends Service {

    /* JADX INFO: renamed from: o0 */
    public static final C3430e f40396o0 = AbstractC8168p6.m8749b("VoiceModeForegroundService", null);

    /* JADX INFO: renamed from: Y */
    public final int f40397Y;

    /* JADX INFO: renamed from: Z */
    public final C17314q f40398Z;

    public VoiceModeForegroundService() {
        AbstractC2922d.f8758Y.getClass();
        this.f40397Y = AbstractC2922d.f8759Z.mo3722b();
        this.f40398Z = AbstractC9227W.m9800c(C5804x.f18953Y);
    }

    /* JADX INFO: renamed from: a */
    public final Notification m14404a(Long l4) {
        NotificationChannel notificationChannelM19140b;
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        String string = getString(R.string.notification_channel_name);
        C17469v c17469v = new C17469v(this);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            notificationChannelM19140b = null;
        } else {
            notificationChannelM19140b = AbstractC17458k.m19140b(2, string, "voice_mode_ongoing");
            AbstractC17458k.m19145g(notificationChannelM19140b);
            AbstractC17458k.m19146h(notificationChannelM19140b);
            AbstractC17458k.m19151m(notificationChannelM19140b);
            AbstractC17458k.m19152n(notificationChannelM19140b, uri, audioAttributes);
            AbstractC17458k.m19142d(notificationChannelM19140b);
            AbstractC17458k.m19148j(notificationChannelM19140b);
            AbstractC17458k.m19154p(notificationChannelM19140b);
            AbstractC17458k.m19143e(notificationChannelM19140b);
        }
        if (i10 >= 26) {
            AbstractC17458k.m19141c(c17469v.f55844a, notificationChannelM19140b);
        }
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        PendingIntent activity = PendingIntent.getActivity(this, 7404, Intent.makeMainActivity(launchIntentForPackage != null ? launchIntentForPackage.getComponent() : null), 201326592);
        C17465r c17465r = new C17465r(this, "voice_mode_ongoing");
        c17465r.f55834l = true;
        c17465r.m19165c(2, true);
        long jLongValue = l4.longValue();
        Notification notification = c17465r.f55842t;
        notification.when = jLongValue;
        c17465r.f55839q = 1;
        notification.icon = R.drawable.ic_notification_small_icon;
        c17465r.f55828f = C17465r.m19163b(getString(R.string.notification_content));
        c17465r.f55829g = activity;
        String string2 = getString(R.string.voice_notification_end);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 7405, new Intent().setAction("End"), 67108864);
        AbstractC16544l.m18093f(broadcast, "getBroadcast(...)");
        IconCompat iconCompatM11384b = IconCompat.m11384b(null, "", R.drawable.outline_close_24);
        Bundle bundle = new Bundle();
        CharSequence charSequenceM19163b = C17465r.m19163b(string2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c17465r.f55824b.add(new C17459l(iconCompatM11384b, charSequenceM19163b, broadcast, bundle, arrayList2.isEmpty() ? null : (AbstractC17473z[]) arrayList2.toArray(new AbstractC17473z[arrayList2.size()]), arrayList.isEmpty() ? null : (AbstractC17473z[]) arrayList.toArray(new AbstractC17473z[arrayList.size()])));
        Notification notificationM19164a = c17465r.m19164a();
        AbstractC16544l.m18093f(notificationM19164a, "build(...)");
        return notificationM19164a;
    }

    @Override // android.app.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        AbstractC15152P0.m16327a("VoiceModeForegroundService.onCreate");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C2153Q0 c2153q0;
        Object value;
        super.onDestroy();
        C13406b c13406b = (C13406b) this.f40398Z.getValue();
        if (c13406b != null) {
            do {
                c2153q0 = c13406b.f42468b;
                value = c2153q0.getValue();
            } while (!c2153q0.m3250k(value, AbstractC17680n.m19357g0((List) value, new C13174b(this.f40397Y))));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        Serializable serializableExtra;
        C2153Q0 c2153q0;
        Object value;
        AbstractC16544l.m18094g(intent, "intent");
        AbstractC15152P0.m16327a("VoiceModeForegroundService.onStartCommand " + i10 + Separators.f31991SP + i11);
        if ("stop".equals(intent.getAction())) {
            AbstractC15152P0.m16327a("VoiceModeForegroundService received Stop command");
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC17466s.m19171d(this);
            } else {
                stopForeground(true);
            }
            stopSelf();
            return 2;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            serializableExtra = AbstractC17807h.m19566c(intent);
        } else {
            serializableExtra = intent.getSerializableExtra("mode");
            if (!EnumC5802v.class.isInstance(serializableExtra)) {
                serializableExtra = null;
            }
        }
        EnumC5802v enumC5802v = (EnumC5802v) serializableExtra;
        int i13 = 0;
        if (i12 >= 30) {
            int i14 = enumC5802v == null ? -1 : AbstractC5803w.f18952a[enumC5802v.ordinal()];
            if (i14 == 1) {
                i13 = 128;
            } else if (i14 == 2) {
                i13 = 160;
            }
        }
        try {
            Notification notificationM14404a = m14404a(Long.valueOf(intent.getLongExtra("start_time", 0L)));
            if (i12 >= 34) {
                AbstractC17453f.m19137f(this, notificationM14404a, i13);
            } else if (i12 >= 29) {
                AbstractC17453f.m19136e(this, notificationM14404a, i13);
            } else {
                startForeground(4414, notificationM14404a);
            }
            AbstractC15152P0.m16327a("VoiceModeForegroundService called startForeground");
        } catch (Exception e10) {
            AbstractC15152P0.m16331e().mo16250s(e10);
            AbstractC8160o6.m8731f(f40396o0, "Failed to start foreground service", e10, null, 4);
        }
        C13406b c13406b = (C13406b) this.f40398Z.getValue();
        if (c13406b != null) {
            do {
                c2153q0 = c13406b.f42468b;
                value = c2153q0.getValue();
            } while (!c2153q0.m3250k(value, AbstractC17680n.m19362l0((List) value, new C13174b(this.f40397Y))));
        }
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        sendBroadcast(new Intent().setAction("End").setPackage(getPackageName()));
    }
}
