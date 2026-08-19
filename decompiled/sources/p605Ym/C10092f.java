package p605Ym;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: Ym.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C10092f implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C10092f f29877Z = new C10092f(0);

    /* JADX INFO: renamed from: o0 */
    public static final C10092f f29878o0 = new C10092f(1);

    /* JADX INFO: renamed from: p0 */
    public static final C10092f f29879p0 = new C10092f(2);

    /* JADX INFO: renamed from: q0 */
    public static final C10092f f29880q0 = new C10092f(3);

    /* JADX INFO: renamed from: r0 */
    public static final C10092f f29881r0 = new C10092f(4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29882Y;

    public /* synthetic */ C10092f(int i10) {
        this.f29882Y = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f29882Y) {
            case 0:
                JavaMember it = (JavaMember) obj;
                int i10 = LazyJavaClassMemberScope.f51909u;
                AbstractC16544l.m18094g(it, "it");
                return Boolean.valueOf(!it.isStatic());
            case 1:
                SimpleFunctionDescriptor selectMostSpecificInEachOverridableGroup = (SimpleFunctionDescriptor) obj;
                InterfaceC3776x[] interfaceC3776xArr = LazyJavaScope.f51933l;
                AbstractC16544l.m18094g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            case 2:
                JavaMember it2 = (JavaMember) obj;
                int i11 = LazyJavaStaticClassScope.f51953o;
                AbstractC16544l.m18094g(it2, "it");
                return Boolean.valueOf(it2.isStatic());
            case 3:
                MemberScope it3 = (MemberScope) obj;
                int i12 = LazyJavaStaticClassScope.f51953o;
                AbstractC16544l.m18094g(it3, "it");
                return it3.getVariableNames();
            default:
                int i13 = LazyJavaStaticClassScope.f51953o;
                ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((KotlinType) obj).getConstructor().mo22589getDeclarationDescriptor();
                if (classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor) {
                    return (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor;
                }
                return null;
        }
    }
}
