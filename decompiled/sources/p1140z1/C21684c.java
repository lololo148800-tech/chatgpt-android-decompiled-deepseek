package p1140z1;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.p650ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.InterfaceC17302e;
import p013Ab.C0420b;
import p045Bj.C1313k;
import p1000s0.AbstractC19397F;
import p1014t1.AbstractC19736m;
import p1014t1.C19729f;
import p1014t1.C19738o;
import p1014t1.C19741r;
import p1014t1.C19742s;
import p1014t1.EnumC19730g;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21063Q;
import p1095x1.InterfaceC21066U;
import p1095x1.InterfaceC21098s;
import p1095x1.InterfaceC21102w;
import p1117y1.C21361a;
import p1117y1.C21362b;
import p1117y1.C21364d;
import p1117y1.C21368h;
import p1117y1.InterfaceC21363c;
import p1117y1.InterfaceC21365e;
import p1117y1.InterfaceC21366f;
import p1117y1.InterfaceC21367g;
import p156G1.C2954a;
import p156G1.C2963j;
import p156G1.C2974u;
import p156G1.InterfaceC2964k;
import p392Q0.C6546d;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8005U5;
import p523V9.AbstractC8111i5;
import p571X9.AbstractC9113C4;
import p635a1.AbstractC10458p;
import p635a1.InterfaceC10457o;
import p715e1.InterfaceC13255a;
import p715e1.InterfaceC13259e;
import p737f1.EnumC13525q;
import p737f1.InterfaceC13511c;
import p737f1.InterfaceC13517i;
import p737f1.InterfaceC13520l;
import p737f1.InterfaceC13523o;
import p936p0.C18275o;
import p936p0.C18280t;
import p977r0.C18852x;

/* JADX INFO: renamed from: z1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C21684c extends AbstractC10458p implements InterfaceC21718w, InterfaceC21708o, InterfaceC21701k0, InterfaceC21697i0, InterfaceC21365e, InterfaceC21367g, InterfaceC21693g0, InterfaceC21717v, InterfaceC21710p, InterfaceC13511c, InterfaceC13520l, InterfaceC13523o, InterfaceC21689e0, InterfaceC13255a {

    /* JADX INFO: renamed from: A0 */
    public C21361a f68826A0;

    /* JADX INFO: renamed from: B0 */
    public HashSet f68827B0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC10457o f68828z0;

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: B */
    public final void mo424B(C2963j c2963j) {
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        AbstractC16544l.m18092e(interfaceC10457o, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        C2963j c2963jMo3788v0 = ((InterfaceC2964k) interfaceC10457o).mo3788v0();
        AbstractC16544l.m18092e(c2963j, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        if (c2963jMo3788v0.f8881Z) {
            c2963j.f8881Z = true;
        }
        if (c2963jMo3788v0.f8882o0) {
            c2963j.f8882o0 = true;
        }
        for (Map.Entry entry : c2963jMo3788v0.f8880Y.entrySet()) {
            C2974u c2974u = (C2974u) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = c2963j.f8880Y;
            if (!linkedHashMap.containsKey(c2974u)) {
                linkedHashMap.put(c2974u, value);
            } else if (value instanceof C2954a) {
                Object obj = linkedHashMap.get(c2974u);
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C2954a c2954a = (C2954a) obj;
                String str = c2954a.f8837a;
                if (str == null) {
                    str = ((C2954a) value).f8837a;
                }
                InterfaceC17302e interfaceC17302e = c2954a.f8838b;
                if (interfaceC17302e == null) {
                    interfaceC17302e = ((C2954a) value).f8838b;
                }
                linkedHashMap.put(c2974u, new C2954a(str, interfaceC17302e));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: C */
    public final void mo15560C(C19729f c19729f, EnumC19730g enumC19730g, long j10) {
        boolean z6;
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        AbstractC16544l.m18092e(interfaceC10457o, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        C0420b c0420b = ((C19742s) interfaceC10457o).f62510p0;
        ?? r11 = c19729f.f62460a;
        C19742s c19742s = (C19742s) c0420b.f1383p0;
        if (c19742s.f62509o0) {
            z6 = true;
            break;
        }
        int size = r11.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z6 = false;
                break;
            }
            C19738o c19738o = (C19738o) r11.get(i10);
            if (AbstractC19736m.m20679a(c19738o) || AbstractC19736m.m20681c(c19738o)) {
                z6 = true;
                break;
            }
            i10++;
        }
        int i11 = c0420b.f1381Z;
        EnumC19730g enumC19730g2 = EnumC19730g.f62467o0;
        if (i11 != 3) {
            if (enumC19730g == EnumC19730g.f62465Y && z6) {
                c0420b.m1055k(c19729f);
            }
            if (enumC19730g == enumC19730g2 && !z6) {
                c0420b.m1055k(c19729f);
            }
        }
        if (enumC19730g == enumC19730g2) {
            int size2 = r11.size();
            for (int i12 = 0; i12 < size2; i12++) {
                if (!AbstractC19736m.m20681c((C19738o) r11.get(i12))) {
                    return;
                }
            }
            c0420b.f1381Z = 1;
            c19742s.f62509o0 = false;
        }
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        m22192K0(true);
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: D */
    public final void mo15561D() {
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        AbstractC16544l.m18092e(interfaceC10457o, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        C0420b c0420b = ((C19742s) interfaceC10457o).f62510p0;
        if (c0420b.f1381Z == 2) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            C19742s c19742s = (C19742s) c0420b.f1383p0;
            C19741r c19741r = new C19741r(c19742s, 1);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            c19741r.invoke(motionEventObtain);
            motionEventObtain.recycle();
            c0420b.f1381Z = 1;
            c19742s.f62509o0 = false;
        }
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        m22193L0();
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean mo425E() {
        return false;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m22192K0(boolean z6) {
        if (!this.f30972y0) {
            AbstractC8111i5.m8592c("initializeModifier called on unattached node");
            throw null;
        }
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        if ((this.f30962o0 & 32) != 0) {
            if (interfaceC10457o instanceof InterfaceC21363c) {
                C21682b c21682b = new C21682b(this, 0);
                C6546d c6546d = ((AndroidComposeView) AbstractC21690f.m22218w(this)).f32753B1;
                if (!c6546d.m7105j(c21682b)) {
                    c6546d.m7099c(c21682b);
                }
            }
            if (interfaceC10457o instanceof InterfaceC21366f) {
                InterfaceC21366f interfaceC21366f = (InterfaceC21366f) interfaceC10457o;
                C21361a c21361a = this.f68826A0;
                if (c21361a == null || !c21361a.mo8311b(interfaceC21366f.getKey())) {
                    C21361a c21361a2 = new C21361a();
                    c21361a2.f67834b = interfaceC21366f;
                    this.f68826A0 = c21361a2;
                    if (AbstractC21690f.m22199d(this)) {
                        C21364d modifierLocalManager = AbstractC21690f.m22218w(this).getModifierLocalManager();
                        C21368h key = interfaceC21366f.getKey();
                        modifierLocalManager.f67837b.m7099c(this);
                        modifierLocalManager.f67838c.m7099c(key);
                        modifierLocalManager.m21756a();
                    }
                } else {
                    c21361a.f67834b = interfaceC21366f;
                    C21364d modifierLocalManager2 = AbstractC21690f.m22218w(this).getModifierLocalManager();
                    C21368h key2 = interfaceC21366f.getKey();
                    modifierLocalManager2.f67837b.m7099c(this);
                    modifierLocalManager2.f67838c.m7099c(key2);
                    modifierLocalManager2.m21756a();
                }
            }
        }
        if ((this.f30962o0 & 4) != 0 && !z6) {
            AbstractC21690f.m22215t(this, 2).m22165P0();
        }
        if ((this.f30962o0 & 2) != 0) {
            if (AbstractC21690f.m22199d(this)) {
                AbstractC21678Y abstractC21678Y = this.f30967t0;
                AbstractC16544l.m18091d(abstractC21678Y);
                ((C21720y) abstractC21678Y).m22230h1(this);
                InterfaceC21687d0 interfaceC21687d0 = abstractC21678Y.f68817P0;
                if (interfaceC21687d0 != null) {
                    interfaceC21687d0.invalidate();
                }
            }
            if (!z6) {
                AbstractC21690f.m22215t(this, 2).m22165P0();
                AbstractC21690f.m22217v(this).m22019Q();
            }
        }
        if (interfaceC10457o instanceof C18275o) {
            C18275o c18275o = (C18275o) interfaceC10457o;
            C21658D c21658dM22217v = AbstractC21690f.m22217v(this);
            switch (c18275o.f58329Y) {
                case 0:
                    ((C18280t) c18275o.f58330Z).f58355k = c21658dM22217v;
                    break;
                case 1:
                    ((C18852x) c18275o.f58330Z).f60047f = c21658dM22217v;
                    break;
                default:
                    ((AbstractC19397F) c18275o.f58330Z).f61460w.setValue(c21658dM22217v);
                    break;
            }
        }
        if ((this.f30962o0 & 256) != 0 && (interfaceC10457o instanceof InterfaceC21063Q) && AbstractC21690f.m22199d(this)) {
            AbstractC21690f.m22217v(this).m22019Q();
        }
        int i10 = this.f30962o0;
        if ((i10 & 16) != 0 && (interfaceC10457o instanceof C19742s)) {
            ((C19742s) interfaceC10457o).f62510p0.f1382o0 = this.f30967t0;
        }
        if ((i10 & 8) != 0) {
            ((AndroidComposeView) AbstractC21690f.m22218w(this)).m11330A();
        }
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: L */
    public final void mo427L() {
        AbstractC21690f.m22209n(this);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m22193L0() {
        if (!this.f30972y0) {
            AbstractC8111i5.m8592c("unInitializeModifier called on unattached node");
            throw null;
        }
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        if ((this.f30962o0 & 32) != 0) {
            if (interfaceC10457o instanceof InterfaceC21366f) {
                C21364d modifierLocalManager = AbstractC21690f.m22218w(this).getModifierLocalManager();
                C21368h key = ((InterfaceC21366f) interfaceC10457o).getKey();
                modifierLocalManager.f67839d.m7099c(AbstractC21690f.m22217v(this));
                modifierLocalManager.f67840e.m7099c(key);
                modifierLocalManager.m21756a();
            }
            if (interfaceC10457o instanceof InterfaceC21363c) {
                ((InterfaceC21363c) interfaceC10457o).mo19471p(AbstractC21690f.f68846a);
            }
        }
        if ((this.f30962o0 & 8) != 0) {
            ((AndroidComposeView) AbstractC21690f.m22218w(this)).m11330A();
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m22194M0() {
        if (this.f30972y0) {
            this.f68827B0.clear();
            AbstractC21690f.m22218w(this).getSnapshotObserver().m22222a(this, C21688e.f68832Z, new C21682b(this, 1));
        }
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: N */
    public final void mo15563N() {
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        AbstractC16544l.m18092e(interfaceC10457o, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
    }

    @Override // p1117y1.InterfaceC21365e
    /* JADX INFO: renamed from: S */
    public final AbstractC8005U5 mo15081S() {
        C21361a c21361a = this.f68826A0;
        return c21361a != null ? c21361a : C21362b.f67835b;
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: T */
    public final void mo15564T() {
        mo15561D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // p1117y1.InterfaceC21365e, p1117y1.InterfaceC21367g
    /* JADX INFO: renamed from: a */
    public final Object mo15082a(C21368h c21368h) {
        C1313k c1313k;
        this.f68827B0.add(c21368h);
        AbstractC10458p abstractC10458p = this.f30960Y;
        if (!abstractC10458p.f30972y0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30964q0;
        C21658D c21658dM22217v = AbstractC21690f.m22217v(this);
        while (c21658dM22217v != null) {
            if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 32) != 0) {
                while (abstractC10458p2 != null) {
                    if ((abstractC10458p2.f30962o0 & 32) != 0) {
                        ?? M22201f = abstractC10458p2;
                        ?? c6546d = 0;
                        while (M22201f != 0) {
                            if (M22201f instanceof InterfaceC21365e) {
                                InterfaceC21365e interfaceC21365e = (InterfaceC21365e) M22201f;
                                if (interfaceC21365e.mo15081S().mo8311b(c21368h)) {
                                    return interfaceC21365e.mo15081S().mo8312c(c21368h);
                                }
                            } else if ((M22201f.f30962o0 & 32) != 0 && (M22201f instanceof AbstractC21706n)) {
                                AbstractC10458p abstractC10458p3 = ((AbstractC21706n) M22201f).f68881A0;
                                int i10 = 0;
                                M22201f = M22201f;
                                c6546d = c6546d;
                                while (abstractC10458p3 != null) {
                                    if ((abstractC10458p3.f30962o0 & 32) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            c6546d = c6546d;
                                            M22201f = abstractC10458p3;
                                        } else {
                                            if (c6546d == 0) {
                                                c6546d = new C6546d(new AbstractC10458p[16]);
                                            }
                                            if (M22201f != 0) {
                                                c6546d.m7099c(M22201f);
                                                M22201f = 0;
                                            }
                                            c6546d.m7099c(abstractC10458p3);
                                        }
                                    }
                                    abstractC10458p3 = abstractC10458p3.f30965r0;
                                    M22201f = M22201f;
                                    c6546d = c6546d;
                                }
                                if (i10 == 1) {
                                }
                            }
                            M22201f = AbstractC21690f.m22201f(c6546d);
                        }
                    }
                    abstractC10458p2 = abstractC10458p2.f30964q0;
                }
            }
            c21658dM22217v = c21658dM22217v.m22009G();
            abstractC10458p2 = (c21658dM22217v == null || (c1313k = c21658dM22217v.f68638I0) == null) ? null : (C21703l0) c1313k.f3470e;
        }
        return c21368h.f67842a.invoke();
    }

    @Override // p1140z1.InterfaceC21693g0
    /* JADX INFO: renamed from: b */
    public final Object mo19470b(InterfaceC7537b interfaceC7537b, Object obj) {
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        AbstractC16544l.m18092e(interfaceC10457o, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((InterfaceC21066U) interfaceC10457o).mo10940b(interfaceC7537b, obj);
    }

    @Override // p1140z1.InterfaceC21710p
    /* JADX INFO: renamed from: c */
    public final void mo2143c(AbstractC21678Y abstractC21678Y) {
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        AbstractC16544l.m18092e(interfaceC10457o, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((InterfaceC21063Q) interfaceC10457o).mo429c(abstractC21678Y);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        AbstractC16544l.m18092e(interfaceC10457o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC21102w) interfaceC10457o).mo2446d(abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(C21660F c21660f) {
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        AbstractC16544l.m18092e(interfaceC10457o, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((InterfaceC13259e) interfaceC10457o).mo14858e(c21660f);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        AbstractC16544l.m18092e(interfaceC10457o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC21102w) interfaceC10457o).mo2447f(interfaceC21059M, interfaceC21056J, j10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        AbstractC16544l.m18092e(interfaceC10457o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC21102w) interfaceC10457o).mo2448g(abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p737f1.InterfaceC13520l
    /* JADX INFO: renamed from: g0 */
    public final void mo9604g0(InterfaceC13517i interfaceC13517i) {
        AbstractC8111i5.m8592c("applyFocusProperties called on wrong node");
        throw null;
    }

    @Override // p715e1.InterfaceC13255a
    public final InterfaceC7537b getDensity() {
        return AbstractC21690f.m22217v(this).f68633D0;
    }

    @Override // p715e1.InterfaceC13255a
    public final EnumC7546k getLayoutDirection() {
        return AbstractC21690f.m22217v(this).f68634E0;
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        AbstractC16544l.m18092e(interfaceC10457o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC21102w) interfaceC10457o).mo2449h(abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p715e1.InterfaceC13255a
    /* JADX INFO: renamed from: i */
    public final long mo14854i() {
        return AbstractC9113C4.m9645c(AbstractC21690f.m22215t(this, 128).f66983o0);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        AbstractC16544l.m18092e(interfaceC10457o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC21102w) interfaceC10457o).mo2450k(abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: q0 */
    public final boolean mo15565q0() {
        InterfaceC10457o interfaceC10457o = this.f68828z0;
        AbstractC16544l.m18092e(interfaceC10457o, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C19742s) interfaceC10457o).f62510p0.getClass();
        return true;
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: s0 */
    public final void mo15566s0() {
        mo15561D();
    }

    public final String toString() {
        return this.f68828z0.toString();
    }

    @Override // p1140z1.InterfaceC21689e0
    /* JADX INFO: renamed from: u */
    public final boolean mo874u() {
        return this.f30972y0;
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean mo432u0() {
        return false;
    }

    @Override // p737f1.InterfaceC13511c
    /* JADX INFO: renamed from: y */
    public final void mo15025y(EnumC13525q enumC13525q) {
        AbstractC8111i5.m8592c("onFocusEvent called on wrong node");
        throw null;
    }

    @Override // p1140z1.InterfaceC21717v
    /* JADX INFO: renamed from: l0 */
    public final void mo11280l0(InterfaceC21098s interfaceC21098s) {
    }

    @Override // p1140z1.InterfaceC21717v
    /* JADX INFO: renamed from: q */
    public final void mo11281q(long j10) {
    }
}
