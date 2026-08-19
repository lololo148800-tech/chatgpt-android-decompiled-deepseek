package p1075w5;

import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p076Cm.InterfaceC1723a;
import p909nm.C17690x;

/* JADX INFO: renamed from: w5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C20836n implements Iterable, InterfaceC1723a {

    /* JADX INFO: renamed from: Z */
    public static final C20836n f66253Z = new C20836n(C17690x.f56481Y);

    /* JADX INFO: renamed from: Y */
    public final Map f66254Y;

    public C20836n(Map map) {
        this.f66254Y = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20836n) {
            if (AbstractC16544l.m18089b(this.f66254Y, ((C20836n) obj).f66254Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f66254Y.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f66254Y;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new C17309l(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return AbstractC12107L1.m13827r(new StringBuilder("Parameters(entries="), this.f66254Y, ')');
    }
}
