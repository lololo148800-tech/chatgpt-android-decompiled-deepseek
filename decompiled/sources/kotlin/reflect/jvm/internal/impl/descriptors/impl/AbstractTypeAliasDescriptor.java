package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p077Cn.C1756x;
import p298Lm.C5140G;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractTypeAliasDescriptor extends DeclarationDescriptorNonRootImpl implements TypeAliasDescriptor {

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ int f51469v0 = 0;

    /* JADX INFO: renamed from: q0 */
    public final StorageManager f51470q0;

    /* JADX INFO: renamed from: r0 */
    public final DescriptorVisibility f51471r0;

    /* JADX INFO: renamed from: s0 */
    public final NotNullLazyValue f51472s0;

    /* JADX INFO: renamed from: t0 */
    public List f51473t0;

    /* JADX INFO: renamed from: u0 */
    public final AbstractTypeAliasDescriptor$typeConstructor$1 f51474u0;

    static {
        AbstractC16526C.f51263a.mo5699h(new C16553u(AbstractTypeAliasDescriptor.class, "constructors", "getConstructors()Ljava/util/Collection;", 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1] */
    public AbstractTypeAliasDescriptor(StorageManager storageManager, DeclarationDescriptor containingDeclaration, Annotations annotations, Name name, SourceElement sourceElement, DescriptorVisibility visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
        AbstractC16544l.m18094g(annotations, "annotations");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(sourceElement, "sourceElement");
        AbstractC16544l.m18094g(visibilityImpl, "visibilityImpl");
        this.f51470q0 = storageManager;
        this.f51471r0 = visibilityImpl;
        this.f51472s0 = storageManager.createLazyValue(new C5140G(this, 10));
        this.f51474u0 = new TypeConstructor() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public KotlinBuiltIns getBuiltIns() {
                return DescriptorUtilsKt.getBuiltIns(mo22589getDeclarationDescriptor());
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public List<TypeParameterDescriptor> getParameters() {
                return this.f51475a.mo18132b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public Collection<KotlinType> getSupertypes() {
                Collection<KotlinType> supertypes = mo22589getDeclarationDescriptor().getUnderlyingType().getConstructor().getSupertypes();
                AbstractC16544l.m18093f(supertypes, "getSupertypes(...)");
                return supertypes;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public boolean isDenotable() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
                AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
                return this;
            }

            public String toString() {
                return "[typealias " + mo22589getDeclarationDescriptor().getName().asString() + ']';
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: getDeclarationDescriptor */
            public TypeAliasDescriptor mo22589getDeclarationDescriptor() {
                return this.f51475a;
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> visitor, D d10) {
        AbstractC16544l.m18094g(visitor, "visitor");
        return visitor.visitTypeAliasDescriptor(this, d10);
    }

    /* JADX INFO: renamed from: b */
    public abstract List mo18132b();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        List<TypeParameterDescriptor> list = this.f51473t0;
        if (list != null) {
            return list;
        }
        AbstractC16544l.m18103p("declaredTypeParametersImpl");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        return Modality.FINAL;
    }

    public final Collection<TypeAliasConstructorDescriptor> getTypeAliasConstructors() {
        ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor == null) {
            return C17689w.f56480Y;
        }
        Collection<ClassConstructorDescriptor> constructors = classDescriptor.getConstructors();
        AbstractC16544l.m18093f(constructors, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            TypeAliasConstructorDescriptorImpl.Companion companion = TypeAliasConstructorDescriptorImpl.Companion;
            AbstractC16544l.m18091d(classConstructorDescriptor);
            TypeAliasConstructorDescriptor typeAliasConstructorDescriptorCreateIfAvailable = companion.createIfAvailable(this.f51470q0, this, classConstructorDescriptor);
            if (typeAliasConstructorDescriptorCreateIfAvailable != null) {
                arrayList.add(typeAliasConstructorDescriptorCreateIfAvailable);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.f51474u0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        return this.f51471r0;
    }

    public final void initialize(List<? extends TypeParameterDescriptor> declaredTypeParameters) {
        AbstractC16544l.m18094g(declaredTypeParameters, "declaredTypeParameters");
        this.f51473t0 = declaredTypeParameters;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return TypeUtils.contains(getUnderlyingType(), new C1756x(this, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        return "typealias " + getName().asString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public TypeAliasDescriptor getOriginal() {
        DeclarationDescriptorWithSource original = super.getOriginal();
        AbstractC16544l.m18092e(original, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (TypeAliasDescriptor) original;
    }
}
