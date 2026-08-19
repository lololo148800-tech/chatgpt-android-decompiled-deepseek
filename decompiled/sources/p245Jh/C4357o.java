package p245Jh;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p195Hh.C3430e;
import p269Kh.EnumC4691r;
import p523V9.AbstractC8168p6;
import p559Wn.C8969a;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Jh.o */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4357o {
    public static final C4356n Companion = new C4356n();

    /* JADX INFO: renamed from: i */
    public static final KSerializer[] f14170i = {null, null, null, new C11158d(C11181o0.f33827a, 0), null, new C11158d(EnumC4691r.Companion.serializer(), 0), null, new C8969a(AbstractC16526C.f51263a.mo5693b(C3430e.class), new KSerializer[0])};

    /* JADX INFO: renamed from: a */
    public final String f14171a;

    /* JADX INFO: renamed from: b */
    public final String f14172b;

    /* JADX INFO: renamed from: c */
    public final String f14173c;

    /* JADX INFO: renamed from: d */
    public final List f14174d;

    /* JADX INFO: renamed from: e */
    public final Integer f14175e;

    /* JADX INFO: renamed from: f */
    public final List f14176f;

    /* JADX INFO: renamed from: g */
    public final C4360r f14177g;

    /* JADX INFO: renamed from: h */
    public final C3430e f14178h;

    public C4357o(int i10, String str, String str2, String str3, List list, Integer num, List list2, C4360r c4360r, C3430e c3430e) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C4355m.f14169a.getDescriptor());
            throw null;
        }
        this.f14171a = str;
        this.f14172b = str2;
        this.f14173c = str3;
        this.f14174d = list;
        if ((i10 & 16) == 0) {
            this.f14175e = null;
        } else {
            this.f14175e = num;
        }
        if ((i10 & 32) == 0) {
            this.f14176f = null;
        } else {
            this.f14176f = list2;
        }
        if ((i10 & 64) == 0) {
            this.f14177g = null;
        } else {
            this.f14177g = c4360r;
        }
        if ((i10 & 128) == 0) {
            this.f14178h = AbstractC8168p6.m8749b("ModelsResponseModel", null);
        } else {
            this.f14178h = c3430e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4357o)) {
            return false;
        }
        C4357o c4357o = (C4357o) obj;
        return AbstractC16544l.m18089b(this.f14171a, c4357o.f14171a) && AbstractC16544l.m18089b(this.f14172b, c4357o.f14172b) && AbstractC16544l.m18089b(this.f14173c, c4357o.f14173c) && AbstractC16544l.m18089b(this.f14174d, c4357o.f14174d) && AbstractC16544l.m18089b(this.f14175e, c4357o.f14175e) && AbstractC16544l.m18089b(this.f14176f, c4357o.f14176f) && AbstractC16544l.m18089b(this.f14177g, c4357o.f14177g);
    }

    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f14174d, AbstractC0168G.m527p(AbstractC0168G.m527p(this.f14171a.hashCode() * 31, 31, this.f14172b), 31, this.f14173c), 31);
        Integer num = this.f14175e;
        int iHashCode = (iM15858x + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f14176f;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        C4360r c4360r = this.f14177g;
        return iHashCode2 + (c4360r != null ? c4360r.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
