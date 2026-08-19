package p298Lm;

import java.lang.reflect.Array;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import kotlin.jvm.internal.InterfaceC16545m;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import mm.C17308k;
import p024Am.C0560a;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3757e;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p523V9.AbstractC8138m0;
import p544W9.AbstractC8565U2;
import p544W9.AbstractC8716t3;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Lm.y0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5213y0 implements InterfaceC16545m {

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ InterfaceC3776x[] f16934q0;

    /* JADX INFO: renamed from: Y */
    public final KotlinType f16935Y;

    /* JADX INFO: renamed from: Z */
    public final C5135D0 f16936Z;

    /* JADX INFO: renamed from: o0 */
    public final C5135D0 f16937o0;

    /* JADX INFO: renamed from: p0 */
    public final C5135D0 f16938p0;

    static {
        C16553u c16553u = new C16553u(C5213y0.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f16934q0 = new InterfaceC3776x[]{c16527d.mo5699h(c16553u), AbstractC3794B0.m4493r(C5213y0.class, "arguments", "getArguments()Ljava/util/List;", 0, c16527d)};
    }

    public C5213y0(KotlinType type, InterfaceC1426a interfaceC1426a) {
        AbstractC16544l.m18094g(type, "type");
        this.f16935Y = type;
        C5135D0 c5135d0 = interfaceC1426a instanceof C5135D0 ? (C5135D0) interfaceC1426a : null;
        this.f16936Z = c5135d0 == null ? interfaceC1426a != null ? AbstractC8716t3.m9425b(null, interfaceC1426a) : null : c5135d0;
        this.f16937o0 = AbstractC8716t3.m9425b(null, new C5207v0(this, 0));
        this.f16938p0 = AbstractC8716t3.m9425b(null, new C5150L(this, 1, interfaceC1426a));
    }

    @Override // p225Im.InterfaceC3777y
    /* JADX INFO: renamed from: b */
    public final boolean mo4452b() {
        return this.f16935Y.isMarkedNullable();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC3757e m5762d(KotlinType kotlinType) {
        KotlinType type;
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        if (!(classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor)) {
            if (classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                return new C5129A0(null, (TypeParameterDescriptor) classifierDescriptorMo22589getDeclarationDescriptor);
            }
            if (classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeAliasDescriptor) {
                throw new C17308k("An operation is not implemented: Type alias classifiers are not yet supported");
            }
            return null;
        }
        Class<?> clsM5723k = AbstractC5147J0.m5723k((ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor);
        if (clsM5723k == null) {
            return null;
        }
        if (!clsM5723k.isArray()) {
            if (TypeUtils.isNullableType(kotlinType)) {
                return new C5134D(clsM5723k);
            }
            Class<?> primitiveByWrapper = ReflectClassUtilKt.getPrimitiveByWrapper(clsM5723k);
            if (primitiveByWrapper != null) {
                clsM5723k = primitiveByWrapper;
            }
            return new C5134D(clsM5723k);
        }
        TypeProjection typeProjection = (TypeProjection) AbstractC17680n.m19367q0(kotlinType.getArguments());
        if (typeProjection == null || (type = typeProjection.getType()) == null) {
            return new C5134D(clsM5723k);
        }
        InterfaceC3757e interfaceC3757eM5762d = m5762d(type);
        if (interfaceC3757eM5762d != null) {
            return new C5134D(Array.newInstance((Class<?>) AbstractC8138m0.m8667b(AbstractC8565U2.m9228c(interfaceC3757eM5762d)), 0).getClass());
        }
        throw new C0560a("Cannot determine classifier for array element type: " + this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5213y0) {
            C5213y0 c5213y0 = (C5213y0) obj;
            if (AbstractC16544l.m18089b(this.f16935Y, c5213y0.f16935Y) && AbstractC16544l.m18089b(getClassifier(), c5213y0.getClassifier()) && getArguments().equals(c5213y0.getArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // p225Im.InterfaceC3777y
    public final List getArguments() {
        InterfaceC3776x interfaceC3776x = f16934q0[1];
        Object objInvoke = this.f16938p0.invoke();
        AbstractC16544l.m18093f(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override // p225Im.InterfaceC3777y
    public final InterfaceC3757e getClassifier() {
        InterfaceC3776x interfaceC3776x = f16934q0[0];
        return (InterfaceC3757e) this.f16937o0.invoke();
    }

    public final int hashCode() {
        int iHashCode = this.f16935Y.hashCode() * 31;
        InterfaceC3757e classifier = getClassifier();
        return getArguments().hashCode() + ((iHashCode + (classifier != null ? classifier.hashCode() : 0)) * 31);
    }

    public final String toString() {
        DescriptorRenderer descriptorRenderer = AbstractC5141G0.f16778a;
        return AbstractC5141G0.m5709d(this.f16935Y);
    }
}
