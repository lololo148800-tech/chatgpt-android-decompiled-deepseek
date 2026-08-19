package p158G3;

import android.os.SystemClock;
import java.net.URL;
import p178H.C3129W;
import p178H.C3165q;
import p228J.C3795C;

/* JADX INFO: renamed from: G3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2988g {

    /* JADX INFO: renamed from: a */
    public int f8970a;

    /* JADX INFO: renamed from: b */
    public long f8971b;

    /* JADX INFO: renamed from: c */
    public Object f8972c;

    public C2988g(long j10, Exception exc) {
        this.f8971b = SystemClock.elapsedRealtime() - j10;
        if (exc instanceof C3795C) {
            this.f8970a = 2;
            this.f8972c = exc;
            return;
        }
        if (!(exc instanceof C3129W)) {
            this.f8970a = 0;
            this.f8972c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.f8972c = exc;
        if (exc instanceof C3165q) {
            this.f8970a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.f8970a = 1;
        } else {
            this.f8970a = 0;
        }
    }

    public C2988g(int i10, URL url, long j10) {
        this.f8970a = i10;
        this.f8972c = url;
        this.f8971b = j10;
    }
}
