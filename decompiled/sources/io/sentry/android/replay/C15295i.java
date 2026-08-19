package io.sentry.android.replay;

import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: io.sentry.android.replay.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C15295i {

    /* JADX INFO: renamed from: a */
    public final File f47781a;

    /* JADX INFO: renamed from: b */
    public final long f47782b;

    /* JADX INFO: renamed from: c */
    public final String f47783c;

    public C15295i(File file, long j10, String str) {
        this.f47781a = file;
        this.f47782b = j10;
        this.f47783c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15295i)) {
            return false;
        }
        C15295i c15295i = (C15295i) obj;
        return AbstractC16544l.m18089b(this.f47781a, c15295i.f47781a) && this.f47782b == c15295i.f47782b && AbstractC16544l.m18089b(this.f47783c, c15295i.f47783c);
    }

    public final int hashCode() {
        int iHashCode = this.f47781a.hashCode() * 31;
        long j10 = this.f47782b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str = this.f47783c;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReplayFrame(screenshot=");
        sb2.append(this.f47781a);
        sb2.append(", timestamp=");
        sb2.append(this.f47782b);
        sb2.append(", screen=");
        return AbstractC9306j0.m9892k(sb2, this.f47783c, ')');
    }
}
