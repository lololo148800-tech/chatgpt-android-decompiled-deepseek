package p403Qd;

import kotlin.jvm.internal.AbstractC16544l;
import p479Td.C7320F;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Qd.d0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6627d0 extends AbstractC6653q0 {
    public static final C6625c0 Companion = new C6625c0();

    /* JADX INFO: renamed from: b */
    public final String f21362b;

    /* JADX INFO: renamed from: c */
    public final C7320F f21363c;

    /* JADX INFO: renamed from: d */
    public final boolean f21364d;

    public /* synthetic */ C6627d0(int i10, String str, C7320F c7320f, boolean z6) {
        if ((i10 & 1) == 0) {
            this.f21362b = null;
        } else {
            this.f21362b = str;
        }
        if ((i10 & 2) == 0) {
            this.f21363c = null;
        } else {
            this.f21363c = c7320f;
        }
        if ((i10 & 4) == 0) {
            this.f21364d = false;
        } else {
            this.f21364d = z6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6627d0)) {
            return false;
        }
        C6627d0 c6627d0 = (C6627d0) obj;
        return AbstractC16544l.m18089b(this.f21362b, c6627d0.f21362b) && AbstractC16544l.m18089b(this.f21363c, c6627d0.f21363c) && this.f21364d == c6627d0.f21364d;
    }

    public final int hashCode() {
        String str = this.f21362b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C7320F c7320f = this.f21363c;
        return ((iHashCode + (c7320f != null ? c7320f.hashCode() : 0)) * 31) + (this.f21364d ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C6627d0(String str, C7320F c7320f, boolean z6) {
        this.f21362b = str;
        this.f21363c = c7320f;
        this.f21364d = z6;
    }

    public /* synthetic */ C6627d0(String str, boolean z6, int i10) {
        this((i10 & 1) != 0 ? null : str, (C7320F) null, (i10 & 4) != 0 ? false : z6);
    }
}
