package bf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: bf.Q */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C11362Q implements InterfaceC11353H {
    public static final C11361P Companion = new C11361P();

    /* JADX INFO: renamed from: a */
    public final String f34357a;

    /* JADX INFO: renamed from: b */
    public final String f34358b;

    public /* synthetic */ C11362Q(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C11360O.f34356a.getDescriptor());
            throw null;
        }
        this.f34357a = str;
        this.f34358b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11362Q)) {
            return false;
        }
        C11362Q c11362q = (C11362Q) obj;
        return AbstractC16544l.m18089b(this.f34357a, c11362q.f34357a) && AbstractC16544l.m18089b(this.f34358b, c11362q.f34358b);
    }

    public final int hashCode() {
        return this.f34358b.hashCode() + (this.f34357a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C11362Q(String str, String str2) {
        this.f34357a = str;
        this.f34358b = str2;
    }
}
