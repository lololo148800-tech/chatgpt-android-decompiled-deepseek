package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.e2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22001e2 {
    public static final C21997d2 Companion = new C21997d2();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f69635e = {null, AbstractC11153a0.m12383f("com.openai.types.ModelContext", EnumC22004f1.values()), AbstractC11153a0.m12383f("com.openai.types.ModelSwitcherDenyReason", EnumC22024k1.values()), null};

    /* JADX INFO: renamed from: a */
    public final String f69636a;

    /* JADX INFO: renamed from: b */
    public final EnumC22004f1 f69637b;

    /* JADX INFO: renamed from: c */
    public final EnumC22024k1 f69638c;

    /* JADX INFO: renamed from: d */
    public final String f69639d;

    public /* synthetic */ C22001e2(int i10, String str, EnumC22004f1 enumC22004f1, EnumC22024k1 enumC22024k1, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C21993c2.f69625a.getDescriptor());
            throw null;
        }
        this.f69636a = str;
        this.f69637b = enumC22004f1;
        if ((i10 & 4) == 0) {
            this.f69638c = EnumC22024k1.UNKNOWN;
        } else {
            this.f69638c = enumC22024k1;
        }
        if ((i10 & 8) == 0) {
            this.f69639d = "";
        } else {
            this.f69639d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22001e2)) {
            return false;
        }
        C22001e2 c22001e2 = (C22001e2) obj;
        return AbstractC16544l.m18089b(this.f69636a, c22001e2.f69636a) && this.f69637b == c22001e2.f69637b && this.f69638c == c22001e2.f69638c && AbstractC16544l.m18089b(this.f69639d, c22001e2.f69639d);
    }

    public final int hashCode() {
        return this.f69639d.hashCode() + ((this.f69638c.hashCode() + ((this.f69637b.hashCode() + (this.f69636a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C22001e2(String slug, EnumC22004f1 enumC22004f1, EnumC22024k1 reason, String description) {
        AbstractC16544l.m18094g(slug, "slug");
        AbstractC16544l.m18094g(reason, "reason");
        AbstractC16544l.m18094g(description, "description");
        this.f69636a = slug;
        this.f69637b = enumC22004f1;
        this.f69638c = reason;
        this.f69639d = description;
    }

    public /* synthetic */ C22001e2(String str, EnumC22024k1 enumC22024k1, int i10) {
        this(str, EnumC22004f1.CONVERSATION, (i10 & 4) != 0 ? EnumC22024k1.UNKNOWN : enumC22024k1, "");
    }
}
