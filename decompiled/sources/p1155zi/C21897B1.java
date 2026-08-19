package p1155zi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p049Bm.InterfaceC1436k;
import p559Wn.InterfaceC8975g;
import p909nm.C17689w;

/* JADX INFO: renamed from: zi.B1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21897B1<T> {
    public static final C21893A1 Companion = new C21893A1();

    /* JADX INFO: renamed from: a */
    public final List f69431a;

    /* JADX INFO: renamed from: b */
    public final String f69432b;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.PaginatedList", null, 2);
        pluginGeneratedSerialDescriptor.m18453j("items", true);
        pluginGeneratedSerialDescriptor.m18453j("cursor", true);
    }

    public /* synthetic */ C21897B1(String str, int i10, List list) {
        this.f69431a = (i10 & 1) == 0 ? C17689w.f56480Y : list;
        this.f69432b = (i10 & 2) == 0 ? null : str;
    }

    /* JADX INFO: renamed from: a */
    public final C21897B1 m22332a(InterfaceC1436k interfaceC1436k) {
        List list = this.f69431a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object objInvoke = interfaceC1436k.invoke(it.next());
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return new C21897B1(arrayList, this.f69432b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21897B1)) {
            return false;
        }
        C21897B1 c21897b1 = (C21897B1) obj;
        return AbstractC16544l.m18089b(this.f69431a, c21897b1.f69431a) && AbstractC16544l.m18089b(this.f69432b, c21897b1.f69432b);
    }

    public final int hashCode() {
        int iHashCode = this.f69431a.hashCode() * 31;
        String str = this.f69432b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C21897B1(List items, String str) {
        AbstractC16544l.m18094g(items, "items");
        this.f69431a = items;
        this.f69432b = str;
    }

    public /* synthetic */ C21897B1() {
        this(C17689w.f56480Y, null);
    }
}
