package p575Xd;

import ao.C11158d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1155zi.C21940M0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Xd.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C9444c {
    public static final C9443b Companion = new C9443b();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f28445c = {null, new C11158d(C21940M0.f69493a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f28446a;

    /* JADX INFO: renamed from: b */
    public final List f28447b;

    public /* synthetic */ C9444c(String str, int i10, List list) {
        if ((i10 & 1) == 0) {
            this.f28446a = null;
        } else {
            this.f28446a = str;
        }
        if ((i10 & 2) == 0) {
            this.f28447b = null;
        } else {
            this.f28447b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9444c)) {
            return false;
        }
        C9444c c9444c = (C9444c) obj;
        return AbstractC16544l.m18089b(this.f28446a, c9444c.f28446a) && AbstractC16544l.m18089b(this.f28447b, c9444c.f28447b);
    }

    public final int hashCode() {
        String str = this.f28446a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f28447b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C9444c(String str, ArrayList arrayList) {
        this.f28446a = str;
        this.f28447b = arrayList;
    }
}
