package p172Gi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p1155zi.AbstractC22035n0;
import p1155zi.C22031m0;
import p1155zi.EnumC22033m2;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Gi.d */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3071d {
    public static final C3070c Companion = new C3070c();

    /* JADX INFO: renamed from: o */
    public static final KSerializer[] f9257o = {null, null, null, null, null, null, null, AbstractC22035n0.Companion.serializer(), null, EnumC22033m2.Companion.serializer(), null, null, EnumC3064F.Companion.serializer(), null};

    /* JADX INFO: renamed from: a */
    public final String f9258a;

    /* JADX INFO: renamed from: b */
    public final String f9259b;

    /* JADX INFO: renamed from: c */
    public final String f9260c;

    /* JADX INFO: renamed from: d */
    public final String f9261d;

    /* JADX INFO: renamed from: e */
    public final String f9262e;

    /* JADX INFO: renamed from: f */
    public final String f9263f;

    /* JADX INFO: renamed from: g */
    public final String f9264g;

    /* JADX INFO: renamed from: h */
    public final AbstractC22035n0 f9265h;

    /* JADX INFO: renamed from: i */
    public final boolean f9266i;

    /* JADX INFO: renamed from: j */
    public final EnumC22033m2 f9267j;

    /* JADX INFO: renamed from: k */
    public final boolean f9268k;

    /* JADX INFO: renamed from: l */
    public final boolean f9269l;

    /* JADX INFO: renamed from: m */
    public final EnumC3064F f9270m;

    /* JADX INFO: renamed from: n */
    public final String f9271n;

    public C3071d(String str, String modelSlug, String str2, String str3, String str4, String str5, String str6, C22031m0 c22031m0, boolean z6, EnumC22033m2 voiceMode, boolean z10, boolean z11, EnumC3064F enumC3064F, String str7) {
        AbstractC16544l.m18094g(modelSlug, "modelSlug");
        AbstractC16544l.m18094g(voiceMode, "voiceMode");
        this.f9258a = str;
        this.f9259b = modelSlug;
        this.f9260c = str2;
        this.f9261d = str3;
        this.f9262e = str4;
        this.f9263f = str5;
        this.f9264g = str6;
        this.f9265h = c22031m0;
        this.f9266i = z6;
        this.f9267j = voiceMode;
        this.f9268k = z10;
        this.f9269l = z11;
        this.f9270m = enumC3064F;
        this.f9271n = str7;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:31:0x004d  */
    /* JADX WARN: Code duplicated, block: B:44:0x006e  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        boolean zM18089b3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3071d)) {
            return false;
        }
        C3071d c3071d = (C3071d) obj;
        if (!AbstractC16544l.m18089b(this.f9258a, c3071d.f9258a) || !AbstractC16544l.m18089b(this.f9259b, c3071d.f9259b) || !AbstractC16544l.m18089b(this.f9260c, c3071d.f9260c)) {
            return false;
        }
        String str = this.f9261d;
        String str2 = c3071d.f9261d;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        if (!zM18089b) {
            return false;
        }
        String str3 = this.f9262e;
        String str4 = c3071d.f9262e;
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
        if (!zM18089b2 || !AbstractC16544l.m18089b(this.f9263f, c3071d.f9263f)) {
            return false;
        }
        String str5 = this.f9264g;
        String str6 = c3071d.f9264g;
        if (str5 == null) {
            if (str6 == null) {
                zM18089b3 = true;
            } else {
                zM18089b3 = false;
            }
        } else if (str6 == null) {
            zM18089b3 = false;
        } else {
            zM18089b3 = AbstractC16544l.m18089b(str5, str6);
        }
        return zM18089b3 && AbstractC16544l.m18089b(this.f9265h, c3071d.f9265h) && this.f9266i == c3071d.f9266i && this.f9267j == c3071d.f9267j && this.f9268k == c3071d.f9268k && this.f9269l == c3071d.f9269l && this.f9270m == c3071d.f9270m && AbstractC16544l.m18089b(this.f9271n, c3071d.f9271n);
    }

    public final int hashCode() {
        String str = this.f9258a;
        int iM527p = AbstractC0168G.m527p((str == null ? 0 : str.hashCode()) * 31, 31, this.f9259b);
        String str2 = this.f9260c;
        int iHashCode = (iM527p + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9261d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9262e;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9263f;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f9264g;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        AbstractC22035n0 abstractC22035n0 = this.f9265h;
        int iHashCode6 = (this.f9270m.hashCode() + ((((((this.f9267j.hashCode() + ((((iHashCode5 + (abstractC22035n0 == null ? 0 : ((C22031m0) abstractC22035n0).f69690b.hashCode())) * 31) + (this.f9266i ? 1231 : 1237)) * 31)) * 31) + (this.f9268k ? 1231 : 1237)) * 31) + (this.f9269l ? 1231 : 1237)) * 31)) * 31;
        String str7 = this.f9271n;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C3071d(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, AbstractC22035n0 abstractC22035n0, boolean z6, EnumC22033m2 enumC22033m2, boolean z10, boolean z11, EnumC3064F enumC3064F, String str8) {
        if (16383 != (i10 & 16383)) {
            AbstractC11153a0.m12389l(i10, 16383, C3069b.f9256a.getDescriptor());
            throw null;
        }
        this.f9258a = str;
        this.f9259b = str2;
        this.f9260c = str3;
        this.f9261d = str4;
        this.f9262e = str5;
        this.f9263f = str6;
        this.f9264g = str7;
        this.f9265h = abstractC22035n0;
        this.f9266i = z6;
        this.f9267j = enumC22033m2;
        this.f9268k = z10;
        this.f9269l = z11;
        this.f9270m = enumC3064F;
        this.f9271n = str8;
    }
}
