package p621Zd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Zd.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10282c {
    public static final C10281b Companion = new C10281b();

    /* JADX INFO: renamed from: a */
    public final String f30530a;

    /* JADX INFO: renamed from: b */
    public final boolean f30531b;

    /* JADX INFO: renamed from: c */
    public final boolean f30532c;

    /* JADX INFO: renamed from: d */
    public final String f30533d;

    /* JADX INFO: renamed from: e */
    public final boolean f30534e;

    public /* synthetic */ C10282c(int i10, String str, boolean z6, boolean z10, String str2, boolean z11) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C10280a.f30529a.getDescriptor());
            throw null;
        }
        this.f30530a = str;
        if ((i10 & 2) == 0) {
            this.f30531b = false;
        } else {
            this.f30531b = z6;
        }
        if ((i10 & 4) == 0) {
            this.f30532c = false;
        } else {
            this.f30532c = z10;
        }
        if ((i10 & 8) == 0) {
            this.f30533d = null;
        } else {
            this.f30533d = str2;
        }
        if ((i10 & 16) == 0) {
            this.f30534e = false;
        } else {
            this.f30534e = z11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10282c)) {
            return false;
        }
        C10282c c10282c = (C10282c) obj;
        return AbstractC16544l.m18089b(this.f30530a, c10282c.f30530a) && this.f30531b == c10282c.f30531b && this.f30532c == c10282c.f30532c && AbstractC16544l.m18089b(this.f30533d, c10282c.f30533d) && this.f30534e == c10282c.f30534e;
    }

    public final int hashCode() {
        String str = this.f30530a;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + (this.f30531b ? 1231 : 1237)) * 31) + (this.f30532c ? 1231 : 1237)) * 31;
        String str2 = this.f30533d;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f30534e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C10282c(String str, boolean z6, boolean z10, String str2, boolean z11, int i10) {
        z6 = (i10 & 2) != 0 ? false : z6;
        z10 = (i10 & 4) != 0 ? false : z10;
        str2 = (i10 & 8) != 0 ? null : str2;
        z11 = (i10 & 16) != 0 ? false : z11;
        this.f30530a = str;
        this.f30531b = z6;
        this.f30532c = z10;
        this.f30533d = str2;
        this.f30534e = z11;
    }
}
