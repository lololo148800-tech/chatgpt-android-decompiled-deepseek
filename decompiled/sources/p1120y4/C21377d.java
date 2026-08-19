package p1120y4;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: y4.d */
/* JADX INFO: loaded from: classes.dex */
public class C21377d {

    /* JADX INFO: renamed from: a */
    public final ArrayList f67865a;

    /* JADX INFO: renamed from: b */
    public long f67866b;

    /* JADX INFO: renamed from: c */
    public long f67867c;

    /* JADX INFO: renamed from: d */
    public boolean f67868d;

    public C21377d(ArrayList states) {
        AbstractC16544l.m18094g(states, "states");
        this.f67865a = states;
        this.f67866b = 0L;
        this.f67867c = 0L;
        this.f67868d = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.metrics.performance.FrameData");
        C21377d c21377d = (C21377d) obj;
        return this.f67866b == c21377d.f67866b && this.f67867c == c21377d.f67867c && this.f67868d == c21377d.f67868d && AbstractC16544l.m18089b(this.f67865a, c21377d.f67865a);
    }

    public int hashCode() {
        long j10 = this.f67866b;
        long j11 = this.f67867c;
        return this.f67865a.hashCode() + (((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f67868d ? 1231 : 1237)) * 31);
    }

    public String toString() {
        return "FrameData(frameStartNanos=" + this.f67866b + ", frameDurationUiNanos=" + this.f67867c + ", isJank=" + this.f67868d + ", states=" + this.f67865a + ')';
    }
}
