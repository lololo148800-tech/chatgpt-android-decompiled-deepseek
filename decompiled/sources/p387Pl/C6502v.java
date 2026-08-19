package p387Pl;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Pl.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C6502v {

    /* JADX INFO: renamed from: a */
    public final boolean f21097a;

    /* JADX INFO: renamed from: b */
    public final String f21098b;

    /* JADX INFO: renamed from: c */
    public final EnumC6481b f21099c;

    /* JADX INFO: renamed from: d */
    public final C6471S f21100d;

    public C6502v(boolean z6, String str, EnumC6481b enumC6481b, C6471S captureParams) {
        AbstractC16544l.m18094g(captureParams, "captureParams");
        this.f21097a = z6;
        this.f21098b = str;
        this.f21099c = enumC6481b;
        this.f21100d = captureParams;
    }

    /* JADX INFO: renamed from: a */
    public static C6502v m7068a(C6502v c6502v, boolean z6, String str, EnumC6481b enumC6481b, int i10) {
        if ((i10 & 1) != 0) {
            z6 = c6502v.f21097a;
        }
        if ((i10 & 2) != 0) {
            str = c6502v.f21098b;
        }
        if ((i10 & 4) != 0) {
            enumC6481b = c6502v.f21099c;
        }
        C6471S captureParams = c6502v.f21100d;
        c6502v.getClass();
        AbstractC16544l.m18094g(captureParams, "captureParams");
        return new C6502v(z6, str, enumC6481b, captureParams);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6502v)) {
            return false;
        }
        C6502v c6502v = (C6502v) obj;
        return this.f21097a == c6502v.f21097a && AbstractC16544l.m18089b(this.f21098b, c6502v.f21098b) && this.f21099c == c6502v.f21099c && AbstractC16544l.m18089b(this.f21100d, c6502v.f21100d);
    }

    public final int hashCode() {
        int i10 = (this.f21097a ? 1231 : 1237) * 31;
        String str = this.f21098b;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        EnumC6481b enumC6481b = this.f21099c;
        return this.f21100d.hashCode() + ((iHashCode + (enumC6481b != null ? enumC6481b.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LocalVideoTrackOptions(isScreencast=" + this.f21097a + ", deviceId=" + this.f21098b + ", position=" + this.f21099c + ", captureParams=" + this.f21100d + ')';
    }

    public C6502v(boolean z6, EnumC6481b enumC6481b, C6471S c6471s, int i10) {
        this((i10 & 1) != 0 ? false : z6, (String) null, (i10 & 4) != 0 ? EnumC6481b.f21034Y : enumC6481b, (i10 & 8) != 0 ? EnumC6475W.H720.f21017Y : c6471s);
    }
}
