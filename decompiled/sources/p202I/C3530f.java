package p202I;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.List;
import java.util.concurrent.Executor;
import p117Eb.C2392v;
import p178H.InterfaceC3121N;
import p348O.AbstractC5939a;

/* JADX INFO: renamed from: I.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3530f {

    /* JADX INFO: renamed from: a */
    public int f10672a;

    /* JADX INFO: renamed from: b */
    public final Executor f10673b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3121N f10674c;

    /* JADX INFO: renamed from: d */
    public final C2392v f10675d;

    /* JADX INFO: renamed from: e */
    public final Rect f10676e;

    /* JADX INFO: renamed from: f */
    public final Matrix f10677f;

    /* JADX INFO: renamed from: g */
    public final int f10678g;

    /* JADX INFO: renamed from: h */
    public final int f10679h;

    /* JADX INFO: renamed from: i */
    public final int f10680i;

    /* JADX INFO: renamed from: j */
    public final List f10681j;

    public C3530f(Executor executor, InterfaceC3121N interfaceC3121N, C2392v c2392v, Rect rect, Matrix matrix, int i10, int i11, int i12, List list) {
        this.f10672a = ((CaptureFailedRetryQuirk) AbstractC5939a.f19323a.m4579f(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f10673b = executor;
        this.f10674c = interfaceC3121N;
        this.f10675d = c2392v;
        this.f10676e = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f10677f = matrix;
        this.f10678g = i10;
        this.f10679h = i11;
        this.f10680i = i12;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f10681j = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3530f)) {
            return false;
        }
        C3530f c3530f = (C3530f) obj;
        if (this.f10673b.equals(c3530f.f10673b)) {
            InterfaceC3121N interfaceC3121N = c3530f.f10674c;
            InterfaceC3121N interfaceC3121N2 = this.f10674c;
            if (interfaceC3121N2 != null ? interfaceC3121N2.equals(interfaceC3121N) : interfaceC3121N == null) {
                C2392v c2392v = c3530f.f10675d;
                C2392v c2392v2 = this.f10675d;
                if (c2392v2 != null ? c2392v2.equals(c2392v) : c2392v == null) {
                    if (this.f10676e.equals(c3530f.f10676e) && this.f10677f.equals(c3530f.f10677f) && this.f10678g == c3530f.f10678g && this.f10679h == c3530f.f10679h && this.f10680i == c3530f.f10680i && this.f10681j.equals(c3530f.f10681j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f10673b.hashCode() ^ 1000003) * (-721379959);
        InterfaceC3121N interfaceC3121N = this.f10674c;
        int iHashCode2 = (iHashCode ^ (interfaceC3121N == null ? 0 : interfaceC3121N.hashCode())) * 1000003;
        C2392v c2392v = this.f10675d;
        return ((((((((((((iHashCode2 ^ (c2392v != null ? c2392v.hashCode() : 0)) * 1000003) ^ this.f10676e.hashCode()) * 1000003) ^ this.f10677f.hashCode()) * 1000003) ^ this.f10678g) * 1000003) ^ this.f10679h) * 1000003) ^ this.f10680i) * 1000003) ^ this.f10681j.hashCode();
    }

    public final String toString() {
        return "TakePictureRequest{appExecutor=" + this.f10673b + ", inMemoryCallback=null, onDiskCallback=" + this.f10674c + ", outputFileOptions=" + this.f10675d + ", cropRect=" + this.f10676e + ", sensorToBufferTransform=" + this.f10677f + ", rotationDegrees=" + this.f10678g + ", jpegQuality=" + this.f10679h + ", captureMode=" + this.f10680i + ", sessionConfigCameraCaptureCallbacks=" + this.f10681j + "}";
    }
}
