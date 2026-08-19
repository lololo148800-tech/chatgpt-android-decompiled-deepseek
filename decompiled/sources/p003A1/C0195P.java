package p003A1;

import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: A1.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0195P implements Comparator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f731Y;

    /* JADX INFO: renamed from: Z */
    public final Object f732Z;

    public /* synthetic */ C0195P(Object obj, int i10) {
        this.f731Y = i10;
        this.f732Z = obj;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v15 Mn.u, still in use, count: 2, list:
          (r3v15 Mn.u) from 0x0036: IF  (r3v15 Mn.u) == (null Mn.u)  -> B:94:? A[HIDDEN] (LINE:55)
          (r3v15 Mn.u) from 0x003a: PHI (r3 I:??) = (r3v10 Mn.u), (r3v15 Mn.u) binds: [B:12:0x0039, B:93:0x003a] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Comparator
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p003A1.C0195P.compare(java.lang.Object, java.lang.Object):int");
    }

    public C0195P(Comparator comparator) {
        this.f731Y = 0;
        this.f732Z = comparator;
    }

    public C0195P(List order) {
        this.f731Y = 6;
        AbstractC16544l.m18094g(order, "order");
        this.f732Z = order;
    }
}
