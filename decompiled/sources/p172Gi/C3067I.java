package p172Gi;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Gi.I */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3067I {
    public static final C3066H Companion = new C3066H();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f9244c = {new C11158d(C3075h.f9277a, 0), null};

    /* JADX INFO: renamed from: a */
    public final List f9245a;

    /* JADX INFO: renamed from: b */
    public final String f9246b;

    public C3067I(String str, int i10, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C3065G.f9243a.getDescriptor());
            throw null;
        }
        this.f9245a = list;
        this.f9246b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3067I)) {
            return false;
        }
        C3067I c3067i = (C3067I) obj;
        return AbstractC16544l.m18089b(this.f9245a, c3067i.f9245a) && AbstractC16544l.m18089b(this.f9246b, c3067i.f9246b);
    }

    public final int hashCode() {
        return this.f9246b.hashCode() + (this.f9245a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
