package p403Qd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Qd.m */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6644m extends AbstractC6661w {
    public static final C6642l Companion = new C6642l();

    /* JADX INFO: renamed from: c */
    public final boolean f21405c;

    /* JADX INFO: renamed from: d */
    public final String f21406d;

    /* JADX INFO: renamed from: e */
    public final boolean f21407e;

    /* JADX INFO: renamed from: f */
    public final boolean f21408f;

    public /* synthetic */ C6644m(int i10, String str, boolean z6, boolean z10, boolean z11) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C6640k.f21403a.getDescriptor());
            throw null;
        }
        this.f21405c = z6;
        if ((i10 & 2) == 0) {
            this.f21406d = null;
        } else {
            this.f21406d = str;
        }
        if ((i10 & 4) == 0) {
            this.f21407e = false;
        } else {
            this.f21407e = z10;
        }
        if ((i10 & 8) == 0) {
            this.f21408f = false;
        } else {
            this.f21408f = z11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6644m)) {
            return false;
        }
        C6644m c6644m = (C6644m) obj;
        return this.f21405c == c6644m.f21405c && AbstractC16544l.m18089b(this.f21406d, c6644m.f21406d) && this.f21407e == c6644m.f21407e && this.f21408f == c6644m.f21408f;
    }

    public final int hashCode() {
        int i10 = (this.f21405c ? 1231 : 1237) * 31;
        String str = this.f21406d;
        return ((((i10 + (str == null ? 0 : str.hashCode())) * 31) + (this.f21407e ? 1231 : 1237)) * 31) + (this.f21408f ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C6644m(boolean z6, String str, boolean z10, boolean z11) {
        this.f21405c = z6;
        this.f21406d = str;
        this.f21407e = z10;
        this.f21408f = z11;
    }
}
