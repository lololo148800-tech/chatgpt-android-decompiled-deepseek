package fj;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0569E;
import p025An.C0625m0;
import p025An.C0631p0;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1436k;
import p077Cn.C1743k;
import p110E4.C2307e;
import p226In.C3782d;
import p372P3.C6337s;
import p482Tg.C7445b0;
import p523V9.AbstractC8017W3;
import p523V9.AbstractC8207u5;
import p658b5.C11248s;
import p722e8.C13298H;
import p729ej.AbstractC13422m;
import p729ej.AbstractC13431v;
import p729ej.C13415f;
import p729ej.C13420k;
import p729ej.C13421l;
import p729ej.C13425p;
import p729ej.C13430u;
import p729ej.C13434y;
import p813ij.C15026j;
import p972qm.InterfaceC18776i;
import p999s.C19341c1;

/* JADX INFO: renamed from: fj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C13676h implements InterfaceC0571F {

    /* JADX INFO: renamed from: Y */
    public final C13677i f43159Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1436k f43160Z;

    /* JADX INFO: renamed from: o0 */
    public final C13676h f43161o0;

    /* JADX INFO: renamed from: p0 */
    public final C13415f f43162p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC18776i f43163q0;

    /* JADX INFO: renamed from: r0 */
    public final long f43164r0;

    /* JADX INFO: renamed from: s0 */
    public final C19341c1 f43165s0;

    /* JADX INFO: renamed from: t0 */
    public final C11248s f43166t0;

    /* JADX INFO: renamed from: u0 */
    public Object f43167u0;

    /* JADX INFO: renamed from: v0 */
    public final C1743k f43168v0;

    /* JADX INFO: renamed from: w0 */
    public Object f43169w0;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, mm.i] */
    public C13676h(C13677i c13677i, AbstractC13422m workflow, Object obj, C13425p c13425p, InterfaceC18776i baseContext, InterfaceC1436k emitOutputToParent, C13676h c13676h, C13415f interceptor, C6337s c6337s) {
        long j10;
        AbstractC16544l.m18094g(workflow, "workflow");
        AbstractC16544l.m18094g(baseContext, "baseContext");
        AbstractC16544l.m18094g(emitOutputToParent, "emitOutputToParent");
        AbstractC16544l.m18094g(interceptor, "interceptor");
        this.f43159Y = c13677i;
        this.f43160Z = emitOutputToParent;
        this.f43161o0 = c13676h;
        this.f43162p0 = interceptor;
        InterfaceC18776i contextForChildren = baseContext.plus(new C0631p0((InterfaceC0627n0) baseContext.get(C0625m0.f1875Y))).plus(new C0569E(c13677i.toString()));
        this.f43163q0 = contextForChildren;
        if (c6337s == null) {
            j10 = 0;
        } else {
            j10 = c6337s.f20561a;
            c6337s.f20561a = 1 + j10;
        }
        this.f43164r0 = j10;
        Map map = c13425p == null ? null : (Map) c13425p.f42510b.getValue();
        C7445b0 c7445b0 = new C7445b0(1, this, C13676h.class, "applyAction", "applyAction(Lcom/squareup/workflow1/WorkflowAction;)Ljava/lang/Object;", 0, 19);
        AbstractC16544l.m18094g(contextForChildren, "contextForChildren");
        AbstractC16544l.m18094g(interceptor, "interceptor");
        C19341c1 c19341c1 = new C19341c1();
        c19341c1.f61254Y = map;
        c19341c1.f61255Z = contextForChildren;
        c19341c1.f61256o0 = c7445b0;
        c19341c1.f61257p0 = this;
        c19341c1.f61258q0 = interceptor;
        c19341c1.f61259r0 = c6337s;
        c19341c1.f61260s0 = new C11248s(20);
        this.f43165s0 = c19341c1;
        this.f43166t0 = new C11248s(20);
        this.f43167u0 = obj;
        this.f43168v0 = AbstractC8017W3.m8337a(Integer.MAX_VALUE, 6, null);
        AbstractC16544l.m18094g(this, "session");
        this.f43169w0 = AbstractC8207u5.m8832c(interceptor, workflow, this).mo2033a(obj, c13425p == null ? null : (C13420k) c13425p.f42509a.getValue());
    }

    /* JADX INFO: renamed from: a */
    public static final Object m15163a(C13676h c13676h, AbstractC13431v abstractC13431v) {
        Object obj = c13676h.f43167u0;
        Object obj2 = c13676h.f43169w0;
        AbstractC16544l.m18094g(abstractC13431v, "<this>");
        C13430u c13430u = new C13430u(abstractC13431v, obj, obj2);
        abstractC13431v.mo14950a(c13430u);
        Object obj3 = c13430u.f42521b;
        C13434y c13434y = c13430u.f42522c;
        c13676h.f43169w0 = obj3;
        if (c13434y == null) {
            return null;
        }
        return c13676h.f43160Z.invoke(c13434y.f42531a);
    }

    /* JADX INFO: renamed from: b */
    public final Object m15164b(AbstractC13422m workflow, Object obj) {
        AbstractC16544l.m18094g(workflow, "workflow");
        boolean zM18089b = AbstractC16544l.m18089b(obj, this.f43167u0);
        C13415f c13415f = this.f43162p0;
        if (!zM18089b) {
            this.f43169w0 = AbstractC8207u5.m8832c(c13415f, workflow, this).mo8937b(this.f43167u0, obj, this.f43169w0);
        }
        this.f43167u0 = obj;
        C19341c1 c19341c1 = this.f43165s0;
        C2307e c2307e = new C2307e(c19341c1, this, this.f43168v0);
        Object objMo2034c = AbstractC8207u5.m8832c(c13415f, workflow, this).mo2034c(obj, this.f43169w0, new C13421l(workflow, c2307e));
        if (c2307e.f7158Z) {
            throw new IllegalStateException("RenderContext cannot be used after render method returns.");
        }
        c2307e.f7158Z = true;
        C11248s c11248s = (C11248s) c19341c1.f61260s0;
        for (InterfaceC13670b interfaceC13670bMo15160a = (InterfaceC13670b) ((C15026j) c11248s.f34081Z).f46724Y; interfaceC13670bMo15160a != null; interfaceC13670bMo15160a = interfaceC13670bMo15160a.mo15160a()) {
            AbstractC0575H.m1181j(((C13673e) interfaceC13670bMo15160a).f43154c.f43163q0, null);
        }
        C15026j c15026j = (C15026j) c11248s.f34081Z;
        c11248s.f34081Z = (C15026j) c11248s.f34082o0;
        c11248s.f34082o0 = c15026j;
        c15026j.f46724Y = null;
        c15026j.f46725Z = null;
        c19341c1.f61254Y = null;
        C11248s c11248s2 = this.f43166t0;
        for (InterfaceC13670b interfaceC13670bMo15160a2 = (InterfaceC13670b) ((C15026j) c11248s2.f34082o0).f46724Y; interfaceC13670bMo15160a2 != null; interfaceC13670bMo15160a2 = interfaceC13670bMo15160a2.mo15160a()) {
            ((C13671c) interfaceC13670bMo15160a2).f43148b.start();
        }
        for (InterfaceC13670b interfaceC13670bMo15160a3 = (InterfaceC13670b) ((C15026j) c11248s2.f34081Z).f46724Y; interfaceC13670bMo15160a3 != null; interfaceC13670bMo15160a3 = interfaceC13670bMo15160a3.mo15160a()) {
            ((C13671c) interfaceC13670bMo15160a3).f43148b.mo1275e(null);
        }
        C15026j c15026j2 = (C15026j) c11248s2.f34081Z;
        c11248s2.f34081Z = (C15026j) c11248s2.f34082o0;
        c11248s2.f34082o0 = c15026j2;
        c15026j2.f46724Y = null;
        c15026j2.f46725Z = null;
        return objMo2034c;
    }

    /* JADX INFO: renamed from: c */
    public final C13425p m15165c(AbstractC13422m workflow) {
        AbstractC16544l.m18094g(workflow, "workflow");
        C19341c1 c19341c1 = this.f43165s0;
        c19341c1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC13670b interfaceC13670bMo15160a = (InterfaceC13670b) ((C15026j) ((C11248s) c19341c1.f61260s0).f34081Z).f46724Y; interfaceC13670bMo15160a != null; interfaceC13670bMo15160a = interfaceC13670bMo15160a.mo15160a()) {
            C13673e c13673e = (C13673e) interfaceC13670bMo15160a;
            AbstractC13422m abstractC13422m = c13673e.f43152a;
            abstractC13422m.getClass();
            C13676h c13676h = c13673e.f43154c;
            linkedHashMap.put(c13676h.f43159Y, c13676h.m15165c(abstractC13422m));
        }
        return new C13425p(AbstractC8207u5.m8832c(this.f43162p0, workflow, this).mo2035d(this.f43169w0), new C13298H(linkedHashMap, 7));
    }

    /* JADX INFO: renamed from: d */
    public final void m15166d(C3782d c3782d) {
        C19341c1 c19341c1 = this.f43165s0;
        c19341c1.getClass();
        for (InterfaceC13670b interfaceC13670bMo15160a = (InterfaceC13670b) ((C15026j) ((C11248s) c19341c1.f61260s0).f34081Z).f46724Y; interfaceC13670bMo15160a != null; interfaceC13670bMo15160a = interfaceC13670bMo15160a.mo15160a()) {
            ((C13673e) interfaceC13670bMo15160a).f43154c.m15166d(c3782d);
        }
        c3782d.m4457f(this.f43168v0.mo2517f(), new C13675g(this, null));
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f43163q0;
    }

    public final String toString() {
        String str = this.f43161o0 == null ? null : "WorkflowInstance(…)";
        StringBuilder sb2 = new StringBuilder("WorkflowInstance(identifier=");
        C13677i c13677i = this.f43159Y;
        sb2.append(c13677i.f43170a);
        sb2.append(", renderKey=");
        sb2.append(c13677i.f43171b);
        sb2.append(", instanceId=");
        sb2.append(this.f43164r0);
        sb2.append(", parent=");
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
