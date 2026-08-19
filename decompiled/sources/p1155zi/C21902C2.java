package p1155zi;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: zi.C2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21902C2 {
    public static final C21898B2 Companion = new C21898B2();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f69435d = {EnumC22033m2.Companion.serializer(), new C11158d(C22073w2.f69788a, 0), null};

    /* JADX INFO: renamed from: a */
    public final EnumC22033m2 f69436a;

    /* JADX INFO: renamed from: b */
    public final List f69437b;

    /* JADX INFO: renamed from: c */
    public final String f69438c;

    public /* synthetic */ C21902C2(int i10, EnumC22033m2 enumC22033m2, List list, String str) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C21894A2.f69417a.getDescriptor());
            throw null;
        }
        this.f69436a = enumC22033m2;
        this.f69437b = list;
        if ((i10 & 4) == 0) {
            this.f69438c = null;
        } else {
            this.f69438c = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C22057s2 m22333a() {
        Object next;
        Iterator it = this.f69437b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C22081y2) next).f69803b != EnumC22033m2.Advanced);
        C22081y2 c22081y2 = (C22081y2) next;
        if (c22081y2 != null) {
            return c22081y2.f69806e;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final C22081y2 m22334b() {
        Object next;
        Iterator it = this.f69437b.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((C22081y2) next).f69803b == this.f69436a) {
                return (C22081y2) next;
            }
        }
        next = null;
        return (C22081y2) next;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m22335c() {
        return this.f69436a == EnumC22033m2.Advanced;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21902C2)) {
            return false;
        }
        C21902C2 c21902c2 = (C21902C2) obj;
        return this.f69436a == c21902c2.f69436a && AbstractC16544l.m18089b(this.f69437b, c21902c2.f69437b) && AbstractC16544l.m18089b(this.f69438c, c21902c2.f69438c);
    }

    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f69437b, this.f69436a.hashCode() * 31, 31);
        String str = this.f69438c;
        return iM15858x + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
