package p1105xc;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: xc.m */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21183m {
    public static final C21182l Companion = new C21182l();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f67327d = {new C11158d(C21171a.f67307a, 0), new C11158d(C21174d.f67313a, 0), null};

    /* JADX INFO: renamed from: a */
    public final List f67328a;

    /* JADX INFO: renamed from: b */
    public final List f67329b;

    /* JADX INFO: renamed from: c */
    public final String f67330c;

    public /* synthetic */ C21183m(int i10, String str, List list, List list2) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C21181k.f67326a.getDescriptor());
            throw null;
        }
        this.f67328a = list;
        this.f67329b = list2;
        this.f67330c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21183m)) {
            return false;
        }
        C21183m c21183m = (C21183m) obj;
        return AbstractC16544l.m18089b(this.f67328a, c21183m.f67328a) && AbstractC16544l.m18089b(this.f67329b, c21183m.f67329b) && AbstractC16544l.m18089b(this.f67330c, c21183m.f67330c);
    }

    public final int hashCode() {
        return this.f67330c.hashCode() + AbstractC14376f.m15858x(this.f67329b, this.f67328a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "█";
    }

    public C21183m(ArrayList arrayList, List list, String clientType) {
        AbstractC16544l.m18094g(clientType, "clientType");
        this.f67328a = arrayList;
        this.f67329b = list;
        this.f67330c = clientType;
    }
}
