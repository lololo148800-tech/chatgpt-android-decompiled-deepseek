package p1140z1;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1039ud.C20198o;
import p1095x1.AbstractC21069X;
import p1095x1.AbstractC21076c;
import p1095x1.C21094o;
import p523V9.AbstractC8088f6;
import p759g1.C13800b;
import p774h1.C14336N;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: z1.E */
/* JADX INFO: loaded from: classes.dex */
public final class C21659E {

    /* JADX INFO: renamed from: a */
    public final AbstractC21069X f68664a;

    /* JADX INFO: renamed from: c */
    public boolean f68666c;

    /* JADX INFO: renamed from: d */
    public boolean f68667d;

    /* JADX INFO: renamed from: e */
    public boolean f68668e;

    /* JADX INFO: renamed from: f */
    public boolean f68669f;

    /* JADX INFO: renamed from: g */
    public boolean f68670g;

    /* JADX INFO: renamed from: h */
    public InterfaceC21680a f68671h;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f68673j;

    /* JADX INFO: renamed from: b */
    public boolean f68665b = true;

    /* JADX INFO: renamed from: i */
    public final HashMap f68672i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public C21659E(InterfaceC21680a interfaceC21680a, int i10) {
        this.f68673j = i10;
        this.f68664a = (AbstractC21069X) interfaceC21680a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Bm.n, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r8v5, types: [x1.X, z1.a] */
    /* JADX INFO: renamed from: a */
    public static final void m22072a(C21659E c21659e, C21094o c21094o, int i10, AbstractC21678Y abstractC21678Y) {
        c21659e.getClass();
        float f10 = i10;
        long jM8536b = AbstractC8088f6.m8536b(f10, f10);
        while (true) {
            switch (c21659e.f68673j) {
                case 0:
                    C14336N c14336n = AbstractC21678Y.f68797R0;
                    jM8536b = abstractC21678Y.m22176b1(jM8536b, true);
                    break;
                default:
                    AbstractC21669O abstractC21669OMo22157H0 = abstractC21678Y.mo22157H0();
                    AbstractC16544l.m18091d(abstractC21669OMo22157H0);
                    long j10 = abstractC21669OMo22157H0.f68766y0;
                    jM8536b = C13800b.m15311l(AbstractC8088f6.m8536b((int) (j10 >> 32), (int) (j10 & 4294967295L)), jM8536b);
                    break;
            }
            abstractC21678Y = abstractC21678Y.f68821z0;
            AbstractC16544l.m18091d(abstractC21678Y);
            if (abstractC21678Y.equals(c21659e.f68664a.mo22090f())) {
                int iRound = Math.round(c21094o instanceof C21094o ? C13800b.m15307h(jM8536b) : C13800b.m15306g(jM8536b));
                HashMap map = c21659e.f68672i;
                if (map.containsKey(c21094o)) {
                    int iIntValue = ((Number) AbstractC17659D.m19243e(map, c21094o)).intValue();
                    C21094o c21094o2 = AbstractC21076c.f66994a;
                    iRound = ((Number) c21094o.f67022a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                }
                map.put(c21094o, Integer.valueOf(iRound));
                return;
            }
            if (c21659e.m22073b(abstractC21678Y).containsKey(c21094o)) {
                float fM22074c = c21659e.m22074c(abstractC21678Y, c21094o);
                jM8536b = AbstractC8088f6.m8536b(fM22074c, fM22074c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final Map m22073b(AbstractC21678Y abstractC21678Y) {
        switch (this.f68673j) {
            case 0:
                return abstractC21678Y.mo22123n0().mo19805a();
            default:
                AbstractC21669O abstractC21669OMo22157H0 = abstractC21678Y.mo22157H0();
                AbstractC16544l.m18091d(abstractC21669OMo22157H0);
                return abstractC21669OMo22157H0.mo22123n0().mo19805a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m22074c(AbstractC21678Y abstractC21678Y, C21094o c21094o) {
        switch (this.f68673j) {
            case 0:
                return abstractC21678Y.mo21547H(c21094o);
            default:
                AbstractC21669O abstractC21669OMo22157H0 = abstractC21678Y.mo22157H0();
                AbstractC16544l.m18091d(abstractC21669OMo22157H0);
                return abstractC21669OMo22157H0.mo21547H(c21094o);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m22075d() {
        return this.f68666c || this.f68668e || this.f68669f || this.f68670g;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m22076e() {
        m22079h();
        return this.f68671h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [x1.X, z1.a] */
    /* JADX INFO: renamed from: f */
    public final void m22077f() {
        this.f68665b = true;
        ?? r6 = this.f68664a;
        InterfaceC21680a interfaceC21680aMo22091g = r6.mo22091g();
        if (interfaceC21680aMo22091g == null) {
            return;
        }
        if (this.f68666c) {
            interfaceC21680aMo22091g.mo22085E();
        } else if (this.f68668e || this.f68667d) {
            interfaceC21680aMo22091g.requestLayout();
        }
        if (this.f68669f) {
            r6.mo22085E();
        }
        if (this.f68670g) {
            r6.requestLayout();
        }
        interfaceC21680aMo22091g.mo22087a().m22077f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [x1.X, z1.a] */
    /* JADX INFO: renamed from: g */
    public final void m22078g() {
        HashMap map = this.f68672i;
        map.clear();
        C20198o c20198o = new C20198o(this, 16);
        ?? r6 = this.f68664a;
        r6.mo22088c(c20198o);
        map.putAll(m22073b(r6.mo22090f()));
        this.f68665b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [x1.X, z1.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [z1.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: h */
    public final void m22079h() {
        InterfaceC21680a interfaceC21680a;
        C21659E c21659eMo22087a;
        C21659E c21659eMo22087a2;
        boolean zM22075d = m22075d();
        ?? r6 = this.f68664a;
        ?? r10 = r6;
        if (!zM22075d) {
            InterfaceC21680a interfaceC21680aMo22091g = r6.mo22091g();
            if (interfaceC21680aMo22091g == null) {
                return;
            }
            interfaceC21680a = interfaceC21680aMo22091g.mo22087a().f68671h;
            if (interfaceC21680a == null || !interfaceC21680a.mo22087a().m22075d()) {
                r10 = interfaceC21680a;
                InterfaceC21680a interfaceC21680a2 = this.f68671h;
                if (interfaceC21680a2 == null || interfaceC21680a2.mo22087a().m22075d()) {
                    return;
                }
                InterfaceC21680a interfaceC21680aMo22091g2 = interfaceC21680a2.mo22091g();
                if (interfaceC21680aMo22091g2 != null && (c21659eMo22087a2 = interfaceC21680aMo22091g2.mo22087a()) != null) {
                    c21659eMo22087a2.m22079h();
                }
                InterfaceC21680a interfaceC21680aMo22091g3 = interfaceC21680a2.mo22091g();
                r10 = (interfaceC21680aMo22091g3 == null || (c21659eMo22087a = interfaceC21680aMo22091g3.mo22087a()) == null) ? 0 : c21659eMo22087a.f68671h;
            }
        }
        r10 = interfaceC21680a;
        this.f68671h = r10;
    }
}
