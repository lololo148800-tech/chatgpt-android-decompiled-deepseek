package p575Xd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.C16642a;
import p040Bd.C1193x2;
import p168Gd.C3034b;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Xd.I */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C9440I {
    public static final C9439H Companion = new C9439H();

    /* JADX INFO: renamed from: l */
    public static final KSerializer[] f28429l = {AbstractC11153a0.m12383f("com.openai.feature.conversations.domain.metadata.ToolCommand", EnumC9437F.values()), null, AbstractC11153a0.m12383f("com.openai.feature.conversations.domain.metadata.ToolStatus", EnumC9441J.values()), null, null, null, null, null, null, null, C3034b.Companion.serializer()};

    /* JADX INFO: renamed from: a */
    public final EnumC9437F f28430a;

    /* JADX INFO: renamed from: b */
    public final C16642a f28431b;

    /* JADX INFO: renamed from: c */
    public final EnumC9441J f28432c;

    /* JADX INFO: renamed from: d */
    public final C9463v f28433d;

    /* JADX INFO: renamed from: e */
    public final C9433B f28434e;

    /* JADX INFO: renamed from: f */
    public final C1193x2 f28435f;

    /* JADX INFO: renamed from: g */
    public final String f28436g;

    /* JADX INFO: renamed from: h */
    public final String f28437h;

    /* JADX INFO: renamed from: i */
    public final String f28438i;

    /* JADX INFO: renamed from: j */
    public final String f28439j;

    /* JADX INFO: renamed from: k */
    public final C3034b f28440k;

    public C9440I(int i10, EnumC9437F enumC9437F, C16642a c16642a, EnumC9441J enumC9441J, C9463v c9463v, C9433B c9433b, C1193x2 c1193x2, String str, String str2, String str3, String str4, C3034b c3034b) {
        if ((i10 & 1) == 0) {
            this.f28430a = null;
        } else {
            this.f28430a = enumC9437F;
        }
        if ((i10 & 2) == 0) {
            this.f28431b = null;
        } else {
            this.f28431b = c16642a;
        }
        if ((i10 & 4) == 0) {
            this.f28432c = null;
        } else {
            this.f28432c = enumC9441J;
        }
        if ((i10 & 8) == 0) {
            this.f28433d = null;
        } else {
            this.f28433d = c9463v;
        }
        if ((i10 & 16) == 0) {
            this.f28434e = null;
        } else {
            this.f28434e = c9433b;
        }
        if ((i10 & 32) == 0) {
            this.f28435f = null;
        } else {
            this.f28435f = c1193x2;
        }
        if ((i10 & 64) == 0) {
            this.f28436g = null;
        } else {
            this.f28436g = str;
        }
        if ((i10 & 128) == 0) {
            this.f28437h = null;
        } else {
            this.f28437h = str2;
        }
        if ((i10 & 256) == 0) {
            this.f28438i = null;
        } else {
            this.f28438i = str3;
        }
        if ((i10 & 512) == 0) {
            this.f28439j = null;
        } else {
            this.f28439j = str4;
        }
        if ((i10 & 1024) == 0) {
            this.f28440k = null;
        } else {
            this.f28440k = c3034b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9440I)) {
            return false;
        }
        C9440I c9440i = (C9440I) obj;
        if (this.f28430a != c9440i.f28430a || !AbstractC16544l.m18089b(this.f28431b, c9440i.f28431b) || this.f28432c != c9440i.f28432c || !AbstractC16544l.m18089b(this.f28433d, c9440i.f28433d) || !AbstractC16544l.m18089b(this.f28434e, c9440i.f28434e) || !AbstractC16544l.m18089b(this.f28435f, c9440i.f28435f)) {
            return false;
        }
        String str = this.f28436g;
        String str2 = c9440i.f28436g;
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
        return zM18089b && AbstractC16544l.m18089b(this.f28437h, c9440i.f28437h) && AbstractC16544l.m18089b(this.f28438i, c9440i.f28438i) && AbstractC16544l.m18089b(this.f28439j, c9440i.f28439j) && AbstractC16544l.m18089b(this.f28440k, c9440i.f28440k);
    }

    public final int hashCode() {
        EnumC9437F enumC9437F = this.f28430a;
        int iHashCode = (enumC9437F == null ? 0 : enumC9437F.hashCode()) * 31;
        C16642a c16642a = this.f28431b;
        int iHashCode2 = (iHashCode + (c16642a == null ? 0 : c16642a.f53330Y.hashCode())) * 31;
        EnumC9441J enumC9441J = this.f28432c;
        int iHashCode3 = (iHashCode2 + (enumC9441J == null ? 0 : enumC9441J.hashCode())) * 31;
        C9463v c9463v = this.f28433d;
        int iHashCode4 = (iHashCode3 + (c9463v == null ? 0 : c9463v.hashCode())) * 31;
        C9433B c9433b = this.f28434e;
        int iHashCode5 = (iHashCode4 + (c9433b == null ? 0 : c9433b.hashCode())) * 31;
        C1193x2 c1193x2 = this.f28435f;
        int iHashCode6 = (iHashCode5 + (c1193x2 == null ? 0 : c1193x2.hashCode())) * 31;
        String str = this.f28436g;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28437h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28438i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f28439j;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C3034b c3034b = this.f28440k;
        return iHashCode10 + (c3034b != null ? c3034b.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C9440I(EnumC9437F enumC9437F, C16642a c16642a, EnumC9441J enumC9441J, C9463v c9463v, C9433B c9433b, C1193x2 c1193x2, String str, String str2, String str3, String str4, C3034b c3034b) {
        this.f28430a = enumC9437F;
        this.f28431b = c16642a;
        this.f28432c = enumC9441J;
        this.f28433d = c9463v;
        this.f28434e = c9433b;
        this.f28435f = c1193x2;
        this.f28436g = str;
        this.f28437h = str2;
        this.f28438i = str3;
        this.f28439j = str4;
        this.f28440k = c3034b;
    }

    public /* synthetic */ C9440I(C9433B c9433b, C1193x2 c1193x2, String str, int i10) {
        this(null, null, null, null, (i10 & 16) != 0 ? null : c9433b, (i10 & 32) != 0 ? null : c1193x2, (i10 & 64) != 0 ? null : str, null, null, null, null);
    }
}
