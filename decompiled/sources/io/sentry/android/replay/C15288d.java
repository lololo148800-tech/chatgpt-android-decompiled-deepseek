package io.sentry.android.replay;

import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: io.sentry.android.replay.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C15288d {

    /* JADX INFO: renamed from: a */
    public final File f47752a;

    /* JADX INFO: renamed from: b */
    public final int f47753b;

    /* JADX INFO: renamed from: c */
    public final long f47754c;

    public C15288d(File file, int i10, long j10) {
        this.f47752a = file;
        this.f47753b = i10;
        this.f47754c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15288d)) {
            return false;
        }
        C15288d c15288d = (C15288d) obj;
        return AbstractC16544l.m18089b(this.f47752a, c15288d.f47752a) && this.f47753b == c15288d.f47753b && this.f47754c == c15288d.f47754c;
    }

    public final int hashCode() {
        int iHashCode = ((this.f47752a.hashCode() * 31) + this.f47753b) * 31;
        long j10 = this.f47754c;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "GeneratedVideo(video=" + this.f47752a + ", frameCount=" + this.f47753b + ", duration=" + this.f47754c + ')';
    }
}
