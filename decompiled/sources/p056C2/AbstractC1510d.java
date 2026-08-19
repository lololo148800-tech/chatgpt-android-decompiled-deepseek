package p056C2;

import android.media.MediaCodecInfo;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: renamed from: C2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1510d {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m2188e() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m2189f(int i10, int i11, int i12) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, i12);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m2190g(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ ContentCaptureSession m2192i(Object obj) {
        return (ContentCaptureSession) obj;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m2195l() {
    }
}
