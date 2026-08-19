package p988rc;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1071w0.C20733W;
import p204I1.C3590f;
import p204I1.C3606v;
import p278L0.C4867c0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p492U1.C7536a;
import p492U1.C7545j;
import p492U1.InterfaceC7537b;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9388w4;
import p909nm.AbstractC17660E;
import p911o0.C17786u;
import p946pc.AbstractC18319D;
import p946pc.C18320E;

/* JADX INFO: renamed from: rc.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C18933u extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Map f60410Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18320E f60411Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3590f f60412o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f60413p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f60414q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f60415r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC1436k f60416s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C3590f f60417t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C18929q f60418u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18933u(Map map, C18320E c18320e, C3590f c3590f, boolean z6, int i10, int i11, InterfaceC1436k interfaceC1436k, C3590f c3590f2, C18929q c18929q) {
        super(3);
        this.f60410Y = map;
        this.f60411Z = c18320e;
        this.f60412o0 = c3590f;
        this.f60413p0 = z6;
        this.f60414q0 = i10;
        this.f60415r0 = i11;
        this.f60416s0 = interfaceC1436k;
        this.f60417t0 = c3590f2;
        this.f60418u0 = c18929q;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C5975S c5975s;
        C17786u BoxWithConstraints = (C17786u) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((iIntValue & 14) == 0) {
            iIntValue |= c6021p.m6542f(BoxWithConstraints) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Map map = this.f60410Y;
            c6021p.m6525T(1382998036);
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(map.size()));
            Iterator it = map.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c5975s = C6013l.f19514a;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                C18913a c18913a = (C18913a) entry.getValue();
                long j10 = BoxWithConstraints.f56763b;
                long jM9959b = AbstractC9388w4.m9959b(C7536a.m7854i(j10), C7536a.m7853h(j10), 5);
                c6021p.m6525T(-1990137059);
                c6021p.m6525T(-492369756);
                Object objM6514H = c6021p.m6514H();
                if (objM6514H == c5975s) {
                    InterfaceC1436k interfaceC1436k = c18913a.f60349b;
                    objM6514H = C5997d.m6430Q(interfaceC1436k != null ? (C7545j) interfaceC1436k.invoke(interfaceC7537b) : null, C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
                C7545j c7545j = (C7545j) interfaceC5985X.getValue();
                long jMo7859F = c7545j != null ? interfaceC7537b.mo7859F((int) (c7545j.f23903a >> 32)) : AbstractC9119D4.m9650c(0);
                C7545j c7545j2 = (C7545j) interfaceC5985X.getValue();
                c6021p = c6021p;
                C20733W c20733w = new C20733W(new C3606v(jMo7859F, c18913a.f60350c, c7545j2 != null ? interfaceC7537b.mo7859F((int) (c7545j2.f23903a & 4294967295L)) : AbstractC9119D4.m9650c(1)), AbstractC8411c.m8968b(-877544637, c6021p, new C4867c0(jM9959b, interfaceC5985X, c18913a, interfaceC7537b)));
                c6021p.m6553p(false);
                linkedHashMap.put(key, c20733w);
                it = it;
                BoxWithConstraints = BoxWithConstraints;
            }
            c6021p.m6553p(false);
            c6021p.m6525T(648277187);
            C3590f c3590f = this.f60417t0;
            boolean zM6542f = c6021p.m6542f(c3590f);
            C18929q c18929q = this.f60418u0;
            boolean zM6542f2 = zM6542f | c6021p.m6542f(c18929q);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == c5975s) {
                objM6514H2 = new C18932t(c3590f, c18929q, 0);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6525T(648277879);
            boolean zM6542f3 = c6021p.m6542f(c3590f) | c6021p.m6542f(c18929q);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f3 || objM6514H3 == c5975s) {
                objM6514H3 = new C18932t(c3590f, c18929q, 1);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC18319D.m19842a(this.f60411Z, this.f60412o0, null, this.f60413p0, this.f60414q0, this.f60415r0, this.f60416s0, linkedHashMap, interfaceC1436k2, (InterfaceC1436k) objM6514H3, c6021p, 16777216);
        }
        return C17296C.f55119a;
    }
}
