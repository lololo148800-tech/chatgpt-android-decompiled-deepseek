package p968qi;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: qi.t */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18737t {
    public static final C18736s Companion = new C18736s();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f59596c = {new C11158d(C18740w.f59613a, 0), null};

    /* JADX INFO: renamed from: a */
    public final List f59597a;

    /* JADX INFO: renamed from: b */
    public final String f59598b;

    public /* synthetic */ C18737t(String str, int i10, List list) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C18735r.f59595a.getDescriptor());
            throw null;
        }
        this.f59597a = list;
        if ((i10 & 2) == 0) {
            this.f59598b = null;
        } else {
            this.f59598b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18737t)) {
            return false;
        }
        C18737t c18737t = (C18737t) obj;
        return AbstractC16544l.m18089b(this.f59597a, c18737t.f59597a) && AbstractC16544l.m18089b(this.f59598b, c18737t.f59598b);
    }

    public final int hashCode() {
        int iHashCode = this.f59597a.hashCode() * 31;
        String str = this.f59598b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C18737t(List list) {
        this.f59597a = list;
        this.f59598b = null;
    }
}
