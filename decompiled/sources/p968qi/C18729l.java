package p968qi;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: qi.l */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18729l {
    public static final C18728k Companion = new C18728k();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f59570c = {null, new C11158d(C18725h.f59566a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f59571a;

    /* JADX INFO: renamed from: b */
    public final List f59572b;

    public /* synthetic */ C18729l(String str, int i10, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C18727j.f59569a.getDescriptor());
            throw null;
        }
        this.f59571a = str;
        this.f59572b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18729l)) {
            return false;
        }
        C18729l c18729l = (C18729l) obj;
        return AbstractC16544l.m18089b(this.f59571a, c18729l.f59571a) && AbstractC16544l.m18089b(this.f59572b, c18729l.f59572b);
    }

    public final int hashCode() {
        return this.f59572b.hashCode() + (this.f59571a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C18729l(String name, ArrayList arrayList) {
        AbstractC16544l.m18094g(name, "name");
        this.f59571a = name;
        this.f59572b = arrayList;
    }
}
