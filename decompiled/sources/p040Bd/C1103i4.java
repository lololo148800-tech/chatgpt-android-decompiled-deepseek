package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Bd.i4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1103i4 implements InterfaceC1136o {
    public static final C1096h4 Companion = new C1096h4();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f3004c = {new C11158d(C11181o0.f33827a, 0), null};

    /* JADX INFO: renamed from: a */
    public final List f3005a;

    /* JADX INFO: renamed from: b */
    public final String f3006b;

    public /* synthetic */ C1103i4(String str, int i10, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C1089g4.f2982a.getDescriptor());
            throw null;
        }
        this.f3005a = list;
        this.f3006b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1103i4)) {
            return false;
        }
        C1103i4 c1103i4 = (C1103i4) obj;
        return AbstractC16544l.m18089b(this.f3005a, c1103i4.f3005a) && AbstractC16544l.m18089b(this.f3006b, c1103i4.f3006b);
    }

    public final int hashCode() {
        return this.f3006b.hashCode() + (this.f3005a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C1103i4(String text) {
        AbstractC16544l.m18094g(text, "text");
        List listM9974d = AbstractC9393x3.m9974d(text);
        EnumC1124m[] enumC1124mArr = EnumC1124m.f3037Y;
        this.f3005a = listM9974d;
        this.f3006b = "text";
    }
}
