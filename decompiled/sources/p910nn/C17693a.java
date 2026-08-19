package p910nn;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: nn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C17693a implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56485Y;

    /* JADX INFO: renamed from: Z */
    public final DeserializedClassDescriptor f56486Z;

    public /* synthetic */ C17693a(DeserializedClassDescriptor deserializedClassDescriptor, int i10) {
        this.f56485Y = i10;
        this.f56486Z = deserializedClassDescriptor;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0226  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 java.lang.Object, still in use, count: 2, list:
          (r1v10 java.lang.Object) from 0x0222: PHI (r1 I:??) = (r1v7 java.lang.Object), (r1v10 java.lang.Object) binds: [B:70:0x0221, B:88:0x0222] A[DONT_GENERATE, DONT_INLINE]
          (r1v10 java.lang.Object) from 0x020e: CHECK_CAST (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor) (r1v10 java.lang.Object)
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
    @Override // p049Bm.InterfaceC1426a
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p910nn.C17693a.invoke():java.lang.Object");
    }
}
