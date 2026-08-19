package p387Pl;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import io.livekit.android.room.track.screencapture.ScreenCaptureService;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.ScreenCapturerAndroid;
import livekit.org.webrtc.VideoSource;
import livekit.org.webrtc.VideoTrack;
import mm.C17296C;
import mm.C17309l;
import p005A3.C0326m;
import p025An.C0624m;
import p197Hj.C3457c;
import p230J1.AbstractC4179f;
import p273Kl.C4762b;
import p357Oa.ServiceConnectionC6160m;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p896n2.C17465r;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Pl.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C6494n extends C6501u {
    public static final C6490j Companion = new C6490j();

    /* JADX INFO: renamed from: A */
    public final C6492l f21064A;

    /* JADX INFO: renamed from: B */
    public final C0326m f21065B;

    /* JADX INFO: renamed from: w */
    public int f21066w;

    /* JADX INFO: renamed from: x */
    public int f21067x;

    /* JADX INFO: renamed from: y */
    public final DisplayMetrics f21068y;

    /* JADX INFO: renamed from: z */
    public final WindowManager f21069z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6494n(ScreenCapturerAndroid screenCapturerAndroid, VideoSource videoSource, String str, C6502v c6502v, VideoTrack videoTrack, C6491k c6491k, PeerConnectionFactory peerConnectionFactory, Context context, EglBase eglBase, C4762b defaultsManager, C6503w videoTrackFactory) {
        super(screenCapturerAndroid, videoSource, str, c6502v, videoTrack, peerConnectionFactory, context, eglBase, defaultsManager, videoTrackFactory, null);
        AbstractC16544l.m18094g(peerConnectionFactory, "peerConnectionFactory");
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(eglBase, "eglBase");
        AbstractC16544l.m18094g(defaultsManager, "defaultsManager");
        AbstractC16544l.m18094g(videoTrackFactory, "videoTrackFactory");
        this.f21068y = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f21069z = (WindowManager) systemService;
        this.f21064A = new C6492l(context, this);
        AbstractC16544l.m18094g(context, "context");
        C0326m c0326m = new C0326m();
        c0326m.f1140b = context;
        c0326m.f1142d = new LinkedHashSet();
        c0326m.f1143e = new ServiceConnectionC6160m(c0326m, 1);
        this.f21065B = c0326m;
        c6491k.f21058a = new C3457c(this, 27);
    }

    @Override // p387Pl.C6501u, p387Pl.AbstractC6468O
    /* JADX INFO: renamed from: f */
    public final void mo7039f() {
        super.mo7039f();
        C0326m c0326m = this.f21065B;
        if (c0326m.f1139a) {
            ((Context) c0326m.f1140b).unbindService((ServiceConnectionC6160m) c0326m.f1143e);
        }
        c0326m.f1141c = null;
        c0326m.f1139a = false;
        this.f21064A.disable();
    }

    @Override // p387Pl.C6501u
    /* JADX INFO: renamed from: o */
    public final void mo7059o() {
        Display defaultDisplay = this.f21069z.getDefaultDisplay();
        DisplayMetrics displayMetrics = this.f21068y;
        defaultDisplay.getRealMetrics(displayMetrics);
        C17309l c17309lM7060p = m7060p(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f21089n.startCapture(((Number) c17309lM7060p.f55136Y).intValue(), ((Number) c17309lM7060p.f55137Z).intValue(), m7065l().f21100d.f21001c);
        C6492l c6492l = this.f21064A;
        if (c6492l.canDetectOrientation()) {
            c6492l.enable();
        }
    }

    /* JADX INFO: renamed from: p */
    public final C17309l m7060p(int i10, int i11) {
        if (m7065l().f21100d.f20999a != 0 || m7065l().f21100d.f21000b != 0) {
            if (i10 > i11) {
                i10 = m7065l().f21100d.f20999a;
                i11 = m7065l().f21100d.f21000b;
            } else {
                i10 = m7065l().f21100d.f21000b;
                i11 = m7065l().f21100d.f20999a;
            }
        }
        return new C17309l(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m7061q(AbstractC19687c abstractC19687c) {
        C6493m c6493m;
        Object objM1261q;
        C6494n c6494n;
        if (abstractC19687c instanceof C6493m) {
            c6493m = (C6493m) abstractC19687c;
            int i10 = c6493m.f21063p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6493m.f21063p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6493m = new C6493m(this, abstractC19687c);
            }
        } else {
            c6493m = new C6493m(this, abstractC19687c);
        }
        Object obj = c6493m.f21061Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6493m.f21063p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C0326m c0326m = this.f21065B;
            c6493m.f21060Y = this;
            c6493m.f21063p0 = 1;
            if (c0326m.f1139a) {
                objM1261q = C17296C.f55119a;
            } else {
                ((Context) c0326m.f1140b).bindService(new Intent((Context) c0326m.f1140b, (Class<?>) ScreenCaptureService.class), (ServiceConnectionC6160m) c0326m.f1143e, 1);
                C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c6493m));
                c0624m.m1262r();
                synchronized (c0326m) {
                    try {
                        if (c0326m.f1139a) {
                            c0624m.resumeWith(C17296C.f55119a);
                        } else {
                            ((LinkedHashSet) c0326m.f1142d).add(c0624m);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                objM1261q = c0624m.m1261q();
                if (objM1261q != enumC19250a) {
                    objM1261q = C17296C.f55119a;
                }
            }
            if (objM1261q == enumC19250a) {
                return enumC19250a;
            }
            c6494n = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6494n = c6493m.f21060Y;
            AbstractC9233X.m9807c(obj);
        }
        ScreenCaptureService screenCaptureService = (ScreenCaptureService) c6494n.f21065B.f1141c;
        if (screenCaptureService != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                AbstractC4179f.m4814j();
                NotificationChannel notificationChannelM4805a = AbstractC4179f.m4805a();
                Object systemService = screenCaptureService.getSystemService("notification");
                AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).createNotificationChannel(notificationChannelM4805a);
            }
            C17465r c17465r = new C17465r(screenCaptureService, "livekit_screen_capture");
            c17465r.f55832j = 0;
            Notification notificationM19164a = c17465r.m19164a();
            AbstractC16544l.m18091d(notificationM19164a);
            screenCaptureService.startForeground(2345, notificationM19164a);
        }
        return C17296C.f55119a;
    }
}
