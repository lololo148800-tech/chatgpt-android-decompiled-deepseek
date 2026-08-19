package io.sentry.android.replay.video;

import android.media.MediaMuxer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.android.replay.video.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C15311b {

    /* JADX INFO: renamed from: a */
    public final long f47832a;

    /* JADX INFO: renamed from: b */
    public final MediaMuxer f47833b;

    /* JADX INFO: renamed from: c */
    public boolean f47834c;

    /* JADX INFO: renamed from: d */
    public int f47835d;

    /* JADX INFO: renamed from: e */
    public int f47836e;

    /* JADX INFO: renamed from: f */
    public long f47837f;

    public C15311b(String str, float f10) {
        this.f47832a = (long) (TimeUnit.SECONDS.toMicros(1L) / f10);
        this.f47833b = new MediaMuxer(str, 0);
    }
}
