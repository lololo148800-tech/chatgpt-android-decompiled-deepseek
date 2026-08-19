package p387Pl;

import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: Pl.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C6471S {

    /* JADX INFO: renamed from: a */
    public final int f20999a;

    /* JADX INFO: renamed from: b */
    public final int f21000b;

    /* JADX INFO: renamed from: c */
    public final int f21001c;

    /* JADX INFO: renamed from: d */
    public final boolean f21002d;

    public C6471S(int i10, int i11, int i12, boolean z6) {
        this.f20999a = i10;
        this.f21000b = i11;
        this.f21001c = i12;
        this.f21002d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6471S)) {
            return false;
        }
        C6471S c6471s = (C6471S) obj;
        return this.f20999a == c6471s.f20999a && this.f21000b == c6471s.f21000b && this.f21001c == c6471s.f21001c && this.f21002d == c6471s.f21002d;
    }

    public final int hashCode() {
        return (((((this.f20999a * 31) + this.f21000b) * 31) + this.f21001c) * 31) + (this.f21002d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoCaptureParameter(width=");
        sb2.append(this.f20999a);
        sb2.append(", height=");
        sb2.append(this.f21000b);
        sb2.append(", maxFps=");
        sb2.append(this.f21001c);
        sb2.append(", adaptOutputToDimensions=");
        return AbstractC3794B0.m4499x(sb2, this.f21002d, ')');
    }
}
