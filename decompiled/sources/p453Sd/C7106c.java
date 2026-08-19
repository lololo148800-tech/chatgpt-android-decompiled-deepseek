package p453Sd;

import ao.C11158d;
import ao.C11181o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: renamed from: Sd.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7106c {
    public static final C7105b Companion = new C7105b();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f22603e = {null, new C11158d(C11181o0.f33827a, 0), null};

    /* JADX INFO: renamed from: a */
    public final String f22604a;

    /* JADX INFO: renamed from: b */
    public final List f22605b;

    /* JADX INFO: renamed from: c */
    public final String f22606c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f22607d;

    public /* synthetic */ C7106c(int i10, String str, String str2, List list) {
        if ((i10 & 1) == 0) {
            this.f22604a = null;
        } else {
            this.f22604a = str;
        }
        if ((i10 & 2) == 0) {
            this.f22605b = null;
        } else {
            this.f22605b = list;
        }
        if ((i10 & 4) == 0) {
            this.f22606c = null;
        } else {
            this.f22606c = str2;
        }
        Collection collection = this.f22605b;
        this.f22607d = AbstractC17680n.m19361k0(AbstractC17681o.m19383l(this.f22606c), collection == null ? C17689w.f56480Y : collection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7106c)) {
            return false;
        }
        C7106c c7106c = (C7106c) obj;
        return AbstractC16544l.m18089b(this.f22604a, c7106c.f22604a) && AbstractC16544l.m18089b(this.f22605b, c7106c.f22605b) && AbstractC16544l.m18089b(this.f22606c, c7106c.f22606c);
    }

    public final int hashCode() {
        String str = this.f22604a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f22605b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f22606c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
