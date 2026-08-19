package p1126yd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1155zi.C21950P;
import p1155zi.C21987b0;
import p1155zi.C22039o0;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: yd.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21476i implements InterfaceC21409C {
    public static final C21474h Companion = new C21474h();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f68073e = {new C11158d(C22039o0.f69722a, 0), null, new C11158d(C21950P.f69510a, 0), null};

    /* JADX INFO: renamed from: a */
    public final List f68074a;

    /* JADX INFO: renamed from: b */
    public final C21987b0 f68075b;

    /* JADX INFO: renamed from: c */
    public final List f68076c;

    /* JADX INFO: renamed from: d */
    public final String f68077d;

    public /* synthetic */ C21476i(int i10, List list, C21987b0 c21987b0, List list2, String str) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C21472g.f68071a.getDescriptor());
            throw null;
        }
        this.f68074a = list;
        this.f68075b = c21987b0;
        this.f68076c = list2;
        this.f68077d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21476i)) {
            return false;
        }
        C21476i c21476i = (C21476i) obj;
        return AbstractC16544l.m18089b(this.f68074a, c21476i.f68074a) && AbstractC16544l.m18089b(this.f68075b, c21476i.f68075b) && AbstractC16544l.m18089b(this.f68076c, c21476i.f68076c) && AbstractC16544l.m18089b(this.f68077d, c21476i.f68077d);
    }

    public final int hashCode() {
        int iHashCode = this.f68074a.hashCode() * 31;
        C21987b0 c21987b0 = this.f68075b;
        int iM15858x = AbstractC14376f.m15858x(this.f68076c, (iHashCode + (c21987b0 == null ? 0 : c21987b0.hashCode())) * 31, 31);
        String str = this.f68077d;
        return iM15858x + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
