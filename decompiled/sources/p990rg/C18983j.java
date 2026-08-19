package p990rg;

import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11158d;
import ao.C11181o0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: rg.j */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18983j {
    public static final C18979f Companion = new C18979f();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f60548c;

    /* JADX INFO: renamed from: a */
    public final List f60549a;

    /* JADX INFO: renamed from: b */
    public final Map f60550b;

    static {
        C18980g c18980g = C18980g.f60540a;
        f60548c = new KSerializer[]{new C11158d(c18980g, 0), new C11131E(C11181o0.f33827a, new C11158d(c18980g, 0), 1)};
        List listM19382k = AbstractC17681o.m19382k(new C18982i("Prompt 1", "Longer prompt description 1", "Prompt 1: Longer prompt description 1", "Prompt 1", EnumC18976c.Travel, "Travel"), new C18982i("Prompt 2", "Longer prompt description 2", "Prompt 2: Longer prompt description 2", "Prompt 2", EnumC18976c.Dalle, "Create image"), new C18982i("Prompt 3", "Longer prompt description 3", "Prompt 3: Longer prompt description 3", "Prompt 3", EnumC18976c.TeachOrExplain, "Teach"), new C18982i("Prompt 4", "Longer prompt description 4", "Prompt 4: Longer prompt description 4", "Prompt 4", EnumC18976c.Math, "Math"), new C18982i("Prompt 5", "Longer prompt description 5", "Prompt 5: Longer prompt description 5", "Prompt 5", EnumC18976c.Weather, "Weather"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listM19382k) {
            String str = ((C18982i) obj).f60547f;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
    }

    public /* synthetic */ C18983j(int i10, List list, Map map) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C18978e.f60539a.getDescriptor());
            throw null;
        }
        this.f60549a = list;
        this.f60550b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18983j)) {
            return false;
        }
        C18983j c18983j = (C18983j) obj;
        return AbstractC16544l.m18089b(this.f60549a, c18983j.f60549a) && AbstractC16544l.m18089b(this.f60550b, c18983j.f60550b);
    }

    public final int hashCode() {
        return this.f60550b.hashCode() + (this.f60549a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C18983j(List list, LinkedHashMap linkedHashMap) {
        this.f60549a = list;
        this.f60550b = linkedHashMap;
    }
}
