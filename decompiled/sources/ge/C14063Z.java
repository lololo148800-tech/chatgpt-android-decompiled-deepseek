package ge;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p349O0.C5996c0;

/* JADX INFO: renamed from: ge.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C14063Z extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ArrayList f44215Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14111x0 f44216Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14054U f44217o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f44218p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f44219q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C5996c0 f44220r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C5996c0 f44221s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14063Z(ArrayList arrayList, C14111x0 c14111x0, C14054U c14054u, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C5996c0 c5996c0, C5996c0 c5996c1) {
        super(4);
        this.f44215Y = arrayList;
        this.f44216Z = c14111x0;
        this.f44217o0 = c14054u;
        this.f44218p0 = interfaceC1436k;
        this.f44219q0 = interfaceC1436k2;
        this.f44220r0 = c5996c0;
        this.f44221s0 = c5996c1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 ??, still in use, count: 1, list:
          (r8v1 ?? I:java.lang.Object) from 0x00fb: INVOKE (r11v1 ?? I:O0.p), (r8v1 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:252)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 ??, still in use, count: 1, list:
          (r8v1 ?? I:java.lang.Object) from 0x00fb: INVOKE (r11v1 ?? I:O0.p), (r8v1 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:252)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
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
