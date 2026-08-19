package p067Cd;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Cd.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1629c {
    public static final C1628b Companion = new C1628b();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f4616d = {null, null, new C11158d(C11181o0.f33827a, 0)};

    /* JADX INFO: renamed from: a */
    public final boolean f4617a;

    /* JADX INFO: renamed from: b */
    public final boolean f4618b;

    /* JADX INFO: renamed from: c */
    public final List f4619c;

    public /* synthetic */ C1629c(int i10, boolean z6, boolean z10, List list) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C1627a.f4615a.getDescriptor());
            throw null;
        }
        this.f4617a = z6;
        this.f4618b = z10;
        this.f4619c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1629c)) {
            return false;
        }
        C1629c c1629c = (C1629c) obj;
        return this.f4617a == c1629c.f4617a && this.f4618b == c1629c.f4618b && AbstractC16544l.m18089b(this.f4619c, c1629c.f4619c);
    }

    public final int hashCode() {
        return this.f4619c.hashCode() + ((((this.f4617a ? 1231 : 1237) * 31) + (this.f4618b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
