package io.livekit.android.room.track.screencapture;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p410Ql.BinderC6758b;
import p410Ql.C6757a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m18067d2 = {"Lio/livekit/android/room/track/screencapture/ScreenCaptureService;", "Landroid/app/Service;", "<init>", "()V", "Companion", "Ql/a", "Ql/b", "livekit-android-sdk_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class ScreenCaptureService extends Service {
    public static final C6757a Companion = new C6757a();

    /* JADX INFO: renamed from: Y */
    public final BinderC6758b f46967Y = new BinderC6758b(this);

    /* JADX INFO: renamed from: Z */
    public int f46968Z;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.f46968Z++;
        return this.f46967Y;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        int i10 = this.f46968Z - 1;
        this.f46968Z = i10;
        if (i10 != 0) {
            return false;
        }
        stopSelf();
        return false;
    }
}
