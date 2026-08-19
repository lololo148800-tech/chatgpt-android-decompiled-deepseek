package p431Rg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Rg.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6887f {
    public static final C6886e Companion = new C6886e();

    /* JADX INFO: renamed from: a */
    public final String f22079a;

    public C6887f(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f22079a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C6885d.f22078a.getDescriptor());
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6887f)) {
            return false;
        }
        String str = ((C6887f) obj).f22079a;
        String str2 = this.f22079a;
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
        return zM18089b;
    }

    public final int hashCode() {
        String str = this.f22079a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C6887f(String str) {
        this.f22079a = str;
    }
}
