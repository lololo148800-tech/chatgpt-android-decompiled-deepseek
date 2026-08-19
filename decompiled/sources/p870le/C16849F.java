package p870le;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p1081wc.InterfaceC20904w;
import p553Wh.C8870f;
import p948pi.C18418a;
import ye.EnumC21517f;

/* JADX INFO: renamed from: le.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C16849F extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f54036Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f54037Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f54038o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC20904w f54039p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C18418a f54040q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C8870f f54041r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC1426a f54042s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1426a f54043t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ InterfaceC1426a f54044u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ boolean f54045v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ InterfaceC1436k f54046w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ EnumC21517f f54047x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16849F(boolean z6, boolean z10, InterfaceC1436k interfaceC1436k, InterfaceC20904w interfaceC20904w, C18418a c18418a, C8870f c8870f, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC1426a interfaceC1426a3, boolean z11, InterfaceC1436k interfaceC1436k2, EnumC21517f enumC21517f) {
        super(4);
        this.f54036Y = z6;
        this.f54037Z = z10;
        this.f54038o0 = interfaceC1436k;
        this.f54039p0 = interfaceC20904w;
        this.f54040q0 = c18418a;
        this.f54041r0 = c8870f;
        this.f54042s0 = interfaceC1426a;
        this.f54043t0 = interfaceC1426a2;
        this.f54044u0 = interfaceC1426a3;
        this.f54045v0 = z11;
        this.f54046w0 = interfaceC1436k2;
        this.f54047x0 = enumC21517f;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v19 ??, still in use, count: 1, list:
          (r4v19 ?? I:java.lang.Object) from 0x0199: INVOKE (r13v1 ?? I:O0.p), (r4v19 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:410)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final java.lang.Object mo985d(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v19 ??, still in use, count: 1, list:
          (r4v19 ?? I:java.lang.Object) from 0x0199: INVOKE (r13v1 ?? I:O0.p), (r4v19 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:410)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
}
