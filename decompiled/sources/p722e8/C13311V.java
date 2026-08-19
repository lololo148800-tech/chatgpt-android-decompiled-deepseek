package p722e8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p035B7.C0846c;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p499U9.C7591u;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8111i5;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9393x3;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p676c7.C11682a;
import p676c7.C11683b;
import p676c7.C11685d;
import p676c7.C11688g;
import p676c7.EnumC11684c;
import p677c8.C11689a;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17659D;
import p909nm.C17689w;
import p919o8.AbstractC17962d;
import p919o8.C17880A0;
import p919o8.C17883B0;
import p919o8.C17886C0;
import p919o8.C17892E0;
import p919o8.C17895F0;
import p919o8.C17901H0;
import p919o8.C17987l0;
import p919o8.C17990m0;
import p919o8.C17993n0;
import p919o8.C17999p0;
import p919o8.C18002q0;
import p919o8.C18011t0;
import p919o8.C18014u0;
import p919o8.C18017v0;
import p919o8.C18020w0;
import p919o8.C18029z0;
import p919o8.EnumC18026y0;

/* JADX INFO: renamed from: e8.V */
/* JADX INFO: loaded from: classes.dex */
public final class C13311V extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C13315Z f42125Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11689a f42126Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f42127o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13328l f42128p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f42129q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ LinkedHashMap f42130r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13311V(C13315Z c13315z, C11689a c11689a, long j10, C13328l c13328l, boolean z6, LinkedHashMap linkedHashMap) {
        super(1);
        this.f42125Y = c13315z;
        this.f42126Z = c11689a;
        this.f42127o0 = j10;
        this.f42128p0 = c13328l;
        this.f42129q0 = z6;
        this.f42130r0 = linkedHashMap;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        List listM9974d;
        int i10;
        int i11;
        int i12;
        String str;
        C11682a datadogContext = (C11682a) obj;
        AbstractC16544l.m18094g(datadogContext, "datadogContext");
        C13315Z c13315z = this.f42125Y;
        C7591u c7591u = c13315z.f42191j;
        C11689a c11689a = this.f42126Z;
        String str2 = c11689a.f35460d;
        boolean zM7938M = C7591u.m7938M(datadogContext, str2 == null ? "" : str2);
        String str3 = c11689a.f35464h;
        C17892E0 c17892e0 = (str3 == null || AbstractC21322p.m21681O(str3) || (str = c11689a.f35465i) == null || AbstractC21322p.m21681O(str)) ? null : new C17892E0(str3, str, null);
        int i13 = c17892e0 == null ? 1 : 2;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        C13328l c13328l = this.f42128p0;
        long millis = timeUnit.toMillis(c13328l.f42292b);
        int i14 = i13;
        long j10 = this.f42127o0 - millis;
        C18029z0 c18029z0 = new C18029z0(null, c13328l.f42292b, Boolean.valueOf(this.f42129q0));
        String str4 = c11689a.f35463g;
        C17987l0 c17987l0 = str4 != null ? new C17987l0(AbstractC9393x3.m9974d(str4)) : null;
        if (str2 == null) {
            str2 = "";
        }
        String str5 = c11689a.f35462f;
        C17883B0 c17883b0 = new C17883B0(str2, null, str5 != null ? str5 : "", c11689a.f35461e);
        C11688g c11688g = datadogContext.f35421m;
        C17895F0 c17895f0 = AbstractC9144I.m9689a(c11688g) ? new C17895F0(c11688g.f35452a, c11688g.f35453b, c11688g.f35454c, AbstractC17659D.m19256r(c11688g.f35455d)) : null;
        C11685d c11685d = datadogContext.f35419k;
        AbstractC16544l.m18094g(c11685d, "<this>");
        int i15 = AbstractC8111i5.m8590a(c11685d) ? 1 : 2;
        switch (AbstractC0010F.m24h(c11685d.f35439a)) {
            case 0:
                listM9974d = C17689w.f56480Y;
                break;
            case 1:
                listM9974d = AbstractC9393x3.m9974d(EnumC18026y0.ETHERNET);
                break;
            case 2:
                listM9974d = AbstractC9393x3.m9974d(EnumC18026y0.WIFI);
                break;
            case 3:
                listM9974d = AbstractC9393x3.m9974d(EnumC18026y0.WIMAX);
                break;
            case 4:
                listM9974d = AbstractC9393x3.m9974d(EnumC18026y0.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listM9974d = AbstractC9393x3.m9974d(EnumC18026y0.CELLULAR);
                break;
            case 11:
                listM9974d = AbstractC9393x3.m9974d(EnumC18026y0.OTHER);
                break;
            default:
                throw new C0644w();
        }
        String str6 = c11685d.f35440b;
        String str7 = c11685d.f35445g;
        int i16 = 0;
        C18002q0 c18002q0 = new C18002q0(i15, listM9974d, 0, (str7 == null && str6 == null) ? null : new C17993n0(str7, str6));
        C17990m0 c17990m0 = new C17990m0(c11689a.f35457a);
        C17880A0 c17880a0 = new C17880A0(i14, Boolean.valueOf(zM7938M), c11689a.f35458b);
        InterfaceC11256c internalLogger = c13315z.f42183b.mo15463s();
        String source = datadogContext.f35415g;
        AbstractC16544l.m18094g(source, "source");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        try {
            int[] iArrM27k = AbstractC0010F.m27k(8);
            int length = iArrM27k.length;
            while (true) {
                if (i16 >= length) {
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                int i17 = iArrM27k[i16];
                if (AbstractC17962d.m19655p(i17).equals(source)) {
                    i10 = i17;
                } else {
                    i16++;
                }
            }
        } catch (NoSuchElementException e10) {
            AbstractC7889G0.m8184b(internalLogger, 5, EnumC11255b.f34098Y, new C0846c(source, 14), e10, false, 48);
            i10 = 0;
        }
        C11683b c11683b = datadogContext.f35420l;
        C17886C0 c17886c0 = new C17886C0(c11683b.f35430f, c11683b.f35432h, null, c11683b.f35431g);
        EnumC11684c enumC11684c = c11683b.f35428d;
        AbstractC16544l.m18094g(enumC11684c, "<this>");
        int iOrdinal = enumC11684c.ordinal();
        if (iOrdinal == 0) {
            i11 = 1;
        } else if (iOrdinal == 1) {
            i11 = 3;
        } else if (iOrdinal != 2) {
            i11 = iOrdinal != 3 ? 7 : 2;
        } else {
            i11 = 4;
        }
        C18020w0 c18020w0 = new C18020w0(i11, c11683b.f35425a, c11683b.f35427c, c11683b.f35426b, c11683b.f35433i);
        C18011t0 c18011t0 = new C18011t0(this.f42130r0);
        int i18 = c11689a.f35470n;
        AbstractC14376f.m15825D(i18, "<this>");
        switch (AbstractC0010F.m24h(i18)) {
            case 0:
                i12 = 1;
                break;
            case 1:
                i12 = 2;
                break;
            case 2:
                i12 = 3;
                break;
            case 3:
                i12 = 4;
                break;
            case 4:
                i12 = 5;
                break;
            case 5:
                i12 = 6;
                break;
            case 6:
                i12 = 7;
                break;
            default:
                throw new C0644w();
        }
        return new C17901H0(j10, c17990m0, datadogContext.f35411c, datadogContext.f35413e, null, null, c17880a0, i10, c17883b0, c17895f0, c18002q0, null, c17892e0, null, c17886c0, c18020w0, new C18014u0(new C18017v0(null, i12), new C17999p0(Float.valueOf(c13315z.f42193l), null), null, null), c18011t0, c17987l0, null, c18029z0);
    }
}
