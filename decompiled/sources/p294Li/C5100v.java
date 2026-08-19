package p294Li;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p1155zi.InterfaceC21925I1;
import p172Gi.C3077j;

/* JADX INFO: renamed from: Li.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C5100v implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21925I1 f16670a;

    /* JADX INFO: renamed from: b */
    public final String f16671b;

    /* JADX INFO: renamed from: c */
    public final C3077j f16672c;

    /* JADX INFO: renamed from: d */
    public final boolean f16673d;

    /* JADX INFO: renamed from: e */
    public final boolean f16674e;

    public C5100v(InterfaceC21925I1 voiceOptions, String str, C3077j c3077j, boolean z6, boolean z10) {
        AbstractC16544l.m18094g(voiceOptions, "voiceOptions");
        this.f16670a = voiceOptions;
        this.f16671b = str;
        this.f16672c = c3077j;
        this.f16673d = z6;
        this.f16674e = z10;
    }

    /* JADX INFO: renamed from: e */
    public static C5100v m5663e(C5100v c5100v, InterfaceC21925I1 interfaceC21925I1, C3077j c3077j, boolean z6, int i10) {
        if ((i10 & 1) != 0) {
            interfaceC21925I1 = c5100v.f16670a;
        }
        InterfaceC21925I1 voiceOptions = interfaceC21925I1;
        String str = c5100v.f16671b;
        if ((i10 & 4) != 0) {
            c3077j = c5100v.f16672c;
        }
        C3077j c3077j2 = c3077j;
        if ((i10 & 8) != 0) {
            z6 = c5100v.f16673d;
        }
        boolean z10 = c5100v.f16674e;
        c5100v.getClass();
        AbstractC16544l.m18094g(voiceOptions, "voiceOptions");
        return new C5100v(voiceOptions, str, c3077j2, z6, z10);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5100v)) {
            return false;
        }
        C5100v c5100v = (C5100v) obj;
        if (!AbstractC16544l.m18089b(this.f16670a, c5100v.f16670a)) {
            return false;
        }
        String str = this.f16671b;
        String str2 = c5100v.f16671b;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f16672c, c5100v.f16672c) && this.f16673d == c5100v.f16673d && this.f16674e == c5100v.f16674e;
    }

    public final int hashCode() {
        int iHashCode = this.f16670a.hashCode() * 31;
        String str = this.f16671b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C3077j c3077j = this.f16672c;
        return ((((iHashCode2 + (c3077j != null ? c3077j.hashCode() : 0)) * 31) + (this.f16673d ? 1231 : 1237)) * 31) + (this.f16674e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
