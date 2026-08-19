package p1126yd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.A */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21405A {
    public static final C21510z Companion = new C21510z();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f67949c = {new C11158d(C21496s.f68110a, 0), null};

    /* JADX INFO: renamed from: a */
    public final List f67950a;

    /* JADX INFO: renamed from: b */
    public final String f67951b;

    public /* synthetic */ C21405A(String str, int i10, List list) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C21508y.f68128a.getDescriptor());
            throw null;
        }
        this.f67950a = list;
        if ((i10 & 2) == 0) {
            this.f67951b = null;
        } else {
            this.f67951b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21405A)) {
            return false;
        }
        C21405A c21405a = (C21405A) obj;
        return AbstractC16544l.m18089b(this.f67950a, c21405a.f67950a) && AbstractC16544l.m18089b(this.f67951b, c21405a.f67951b);
    }

    public final int hashCode() {
        int iHashCode = this.f67950a.hashCode() * 31;
        String str = this.f67951b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
