package p860l0;

import android.content.Context;
import android.view.ViewGroup;
import bf.C11349D;
import bf.InterfaceC11374b0;
import cd.C11709i;
import com.openai.chatgpt.R;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1436k;
import p1014t1.C19738o;
import p1039ud.C20198o;
import p1044uj.AbstractC20337g0;
import p1044uj.AbstractC20361s0;
import p1044uj.C20316S;
import p1044uj.C20329c0;
import p1044uj.C20336g;
import p1044uj.C20355p0;
import p1044uj.C20357q0;
import p1044uj.C20359r0;
import p1044uj.EnumC20335f0;
import p1066vk.C20642j;
import p1071w0.C20709G;
import p1071w0.C20710G0;
import p1071w0.C20718K0;
import p1071w0.C20750g0;
import p1071w0.C20752h0;
import p1071w0.C20768p0;
import p1087wj.AbstractC20994o;
import p1087wj.C20990k;
import p1087wj.C20991l;
import p1087wj.C20992m;
import p1087wj.C20993n;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21059M;
import p110E4.C2307e;
import p1155zi.C21936L0;
import p1156zj.AbstractC22120R0;
import p1156zj.AbstractC22121S;
import p1156zj.AbstractC22180o0;
import p1156zj.AbstractC22208y0;
import p1156zj.C22090C;
import p1156zj.C22091C0;
import p1156zj.C22107K0;
import p1156zj.C22139a1;
import p1156zj.C22150e0;
import p1156zj.C22168k0;
import p1156zj.C22204w0;
import p1156zj.C22205x;
import p1156zj.EnumC22088B;
import p140Fa.C2685e;
import p149Fj.C2873g;
import p149Fj.InterfaceC2875i;
import p204I1.AbstractC3597m;
import p204I1.C3573D;
import p204I1.C3578I;
import p204I1.C3579J;
import p204I1.C3581L;
import p204I1.C3588d;
import p204I1.C3590f;
import p349O0.C5994b0;
import p349O0.C5996c0;
import p349O0.InterfaceC5985X;
import p350O1.C6045C;
import p350O1.C6049G;
import p350O1.InterfaceC6073v;
import p385Pj.AbstractC6433h;
import p385Pj.AbstractC6442q;
import p385Pj.C6431f;
import p385Pj.C6432g;
import p385Pj.C6439n;
import p385Pj.C6440o;
import p385Pj.C6441p;
import p492U1.C7543h;
import p492U1.C7545j;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8215v5;
import p544W9.AbstractC8664l;
import p571X9.AbstractC9393x3;
import p620Zc.InterfaceC10277b;
import p729ej.C13421l;
import p729ej.C13430u;
import p749fd.AbstractC13627l;
import p749fd.C13625j;
import p759g1.C13800b;
import p774h1.C14365u;
import p774h1.InterfaceC14362r;
import p813ij.C15026j;
import p821j1.InterfaceC16039d;
import p909nm.AbstractC17680n;
import p911o0.C17757f0;
import p911o0.C17759g0;
import p911o0.C17761h0;
import p911o0.C17771m0;
import p926of.C18154Q;
import p928oh.C18194a;
import p949pj.C18428A;
import p985r9.C18903m;
import p994rk.C19067A1;
import p994rk.InterfaceC19099L0;
import pf.AbstractC18384B;
import td.C19849l;
import tf.AbstractC19915U;

/* JADX INFO: renamed from: l0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C16663C extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f53361Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f53362Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f53363o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f53364p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16663C(Object obj, Object obj2, Object obj3, int i10) {
        super(1);
        this.f53361Y = i10;
        this.f53362Z = obj;
        this.f53363o0 = obj2;
        this.f53364p0 = obj3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C3579J c3579jMo4306b;
        C3579J c3579jMo4306b2;
        C3579J c3579jMo4306b3;
        int i10 = 5;
        int i11 = 0;
        int i12 = 4;
        int i13 = 1;
        c3573dM4247d = null;
        C3573D c3573dM4247d = null;
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f53362Z;
        Object obj3 = this.f53364p0;
        Object obj4 = this.f53363o0;
        switch (this.f53361Y) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                C16672F c16672f = (C16672F) obj2;
                float f10 = c16672f.f53392B0 ? 1.0f : -1.0f;
                C16757l1 c16757l1 = c16672f.f53391A0;
                long jM18534d = c16757l1.m18534d(c16757l1.m18537g(f10 * fFloatValue));
                C16757l1 c16757l2 = ((C16748i1) obj3).f53725a;
                float fM18536f = c16757l1.m18536f(c16757l1.m18534d(C16757l1.m18531a(c16757l2, c16757l2.f53764h, jM18534d, 1))) * f10;
                if (Math.abs(fM18536f) < Math.abs(fFloatValue)) {
                    ((InterfaceC0627n0) obj4).mo1275e(AbstractC0575H.m1172a("Scroll animation cancelled because scroll was not consumed (" + fM18536f + " < " + fFloatValue + ')', null));
                }
                return c17296c;
            case 1:
                AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
                C17757f0 c17757f0 = (C17757f0) obj2;
                InterfaceC21059M interfaceC21059M = (InterfaceC21059M) obj3;
                AbstractC21069X abstractC21069X = (AbstractC21069X) obj4;
                if (c17757f0.f56696B0) {
                    abstractC21068W.m21546g(abstractC21069X, interfaceC21059M.mo7866k0(c17757f0.f56697z0), interfaceC21059M.mo7866k0(c17757f0.f56695A0), 0.0f);
                } else {
                    abstractC21068W.m21545d(abstractC21069X, interfaceC21059M.mo7866k0(c17757f0.f56697z0), interfaceC21059M.mo7866k0(c17757f0.f56695A0), 0.0f);
                }
                return c17296c;
            case 2:
                AbstractC21068W abstractC21068W2 = (AbstractC21068W) obj;
                C17759g0 c17759g0 = (C17759g0) obj2;
                long j10 = ((C7543h) c17759g0.f56706z0.invoke((InterfaceC21059M) obj4)).f23897a;
                AbstractC21069X abstractC21069X2 = (AbstractC21069X) obj3;
                if (c17759g0.f56705A0) {
                    AbstractC21068W.m21540j(abstractC21068W2, abstractC21069X2, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                } else {
                    AbstractC21068W.m21543m(abstractC21068W2, abstractC21069X2, (int) (j10 >> 32), (int) (j10 & 4294967295L), null, 12);
                }
                return c17296c;
            case 3:
                AbstractC21068W abstractC21068W3 = (AbstractC21068W) obj;
                C17761h0 c17761h0 = (C17761h0) obj2;
                InterfaceC21059M interfaceC21059M2 = (InterfaceC21059M) obj3;
                AbstractC21069X abstractC21069X3 = (AbstractC21069X) obj4;
                if (c17761h0.f56710D0) {
                    abstractC21068W3.m21546g(abstractC21069X3, interfaceC21059M2.mo7866k0(c17761h0.f56711z0), interfaceC21059M2.mo7866k0(c17761h0.f56707A0), 0.0f);
                } else {
                    abstractC21068W3.m21545d(abstractC21069X3, interfaceC21059M2.mo7866k0(c17761h0.f56711z0), interfaceC21059M2.mo7866k0(c17761h0.f56707A0), 0.0f);
                }
                return c17296c;
            case 4:
                C17771m0 c17771m0 = (C17771m0) obj3;
                InterfaceC21059M interfaceC21059M3 = (InterfaceC21059M) obj4;
                ((AbstractC21068W) obj).m21545d((AbstractC21069X) obj2, interfaceC21059M3.mo7866k0(c17771m0.f56730z0.mo19474c(interfaceC21059M3.getLayoutDirection())), interfaceC21059M3.mo7866k0(c17771m0.f56730z0.mo19475d()), 0.0f);
                return c17296c;
            case 5:
                C19738o change = (C19738o) obj;
                AbstractC16544l.m18094g(change, "change");
                change.m20691a();
                float fM15306g = C13800b.m15306g(change.f62480c);
                List list = AbstractC18384B.f58664a;
                float f11 = fM15306g / ((int) (((C7545j) ((InterfaceC5985X) obj4).getValue()).f23903a >> 32));
                ((C16557y) obj2).f51286Y = f11;
                ((InterfaceC5985X) obj3).setValue(Float.valueOf(f11));
                return c17296c;
            case 6:
                AbstractC16544l.m18094g((InterfaceC11374b0) obj, "it");
                if (!((C19849l) obj2).f62940d) {
                    ((InterfaceC1436k) obj4).invoke(new C21936L0(((C11349D) ((InterfaceC11374b0) obj3)).f34318a));
                }
                return c17296c;
            case 7:
                float fFloatValue2 = ((Number) obj).floatValue();
                ((C5994b0) obj2).m6410h(fFloatValue2);
                InterfaceC7537b interfaceC7537b = (InterfaceC7537b) obj3;
                float f12 = AbstractC19915U.f63136a;
                float f13 = AbstractC13627l.f43058a;
                ((C13625j) obj4).f43053f.m6410h(((interfaceC7537b.mo7864b0(AbstractC13627l.f43059b) - interfaceC7537b.mo7864b0(f13)) * fFloatValue2) + interfaceC7537b.mo7864b0(f13));
                return c17296c;
            case 8:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                action.f42521b = new C20329c0(AbstractC17680n.m19373w0(AbstractC17680n.m19361k0(AbstractC20361s0.m21044a(((C6440o) ((AbstractC6442q) obj2)).f20904a), ((AbstractC20337g0) action.f42521b).mo21035g()), ((C20316S) obj4).f64218p), ((AbstractC20337g0) action.f42521b).mo21034f(), null, EnumC20335f0.f64297Z, false, ((C20359r0) obj3).f64367b.getString(R.string.pi2_document_error_unable_to_add_file), 116);
                return c17296c;
            case 9:
                AbstractC6442q it = (AbstractC6442q) obj;
                AbstractC16544l.m18094g(it, "it");
                C20316S c20316s = (C20316S) obj4;
                C20359r0 c20359r0 = (C20359r0) obj2;
                if (it instanceof C6441p) {
                    return AbstractC8215v5.m8839a(c20359r0, new C18194a(it, 16, c20316s));
                }
                if (it instanceof C6440o) {
                    return AbstractC8215v5.m8839a(c20359r0, new C16663C(it, c20316s, c20359r0, 8));
                }
                if (it.equals(C6439n.f20903a)) {
                    return AbstractC8215v5.m8839a(c20359r0, new C20198o((AbstractC20337g0) obj3, i10));
                }
                throw new C0644w();
            case 10:
                AbstractC20994o response = (AbstractC20994o) obj;
                AbstractC16544l.m18094g(response, "response");
                C20359r0 c20359r1 = (C20359r0) obj2;
                if (response instanceof C20993n) {
                    return AbstractC8215v5.m8839a(c20359r1, new C20355p0(response, i11));
                }
                C20336g c20336g = (C20336g) obj4;
                if (response instanceof C20992m) {
                    return AbstractC8215v5.m8839a(c20359r1, new C18194a(c20336g, 17, response));
                }
                if (response instanceof C20990k) {
                    return AbstractC8215v5.m8839a(c20359r1, new C20357q0(c20336g, (AbstractC20337g0) obj3, response, c20359r1));
                }
                if (response instanceof C20991l) {
                    return AbstractC8215v5.m8839a(c20359r1, new C20355p0(response, i13));
                }
                throw new C0644w();
            case 11:
                if (((Number) obj).intValue() == 5) {
                    C16525B c16525b = (C16525B) obj2;
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) c16525b.f51262Y;
                    if (interfaceC1436k != null) {
                        interfaceC1436k.invoke(AbstractC17680n.m19322C0(AbstractC17680n.m19322C0(((C20642j) obj4).f65517j)));
                    }
                    c16525b.f51262Y = null;
                    Context context = ((ViewGroup) ((C2307e) obj3).f7159o0).getContext();
                    AbstractC16544l.m18093f(context, "getContext(...)");
                    AbstractC8012V5.m8331d(context);
                }
                return c17296c;
            case 12:
                C19067A1 selectedItem = (C19067A1) obj;
                AbstractC16544l.m18094g(selectedItem, "selectedItem");
                if (!((InterfaceC19099L0) obj2).mo1131g()) {
                    C16525B c16525b2 = (C16525B) obj4;
                    InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) c16525b2.f51262Y;
                    if (interfaceC1436k2 != null) {
                        interfaceC1436k2.invoke(AbstractC9393x3.m9974d(selectedItem));
                    }
                    c16525b2.f51262Y = null;
                    ((C2307e) obj3).m3395e();
                }
                return c17296c;
            case 13:
                C6045C c6045c = (C6045C) obj;
                ((InterfaceC5985X) obj4).setValue(c6045c);
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj3;
                boolean zM18089b = AbstractC16544l.m18089b((String) interfaceC5985X.getValue(), c6045c.f19682a.f10934Y);
                C3590f c3590f = c6045c.f19682a;
                interfaceC5985X.setValue(c3590f.f10934Y);
                if (!zM18089b) {
                    ((InterfaceC1436k) obj2).invoke(c3590f.f10934Y);
                }
                return c17296c;
            case 14:
                InterfaceC16039d interfaceC16039d = (InterfaceC16039d) obj;
                C20750g0 c20750g0 = (C20750g0) obj2;
                C20710G0 c20710g0M21294d = c20750g0.m21294d();
                if (c20710g0M21294d != null) {
                    InterfaceC14362r interfaceC14362rM15196m = interfaceC16039d.mo17601f0().m15196m();
                    long j11 = ((C3581L) c20750g0.f65833x.getValue()).f10908a;
                    long j12 = ((C3581L) c20750g0.f65834y.getValue()).f10908a;
                    long j13 = c20750g0.f65832w;
                    boolean zM4267c = C3581L.m4267c(j11);
                    InterfaceC6073v interfaceC6073v = (InterfaceC6073v) obj3;
                    C3578I c3578i = c20710g0M21294d.f65650a;
                    C18903m c18903m = c20750g0.f65831v;
                    if (!zM4267c) {
                        c18903m.m20222f(j13);
                        int iMo1766b = interfaceC6073v.mo1766b(C3581L.m4270f(j11));
                        int iMo1766b2 = interfaceC6073v.mo1766b(C3581L.m4269e(j11));
                        if (iMo1766b != iMo1766b2) {
                            interfaceC14362rM15196m.mo15713l(c3578i.m4262l(iMo1766b, iMo1766b2), c18903m);
                        }
                    } else if (C3581L.m4267c(j12)) {
                        C6045C c6045c2 = (C6045C) obj4;
                        if (!C3581L.m4267c(c6045c2.f19683b)) {
                            c18903m.m20222f(j13);
                            long j14 = c6045c2.f19683b;
                            int iMo1766b3 = interfaceC6073v.mo1766b(C3581L.m4270f(j14));
                            int iMo1766b4 = interfaceC6073v.mo1766b(C3581L.m4269e(j14));
                            if (iMo1766b3 != iMo1766b4) {
                                interfaceC14362rM15196m.mo15713l(c3578i.m4262l(iMo1766b3, iMo1766b4), c18903m);
                            }
                        }
                    } else {
                        long jM4277d = c3578i.f10892a.f10883b.m4277d();
                        C14365u c14365u = jM4277d != 16 ? new C14365u(jM4277d) : null;
                        long j15 = c14365u != null ? c14365u.f45062a : C14365u.f45052b;
                        c18903m.m20222f(C14365u.m15774b(C14365u.m15776d(j15) * 0.2f, j15));
                        int iMo1766b5 = interfaceC6073v.mo1766b(C3581L.m4270f(j12));
                        int iMo1766b6 = interfaceC6073v.mo1766b(C3581L.m4269e(j12));
                        if (iMo1766b5 != iMo1766b6) {
                            interfaceC14362rM15196m.mo15713l(c3578i.m4262l(iMo1766b5, iMo1766b6), c18903m);
                        }
                    }
                    AbstractC8664l.m9361b(interfaceC14362rM15196m, c3578i);
                }
                return c17296c;
            case 15:
                C6049G c6049g = (C6049G) ((C16525B) obj3).f51262Y;
                C6045C c6045cM16144b = ((C15026j) obj2).m16144b((List) obj);
                if (c6049g != null) {
                    c6049g.m6623a(null, c6045cM16144b);
                }
                ((C20709G) obj4).invoke(c6045cM16144b);
                return c17296c;
            case 16:
                C20768p0 c20768p0 = (C20768p0) obj;
                C3588d c3588d = (C3588d) obj4;
                Object obj5 = c3588d.f10930a;
                C3579J c3579jMo4306b4 = ((AbstractC3597m) obj5).mo4306b();
                C3573D c3573d = c3579jMo4306b4 != null ? c3579jMo4306b4.f10898a : null;
                C5996c0 c5996c0 = ((C20752h0) obj3).f65850a;
                C3573D c3573dM4247d2 = (((c5996c0.m6412g() & 1) != 0 ? 1 : 0) == 0 || (c3579jMo4306b3 = ((AbstractC3597m) obj5).mo4306b()) == null) ? null : c3579jMo4306b3.f10899b;
                ((C20718K0) obj2).getClass();
                if (c3573d != null) {
                    c3573dM4247d2 = c3573d.m4247d(c3573dM4247d2);
                }
                C3573D c3573dM4247d3 = ((c5996c0.m6412g() & 2) == 0 || (c3579jMo4306b2 = ((AbstractC3597m) obj5).mo4306b()) == null) ? null : c3579jMo4306b2.f10900c;
                if (c3573dM4247d2 != null) {
                    c3573dM4247d3 = c3573dM4247d2.m4247d(c3573dM4247d3);
                }
                if ((c5996c0.m6412g() & 4) != 0 && (c3579jMo4306b = ((AbstractC3597m) obj5).mo4306b()) != null) {
                    c3573dM4247d = c3579jMo4306b.f10901d;
                }
                if (c3573dM4247d3 != null) {
                    c3573dM4247d = c3573dM4247d3.m4247d(c3573dM4247d);
                }
                if (c3573dM4247d != null) {
                    c20768p0.f65940a.m4289a(c3573dM4247d, c3588d.f10931b, c3588d.f10932c);
                }
                return c17296c;
            case 17:
                long j16 = ((C7543h) obj).f23897a;
                ((InterfaceC10277b) obj2).mo10871a();
                ((InterfaceC1436k) obj4).invoke(C18154Q.f57905a);
                ((C11709i) obj3).m13032b(j16);
                return c17296c;
            case 18:
                AbstractC6433h it2 = (AbstractC6433h) obj;
                AbstractC16544l.m18094g(it2, "it");
                C22107K0 c22107k0 = (C22107K0) obj2;
                AbstractC22180o0 abstractC22180o0 = (AbstractC22180o0) obj3;
                if (it2 instanceof C6432g) {
                    C6432g c6432g = (C6432g) it2;
                    return AbstractC8215v5.m8839a(c22107k0, new C16663C(abstractC22180o0, new C22090C(AbstractC9393x3.m9974d(new C22205x(c6432g.f20889a)), AbstractC22120R0.m22363j(((C22139a1) obj4).f69986Y), AbstractC22121S.m22366c(((C22150e0) abstractC22180o0).f70028r0), EnumC22088B.f69818o0, null, null), c6432g.f20890b, 19));
                }
                if (it2.equals(C6431f.f20888a)) {
                    return AbstractC8215v5.m8839a(c22107k0, new C22091C0(abstractC22180o0, i12));
                }
                throw new C0644w();
            case 19:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                Object obj6 = action2.f42521b;
                C22150e0 c22150e0 = obj6 instanceof C22150e0 ? (C22150e0) obj6 : null;
                if (c22150e0 != null) {
                    AbstractC22180o0 abstractC22180o1 = (AbstractC22180o0) obj2;
                    action2.f42521b = new C22168k0(((C22150e0) abstractC22180o1).f70024Z, abstractC22180o1.mo22381h(), ((C22150e0) abstractC22180o1).f70028r0, (C22090C) obj4, (String) obj3, c22150e0.f70026p0, c22150e0.f70027q0, AbstractC22120R0.m22355b(action2, true), new C18428A(), null, false);
                }
                return c17296c;
            case 20:
                AbstractC16544l.m18094g((C13430u) obj, "$this$action");
                AbstractC22120R0.m22362i((C13421l) obj4, (AbstractC22208y0) obj3, ((C22107K0) obj2).f69887m);
                return c17296c;
            default:
                AbstractC16544l.m18094g((C13430u) obj, "$this$action");
                AbstractC22120R0.m22362i((C13421l) obj2, new C22204w0(((C2873g) ((InterfaceC2875i) obj4)).f8640a), (C2685e) obj3);
                return c17296c;
        }
    }
}
