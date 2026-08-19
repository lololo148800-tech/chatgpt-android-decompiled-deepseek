package p479Td;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Td.W */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7336W {
    public static final C7335V Companion = new C7335V();

    /* JADX INFO: renamed from: a */
    public final String f23241a;

    /* JADX INFO: renamed from: b */
    public final Boolean f23242b;

    /* JADX INFO: renamed from: c */
    public final String f23243c;

    /* JADX INFO: renamed from: d */
    public final boolean f23244d;

    /* JADX INFO: renamed from: e */
    public final boolean f23245e;

    public /* synthetic */ C7336W(int i10, String str, Boolean bool, String str2, boolean z6, boolean z10) {
        if ((i10 & 1) == 0) {
            this.f23241a = null;
        } else {
            this.f23241a = str;
        }
        if ((i10 & 2) == 0) {
            this.f23242b = null;
        } else {
            this.f23242b = bool;
        }
        if ((i10 & 4) == 0) {
            this.f23243c = null;
        } else {
            this.f23243c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f23244d = false;
        } else {
            this.f23244d = z6;
        }
        if ((i10 & 16) == 0) {
            this.f23245e = false;
        } else {
            this.f23245e = z10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7336W)) {
            return false;
        }
        C7336W c7336w = (C7336W) obj;
        return AbstractC16544l.m18089b(this.f23241a, c7336w.f23241a) && AbstractC16544l.m18089b(this.f23242b, c7336w.f23242b) && AbstractC16544l.m18089b(this.f23243c, c7336w.f23243c) && this.f23244d == c7336w.f23244d && this.f23245e == c7336w.f23245e;
    }

    public final int hashCode() {
        String str = this.f23241a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f23242b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f23243c;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f23244d ? 1231 : 1237)) * 31) + (this.f23245e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C7336W(String str, Boolean bool, String str2, boolean z6, boolean z10) {
        this.f23241a = str;
        this.f23242b = bool;
        this.f23243c = str2;
        this.f23244d = z6;
        this.f23245e = z10;
    }
}
