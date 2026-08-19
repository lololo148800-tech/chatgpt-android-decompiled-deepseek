package sn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: sn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C19695a implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C19695a f62381Z = new C19695a(0);

    /* JADX INFO: renamed from: o0 */
    public static final C19695a f62382o0 = new C19695a(1);

    /* JADX INFO: renamed from: p0 */
    public static final C19695a f62383p0 = new C19695a(2);

    /* JADX INFO: renamed from: q0 */
    public static final C19695a f62384q0 = new C19695a(3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62385Y;

    public /* synthetic */ C19695a(int i10) {
        this.f62385Y = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        UnwrappedType it = (UnwrappedType) obj;
        switch (this.f62385Y) {
            case 0:
                return Boolean.valueOf(TypeUtils.isTypeParameter(it));
            case 1:
                AbstractC16544l.m18094g(it, "it");
                ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = it.getConstructor().mo22589getDeclarationDescriptor();
                return Boolean.valueOf(classifierDescriptorMo22589getDeclarationDescriptor != null ? TypeUtilsKt.isTypeAliasParameter(classifierDescriptorMo22589getDeclarationDescriptor) : false);
            case 2:
                AbstractC16544l.m18094g(it, "it");
                ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor2 = it.getConstructor().mo22589getDeclarationDescriptor();
                boolean z6 = false;
                if (classifierDescriptorMo22589getDeclarationDescriptor2 != null && ((classifierDescriptorMo22589getDeclarationDescriptor2 instanceof TypeAliasDescriptor) || (classifierDescriptorMo22589getDeclarationDescriptor2 instanceof TypeParameterDescriptor))) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            default:
                AbstractC16544l.m18094g(it, "it");
                return Boolean.valueOf((it instanceof StubTypeForBuilderInference) || (it.getConstructor() instanceof TypeVariableTypeConstructorMarker) || KotlinTypeKt.isError(it));
        }
    }
}
