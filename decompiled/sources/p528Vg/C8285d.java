package p528Vg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p025An.C0644w;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Vg.d */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C8285d {
    public static final C8284c Companion = new C8284c();

    /* JADX INFO: renamed from: k */
    public static final KSerializer[] f25822k = {AbstractC11153a0.m12383f("com.openai.feature.settings.settings.ApiEnvironment", EnumC8282a.values()), null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final EnumC8282a f25823a;

    /* JADX INFO: renamed from: b */
    public final String f25824b;

    /* JADX INFO: renamed from: c */
    public final boolean f25825c;

    /* JADX INFO: renamed from: d */
    public final boolean f25826d;

    /* JADX INFO: renamed from: e */
    public final boolean f25827e;

    /* JADX INFO: renamed from: f */
    public final boolean f25828f;

    /* JADX INFO: renamed from: g */
    public final boolean f25829g;

    /* JADX INFO: renamed from: h */
    public final boolean f25830h;

    /* JADX INFO: renamed from: i */
    public final boolean f25831i;

    /* JADX INFO: renamed from: j */
    public final boolean f25832j;

    public C8285d(int i10, EnumC8282a enumC8282a, String str, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f25823a = (i10 & 1) == 0 ? EnumC8282a.f25819Y : enumC8282a;
        if ((i10 & 2) == 0) {
            this.f25824b = null;
        } else {
            this.f25824b = str;
        }
        boolean z17 = false;
        if ((i10 & 4) == 0) {
            this.f25825c = false;
        } else {
            this.f25825c = z6;
        }
        if ((i10 & 8) == 0) {
            this.f25826d = false;
        } else {
            this.f25826d = z10;
        }
        if ((i10 & 16) == 0) {
            this.f25827e = false;
        } else {
            this.f25827e = z11;
        }
        if ((i10 & 32) == 0) {
            this.f25828f = false;
        } else {
            this.f25828f = z12;
        }
        if ((i10 & 64) == 0) {
            this.f25829g = false;
        } else {
            this.f25829g = z13;
        }
        if ((i10 & 128) == 0) {
            this.f25830h = false;
        } else {
            this.f25830h = z14;
        }
        if ((i10 & 256) == 0) {
            this.f25831i = false;
        } else {
            this.f25831i = z15;
        }
        if ((i10 & 512) != 0) {
            this.f25832j = z16;
            return;
        }
        int iOrdinal = this.f25823a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            z17 = true;
        } else if (iOrdinal != 2) {
            throw new C0644w();
        }
        this.f25832j = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8285d)) {
            return false;
        }
        C8285d c8285d = (C8285d) obj;
        return this.f25823a == c8285d.f25823a && AbstractC16544l.m18089b(this.f25824b, c8285d.f25824b) && this.f25825c == c8285d.f25825c && this.f25826d == c8285d.f25826d && this.f25827e == c8285d.f25827e && this.f25828f == c8285d.f25828f && this.f25829g == c8285d.f25829g && this.f25830h == c8285d.f25830h && this.f25831i == c8285d.f25831i;
    }

    public final int hashCode() {
        int iHashCode = this.f25823a.hashCode() * 31;
        String str = this.f25824b;
        return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f25825c ? 1231 : 1237)) * 31) + (this.f25826d ? 1231 : 1237)) * 31) + (this.f25827e ? 1231 : 1237)) * 31) + (this.f25828f ? 1231 : 1237)) * 31) + (this.f25829g ? 1231 : 1237)) * 31) + (this.f25830h ? 1231 : 1237)) * 31) + (this.f25831i ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C8285d() {
        EnumC8282a enumC8282a = EnumC8282a.f25819Y;
        this.f25823a = enumC8282a;
        this.f25824b = null;
        boolean z6 = false;
        this.f25825c = false;
        this.f25826d = false;
        this.f25827e = false;
        this.f25828f = false;
        this.f25829g = false;
        this.f25830h = false;
        this.f25831i = false;
        int iOrdinal = enumC8282a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            z6 = true;
        } else if (iOrdinal != 2) {
            throw new C0644w();
        }
        this.f25832j = z6;
    }
}
