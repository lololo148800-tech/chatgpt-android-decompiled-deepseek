package p193Hf;

import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import ge.C14111x0;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1081wc.InterfaceC20904w;
import p225Im.InterfaceC3759g;
import p349O0.C5996c0;
import p349O0.InterfaceC5985X;
import p553Wh.C8870f;
import p795i.C14893g;
import ye.C21525n;

/* JADX INFO: renamed from: Hf.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3347a0 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10223Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f10224Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f10225o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f10226p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f10227q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f10228r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f10229s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f10230t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Object f10231u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ Object f10232v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ Object f10233w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3347a0(C3418y0 c3418y0, C21525n c21525n, C3337V0 c3337v0, String str, CanmoreViewModel canmoreViewModel, C14893g c14893g, C8870f c8870f, InterfaceC5985X interfaceC5985X, C5996c0 c5996c0, InterfaceC5985X interfaceC5985X2) {
        super(3);
        this.f10227q0 = c3418y0;
        this.f10228r0 = c21525n;
        this.f10229s0 = c3337v0;
        this.f10224Z = str;
        this.f10230t0 = canmoreViewModel;
        this.f10231u0 = c14893g;
        this.f10232v0 = c8870f;
        this.f10225o0 = interfaceC5985X;
        this.f10233w0 = c5996c0;
        this.f10226p0 = interfaceC5985X2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v24 ??, still in use, count: 1, list:
          (r3v24 ?? I:java.lang.Object) from 0x0648: INVOKE (r12v1 ?? I:O0.p), (r3v24 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:1609)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v24 ??, still in use, count: 1, list:
          (r3v24 ?? I:java.lang.Object) from 0x0648: INVOKE (r12v1 ?? I:O0.p), (r3v24 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:1609)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r38v0 ??
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
    public C3347a0(C14111x0 c14111x0, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC3759g interfaceC3759g, String str, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, InterfaceC5985X interfaceC5985X3, InterfaceC1436k interfaceC1436k, InterfaceC20904w interfaceC20904w) {
        super(3);
        this.f10227q0 = c14111x0;
        this.f10228r0 = interfaceC1426a;
        this.f10229s0 = interfaceC1426a2;
        this.f10230t0 = interfaceC3759g;
        this.f10224Z = str;
        this.f10225o0 = interfaceC5985X;
        this.f10226p0 = interfaceC5985X2;
        this.f10231u0 = interfaceC5985X3;
        this.f10232v0 = interfaceC1436k;
        this.f10233w0 = interfaceC20904w;
    }
}
