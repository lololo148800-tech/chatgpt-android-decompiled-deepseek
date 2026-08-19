package p479Td;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17314q;
import p437Rn.C6949g;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Td.I */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7323I extends AbstractC7343b0 {
    public static final C7322H Companion = new C7322H();

    /* JADX INFO: renamed from: f */
    public static final KSerializer[] f23228f = {null, new C11158d(AbstractC7343b0.Companion.serializer(), 0)};

    /* JADX INFO: renamed from: c */
    public final List f23229c;

    /* JADX INFO: renamed from: d */
    public final C17314q f23230d;

    /* JADX INFO: renamed from: e */
    public final boolean f23231e;

    public C7323I(ArrayList arrayList) {
        this.f23229c = arrayList;
        this.f23230d = AbstractC9227W.m9800c(new C6949g(this, 8));
        boolean z6 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((AbstractC7343b0) it.next()).mo7777a()) {
                    z6 = true;
                    break;
                }
            }
        }
        this.f23231e = z6;
    }

    @Override // p479Td.AbstractC7343b0
    /* JADX INFO: renamed from: a */
    public final boolean mo7777a() {
        return this.f23231e;
    }

    /* JADX INFO: renamed from: c */
    public final List m7779c() {
        return (List) this.f23230d.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7323I) && AbstractC16544l.m18089b(this.f23229c, ((C7323I) obj).f23229c);
    }

    public final int hashCode() {
        return this.f23229c.hashCode();
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7323I(int i10, boolean z6, List list) {
        super(i10, z6);
        if (2 != (i10 & 2)) {
            AbstractC11153a0.m12389l(i10, 2, C7321G.f23227a.getDescriptor());
            throw null;
        }
        this.f23229c = list;
        this.f23230d = AbstractC9227W.m9800c(new C6949g(this, 8));
        List list2 = list;
        boolean z10 = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((AbstractC7343b0) it.next()).mo7777a()) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f23231e = z10;
    }
}
