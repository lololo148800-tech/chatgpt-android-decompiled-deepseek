package p594Y9;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p1139z0.C21585H;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p402Qc.C6593i;
import p482Tg.C7443a0;
import p562X0.AbstractC9020o;
import p562X0.InterfaceC9019n;
import p919o8.C17899G1;

/* JADX INFO: renamed from: Y9.X3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9834X3 {
    /* JADX INFO: renamed from: a */
    public static C17899G1 m10478a(C3676s c3676s) {
        try {
            return new C17899G1(c3676s.m4395w("count").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Frustration", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Frustration", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Frustration", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m10479b(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC5985X m10480c(Object[] objArr, InterfaceC9019n interfaceC9019n, InterfaceC1426a interfaceC1426a, C6021p c6021p, int i10) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC16544l.m18092e(interfaceC9019n, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        C7443a0 c7443a0 = new C7443a0(interfaceC9019n, 3);
        C6593i c6593i = new C6593i(interfaceC9019n, 22);
        C21585H c21585h = AbstractC9020o.f27518a;
        return (InterfaceC5985X) m10481d(objArrCopyOf, new C21585H(c7443a0, 10, c6593i), null, interfaceC1426a, c6021p, i10 & 8064, 0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0058: INVOKE (r13v0 ?? I:O0.p), (r8v0 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:89)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: d */
    public static final java.lang.Object m10481d(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0058: INVOKE (r13v0 ?? I:O0.p), (r8v0 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:89)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
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
