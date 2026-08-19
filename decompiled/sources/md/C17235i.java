package md;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: md.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C17235i {
    public static final C17234h Companion = new C17234h();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f54989c = {new C11158d(C17227a.f54979a, 0), null};

    /* JADX INFO: renamed from: a */
    public final List f54990a;

    /* JADX INFO: renamed from: b */
    public final String f54991b;

    public /* synthetic */ C17235i(String str, int i10, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C17233g.f54988a.getDescriptor());
            throw null;
        }
        this.f54990a = list;
        this.f54991b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17235i)) {
            return false;
        }
        C17235i c17235i = (C17235i) obj;
        return AbstractC16544l.m18089b(this.f54990a, c17235i.f54990a) && AbstractC16544l.m18089b(this.f54991b, c17235i.f54991b);
    }

    public final int hashCode() {
        int iHashCode = this.f54990a.hashCode() * 31;
        String str = this.f54991b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C17235i(String str, ArrayList arrayList) {
        this.f54990a = arrayList;
        this.f54991b = str;
    }
}
