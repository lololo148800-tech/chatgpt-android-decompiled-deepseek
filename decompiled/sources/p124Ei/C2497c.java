package p124Ei;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1081wc.InterfaceC20904w;
import p349O0.C5994b0;
import p349O0.C5996c0;
import p349O0.InterfaceC5985X;
import p507Uh.InterfaceC7678d;
import p749fd.C13625j;
import p990rg.C18983j;
import tf.C19906K;

/* JADX INFO: renamed from: Ei.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2497c extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7780Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f7781Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f7782o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f7783p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f7784q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2497c(InterfaceC1426a interfaceC1426a, InterfaceC20904w interfaceC20904w, InterfaceC7678d interfaceC7678d, InterfaceC5985X interfaceC5985X) {
        super(3);
        this.f7780Y = 11;
        this.f7783p0 = interfaceC1426a;
        this.f7781Z = interfaceC20904w;
        this.f7782o0 = interfaceC7678d;
        this.f7784q0 = interfaceC5985X;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v55 ??, still in use, count: 1, list:
          (r2v55 ?? I:java.lang.Object) from 0x0879: INVOKE (r1v15 ?? I:O0.p), (r2v55 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:2170)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // p049Bm.InterfaceC1440o
    public final java.lang.Object invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v55 ??, still in use, count: 1, list:
          (r2v55 ?? I:java.lang.Object) from 0x0879: INVOKE (r1v15 ?? I:O0.p), (r2v55 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:2170)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r51v0 ??
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2497c(InterfaceC1436k interfaceC1436k, Object obj, Object obj2, InterfaceC5985X interfaceC5985X, int i10) {
        super(3);
        this.f7780Y = i10;
        this.f7782o0 = interfaceC1436k;
        this.f7781Z = obj;
        this.f7783p0 = obj2;
        this.f7784q0 = interfaceC5985X;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2497c(C13625j c13625j, C19906K c19906k, InterfaceC1436k interfaceC1436k, C5994b0 c5994b0) {
        super(3);
        this.f7780Y = 12;
        this.f7781Z = c13625j;
        this.f7783p0 = c19906k;
        this.f7782o0 = interfaceC1436k;
        this.f7784q0 = c5994b0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2497c(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(3);
        this.f7780Y = i10;
        this.f7781Z = obj;
        this.f7782o0 = obj2;
        this.f7783p0 = obj3;
        this.f7784q0 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2497c(C18983j c18983j, C5996c0 c5996c0, InterfaceC20904w interfaceC20904w, InterfaceC1436k interfaceC1436k) {
        super(3);
        this.f7780Y = 8;
        this.f7781Z = c18983j;
        this.f7783p0 = c5996c0;
        this.f7784q0 = interfaceC20904w;
        this.f7782o0 = interfaceC1436k;
    }
}
