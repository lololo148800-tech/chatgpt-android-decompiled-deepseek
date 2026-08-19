package p984r8;

import io.sentry.internal.debugmeta.C15384c;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p035B7.C0846c;
import p1008s8.C19482k;
import p1008s8.C19483l;
import p1008s8.C19484m;
import p1008s8.C19485n;
import p1008s8.C19486o;
import p1008s8.C19487p;
import p1008s8.C19488q;
import p1008s8.C19489r;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8150n4;
import p592Y7.InterfaceC9672g;
import p658b5.C11234e;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p676c7.C11682a;
import p676c7.C11683b;
import p677c8.C11689a;
import p765g7.InterfaceC13823a;
import p849k7.C16361n;
import p861l1.xapn.suYVq;
import p909nm.AbstractC17659D;
import p909nm.C17690x;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: r8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18889c implements InterfaceC9672g {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC13823a f60216Y;

    /* JADX INFO: renamed from: Z */
    public final C11234e f60217Z;

    /* JADX INFO: renamed from: o0 */
    public final C11234e f60218o0;

    /* JADX INFO: renamed from: p0 */
    public final C15384c f60219p0;

    /* JADX INFO: renamed from: r0 */
    public boolean f60221r0;

    /* JADX INFO: renamed from: t0 */
    public int f60223t0;

    /* JADX INFO: renamed from: q0 */
    public final int f60220q0 = 100;

    /* JADX INFO: renamed from: s0 */
    public final LinkedHashSet f60222s0 = new LinkedHashSet();

    public C18889c(InterfaceC13823a interfaceC13823a, C11234e c11234e, C11234e c11234e2, C15384c c15384c) {
        this.f60216Y = interfaceC13823a;
        this.f60217Z = c11234e;
        this.f60218o0 = c11234e2;
        this.f60219p0 = c15384c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public static C11689a m20203b(C11682a c11682a) {
        Map map = (Map) c11682a.f35424p.get("rum");
        if (map == null) {
            map = C17690x.f56481Y;
        }
        String str = C11689a.f35456p;
        return AbstractC8150n4.m8689b(map);
    }

    @Override // p592Y7.InterfaceC9672g
    /* JADX INFO: renamed from: o */
    public final void mo10266o(String sessionId, boolean z6) {
        AbstractC16544l.m18094g(sessionId, "sessionId");
        this.f60222s0.clear();
        this.f60223t0 = 0;
    }

    /* JADX INFO: renamed from: a */
    public static final C19489r m20202a(C18889c c18889c, C11682a c11682a, long j10, String str, Map map) {
        C11689a c11689aM20203b = m20203b(c11682a);
        LinkedHashMap linkedHashMapM19256r = map != null ? AbstractC17659D.m19256r(map) : new LinkedHashMap();
        C16361n c16361n = new C16361n();
        InterfaceC11256c internalLogger = c18889c.f60216Y.mo15463s();
        String str2 = suYVq.VwAgELpouavEVO;
        String str3 = c11682a.f35415g;
        AbstractC16544l.m18094g(str3, str2);
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        int i10 = 0;
        try {
            int[] iArrM27k = AbstractC0010F.m27k(7);
            int length = iArrM27k.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                int i12 = iArrM27k[i11];
                if (AbstractC17792x.m19526i(i12).equals(str3)) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
        } catch (NoSuchElementException e10) {
            AbstractC7889G0.m8184b(internalLogger, 5, EnumC11255b.f34098Y, new C0846c(str3, 28), e10, false, 48);
        }
        int i13 = i10 == 0 ? 1 : i10;
        C19483l c19483l = new C19483l(c11689aM20203b.f35457a);
        C19486o c19486o = new C19486o(c11689aM20203b.f35458b);
        String str4 = c11689aM20203b.f35460d;
        C19488q c19488q = str4 != null ? new C19488q(str4) : null;
        String str5 = c11689aM20203b.f35463g;
        C19482k c19482k = str5 != null ? new C19482k(str5) : null;
        C11683b c11683b = c11682a.f35420l;
        return new C19489r(c16361n, j10, "dd-sdk-android", i13, c11682a.f35416h, c19483l, c19486o, c19488q, c19482k, null, new C19487p(new C19484m(c11683b.f35433i, c11683b.f35426b, c11683b.f35427c), new C19485n(c11683b.f35429e, c11683b.f35430f, c11683b.f35432h), str, linkedHashMapM19256r));
    }
}
