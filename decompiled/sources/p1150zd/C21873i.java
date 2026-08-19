package p1150zd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zd.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21873i {
    public static final C21872h Companion = new C21872h();

    /* JADX INFO: renamed from: f */
    public static final KSerializer[] f69351f = {null, null, null, EnumC21867c.Companion.serializer(), null};

    /* JADX INFO: renamed from: a */
    public final String f69352a;

    /* JADX INFO: renamed from: b */
    public final String f69353b;

    /* JADX INFO: renamed from: c */
    public final String f69354c;

    /* JADX INFO: renamed from: d */
    public final EnumC21867c f69355d;

    /* JADX INFO: renamed from: e */
    public final String f69356e;

    public C21873i(int i10, String str, String str2, String str3, EnumC21867c enumC21867c, String str4) {
        if (31 != (i10 & 31)) {
            AbstractC11153a0.m12389l(i10, 31, C21871g.f69350a.getDescriptor());
            throw null;
        }
        this.f69352a = str;
        this.f69353b = str2;
        this.f69354c = str3;
        this.f69355d = enumC21867c;
        this.f69356e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21873i)) {
            return false;
        }
        C21873i c21873i = (C21873i) obj;
        return AbstractC16544l.m18089b(this.f69352a, c21873i.f69352a) && AbstractC16544l.m18089b(this.f69353b, c21873i.f69353b) && AbstractC16544l.m18089b(this.f69354c, c21873i.f69354c) && this.f69355d == c21873i.f69355d && AbstractC16544l.m18089b(this.f69356e, c21873i.f69356e);
    }

    public final int hashCode() {
        return this.f69356e.hashCode() + ((this.f69355d.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(this.f69352a.hashCode() * 31, 31, this.f69353b), 31, this.f69354c)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
