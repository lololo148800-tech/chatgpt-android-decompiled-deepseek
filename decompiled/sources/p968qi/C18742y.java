package p968qi;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: qi.y */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18742y {
    public static final C18741x Companion = new C18741x();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f59614c = {null, new C11158d(C18727j.f59569a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f59615a;

    /* JADX INFO: renamed from: b */
    public final List f59616b;

    public /* synthetic */ C18742y(String str, int i10, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C18740w.f59613a.getDescriptor());
            throw null;
        }
        this.f59615a = str;
        this.f59616b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18742y)) {
            return false;
        }
        C18742y c18742y = (C18742y) obj;
        return AbstractC16544l.m18089b(this.f59615a, c18742y.f59615a) && AbstractC16544l.m18089b(this.f59616b, c18742y.f59616b);
    }

    public final int hashCode() {
        return this.f59616b.hashCode() + (this.f59615a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C18742y(ArrayList arrayList) {
        this.f59615a = "";
        this.f59616b = arrayList;
    }
}
