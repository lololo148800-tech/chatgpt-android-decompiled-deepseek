package p857kl;

import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11181o0;
import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p1045ul.C20387d;
import p559Wn.C8969a;
import p559Wn.InterfaceC8975g;
import p594Y9.AbstractC9961r4;
import p909nm.C17690x;

/* JADX INFO: renamed from: kl.l */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16464l {
    public static final C16463k Companion = new C16463k();

    /* JADX INFO: renamed from: k */
    public static final KSerializer[] f51069k;

    /* JADX INFO: renamed from: a */
    public final String f51070a;

    /* JADX INFO: renamed from: b */
    public final String f51071b;

    /* JADX INFO: renamed from: c */
    public final EnumC16465m f51072c;

    /* JADX INFO: renamed from: d */
    public final Integer f51073d;

    /* JADX INFO: renamed from: e */
    public final C20387d f51074e;

    /* JADX INFO: renamed from: f */
    public final String f51075f;

    /* JADX INFO: renamed from: g */
    public final String f51076g;

    /* JADX INFO: renamed from: h */
    public final boolean f51077h;

    /* JADX INFO: renamed from: i */
    public final boolean f51078i;

    /* JADX INFO: renamed from: j */
    public final Map f51079j;

    static {
        C8969a c8969aM12383f = AbstractC11153a0.m12383f("io.ktor.http.CookieEncoding", EnumC16465m.values());
        C11181o0 c11181o0 = C11181o0.f33827a;
        f51069k = new KSerializer[]{null, null, c8969aM12383f, null, null, null, null, null, null, new C11131E(c11181o0, AbstractC9961r4.m10615b(c11181o0), 1)};
    }

    public /* synthetic */ C16464l(int i10, String str, String str2, EnumC16465m enumC16465m, Integer num, C20387d c20387d, String str3, String str4, boolean z6, boolean z10, Map map) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C16462j.f51068a.getDescriptor());
            throw null;
        }
        this.f51070a = str;
        this.f51071b = str2;
        if ((i10 & 4) == 0) {
            this.f51072c = EnumC16465m.f51081Z;
        } else {
            this.f51072c = enumC16465m;
        }
        if ((i10 & 8) == 0) {
            this.f51073d = null;
        } else {
            this.f51073d = num;
        }
        if ((i10 & 16) == 0) {
            this.f51074e = null;
        } else {
            this.f51074e = c20387d;
        }
        if ((i10 & 32) == 0) {
            this.f51075f = null;
        } else {
            this.f51075f = str3;
        }
        if ((i10 & 64) == 0) {
            this.f51076g = null;
        } else {
            this.f51076g = str4;
        }
        if ((i10 & 128) == 0) {
            this.f51077h = false;
        } else {
            this.f51077h = z6;
        }
        if ((i10 & 256) == 0) {
            this.f51078i = false;
        } else {
            this.f51078i = z10;
        }
        if ((i10 & 512) == 0) {
            this.f51079j = C17690x.f56481Y;
        } else {
            this.f51079j = map;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C16464l m18038a(C16464l c16464l, String str, String str2, int i10) {
        if ((i10 & 32) != 0) {
            str = c16464l.f51075f;
        }
        String str3 = str;
        if ((i10 & 64) != 0) {
            str2 = c16464l.f51076g;
        }
        String name = c16464l.f51070a;
        AbstractC16544l.m18094g(name, "name");
        String value = c16464l.f51071b;
        AbstractC16544l.m18094g(value, "value");
        EnumC16465m encoding = c16464l.f51072c;
        AbstractC16544l.m18094g(encoding, "encoding");
        Map extensions = c16464l.f51079j;
        AbstractC16544l.m18094g(extensions, "extensions");
        return new C16464l(name, value, encoding, c16464l.f51073d, c16464l.f51074e, str3, str2, c16464l.f51077h, c16464l.f51078i, extensions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16464l)) {
            return false;
        }
        C16464l c16464l = (C16464l) obj;
        return AbstractC16544l.m18089b(this.f51070a, c16464l.f51070a) && AbstractC16544l.m18089b(this.f51071b, c16464l.f51071b) && this.f51072c == c16464l.f51072c && AbstractC16544l.m18089b(this.f51073d, c16464l.f51073d) && AbstractC16544l.m18089b(this.f51074e, c16464l.f51074e) && AbstractC16544l.m18089b(this.f51075f, c16464l.f51075f) && AbstractC16544l.m18089b(this.f51076g, c16464l.f51076g) && this.f51077h == c16464l.f51077h && this.f51078i == c16464l.f51078i && AbstractC16544l.m18089b(this.f51079j, c16464l.f51079j);
    }

    public final int hashCode() {
        int iHashCode = (this.f51072c.hashCode() + AbstractC0168G.m527p(this.f51070a.hashCode() * 31, 31, this.f51071b)) * 31;
        Integer num = this.f51073d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C20387d c20387d = this.f51074e;
        int iHashCode3 = (iHashCode2 + (c20387d == null ? 0 : c20387d.hashCode())) * 31;
        String str = this.f51075f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51076g;
        return this.f51079j.hashCode() + ((((((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f51077h ? 1231 : 1237)) * 31) + (this.f51078i ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cookie(name=");
        sb2.append(this.f51070a);
        sb2.append(", value=");
        sb2.append(this.f51071b);
        sb2.append(", encoding=");
        sb2.append(this.f51072c);
        sb2.append(", maxAge=");
        sb2.append(this.f51073d);
        sb2.append(", expires=");
        sb2.append(this.f51074e);
        sb2.append(", domain=");
        sb2.append(this.f51075f);
        sb2.append(", path=");
        sb2.append(this.f51076g);
        sb2.append(", secure=");
        sb2.append(this.f51077h);
        sb2.append(", httpOnly=");
        sb2.append(this.f51078i);
        sb2.append(", extensions=");
        return AbstractC12107L1.m13827r(sb2, this.f51079j, ')');
    }

    public C16464l(String name, String value, EnumC16465m encoding, Integer num, C20387d c20387d, String str, String str2, boolean z6, boolean z10, Map extensions) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        AbstractC16544l.m18094g(encoding, "encoding");
        AbstractC16544l.m18094g(extensions, "extensions");
        this.f51070a = name;
        this.f51071b = value;
        this.f51072c = encoding;
        this.f51073d = num;
        this.f51074e = c20387d;
        this.f51075f = str;
        this.f51076g = str2;
        this.f51077h = z6;
        this.f51078i = z10;
        this.f51079j = extensions;
    }
}
