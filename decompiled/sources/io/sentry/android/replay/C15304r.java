package io.sentry.android.replay;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: io.sentry.android.replay.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C15304r {

    /* JADX INFO: renamed from: a */
    public final int f47813a;

    /* JADX INFO: renamed from: b */
    public final int f47814b;

    /* JADX INFO: renamed from: c */
    public final float f47815c;

    /* JADX INFO: renamed from: d */
    public final float f47816d;

    /* JADX INFO: renamed from: e */
    public final int f47817e;

    /* JADX INFO: renamed from: f */
    public final int f47818f;

    public C15304r(int i10, int i11, float f10, float f11, int i12, int i13) {
        this.f47813a = i10;
        this.f47814b = i11;
        this.f47815c = f10;
        this.f47816d = f11;
        this.f47817e = i12;
        this.f47818f = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15304r)) {
            return false;
        }
        C15304r c15304r = (C15304r) obj;
        return this.f47813a == c15304r.f47813a && this.f47814b == c15304r.f47814b && Float.compare(this.f47815c, c15304r.f47815c) == 0 && Float.compare(this.f47816d, c15304r.f47816d) == 0 && this.f47817e == c15304r.f47817e && this.f47818f == c15304r.f47818f;
    }

    public final int hashCode() {
        return ((AbstractC12107L1.m13819j(this.f47816d, AbstractC12107L1.m13819j(this.f47815c, ((this.f47813a * 31) + this.f47814b) * 31, 31), 31) + this.f47817e) * 31) + this.f47818f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb2.append(this.f47813a);
        sb2.append(", recordingHeight=");
        sb2.append(this.f47814b);
        sb2.append(", scaleFactorX=");
        sb2.append(this.f47815c);
        sb2.append(", scaleFactorY=");
        sb2.append(this.f47816d);
        sb2.append(", frameRate=");
        sb2.append(this.f47817e);
        sb2.append(", bitRate=");
        return AbstractC12107L1.m13826q(sb2, this.f47818f, ')');
    }
}
