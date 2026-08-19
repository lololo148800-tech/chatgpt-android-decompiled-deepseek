package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: io.sentry.android.replay.video.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15312c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public static final C15312c f47838Y = new C15312c(0);

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        boolean z6 = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        AbstractC16544l.m18093f(codecInfos, "MediaCodecList(MediaCode…)\n            .codecInfos");
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            String name = mediaCodecInfo.getName();
            AbstractC16544l.m18093f(name, "it.name");
            if (AbstractC21322p.m21667A(name, "c2.exynos", false)) {
                z6 = true;
                break;
            }
        }
        return Boolean.valueOf(z6);
    }
}
