package p1129yh;

import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.InterfaceC19456f;
import p1107xh.EnumC21212B;
import p1107xh.EnumC21219I;
import p1107xh.EnumC21225O;
import p1107xh.EnumC21249l;
import p1107xh.EnumC21252o;
import p1107xh.EnumC21254q;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: yh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21541a implements InterfaceC17848a {

    /* JADX INFO: renamed from: Z */
    public static final C21541a f68227Z = new C21541a(0);

    /* JADX INFO: renamed from: o0 */
    public static final C21541a f68228o0 = new C21541a(1);

    /* JADX INFO: renamed from: p0 */
    public static final C21541a f68229p0 = new C21541a(2);

    /* JADX INFO: renamed from: q0 */
    public static final C21541a f68230q0 = new C21541a(3);

    /* JADX INFO: renamed from: r0 */
    public static final C21541a f68231r0 = new C21541a(4);

    /* JADX INFO: renamed from: s0 */
    public static final C21541a f68232s0 = new C21541a(5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68233Y;

    public /* synthetic */ C21541a(int i10) {
        this.f68233Y = i10;
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public final void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        switch (this.f68233Y) {
            case 0:
                EnumC21249l value = (EnumC21249l) obj;
                AbstractC16544l.m18094g(writer, "writer");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                AbstractC16544l.m18094g(value, "value");
                writer.mo20544L(value.f67609Y);
                break;
            case 1:
                EnumC21252o value2 = (EnumC21252o) obj;
                AbstractC16544l.m18094g(writer, "writer");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                AbstractC16544l.m18094g(value2, "value");
                writer.mo20544L(value2.f67616Y);
                break;
            case 2:
                EnumC21254q value3 = (EnumC21254q) obj;
                AbstractC16544l.m18094g(writer, "writer");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                AbstractC16544l.m18094g(value3, "value");
                writer.mo20544L(value3.f67625Y);
                break;
            case 3:
                EnumC21212B value4 = (EnumC21212B) obj;
                AbstractC16544l.m18094g(writer, "writer");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                AbstractC16544l.m18094g(value4, "value");
                writer.mo20544L(value4.f67485Y);
                break;
            case 4:
                EnumC21219I value5 = (EnumC21219I) obj;
                AbstractC16544l.m18094g(writer, "writer");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                AbstractC16544l.m18094g(value5, "value");
                writer.mo20544L(value5.f67512Y);
                break;
            default:
                EnumC21225O value6 = (EnumC21225O) obj;
                AbstractC16544l.m18094g(writer, "writer");
                AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
                AbstractC16544l.m18094g(value6, "value");
                writer.mo20544L(value6.f67523Y);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Code duplicated, block: B:68:0x015f  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v8 java.lang.Object, still in use, count: 2, list:
          (r0v8 java.lang.Object) from 0x015b: PHI (r0 I:??) = (r0v4 java.lang.Object), (r0v8 java.lang.Object) binds: [B:65:0x015a, B:86:0x015b] A[DONT_GENERATE, DONT_INLINE]
          (r0v8 java.lang.Object) from 0x014f: CHECK_CAST (xh.l) (r0v8 java.lang.Object)
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
    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public final java.lang.Object mo373j(p1006s6.InterfaceC19455e r3, p917o6.C17867t r4) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1129yh.C21541a.mo373j(s6.e, o6.t):java.lang.Object");
    }
}
