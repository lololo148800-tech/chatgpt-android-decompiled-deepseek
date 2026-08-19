package gh;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: gh.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C14138f {
    public static final C14137e Companion = new C14137e();

    /* JADX INFO: renamed from: a */
    public final String f44480a;

    /* JADX INFO: renamed from: b */
    public final boolean f44481b;

    public C14138f(String str, int i10, boolean z6) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C14136d.f44479a.getDescriptor());
            throw null;
        }
        this.f44480a = str;
        if ((i10 & 2) == 0) {
            this.f44481b = false;
        } else {
            this.f44481b = z6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14138f)) {
            return false;
        }
        C14138f c14138f = (C14138f) obj;
        String str = c14138f.f44480a;
        String str2 = this.f44480a;
        if (str2 == null) {
            if (str == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str2, str);
        }
        return zM18089b && this.f44481b == c14138f.f44481b;
    }

    public final int hashCode() {
        String str = this.f44480a;
        return ((str == null ? 0 : str.hashCode()) * 31) + (this.f44481b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C14138f(String str, boolean z6) {
        this.f44480a = str;
        this.f44481b = z6;
    }
}
