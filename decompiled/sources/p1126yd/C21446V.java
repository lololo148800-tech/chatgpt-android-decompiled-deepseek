package p1126yd;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p040Bd.C1020W1;
import p1155zi.AbstractC22035n0;
import p1155zi.C22031m0;
import p559Wn.InterfaceC8975g;
import ye.EnumC21517f;
import ye.EnumC21521j;

/* JADX INFO: renamed from: yd.V */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21446V {
    public static final C21444U Companion = new C21444U();

    /* JADX INFO: renamed from: q */
    public static final KSerializer[] f68015q;

    /* JADX INFO: renamed from: a */
    public final String f68016a;

    /* JADX INFO: renamed from: b */
    public final EnumC21452Y f68017b;

    /* JADX INFO: renamed from: c */
    public final String f68018c;

    /* JADX INFO: renamed from: d */
    public final List f68019d;

    /* JADX INFO: renamed from: e */
    public final String f68020e;

    /* JADX INFO: renamed from: f */
    public final boolean f68021f;

    /* JADX INFO: renamed from: g */
    public final String f68022g;

    /* JADX INFO: renamed from: h */
    public final AbstractC22035n0 f68023h;

    /* JADX INFO: renamed from: i */
    public final List f68024i;

    /* JADX INFO: renamed from: j */
    public final boolean f68025j;

    /* JADX INFO: renamed from: k */
    public final EnumC21517f f68026k;

    /* JADX INFO: renamed from: l */
    public final EnumC21521j f68027l;

    /* JADX INFO: renamed from: m */
    public final boolean f68028m;

    /* JADX INFO: renamed from: n */
    public final List f68029n;

    /* JADX INFO: renamed from: o */
    public final boolean f68030o;

    /* JADX INFO: renamed from: p */
    public final String f68031p;

    static {
        KSerializer kSerializerSerializer = EnumC21452Y.Companion.serializer();
        C11158d c11158d = new C11158d(C1020W1.f2828a, 0);
        KSerializer kSerializerSerializer2 = AbstractC22035n0.Companion.serializer();
        C11181o0 c11181o0 = C11181o0.f33827a;
        f68015q = new KSerializer[]{null, kSerializerSerializer, null, c11158d, null, null, null, kSerializerSerializer2, new C11158d(c11181o0, 0), null, null, EnumC21521j.Companion.serializer(), null, new C11158d(c11181o0, 0), null, null};
    }

    public C21446V(String str, EnumC21452Y enumC21452Y, String parentMessageId, ArrayList arrayList, String model, boolean z6, String str2, C22031m0 c22031m0, List list, EnumC21517f enumC21517f, EnumC21521j enumC21521j, boolean z10, List list2, boolean z11, String str3) {
        AbstractC16544l.m18094g(parentMessageId, "parentMessageId");
        AbstractC16544l.m18094g(model, "model");
        this.f68016a = str;
        this.f68017b = enumC21452Y;
        this.f68018c = parentMessageId;
        this.f68019d = arrayList;
        this.f68020e = model;
        this.f68021f = z6;
        this.f68022g = str2;
        this.f68023h = c22031m0;
        this.f68024i = list;
        this.f68025j = true;
        this.f68026k = enumC21517f;
        this.f68027l = enumC21521j;
        this.f68028m = z10;
        this.f68029n = list2;
        this.f68030o = z11;
        this.f68031p = str3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:37:0x005b  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21446V)) {
            return false;
        }
        C21446V c21446v = (C21446V) obj;
        String str = c21446v.f68016a;
        String str2 = this.f68016a;
        if (str2 == null) {
            if (str == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str2, str);
        }
        if (!zM18089b || this.f68017b != c21446v.f68017b || !AbstractC16544l.m18089b(this.f68018c, c21446v.f68018c) || !AbstractC16544l.m18089b(this.f68019d, c21446v.f68019d) || !AbstractC16544l.m18089b(this.f68020e, c21446v.f68020e) || this.f68021f != c21446v.f68021f) {
            return false;
        }
        String str3 = this.f68022g;
        String str4 = c21446v.f68022g;
        if (str3 == null) {
            if (str4 == null) {
                zM18089b2 = true;
            } else {
                zM18089b2 = false;
            }
        } else if (str4 == null) {
            zM18089b2 = false;
        } else {
            zM18089b2 = AbstractC16544l.m18089b(str3, str4);
        }
        return zM18089b2 && AbstractC16544l.m18089b(this.f68023h, c21446v.f68023h) && AbstractC16544l.m18089b(this.f68024i, c21446v.f68024i) && this.f68025j == c21446v.f68025j && this.f68026k == c21446v.f68026k && this.f68027l == c21446v.f68027l && this.f68028m == c21446v.f68028m && AbstractC16544l.m18089b(this.f68029n, c21446v.f68029n) && this.f68030o == c21446v.f68030o && AbstractC16544l.m18089b(this.f68031p, c21446v.f68031p);
    }

    public final int hashCode() {
        String str = this.f68016a;
        int iM527p = AbstractC0168G.m527p((this.f68017b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f68018c);
        List list = this.f68019d;
        int iM527p2 = (AbstractC0168G.m527p((iM527p + (list == null ? 0 : list.hashCode())) * 31, 31, this.f68020e) + (this.f68021f ? 1231 : 1237)) * 31;
        String str2 = this.f68022g;
        int iHashCode = (iM527p2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AbstractC22035n0 abstractC22035n0 = this.f68023h;
        int iHashCode2 = (iHashCode + (abstractC22035n0 == null ? 0 : ((C22031m0) abstractC22035n0).f69690b.hashCode())) * 31;
        List list2 = this.f68024i;
        int iHashCode3 = (((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31) + (this.f68025j ? 1231 : 1237)) * 31;
        EnumC21517f enumC21517f = this.f68026k;
        int iHashCode4 = (iHashCode3 + (enumC21517f == null ? 0 : enumC21517f.hashCode())) * 31;
        EnumC21521j enumC21521j = this.f68027l;
        int iHashCode5 = (((iHashCode4 + (enumC21521j == null ? 0 : enumC21521j.hashCode())) * 31) + (this.f68028m ? 1231 : 1237)) * 31;
        List list3 = this.f68029n;
        return this.f68031p.hashCode() + ((((iHashCode5 + (list3 != null ? list3.hashCode() : 0)) * 31) + (this.f68030o ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C21446V(int i10, String str, EnumC21452Y enumC21452Y, String str2, List list, String str3, boolean z6, String str4, AbstractC22035n0 abstractC22035n0, List list2, boolean z10, EnumC21517f enumC21517f, EnumC21521j enumC21521j, boolean z11, List list3, boolean z12, String str5) {
        if (32799 != (i10 & 32799)) {
            AbstractC11153a0.m12389l(i10, 32799, C21442T.f68013a.getDescriptor());
            throw null;
        }
        this.f68016a = str;
        this.f68017b = enumC21452Y;
        this.f68018c = str2;
        this.f68019d = list;
        this.f68020e = str3;
        if ((i10 & 32) == 0) {
            this.f68021f = false;
        } else {
            this.f68021f = z6;
        }
        if ((i10 & 64) == 0) {
            this.f68022g = null;
        } else {
            this.f68022g = str4;
        }
        if ((i10 & 128) == 0) {
            this.f68023h = null;
        } else {
            this.f68023h = abstractC22035n0;
        }
        if ((i10 & 256) == 0) {
            this.f68024i = null;
        } else {
            this.f68024i = list2;
        }
        if ((i10 & 512) == 0) {
            this.f68025j = false;
        } else {
            this.f68025j = z10;
        }
        this.f68026k = (i10 & 1024) == 0 ? EnumC21517f.f68138Z : enumC21517f;
        if ((i10 & 2048) == 0) {
            this.f68027l = null;
        } else {
            this.f68027l = enumC21521j;
        }
        if ((i10 & 4096) == 0) {
            this.f68028m = false;
        } else {
            this.f68028m = z11;
        }
        if ((i10 & 8192) == 0) {
            this.f68029n = null;
        } else {
            this.f68029n = list3;
        }
        if ((i10 & 16384) == 0) {
            this.f68030o = false;
        } else {
            this.f68030o = z12;
        }
        this.f68031p = str5;
    }
}
