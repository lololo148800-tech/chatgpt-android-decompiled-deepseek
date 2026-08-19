package p193Hf;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p016Ae.C0452n;
import p1113xn.C21319m;
import p1126yd.C21501u0;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p195Hh.C3430e;
import p324Mn.C5551u;
import p479Td.C7320F;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p787he.C14459O;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;
import p909nm.C17690x;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import ye.C21514c;
import ye.C21523l;
import ye.EnumC21524m;

/* JADX INFO: renamed from: Hf.w1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3414w1 {

    /* JADX INFO: renamed from: a */
    public final C14459O f10397a;

    /* JADX INFO: renamed from: b */
    public final C0452n f10398b;

    /* JADX INFO: renamed from: c */
    public final C3430e f10399c = AbstractC8168p6.m8749b("TextdocRepository", null);

    /* JADX INFO: renamed from: d */
    public Object f10400d = C17690x.f56481Y;

    /* JADX INFO: renamed from: e */
    public C21319m f10401e;

    /* JADX INFO: renamed from: f */
    public String f10402f;

    public C3414w1(C14459O c14459o, C0452n c0452n) {
        this.f10397a = c14459o;
        this.f10398b = c0452n;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m4183a(C3414w1 c3414w1, String str, AbstractC19687c abstractC19687c) {
        C3381l1 c3381l1;
        c3414w1.getClass();
        if (abstractC19687c instanceof C3381l1) {
            c3381l1 = (C3381l1) abstractC19687c;
            int i10 = c3381l1.f10316p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3381l1.f10316p0 = i10 - Integer.MIN_VALUE;
            } else {
                c3381l1 = new C3381l1(c3414w1, abstractC19687c);
            }
        } else {
            c3381l1 = new C3381l1(c3414w1, abstractC19687c);
        }
        Object objM1100h = c3381l1.f10314Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3381l1.f10316p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM1100h);
            c3381l1.f10313Y = c3414w1;
            c3381l1.f10316p0 = 1;
            objM1100h = c3414w1.f10398b.m1100h(str, c3381l1);
            if (objM1100h == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3414w1 = c3381l1.f10313Y;
            AbstractC9233X.m9807c(objM1100h);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM1100h;
        if (!AbstractC16544l.m18089b(abstractC21955Q1, C21929J1.f69476a) && !(abstractC21955Q1 instanceof AbstractC21933K1) && (abstractC21955Q1 instanceof C21952P1)) {
            Iterable<C21501u0> iterable = (Iterable) ((C21952P1) abstractC21955Q1).f69511a;
            int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(iterable, 10));
            if (iM19257b < 16) {
                iM19257b = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
            for (C21501u0 c21501u0 : iterable) {
                String value = c21501u0.f68118a;
                AbstractC16544l.m18094g(value, "value");
                C21514c c21514c = new C21514c(value);
                String value2 = c21501u0.f68118a;
                AbstractC16544l.m18094g(value2, "value");
                C7320F c7320f = new C7320F(14, c21501u0.f68122e, null, false, false);
                C5551u.Companion.getClass();
                linkedHashMap.put(c21514c, new C21523l(value2, c21501u0.f68119b, null, c21501u0.f68120c, c21501u0.f68121d, c7320f, C5551u.f18000Z, EnumC21524m.f68166p0));
            }
            c3414w1.f10400d = linkedHashMap;
        }
        return C17296C.f55119a;
    }
}
