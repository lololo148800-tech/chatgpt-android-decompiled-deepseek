package p344Nl;

import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: Nl.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C5823E {
    public static final C5822D Companion = new C5822D();

    /* JADX INFO: renamed from: a */
    public final boolean f19014a;

    /* JADX INFO: renamed from: b */
    public final boolean f19015b;

    /* JADX INFO: renamed from: c */
    public final boolean f19016c;

    /* JADX INFO: renamed from: d */
    public final boolean f19017d;

    /* JADX INFO: renamed from: e */
    public final boolean f19018e;

    public C5823E(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f19014a = z6;
        this.f19015b = z10;
        this.f19016c = z11;
        this.f19017d = z12;
        this.f19018e = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5823E)) {
            return false;
        }
        C5823E c5823e = (C5823E) obj;
        return this.f19014a == c5823e.f19014a && this.f19015b == c5823e.f19015b && this.f19016c == c5823e.f19016c && this.f19017d == c5823e.f19017d && this.f19018e == c5823e.f19018e;
    }

    public final int hashCode() {
        return ((((((((this.f19014a ? 1231 : 1237) * 31) + (this.f19015b ? 1231 : 1237)) * 31) + (this.f19016c ? 1231 : 1237)) * 31) + (this.f19017d ? 1231 : 1237)) * 31) + (this.f19018e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParticipantPermission(canPublish=");
        sb2.append(this.f19014a);
        sb2.append(", canSubscribe=");
        sb2.append(this.f19015b);
        sb2.append(", canPublishData=");
        sb2.append(this.f19016c);
        sb2.append(", hidden=");
        sb2.append(this.f19017d);
        sb2.append(", recorder=");
        return AbstractC3794B0.m4499x(sb2, this.f19018e, ')');
    }
}
