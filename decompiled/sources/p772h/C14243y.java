package p772h;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: h.y */
/* JADX INFO: loaded from: classes.dex */
public final class C14243y extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44699Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14215F f44700Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14243y(C14215F c14215f, int i10) {
        super(1);
        this.f44699Y = i10;
        this.f44700Z = c14215f;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v5 java.lang.Object, still in use, count: 2, list:
          (r1v5 java.lang.Object) from 0x005a: PHI (r1 I:??) = (r1v2 java.lang.Object), (r1v5 java.lang.Object) binds: [B:22:0x0059, B:32:0x005a] A[DONT_GENERATE, DONT_INLINE]
          (r1v5 java.lang.Object) from 0x0052: CHECK_CAST (h.x) (r1v5 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f44699Y
            switch(r0) {
                case 0: goto L34;
                default: goto L5;
            }
        L5:
            h.b r4 = (p772h.C14220b) r4
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.AbstractC16544l.m18094g(r4, r0)
            h.F r4 = r3.f44700Z
            h.x r0 = r4.f44643c
            if (r0 != 0) goto L31
            nm.k r4 = r4.f44642b
            int r0 = r4.mo7371f()
            java.util.ListIterator r4 = r4.listIterator(r0)
        L1c:
            boolean r0 = r4.hasPrevious()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r4.previous()
            r1 = r0
            h.x r1 = (p772h.AbstractC14242x) r1
            boolean r1 = r1.f44696a
            if (r1 == 0) goto L1c
            goto L2f
        L2e:
            r0 = 0
        L2f:
            h.x r0 = (p772h.AbstractC14242x) r0
        L31:
            mm.C r4 = mm.C17296C.f55119a
            return r4
        L34:
            h.b r4 = (p772h.C14220b) r4
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.AbstractC16544l.m18094g(r4, r0)
            h.F r4 = r3.f44700Z
            nm.k r0 = r4.f44642b
            int r1 = r0.mo7371f()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L47:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.previous()
            r2 = r1
            h.x r2 = (p772h.AbstractC14242x) r2
            boolean r2 = r2.f44696a
            if (r2 == 0) goto L47
            goto L5a
        L59:
            r1 = 0
        L5a:
            h.x r1 = (p772h.AbstractC14242x) r1
            h.x r0 = r4.f44643c
            if (r0 == 0) goto L63
            r4.m15517b()
        L63:
            r4.f44643c = r1
            mm.C r4 = mm.C17296C.f55119a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p772h.C14243y.invoke(java.lang.Object):java.lang.Object");
    }
}
