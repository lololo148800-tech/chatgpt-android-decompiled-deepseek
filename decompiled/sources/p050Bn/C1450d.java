package p050Bn;

import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Bn.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1450d implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3813Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f3814Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f3815o0;

    public /* synthetic */ C1450d(Object obj, int i10, Object obj2) {
        this.f3813Y = i10;
        this.f3814Z = obj;
        this.f3815o0 = obj2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v5 java.lang.Object, still in use, count: 2, list:
          (r6v5 java.lang.Object) from 0x00e6: PHI (r6 I:??) = (r6v2 java.lang.Object), (r6v5 java.lang.Object) binds: [B:38:0x00e5, B:60:0x00e6] A[DONT_GENERATE, DONT_INLINE]
          (r6v5 java.lang.Object) from 0x00da: CHECK_CAST (T8.f) (r6v5 java.lang.Object)
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
    @Override // p049Bm.InterfaceC1436k
    public final java.lang.Object invoke(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p050Bn.C1450d.invoke(java.lang.Object):java.lang.Object");
    }
}
