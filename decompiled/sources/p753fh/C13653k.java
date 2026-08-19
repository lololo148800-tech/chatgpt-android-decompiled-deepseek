package p753fh;

import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11158d;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import p1155zi.C22042p;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: fh.k */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13653k {
    public static final C13652j Companion = new C13652j();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f43117c;

    /* JADX INFO: renamed from: a */
    public final Map f43118a;

    /* JADX INFO: renamed from: b */
    public final List f43119b;

    static {
        C22042p c22042p = C22042p.f69730a;
        f43117c = new KSerializer[]{new C11131E(c22042p, C13657o.f43130a, 1), new C11158d(c22042p, 0)};
    }

    public /* synthetic */ C13653k(int i10, List list, Map map) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C13651i.f43116a.getDescriptor());
            throw null;
        }
        this.f43118a = map;
        this.f43119b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:81:0x0173  */
    /* JADX WARN: Code duplicated, block: B:82:0x0177  */
    /* JADX WARN: Code duplicated, block: B:85:0x017e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0186  */
    /* JADX WARN: Code duplicated, block: B:93:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0106 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v6 java.lang.Object, still in use, count: 2, list:
          (r13v6 java.lang.Object) from 0x0139: PHI (r13 I:??) = (r13v3 java.lang.Object), (r13v6 java.lang.Object) binds: [B:65:0x0138, B:99:0x0139] A[DONT_GENERATE, DONT_INLINE]
          (r13v6 java.lang.Object) from 0x012d: CHECK_CAST (zi.l) (r13v6 java.lang.Object)
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
    /* JADX INFO: renamed from: a */
    public final p1155zi.C22062u m15156a() {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p753fh.C13653k.m15156a():zi.u");
    }
}
