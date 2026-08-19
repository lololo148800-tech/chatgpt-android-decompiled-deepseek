package io.sentry.android.replay.video;

import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: io.sentry.android.replay.video.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15310a {

    /* JADX INFO: renamed from: a */
    public final File f47826a;

    /* JADX INFO: renamed from: b */
    public final int f47827b;

    /* JADX INFO: renamed from: c */
    public final int f47828c;

    /* JADX INFO: renamed from: d */
    public final int f47829d;

    /* JADX INFO: renamed from: e */
    public final int f47830e;

    /* JADX INFO: renamed from: f */
    public final String f47831f = "video/avc";

    public C15310a(File file, int i10, int i11, int i12, int i13) {
        this.f47826a = file;
        this.f47827b = i10;
        this.f47828c = i11;
        this.f47829d = i12;
        this.f47830e = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15310a)) {
            return false;
        }
        C15310a c15310a = (C15310a) obj;
        return AbstractC16544l.m18089b(this.f47826a, c15310a.f47826a) && this.f47827b == c15310a.f47827b && this.f47828c == c15310a.f47828c && this.f47829d == c15310a.f47829d && this.f47830e == c15310a.f47830e && AbstractC16544l.m18089b(this.f47831f, c15310a.f47831f);
    }

    public final int hashCode() {
        return this.f47831f.hashCode() + (((((((((this.f47826a.hashCode() * 31) + this.f47827b) * 31) + this.f47828c) * 31) + this.f47829d) * 31) + this.f47830e) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MuxerConfig(file=");
        sb2.append(this.f47826a);
        sb2.append(", recordingWidth=");
        sb2.append(this.f47827b);
        sb2.append(", recordingHeight=");
        sb2.append(this.f47828c);
        sb2.append(", frameRate=");
        sb2.append(this.f47829d);
        sb2.append(", bitRate=");
        sb2.append(this.f47830e);
        sb2.append(", mimeType=");
        return AbstractC9306j0.m9892k(sb2, this.f47831f, ')');
    }
}
