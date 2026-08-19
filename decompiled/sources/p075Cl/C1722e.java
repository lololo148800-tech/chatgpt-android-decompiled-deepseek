package p075Cl;

import kotlin.jvm.internal.AbstractC16544l;
import p344Nl.C5827I;
import p344Nl.C5830b;
import p387Pl.C6488h;
import p387Pl.C6502v;
import p813ij.C15026j;

/* JADX INFO: renamed from: Cl.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C1722e {

    /* JADX INFO: renamed from: a */
    public final boolean f4950a;

    /* JADX INFO: renamed from: b */
    public final boolean f4951b;

    /* JADX INFO: renamed from: c */
    public final C15026j f4952c;

    /* JADX INFO: renamed from: d */
    public final C6488h f4953d;

    /* JADX INFO: renamed from: e */
    public final C6502v f4954e;

    /* JADX INFO: renamed from: f */
    public final C5830b f4955f;

    /* JADX INFO: renamed from: g */
    public final C5827I f4956g;

    /* JADX INFO: renamed from: h */
    public final C6502v f4957h;

    /* JADX INFO: renamed from: i */
    public final C5827I f4958i;

    public /* synthetic */ C1722e(C6502v c6502v, C5827I c5827i, int i10) {
        this(false, false, null, null, (i10 & 16) != 0 ? null : c6502v, null, (i10 & 64) != 0 ? null : c5827i, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1722e)) {
            return false;
        }
        C1722e c1722e = (C1722e) obj;
        return this.f4950a == c1722e.f4950a && this.f4951b == c1722e.f4951b && AbstractC16544l.m18089b(this.f4952c, c1722e.f4952c) && AbstractC16544l.m18089b(this.f4953d, c1722e.f4953d) && AbstractC16544l.m18089b(this.f4954e, c1722e.f4954e) && AbstractC16544l.m18089b(this.f4955f, c1722e.f4955f) && AbstractC16544l.m18089b(this.f4956g, c1722e.f4956g) && AbstractC16544l.m18089b(this.f4957h, c1722e.f4957h) && AbstractC16544l.m18089b(this.f4958i, c1722e.f4958i);
    }

    public final int hashCode() {
        int i10 = (((this.f4950a ? 1231 : 1237) * 31) + (this.f4951b ? 1231 : 1237)) * 31;
        C15026j c15026j = this.f4952c;
        int iHashCode = (i10 + (c15026j == null ? 0 : c15026j.hashCode())) * 31;
        C6488h c6488h = this.f4953d;
        int iHashCode2 = (iHashCode + (c6488h == null ? 0 : c6488h.hashCode())) * 31;
        C6502v c6502v = this.f4954e;
        int iHashCode3 = (iHashCode2 + (c6502v == null ? 0 : c6502v.hashCode())) * 31;
        C5830b c5830b = this.f4955f;
        int iHashCode4 = (iHashCode3 + (c5830b == null ? 0 : c5830b.hashCode())) * 31;
        C5827I c5827i = this.f4956g;
        int iHashCode5 = (iHashCode4 + (c5827i == null ? 0 : c5827i.hashCode())) * 31;
        C6502v c6502v2 = this.f4957h;
        int iHashCode6 = (iHashCode5 + (c6502v2 == null ? 0 : c6502v2.hashCode())) * 31;
        C5827I c5827i2 = this.f4958i;
        return iHashCode6 + (c5827i2 != null ? c5827i2.hashCode() : 0);
    }

    public final String toString() {
        return "RoomOptions(adaptiveStream=" + this.f4950a + ", dynacast=" + this.f4951b + ", e2eeOptions=" + this.f4952c + ", audioTrackCaptureDefaults=" + this.f4953d + ", videoTrackCaptureDefaults=" + this.f4954e + ", audioTrackPublishDefaults=" + this.f4955f + ", videoTrackPublishDefaults=" + this.f4956g + ", screenShareTrackCaptureDefaults=" + this.f4957h + ", screenShareTrackPublishDefaults=" + this.f4958i + ')';
    }

    public C1722e(boolean z6, boolean z10, C15026j c15026j, C6488h c6488h, C6502v c6502v, C5830b c5830b, C5827I c5827i, C6502v c6502v2, C5827I c5827i2) {
        this.f4950a = z6;
        this.f4951b = z10;
        this.f4952c = c15026j;
        this.f4953d = c6488h;
        this.f4954e = c6502v;
        this.f4955f = c5830b;
        this.f4956g = c5827i;
        this.f4957h = c6502v2;
        this.f4958i = c5827i2;
    }
}
