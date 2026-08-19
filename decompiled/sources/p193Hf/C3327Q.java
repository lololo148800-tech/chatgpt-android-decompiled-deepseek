package p193Hf;

import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p216Id.C3694b;
import p216Id.InterfaceC3702j;
import p403Qd.C6636i;
import p787he.C14459O;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C3327Q extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10157Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f10158Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f10159o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f10160p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3327Q(C14459O c14459o, String str, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f10157Y = 1;
        this.f10159o0 = c14459o;
        this.f10160p0 = str;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f10157Y) {
            case 0:
                C3327Q c3327q = new C3327Q((C3332T) this.f10160p0, (InterfaceC18770c) obj3, 0);
                c3327q.f10158Z = (C6636i) obj;
                c3327q.f10159o0 = (C3694b) obj2;
                C17296C c17296c = C17296C.f55119a;
                c3327q.invokeSuspend(c17296c);
                return c17296c;
            case 1:
                String str = (String) this.f10160p0;
                C3327Q c3327q2 = new C3327Q((C14459O) this.f10159o0, str, (InterfaceC18770c) obj3);
                c3327q2.f10158Z = (Throwable) obj2;
                C17296C c17296c2 = C17296C.f55119a;
                c3327q2.invokeSuspend(c17296c2);
                return c17296c2;
            default:
                C3327Q c3327q3 = new C3327Q((C14459O) this.f10160p0, (InterfaceC18770c) obj3, 2);
                c3327q3.f10159o0 = (InterfaceC3702j) obj;
                c3327q3.f10158Z = (C6636i) obj2;
                return c3327q3.invokeSuspend(C17296C.f55119a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x023c  */
    /* JADX WARN: Code duplicated, block: B:206:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:207:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:210:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:216:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01af  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v14 java.lang.Object, still in use, count: 2, list:
          (r3v14 java.lang.Object) from 0x04cc: PHI (r3 I:??) = (r3v6 java.lang.Object), (r3v14 java.lang.Object) binds: [B:203:0x04cb, B:238:0x04cc] A[DONT_GENERATE, DONT_INLINE]
          (r3v14 java.lang.Object) from 0x04c2: CHECK_CAST (Qd.F) (r3v14 java.lang.Object)
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
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r108) {
        /*
            Method dump skipped, instruction units count: 1288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p193Hf.C3327Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3327Q(Object obj, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f10157Y = i10;
        this.f10160p0 = obj;
    }
}
