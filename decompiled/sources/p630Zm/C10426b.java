package p630Zm;

import java.util.AbstractCollection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import pn.C18514a;

/* JADX INFO: renamed from: Zm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10426b implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30897Y;

    /* JADX INFO: renamed from: Z */
    public final Object f30898Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f30899o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f30900p0;

    /* JADX INFO: renamed from: q0 */
    public final Object f30901q0;

    public /* synthetic */ C10426b(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f30897Y = i10;
        this.f30898Z = obj;
        this.f30899o0 = obj2;
        this.f30900p0 = obj3;
        this.f30901q0 = obj4;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies;
        Object obj2 = this.f30899o0;
        Object obj3 = this.f30901q0;
        Object obj4 = this.f30900p0;
        Object obj5 = this.f30898Z;
        switch (this.f30897Y) {
            case 0:
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
                RawSubstitution.Companion companion = RawSubstitution.Companion;
                AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
                ClassDescriptor classDescriptor = (ClassDescriptor) obj5;
                ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
                if (classId == null || (classDescriptorFindClassAcrossModuleDependencies = kotlinTypeRefiner.findClassAcrossModuleDependencies(classId)) == null || classDescriptorFindClassAcrossModuleDependencies.equals(classDescriptor)) {
                    return null;
                }
                return (SimpleType) ((RawSubstitution) obj2).m18222a((SimpleType) obj4, classDescriptorFindClassAcrossModuleDependencies, (JavaTypeAttributes) obj3).f55136Y;
            default:
                TypeCheckerState.ForkPointContext runForkingPoint = (TypeCheckerState.ForkPointContext) obj;
                AbstractC16544l.m18094g(runForkingPoint, "$this$runForkingPoint");
                Iterator it = ((AbstractCollection) obj5).iterator();
                while (it.hasNext()) {
                    runForkingPoint.fork(new C18514a((TypeCheckerState) obj2, (TypeSystemContext) obj4, (RigidTypeMarker) it.next(), (RigidTypeMarker) obj3));
                }
                return C17296C.f55119a;
        }
    }
}
