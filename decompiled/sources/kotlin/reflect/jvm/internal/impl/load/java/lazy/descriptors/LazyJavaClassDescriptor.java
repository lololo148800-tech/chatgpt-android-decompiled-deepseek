package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import mm.C17314q;
import p077Cn.C1756x;
import p1091wn.InterfaceC21029j;
import p165G9.AbstractC3021g;
import p571X9.AbstractC9227W;
import p605Ym.C10088b;
import p605Ym.C10089c;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: A0 */
    public final Visibility f51893A0;

    /* JADX INFO: renamed from: B0 */
    public final boolean f51894B0;

    /* JADX INFO: renamed from: C0 */
    public final C10089c f51895C0;

    /* JADX INFO: renamed from: D0 */
    public final LazyJavaClassMemberScope f51896D0;

    /* JADX INFO: renamed from: E0 */
    public final ScopesHolderForClass f51897E0;

    /* JADX INFO: renamed from: F0 */
    public final InnerClassesScopeWrapper f51898F0;

    /* JADX INFO: renamed from: G0 */
    public final LazyJavaStaticClassScope f51899G0;

    /* JADX INFO: renamed from: H0 */
    public final Annotations f51900H0;

    /* JADX INFO: renamed from: I0 */
    public final NotNullLazyValue f51901I0;

    /* JADX INFO: renamed from: t0 */
    public final LazyJavaResolverContext f51902t0;

    /* JADX INFO: renamed from: u0 */
    public final JavaClass f51903u0;

    /* JADX INFO: renamed from: v0 */
    public final ClassDescriptor f51904v0;

    /* JADX INFO: renamed from: w0 */
    public final LazyJavaResolverContext f51905w0;

    /* JADX INFO: renamed from: x0 */
    public final C17314q f51906x0;

    /* JADX INFO: renamed from: y0 */
    public final ClassKind f51907y0;

    /* JADX INFO: renamed from: z0 */
    public final Modality f51908z0;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        AbstractC17678l.m19293P(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    public /* synthetic */ LazyJavaClassDescriptor(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaClass javaClass, ClassDescriptor classDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, declarationDescriptor, javaClass, (i10 & 8) != 0 ? null : classDescriptor);
    }

    public final LazyJavaClassDescriptor copy$descriptors_jvm(JavaResolverCache javaResolverCache, ClassDescriptor classDescriptor) {
        AbstractC16544l.m18094g(javaResolverCache, "javaResolverCache");
        LazyJavaResolverContext lazyJavaResolverContext = this.f51905w0;
        LazyJavaResolverContext lazyJavaResolverContextReplaceComponents = ContextKt.replaceComponents(lazyJavaResolverContext, lazyJavaResolverContext.getComponents().replace(javaResolverCache));
        DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
        return new LazyJavaClassDescriptor(lazyJavaResolverContextReplaceComponents, containingDeclaration, this.f51903u0, classDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.f51900H0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo22583getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return (List) this.f51901I0.invoke();
    }

    public final JavaClass getJClass() {
        return this.f51903u0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        return this.f51907y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        return this.f51908z0;
    }

    public final List<JavaAnnotation> getModuleAnnotations() {
        return (List) this.f51906x0.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> getSealedSubclasses() {
        if (this.f51908z0 != Modality.SEALED) {
            return C17689w.f56480Y;
        }
        JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
        InterfaceC21029j permittedTypes = this.f51903u0.getPermittedTypes();
        ArrayList arrayList = new ArrayList();
        Iterator it = permittedTypes.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = this.f51905w0.getTypeResolver().transformJavaType((JavaClassifierType) it.next(), attributes$default).getConstructor().mo22589getDeclarationDescriptor();
            ClassDescriptor classDescriptor = classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null;
            if (classDescriptor != null) {
                arrayList.add(classDescriptor);
            }
        }
        return AbstractC17680n.m19370t0(arrayList, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$getSealedSubclasses$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return AbstractC3021g.m3873a(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t10).asString(), DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t11).asString());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getStaticScope() {
        return this.f51899G0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.f51895C0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedInnerClassesScope() {
        return this.f51898F0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (LazyJavaClassMemberScope) this.f51897E0.getScope(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo22584getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PRIVATE;
        Visibility visibility = this.f51893A0;
        if (!AbstractC16544l.m18089b(visibility, descriptorVisibility) || this.f51903u0.getOuterClass() != null) {
            return UtilsKt.toDescriptorVisibility(visibility);
        }
        DescriptorVisibility descriptorVisibility2 = JavaDescriptorVisibilities.PACKAGE_VISIBILITY;
        AbstractC16544l.m18091d(descriptorVisibility2);
        return descriptorVisibility2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.f51894B0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    public String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.getFqNameUnsafe(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(LazyJavaResolverContext outerContext, DeclarationDescriptor containingDeclaration, JavaClass jClass, ClassDescriptor classDescriptor) {
        Modality modalityConvertFromFlags;
        super(outerContext.getStorageManager(), containingDeclaration, jClass.getName(), outerContext.getComponents().getSourceElementFactory().source(jClass), false);
        AbstractC16544l.m18094g(outerContext, "outerContext");
        AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
        AbstractC16544l.m18094g(jClass, "jClass");
        this.f51902t0 = outerContext;
        this.f51903u0 = jClass;
        this.f51904v0 = classDescriptor;
        LazyJavaResolverContext lazyJavaResolverContextChildForClassOrPackage$default = ContextKt.childForClassOrPackage$default(outerContext, this, jClass, 0, 4, null);
        this.f51905w0 = lazyJavaResolverContextChildForClassOrPackage$default;
        lazyJavaResolverContextChildForClassOrPackage$default.getComponents().getJavaResolverCache().recordClass(jClass, this);
        jClass.getLightClassOriginKind();
        this.f51906x0 = AbstractC9227W.m9800c(new C10088b(this, 0));
        this.f51907y0 = jClass.isAnnotationType() ? ClassKind.ANNOTATION_CLASS : jClass.isInterface() ? ClassKind.INTERFACE : jClass.isEnum() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        if (jClass.isAnnotationType() || jClass.isEnum()) {
            modalityConvertFromFlags = Modality.FINAL;
        } else {
            modalityConvertFromFlags = Modality.Companion.convertFromFlags(jClass.isSealed(), jClass.isSealed() || jClass.isAbstract() || jClass.isInterface(), !jClass.isFinal());
        }
        this.f51908z0 = modalityConvertFromFlags;
        this.f51893A0 = jClass.getVisibility();
        this.f51894B0 = (jClass.getOuterClass() == null || jClass.isStatic()) ? false : true;
        this.f51895C0 = new C10089c(this);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(lazyJavaResolverContextChildForClassOrPackage$default, this, jClass, classDescriptor != null, null, 16, null);
        this.f51896D0 = lazyJavaClassMemberScope;
        this.f51897E0 = ScopesHolderForClass.Companion.create(this, lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager(), lazyJavaResolverContextChildForClassOrPackage$default.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new C1756x(this, 15));
        this.f51898F0 = new InnerClassesScopeWrapper(lazyJavaClassMemberScope);
        this.f51899G0 = new LazyJavaStaticClassScope(lazyJavaResolverContextChildForClassOrPackage$default, jClass, this);
        this.f51900H0 = LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContextChildForClassOrPackage$default, jClass);
        this.f51901I0 = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new C10088b(this, 1));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ClassConstructorDescriptor> getConstructors() {
        return (List) this.f51896D0.getConstructors$descriptors_jvm().invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public LazyJavaClassMemberScope getUnsubstitutedMemberScope() {
        MemberScope unsubstitutedMemberScope = super.getUnsubstitutedMemberScope();
        AbstractC16544l.m18092e(unsubstitutedMemberScope, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (LazyJavaClassMemberScope) unsubstitutedMemberScope;
    }
}
