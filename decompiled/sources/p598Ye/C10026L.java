package p598Ye;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ye.L */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10026L {
    public static final C10025K Companion = new C10025K();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f29721c = {new C11158d(C10045p.f29759a, 0), null};

    /* JADX INFO: renamed from: a */
    public final List f29722a;

    /* JADX INFO: renamed from: b */
    public final String f29723b;

    public /* synthetic */ C10026L(String str, int i10, List list) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C10024J.f29720a.getDescriptor());
            throw null;
        }
        this.f29722a = list;
        if ((i10 & 2) == 0) {
            this.f29723b = null;
        } else {
            this.f29723b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10026L)) {
            return false;
        }
        C10026L c10026l = (C10026L) obj;
        return AbstractC16544l.m18089b(this.f29722a, c10026l.f29722a) && AbstractC16544l.m18089b(this.f29723b, c10026l.f29723b);
    }

    public final int hashCode() {
        int iHashCode = this.f29722a.hashCode() * 31;
        String str = this.f29723b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
