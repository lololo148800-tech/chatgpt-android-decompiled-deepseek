package p722e8;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p499U9.C7591u;
import p523V9.AbstractC8111i5;
import p571X9.AbstractC9144I;
import p592Y7.EnumC9668c;
import p676c7.C11682a;
import p676c7.C11683b;
import p676c7.C11688g;
import p677c8.C11689a;
import p909nm.AbstractC17659D;
import p919o8.C17882B;
import p919o8.C17885C;
import p919o8.C17891E;
import p919o8.C17897G;
import p919o8.C17953a;
import p919o8.C17956b;
import p919o8.C17959c;
import p919o8.C17965e;
import p919o8.C17968f;
import p919o8.C17977i;
import p919o8.C17989m;
import p919o8.C17992n;
import p919o8.C17995o;
import p919o8.C18004r;
import p919o8.C18007s;
import p919o8.C18013u;
import p919o8.C18016v;
import p919o8.C18022x;
import p919o8.C18025y;

/* JADX INFO: renamed from: e8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13319c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C13321e f42212Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11689a f42213Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC9668c f42214o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f42215p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f42216q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ long f42217r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ long f42218s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ long f42219t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ long f42220u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ ArrayList f42221v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ int f42222w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ LinkedHashMap f42223x0;

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ C17885C f42224y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13319c(C13321e c13321e, C11689a c11689a, EnumC9668c enumC9668c, String str, long j10, long j11, long j12, long j13, long j14, ArrayList arrayList, int i10, LinkedHashMap linkedHashMap, C17885C c17885c) {
        super(1);
        this.f42212Y = c13321e;
        this.f42213Z = c11689a;
        this.f42214o0 = enumC9668c;
        this.f42215p0 = str;
        this.f42216q0 = j10;
        this.f42217r0 = j11;
        this.f42218s0 = j12;
        this.f42219t0 = j13;
        this.f42220u0 = j14;
        this.f42221v0 = arrayList;
        this.f42222w0 = i10;
        this.f42223x0 = linkedHashMap;
        this.f42224y0 = c17885c;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int i10;
        C17891E c17891e;
        C11682a datadogContext = (C11682a) obj;
        AbstractC16544l.m18094g(datadogContext, "datadogContext");
        C13321e c13321e = this.f42212Y;
        C7591u c7591u = c13321e.f42231d;
        C11689a c11689a = this.f42213Z;
        String str = c11689a.f35460d;
        boolean zM7938M = C7591u.m7938M(datadogContext, str == null ? "" : str);
        EnumC9668c enumC9668c = this.f42214o0;
        AbstractC16544l.m18094g(enumC9668c, "<this>");
        int iOrdinal = enumC9668c.ordinal();
        int i11 = 3;
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal == 1) {
                i10 = 4;
            } else if (iOrdinal == 2) {
                i10 = 5;
            } else if (iOrdinal == 3) {
                i10 = 2;
            } else if (iOrdinal == 4) {
                i11 = 7;
                i10 = i11;
            } else if (iOrdinal != 5) {
                throw new C0644w();
            }
        } else {
            i10 = i11;
        }
        C17956b c17956b = new C17956b(this.f42215p0);
        C18013u c18013u = new C18013u(this.f42216q0);
        C17992n c17992n = new C17992n(this.f42217r0);
        C18022x c18022x = new C18022x(this.f42218s0);
        C17882B c17882b = new C17882B(this.f42219t0);
        long jMax = Math.max(this.f42220u0 - c13321e.f42240m, 1L);
        ArrayList arrayList = this.f42221v0;
        C17953a c17953a = new C17953a(i10, c13321e.f42237j, Long.valueOf(jMax), c17956b, !arrayList.isEmpty() ? new C18016v(arrayList) : null, c18013u, c17992n, c18022x, c17882b);
        String str2 = str == null ? "" : str;
        String str3 = c11689a.f35462f;
        C17965e c17965e = new C17965e(null, str2, null, str3 == null ? "" : str3, c11689a.f35461e);
        C17968f c17968f = new C17968f(c11689a.f35457a);
        C17959c c17959c = new C17959c(this.f42222w0, Boolean.valueOf(zM7938M), c11689a.f35458b);
        int iM8602m = AbstractC8111i5.m8602m(datadogContext.f35415g, c13321e.f42229b.mo15463s());
        C11688g c11688g = datadogContext.f35421m;
        if (AbstractC9144I.m9689a(c11688g)) {
            c17891e = new C17891E(c11688g.f35452a, c11688g.f35453b, c11688g.f35454c, AbstractC17659D.m19256r(c11688g.f35455d));
        } else {
            c17891e = null;
        }
        C11683b c11683b = datadogContext.f35420l;
        return new C17897G(c13321e.f42236i, c17968f, datadogContext.f35411c, datadogContext.f35413e, null, null, c17959c, iM8602m, c17965e, c17891e, AbstractC8111i5.m8594e(c13321e.f42242o), null, this.f42224y0, null, new C18025y(c11683b.f35430f, c11683b.f35432h, null, c11683b.f35431g), new C18007s(AbstractC8111i5.m8595f(c11683b.f35428d), c11683b.f35425a, c11683b.f35427c, c11683b.f35426b, c11683b.f35433i), new C17995o(new C18004r(null, AbstractC8111i5.m8596g(c11689a.f35470n)), new C17977i(Float.valueOf(c13321e.f42233f)), null, null), new C17989m(this.f42223x0), null, c17953a);
    }
}
