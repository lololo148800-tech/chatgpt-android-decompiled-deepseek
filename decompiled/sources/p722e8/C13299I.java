package p722e8;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p499U9.C7591u;
import p523V9.AbstractC8111i5;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9393x3;
import p676c7.C11682a;
import p676c7.C11683b;
import p676c7.C11688g;
import p677c8.C11689a;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17659D;
import p919o8.C17900H;
import p919o8.C17903I;
import p919o8.C17918N;
import p919o8.C17921O;
import p919o8.C17932S;
import p919o8.C17935T;
import p919o8.C17938U;
import p919o8.C17941V;
import p919o8.C17947X;
import p919o8.C17949Y;
import p919o8.C17951Z;
import p919o8.C17960c0;
import p919o8.C17966e0;
import p919o8.C17969f0;
import p919o8.C17972g0;
import p919o8.C17978i0;
import p919o8.C17984k0;

/* JADX INFO: renamed from: e8.I */
/* JADX INFO: loaded from: classes.dex */
public final class C13299I extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C13302L f42035Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11689a f42036Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f42037o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Long f42038p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f42039q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ String f42040r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ String f42041s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ String f42042t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ int f42043u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ LinkedHashMap f42044v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ C17972g0 f42045w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13299I(C13302L c13302l, C11689a c11689a, int i10, Long l4, String str, String str2, String str3, String str4, int i11, LinkedHashMap linkedHashMap, C17972g0 c17972g0) {
        super(1);
        this.f42035Y = c13302l;
        this.f42036Z = c11689a;
        this.f42037o0 = i10;
        this.f42038p0 = l4;
        this.f42039q0 = str;
        this.f42040r0 = str2;
        this.f42041s0 = str3;
        this.f42042t0 = str4;
        this.f42043u0 = i11;
        this.f42044v0 = linkedHashMap;
        this.f42045w0 = c17972g0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int i10;
        int i11;
        Long l4;
        long jLongValue;
        String str;
        C17966e0 c17966e0;
        String str2;
        C17900H c17900h;
        String str3;
        String str4;
        String str5;
        String str6;
        C11688g c11688g;
        C17978i0 c17978i0;
        String host;
        C11682a datadogContext = (C11682a) obj;
        AbstractC16544l.m18094g(datadogContext, "datadogContext");
        C13302L c13302l = this.f42035Y;
        C7591u c7591u = c13302l.f42067f;
        C11689a c11689a = this.f42036Z;
        String str7 = c11689a.f35460d;
        if (str7 == null) {
            str7 = "";
        }
        boolean zM7938M = C7591u.m7938M(datadogContext, str7);
        int iM8600k = AbstractC8111i5.m8600k(this.f42037o0);
        int i12 = c13302l.f42064c;
        AbstractC14376f.m15825D(i12, "<this>");
        switch (AbstractC0010F.m24h(i12)) {
            case 0:
                i10 = 1;
                l4 = this.f42038p0;
                if (l4 != null) {
                    jLongValue = l4.longValue();
                } else {
                    jLongValue = 0;
                }
                long j10 = jLongValue;
                str = c13302l.f42063b;
                if (c13302l.f42066e.m14852b(str)) {
                    try {
                        host = new URL(str).getHost();
                        AbstractC16544l.m18093f(host, "{\n            URL(url).host\n        }");
                    } catch (MalformedURLException unused) {
                        host = str;
                    }
                    c17966e0 = new C17966e0(7, host, null);
                    break;
                } else {
                    c17966e0 = null;
                }
                C17969f0 c17969f0 = new C17969f0(i10, j10, str, c17966e0);
                C17947X c17947x = new C17947X(this.f42039q0, iM8600k, this.f42040r0, Boolean.FALSE, this.f42041s0, this.f42042t0, 3, 1, c17969f0, null, null, 255505);
                str2 = c11689a.f35463g;
                if (str2 != null) {
                    c17900h = new C17900H(AbstractC9393x3.m9974d(str2));
                } else {
                    c17900h = null;
                }
                str3 = c11689a.f35460d;
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                str5 = c11689a.f35462f;
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                C17951Z c17951z = new C17951Z(18, str4, (String) null, str6, c11689a.f35461e);
                c11688g = datadogContext.f35421m;
                if (AbstractC9144I.m9689a(c11688g)) {
                    c17978i0 = new C17978i0(c11688g.f35452a, c11688g.f35453b, c11688g.f35454c, AbstractC17659D.m19256r(c11688g.f35455d));
                } else {
                    c17978i0 = null;
                }
                C17921O c17921oM8597h = AbstractC8111i5.m8597h(c13302l.f42074m);
                C17903I c17903i = new C17903I(c11689a.f35457a);
                C17949Y c17949y = new C17949Y(this.f42043u0, Boolean.valueOf(zM7938M), c11689a.f35458b);
                int iM8601l = AbstractC8111i5.m8601l(datadogContext.f35415g, c13302l.f42062a.mo15463s());
                C11683b c11683b = datadogContext.f35420l;
                C17960c0 c17960c0 = new C17960c0(c11683b.f35430f, c11683b.f35432h, null, c11683b.f35431g);
                C17941V c17941v = new C17941V(AbstractC8111i5.m8598i(c11683b.f35428d), c11683b.f35425a, c11683b.f35427c, c11683b.f35426b, c11683b.f35433i);
                C17932S c17932s = new C17932S(this.f42044v0);
                return new C17984k0(c13302l.f42072k, c17903i, datadogContext.f35411c, datadogContext.f35413e, datadogContext.f35423o, c17949y, iM8601l, c17951z, c17978i0, c17921oM8597h, this.f42045w0, c17960c0, c17941v, new C17935T(new C17938U(AbstractC8111i5.m8599j(c11689a.f35470n), 1), new C17918N(Float.valueOf(c13302l.f42068g)), null), c17932s, c17900h, c17947x, null, 2631696);
            case 1:
                i11 = 2;
                i10 = i11;
                l4 = this.f42038p0;
                if (l4 != null) {
                    jLongValue = l4.longValue();
                } else {
                    jLongValue = 0;
                }
                long j11 = jLongValue;
                str = c13302l.f42063b;
                if (c13302l.f42066e.m14852b(str)) {
                    host = new URL(str).getHost();
                    AbstractC16544l.m18093f(host, "{\n            URL(url).host\n        }");
                    c17966e0 = new C17966e0(7, host, null);
                } else {
                    c17966e0 = null;
                }
                C17969f0 c17969f1 = new C17969f0(i10, j11, str, c17966e0);
                C17947X c17947x2 = new C17947X(this.f42039q0, iM8600k, this.f42040r0, Boolean.FALSE, this.f42041s0, this.f42042t0, 3, 1, c17969f1, null, null, 255505);
                str2 = c11689a.f35463g;
                if (str2 != null) {
                    c17900h = new C17900H(AbstractC9393x3.m9974d(str2));
                } else {
                    c17900h = null;
                }
                str3 = c11689a.f35460d;
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                str5 = c11689a.f35462f;
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                C17951Z c17951z2 = new C17951Z(18, str4, (String) null, str6, c11689a.f35461e);
                c11688g = datadogContext.f35421m;
                if (AbstractC9144I.m9689a(c11688g)) {
                    c17978i0 = new C17978i0(c11688g.f35452a, c11688g.f35453b, c11688g.f35454c, AbstractC17659D.m19256r(c11688g.f35455d));
                } else {
                    c17978i0 = null;
                }
                C17921O c17921oM8597h2 = AbstractC8111i5.m8597h(c13302l.f42074m);
                C17903I c17903i2 = new C17903I(c11689a.f35457a);
                C17949Y c17949y2 = new C17949Y(this.f42043u0, Boolean.valueOf(zM7938M), c11689a.f35458b);
                int iM8601l2 = AbstractC8111i5.m8601l(datadogContext.f35415g, c13302l.f42062a.mo15463s());
                C11683b c11683b2 = datadogContext.f35420l;
                C17960c0 c17960c1 = new C17960c0(c11683b2.f35430f, c11683b2.f35432h, null, c11683b2.f35431g);
                C17941V c17941v2 = new C17941V(AbstractC8111i5.m8598i(c11683b2.f35428d), c11683b2.f35425a, c11683b2.f35427c, c11683b2.f35426b, c11683b2.f35433i);
                C17932S c17932s2 = new C17932S(this.f42044v0);
                return new C17984k0(c13302l.f42072k, c17903i2, datadogContext.f35411c, datadogContext.f35413e, datadogContext.f35423o, c17949y2, iM8601l2, c17951z2, c17978i0, c17921oM8597h2, this.f42045w0, c17960c1, c17941v2, new C17935T(new C17938U(AbstractC8111i5.m8599j(c11689a.f35470n), 1), new C17918N(Float.valueOf(c13302l.f42068g)), null), c17932s2, c17900h, c17947x2, null, 2631696);
            case 2:
                i11 = 3;
                i10 = i11;
                l4 = this.f42038p0;
                if (l4 != null) {
                    jLongValue = l4.longValue();
                } else {
                    jLongValue = 0;
                }
                long j12 = jLongValue;
                str = c13302l.f42063b;
                if (c13302l.f42066e.m14852b(str)) {
                    host = new URL(str).getHost();
                    AbstractC16544l.m18093f(host, "{\n            URL(url).host\n        }");
                    c17966e0 = new C17966e0(7, host, null);
                } else {
                    c17966e0 = null;
                }
                C17969f0 c17969f2 = new C17969f0(i10, j12, str, c17966e0);
                C17947X c17947x3 = new C17947X(this.f42039q0, iM8600k, this.f42040r0, Boolean.FALSE, this.f42041s0, this.f42042t0, 3, 1, c17969f2, null, null, 255505);
                str2 = c11689a.f35463g;
                if (str2 != null) {
                    c17900h = new C17900H(AbstractC9393x3.m9974d(str2));
                } else {
                    c17900h = null;
                }
                str3 = c11689a.f35460d;
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                str5 = c11689a.f35462f;
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                C17951Z c17951z3 = new C17951Z(18, str4, (String) null, str6, c11689a.f35461e);
                c11688g = datadogContext.f35421m;
                if (AbstractC9144I.m9689a(c11688g)) {
                    c17978i0 = new C17978i0(c11688g.f35452a, c11688g.f35453b, c11688g.f35454c, AbstractC17659D.m19256r(c11688g.f35455d));
                } else {
                    c17978i0 = null;
                }
                C17921O c17921oM8597h3 = AbstractC8111i5.m8597h(c13302l.f42074m);
                C17903I c17903i3 = new C17903I(c11689a.f35457a);
                C17949Y c17949y3 = new C17949Y(this.f42043u0, Boolean.valueOf(zM7938M), c11689a.f35458b);
                int iM8601l3 = AbstractC8111i5.m8601l(datadogContext.f35415g, c13302l.f42062a.mo15463s());
                C11683b c11683b3 = datadogContext.f35420l;
                C17960c0 c17960c2 = new C17960c0(c11683b3.f35430f, c11683b3.f35432h, null, c11683b3.f35431g);
                C17941V c17941v3 = new C17941V(AbstractC8111i5.m8598i(c11683b3.f35428d), c11683b3.f35425a, c11683b3.f35427c, c11683b3.f35426b, c11683b3.f35433i);
                C17932S c17932s3 = new C17932S(this.f42044v0);
                return new C17984k0(c13302l.f42072k, c17903i3, datadogContext.f35411c, datadogContext.f35413e, datadogContext.f35423o, c17949y3, iM8601l3, c17951z3, c17978i0, c17921oM8597h3, this.f42045w0, c17960c2, c17941v3, new C17935T(new C17938U(AbstractC8111i5.m8599j(c11689a.f35470n), 1), new C17918N(Float.valueOf(c13302l.f42068g)), null), c17932s3, c17900h, c17947x3, null, 2631696);
            case 3:
                i11 = 4;
                i10 = i11;
                l4 = this.f42038p0;
                if (l4 != null) {
                    jLongValue = l4.longValue();
                } else {
                    jLongValue = 0;
                }
                long j13 = jLongValue;
                str = c13302l.f42063b;
                if (c13302l.f42066e.m14852b(str)) {
                    host = new URL(str).getHost();
                    AbstractC16544l.m18093f(host, "{\n            URL(url).host\n        }");
                    c17966e0 = new C17966e0(7, host, null);
                } else {
                    c17966e0 = null;
                }
                C17969f0 c17969f3 = new C17969f0(i10, j13, str, c17966e0);
                C17947X c17947x4 = new C17947X(this.f42039q0, iM8600k, this.f42040r0, Boolean.FALSE, this.f42041s0, this.f42042t0, 3, 1, c17969f3, null, null, 255505);
                str2 = c11689a.f35463g;
                if (str2 != null) {
                    c17900h = new C17900H(AbstractC9393x3.m9974d(str2));
                } else {
                    c17900h = null;
                }
                str3 = c11689a.f35460d;
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                str5 = c11689a.f35462f;
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                C17951Z c17951z4 = new C17951Z(18, str4, (String) null, str6, c11689a.f35461e);
                c11688g = datadogContext.f35421m;
                if (AbstractC9144I.m9689a(c11688g)) {
                    c17978i0 = new C17978i0(c11688g.f35452a, c11688g.f35453b, c11688g.f35454c, AbstractC17659D.m19256r(c11688g.f35455d));
                } else {
                    c17978i0 = null;
                }
                C17921O c17921oM8597h4 = AbstractC8111i5.m8597h(c13302l.f42074m);
                C17903I c17903i4 = new C17903I(c11689a.f35457a);
                C17949Y c17949y4 = new C17949Y(this.f42043u0, Boolean.valueOf(zM7938M), c11689a.f35458b);
                int iM8601l4 = AbstractC8111i5.m8601l(datadogContext.f35415g, c13302l.f42062a.mo15463s());
                C11683b c11683b4 = datadogContext.f35420l;
                C17960c0 c17960c3 = new C17960c0(c11683b4.f35430f, c11683b4.f35432h, null, c11683b4.f35431g);
                C17941V c17941v4 = new C17941V(AbstractC8111i5.m8598i(c11683b4.f35428d), c11683b4.f35425a, c11683b4.f35427c, c11683b4.f35426b, c11683b4.f35433i);
                C17932S c17932s4 = new C17932S(this.f42044v0);
                return new C17984k0(c13302l.f42072k, c17903i4, datadogContext.f35411c, datadogContext.f35413e, datadogContext.f35423o, c17949y4, iM8601l4, c17951z4, c17978i0, c17921oM8597h4, this.f42045w0, c17960c3, c17941v4, new C17935T(new C17938U(AbstractC8111i5.m8599j(c11689a.f35470n), 1), new C17918N(Float.valueOf(c13302l.f42068g)), null), c17932s4, c17900h, c17947x4, null, 2631696);
            case 4:
                i11 = 5;
                i10 = i11;
                l4 = this.f42038p0;
                if (l4 != null) {
                    jLongValue = l4.longValue();
                } else {
                    jLongValue = 0;
                }
                long j14 = jLongValue;
                str = c13302l.f42063b;
                if (c13302l.f42066e.m14852b(str)) {
                    host = new URL(str).getHost();
                    AbstractC16544l.m18093f(host, "{\n            URL(url).host\n        }");
                    c17966e0 = new C17966e0(7, host, null);
                } else {
                    c17966e0 = null;
                }
                C17969f0 c17969f4 = new C17969f0(i10, j14, str, c17966e0);
                C17947X c17947x5 = new C17947X(this.f42039q0, iM8600k, this.f42040r0, Boolean.FALSE, this.f42041s0, this.f42042t0, 3, 1, c17969f4, null, null, 255505);
                str2 = c11689a.f35463g;
                if (str2 != null) {
                    c17900h = new C17900H(AbstractC9393x3.m9974d(str2));
                } else {
                    c17900h = null;
                }
                str3 = c11689a.f35460d;
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                str5 = c11689a.f35462f;
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                C17951Z c17951z5 = new C17951Z(18, str4, (String) null, str6, c11689a.f35461e);
                c11688g = datadogContext.f35421m;
                if (AbstractC9144I.m9689a(c11688g)) {
                    c17978i0 = new C17978i0(c11688g.f35452a, c11688g.f35453b, c11688g.f35454c, AbstractC17659D.m19256r(c11688g.f35455d));
                } else {
                    c17978i0 = null;
                }
                C17921O c17921oM8597h5 = AbstractC8111i5.m8597h(c13302l.f42074m);
                C17903I c17903i5 = new C17903I(c11689a.f35457a);
                C17949Y c17949y5 = new C17949Y(this.f42043u0, Boolean.valueOf(zM7938M), c11689a.f35458b);
                int iM8601l5 = AbstractC8111i5.m8601l(datadogContext.f35415g, c13302l.f42062a.mo15463s());
                C11683b c11683b5 = datadogContext.f35420l;
                C17960c0 c17960c4 = new C17960c0(c11683b5.f35430f, c11683b5.f35432h, null, c11683b5.f35431g);
                C17941V c17941v5 = new C17941V(AbstractC8111i5.m8598i(c11683b5.f35428d), c11683b5.f35425a, c11683b5.f35427c, c11683b5.f35426b, c11683b5.f35433i);
                C17932S c17932s5 = new C17932S(this.f42044v0);
                return new C17984k0(c13302l.f42072k, c17903i5, datadogContext.f35411c, datadogContext.f35413e, datadogContext.f35423o, c17949y5, iM8601l5, c17951z5, c17978i0, c17921oM8597h5, this.f42045w0, c17960c4, c17941v5, new C17935T(new C17938U(AbstractC8111i5.m8599j(c11689a.f35470n), 1), new C17918N(Float.valueOf(c13302l.f42068g)), null), c17932s5, c17900h, c17947x5, null, 2631696);
            case 5:
                i11 = 6;
                i10 = i11;
                l4 = this.f42038p0;
                if (l4 != null) {
                    jLongValue = l4.longValue();
                } else {
                    jLongValue = 0;
                }
                long j15 = jLongValue;
                str = c13302l.f42063b;
                if (c13302l.f42066e.m14852b(str)) {
                    host = new URL(str).getHost();
                    AbstractC16544l.m18093f(host, "{\n            URL(url).host\n        }");
                    c17966e0 = new C17966e0(7, host, null);
                } else {
                    c17966e0 = null;
                }
                C17969f0 c17969f5 = new C17969f0(i10, j15, str, c17966e0);
                C17947X c17947x6 = new C17947X(this.f42039q0, iM8600k, this.f42040r0, Boolean.FALSE, this.f42041s0, this.f42042t0, 3, 1, c17969f5, null, null, 255505);
                str2 = c11689a.f35463g;
                if (str2 != null) {
                    c17900h = new C17900H(AbstractC9393x3.m9974d(str2));
                } else {
                    c17900h = null;
                }
                str3 = c11689a.f35460d;
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                str5 = c11689a.f35462f;
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                C17951Z c17951z6 = new C17951Z(18, str4, (String) null, str6, c11689a.f35461e);
                c11688g = datadogContext.f35421m;
                if (AbstractC9144I.m9689a(c11688g)) {
                    c17978i0 = new C17978i0(c11688g.f35452a, c11688g.f35453b, c11688g.f35454c, AbstractC17659D.m19256r(c11688g.f35455d));
                } else {
                    c17978i0 = null;
                }
                C17921O c17921oM8597h6 = AbstractC8111i5.m8597h(c13302l.f42074m);
                C17903I c17903i6 = new C17903I(c11689a.f35457a);
                C17949Y c17949y6 = new C17949Y(this.f42043u0, Boolean.valueOf(zM7938M), c11689a.f35458b);
                int iM8601l6 = AbstractC8111i5.m8601l(datadogContext.f35415g, c13302l.f42062a.mo15463s());
                C11683b c11683b6 = datadogContext.f35420l;
                C17960c0 c17960c5 = new C17960c0(c11683b6.f35430f, c11683b6.f35432h, null, c11683b6.f35431g);
                C17941V c17941v6 = new C17941V(AbstractC8111i5.m8598i(c11683b6.f35428d), c11683b6.f35425a, c11683b6.f35427c, c11683b6.f35426b, c11683b6.f35433i);
                C17932S c17932s6 = new C17932S(this.f42044v0);
                return new C17984k0(c13302l.f42072k, c17903i6, datadogContext.f35411c, datadogContext.f35413e, datadogContext.f35423o, c17949y6, iM8601l6, c17951z6, c17978i0, c17921oM8597h6, this.f42045w0, c17960c5, c17941v6, new C17935T(new C17938U(AbstractC8111i5.m8599j(c11689a.f35470n), 1), new C17918N(Float.valueOf(c13302l.f42068g)), null), c17932s6, c17900h, c17947x6, null, 2631696);
            case 6:
                i10 = 7;
                l4 = this.f42038p0;
                if (l4 != null) {
                    jLongValue = l4.longValue();
                } else {
                    jLongValue = 0;
                }
                long j16 = jLongValue;
                str = c13302l.f42063b;
                if (c13302l.f42066e.m14852b(str)) {
                    host = new URL(str).getHost();
                    AbstractC16544l.m18093f(host, "{\n            URL(url).host\n        }");
                    c17966e0 = new C17966e0(7, host, null);
                } else {
                    c17966e0 = null;
                }
                C17969f0 c17969f6 = new C17969f0(i10, j16, str, c17966e0);
                C17947X c17947x7 = new C17947X(this.f42039q0, iM8600k, this.f42040r0, Boolean.FALSE, this.f42041s0, this.f42042t0, 3, 1, c17969f6, null, null, 255505);
                str2 = c11689a.f35463g;
                if (str2 != null) {
                    c17900h = new C17900H(AbstractC9393x3.m9974d(str2));
                } else {
                    c17900h = null;
                }
                str3 = c11689a.f35460d;
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                str5 = c11689a.f35462f;
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                C17951Z c17951z7 = new C17951Z(18, str4, (String) null, str6, c11689a.f35461e);
                c11688g = datadogContext.f35421m;
                if (AbstractC9144I.m9689a(c11688g)) {
                    c17978i0 = new C17978i0(c11688g.f35452a, c11688g.f35453b, c11688g.f35454c, AbstractC17659D.m19256r(c11688g.f35455d));
                } else {
                    c17978i0 = null;
                }
                C17921O c17921oM8597h7 = AbstractC8111i5.m8597h(c13302l.f42074m);
                C17903I c17903i7 = new C17903I(c11689a.f35457a);
                C17949Y c17949y7 = new C17949Y(this.f42043u0, Boolean.valueOf(zM7938M), c11689a.f35458b);
                int iM8601l7 = AbstractC8111i5.m8601l(datadogContext.f35415g, c13302l.f42062a.mo15463s());
                C11683b c11683b7 = datadogContext.f35420l;
                C17960c0 c17960c6 = new C17960c0(c11683b7.f35430f, c11683b7.f35432h, null, c11683b7.f35431g);
                C17941V c17941v7 = new C17941V(AbstractC8111i5.m8598i(c11683b7.f35428d), c11683b7.f35425a, c11683b7.f35427c, c11683b7.f35426b, c11683b7.f35433i);
                C17932S c17932s7 = new C17932S(this.f42044v0);
                return new C17984k0(c13302l.f42072k, c17903i7, datadogContext.f35411c, datadogContext.f35413e, datadogContext.f35423o, c17949y7, iM8601l7, c17951z7, c17978i0, c17921oM8597h7, this.f42045w0, c17960c6, c17941v7, new C17935T(new C17938U(AbstractC8111i5.m8599j(c11689a.f35470n), 1), new C17918N(Float.valueOf(c13302l.f42068g)), null), c17932s7, c17900h, c17947x7, null, 2631696);
            case 7:
                i11 = 8;
                i10 = i11;
                l4 = this.f42038p0;
                if (l4 != null) {
                    jLongValue = l4.longValue();
                } else {
                    jLongValue = 0;
                }
                long j17 = jLongValue;
                str = c13302l.f42063b;
                if (c13302l.f42066e.m14852b(str)) {
                    host = new URL(str).getHost();
                    AbstractC16544l.m18093f(host, "{\n            URL(url).host\n        }");
                    c17966e0 = new C17966e0(7, host, null);
                } else {
                    c17966e0 = null;
                }
                C17969f0 c17969f7 = new C17969f0(i10, j17, str, c17966e0);
                C17947X c17947x8 = new C17947X(this.f42039q0, iM8600k, this.f42040r0, Boolean.FALSE, this.f42041s0, this.f42042t0, 3, 1, c17969f7, null, null, 255505);
                str2 = c11689a.f35463g;
                if (str2 != null) {
                    c17900h = new C17900H(AbstractC9393x3.m9974d(str2));
                } else {
                    c17900h = null;
                }
                str3 = c11689a.f35460d;
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                str5 = c11689a.f35462f;
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                C17951Z c17951z8 = new C17951Z(18, str4, (String) null, str6, c11689a.f35461e);
                c11688g = datadogContext.f35421m;
                if (AbstractC9144I.m9689a(c11688g)) {
                    c17978i0 = new C17978i0(c11688g.f35452a, c11688g.f35453b, c11688g.f35454c, AbstractC17659D.m19256r(c11688g.f35455d));
                } else {
                    c17978i0 = null;
                }
                C17921O c17921oM8597h8 = AbstractC8111i5.m8597h(c13302l.f42074m);
                C17903I c17903i8 = new C17903I(c11689a.f35457a);
                C17949Y c17949y8 = new C17949Y(this.f42043u0, Boolean.valueOf(zM7938M), c11689a.f35458b);
                int iM8601l8 = AbstractC8111i5.m8601l(datadogContext.f35415g, c13302l.f42062a.mo15463s());
                C11683b c11683b8 = datadogContext.f35420l;
                C17960c0 c17960c7 = new C17960c0(c11683b8.f35430f, c11683b8.f35432h, null, c11683b8.f35431g);
                C17941V c17941v8 = new C17941V(AbstractC8111i5.m8598i(c11683b8.f35428d), c11683b8.f35425a, c11683b8.f35427c, c11683b8.f35426b, c11683b8.f35433i);
                C17932S c17932s8 = new C17932S(this.f42044v0);
                return new C17984k0(c13302l.f42072k, c17903i8, datadogContext.f35411c, datadogContext.f35413e, datadogContext.f35423o, c17949y8, iM8601l8, c17951z8, c17978i0, c17921oM8597h8, this.f42045w0, c17960c7, c17941v8, new C17935T(new C17938U(AbstractC8111i5.m8599j(c11689a.f35470n), 1), new C17918N(Float.valueOf(c13302l.f42068g)), null), c17932s8, c17900h, c17947x8, null, 2631696);
            case 8:
                i11 = 9;
                i10 = i11;
                l4 = this.f42038p0;
                if (l4 != null) {
                    jLongValue = l4.longValue();
                } else {
                    jLongValue = 0;
                }
                long j18 = jLongValue;
                str = c13302l.f42063b;
                if (c13302l.f42066e.m14852b(str)) {
                    host = new URL(str).getHost();
                    AbstractC16544l.m18093f(host, "{\n            URL(url).host\n        }");
                    c17966e0 = new C17966e0(7, host, null);
                } else {
                    c17966e0 = null;
                }
                C17969f0 c17969f8 = new C17969f0(i10, j18, str, c17966e0);
                C17947X c17947x9 = new C17947X(this.f42039q0, iM8600k, this.f42040r0, Boolean.FALSE, this.f42041s0, this.f42042t0, 3, 1, c17969f8, null, null, 255505);
                str2 = c11689a.f35463g;
                if (str2 != null) {
                    c17900h = new C17900H(AbstractC9393x3.m9974d(str2));
                } else {
                    c17900h = null;
                }
                str3 = c11689a.f35460d;
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                str5 = c11689a.f35462f;
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                C17951Z c17951z9 = new C17951Z(18, str4, (String) null, str6, c11689a.f35461e);
                c11688g = datadogContext.f35421m;
                if (AbstractC9144I.m9689a(c11688g)) {
                    c17978i0 = new C17978i0(c11688g.f35452a, c11688g.f35453b, c11688g.f35454c, AbstractC17659D.m19256r(c11688g.f35455d));
                } else {
                    c17978i0 = null;
                }
                C17921O c17921oM8597h9 = AbstractC8111i5.m8597h(c13302l.f42074m);
                C17903I c17903i9 = new C17903I(c11689a.f35457a);
                C17949Y c17949y9 = new C17949Y(this.f42043u0, Boolean.valueOf(zM7938M), c11689a.f35458b);
                int iM8601l9 = AbstractC8111i5.m8601l(datadogContext.f35415g, c13302l.f42062a.mo15463s());
                C11683b c11683b9 = datadogContext.f35420l;
                C17960c0 c17960c8 = new C17960c0(c11683b9.f35430f, c11683b9.f35432h, null, c11683b9.f35431g);
                C17941V c17941v9 = new C17941V(AbstractC8111i5.m8598i(c11683b9.f35428d), c11683b9.f35425a, c11683b9.f35427c, c11683b9.f35426b, c11683b9.f35433i);
                C17932S c17932s9 = new C17932S(this.f42044v0);
                return new C17984k0(c13302l.f42072k, c17903i9, datadogContext.f35411c, datadogContext.f35413e, datadogContext.f35423o, c17949y9, iM8601l9, c17951z9, c17978i0, c17921oM8597h9, this.f42045w0, c17960c8, c17941v9, new C17935T(new C17938U(AbstractC8111i5.m8599j(c11689a.f35470n), 1), new C17918N(Float.valueOf(c13302l.f42068g)), null), c17932s9, c17900h, c17947x9, null, 2631696);
            default:
                throw new C0644w();
        }
    }
}
