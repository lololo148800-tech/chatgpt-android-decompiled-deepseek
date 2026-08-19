package p228J;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: J.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3826b {

    /* JADX INFO: renamed from: a */
    public final Executor f11585a;

    /* JADX INFO: renamed from: b */
    public final Handler f11586b;

    public C3826b(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f11585a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f11586b = handler;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3826b)) {
            return false;
        }
        C3826b c3826b = (C3826b) obj;
        return this.f11585a.equals(c3826b.f11585a) && this.f11586b.equals(c3826b.f11586b);
    }

    public final int hashCode() {
        return ((this.f11585a.hashCode() ^ 1000003) * 1000003) ^ this.f11586b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f11585a + ", schedulerHandler=" + this.f11586b + "}";
    }
}
