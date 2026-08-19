package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p077Cn.C1756x;

/* JADX INFO: loaded from: classes2.dex */
public class LazySubstitutingClassDescriptor extends ModuleAwareClassDescriptor {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ int f51560s0 = 0;

    /* JADX INFO: renamed from: Y */
    public final ModuleAwareClassDescriptor f51561Y;

    /* JADX INFO: renamed from: Z */
    public final TypeSubstitutor f51562Z;

    /* JADX INFO: renamed from: o0 */
    public TypeSubstitutor f51563o0;

    /* JADX INFO: renamed from: p0 */
    public ArrayList f51564p0;

    /* JADX INFO: renamed from: q0 */
    public ArrayList f51565q0;

    /* JADX INFO: renamed from: r0 */
    public ClassTypeConstructorImpl f51566r0;

    public LazySubstitutingClassDescriptor(ModuleAwareClassDescriptor moduleAwareClassDescriptor, TypeSubstitutor typeSubstitutor) {
        this.f51561Y = moduleAwareClassDescriptor;
        this.f51562Z = typeSubstitutor;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18146a(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? 3 : 2];
        if (i10 == 2) {
            objArr[0] = "typeArguments";
        } else if (i10 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i10 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 == 8) {
            objArr[0] = "typeArguments";
        } else if (i10 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i10 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i10 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i10 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 13 && i10 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d10);
    }

    /* JADX INFO: renamed from: b */
    public final TypeSubstitutor m18147b() {
        if (this.f51563o0 == null) {
            TypeSubstitutor typeSubstitutor = this.f51562Z;
            if (typeSubstitutor.isEmpty()) {
                this.f51563o0 = typeSubstitutor;
            } else {
                List<TypeParameterDescriptor> parameters = this.f51561Y.getTypeConstructor().getParameters();
                this.f51564p0 = new ArrayList(parameters.size());
                this.f51563o0 = DescriptorSubstitutor.substituteTypeParameters(parameters, typeSubstitutor.getSubstitution(), this, this.f51564p0);
                ArrayList arrayList = this.f51564p0;
                AbstractC16544l.m18094g(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((TypeParameterDescriptor) obj).isCapturedFromOuterDeclaration()) {
                        arrayList2.add(obj);
                    }
                }
                this.f51565q0 = arrayList2;
            }
        }
        return this.f51563o0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations annotations = this.f51561Y.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        m18146a(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo22583getCompanionObjectDescriptor() {
        return this.f51561Y.mo22583getCompanionObjectDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassConstructorDescriptor> getConstructors() {
        Collection<ClassConstructorDescriptor> constructors = this.f51561Y.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        for (ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            arrayList.add(((ClassConstructorDescriptor) classConstructorDescriptor.newCopyBuilder().setOriginal(classConstructorDescriptor.getOriginal()).setModality(classConstructorDescriptor.getModality()).setVisibility(classConstructorDescriptor.getVisibility()).setKind(classConstructorDescriptor.getKind()).setCopyOverrides(false).build()).substitute(m18147b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor containingDeclaration = this.f51561Y.getContainingDeclaration();
        if (containingDeclaration != null) {
            return containingDeclaration;
        }
        m18146a(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ReceiverParameterDescriptor> getContextReceivers() {
        List<ReceiverParameterDescriptor> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18146a(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        m18147b();
        ArrayList arrayList = this.f51565q0;
        if (arrayList != null) {
            return arrayList;
        }
        m18146a(30);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType getDefaultType() {
        SimpleType simpleTypeSimpleTypeWithNonTrivialMemberScope = KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(DefaultTypeAttributeTranslator.INSTANCE.toAttributes(getAnnotations(), null, null), getTypeConstructor(), TypeUtils.getDefaultTypeProjections(getTypeConstructor().getParameters()), false, getUnsubstitutedMemberScope());
        if (simpleTypeSimpleTypeWithNonTrivialMemberScope != null) {
            return simpleTypeSimpleTypeWithNonTrivialMemberScope;
        }
        m18146a(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        ClassKind kind = this.f51561Y.getKind();
        if (kind != null) {
            return kind;
        }
        m18146a(25);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getMemberScope(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            m18146a(5);
            throw null;
        }
        if (kotlinTypeRefiner == null) {
            m18146a(6);
            throw null;
        }
        MemberScope memberScope = this.f51561Y.getMemberScope(typeSubstitution, kotlinTypeRefiner);
        if (!this.f51562Z.isEmpty()) {
            return new SubstitutingScope(memberScope, m18147b());
        }
        if (memberScope != null) {
            return memberScope;
        }
        m18146a(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        Modality modality = this.f51561Y.getModality();
        if (modality != null) {
            return modality;
        }
        m18146a(26);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public Name getName() {
        Name name = this.f51561Y.getName();
        if (name != null) {
            return name;
        }
        m18146a(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> getSealedSubclasses() {
        Collection<ClassDescriptor> sealedSubclasses = this.f51561Y.getSealedSubclasses();
        if (sealedSubclasses != null) {
            return sealedSubclasses;
        }
        m18146a(31);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        if (sourceElement != null) {
            return sourceElement;
        }
        m18146a(29);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getStaticScope() {
        MemberScope staticScope = this.f51561Y.getStaticScope();
        if (staticScope != null) {
            return staticScope;
        }
        m18146a(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ReceiverParameterDescriptor getThisAsReceiverParameter() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = this.f51561Y.getTypeConstructor();
        if (this.f51562Z.isEmpty()) {
            if (typeConstructor != null) {
                return typeConstructor;
            }
            m18146a(0);
            throw null;
        }
        if (this.f51566r0 == null) {
            TypeSubstitutor typeSubstitutorM18147b = m18147b();
            Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
            ArrayList arrayList = new ArrayList(supertypes.size());
            Iterator<KotlinType> it = supertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(typeSubstitutorM18147b.substitute(it.next(), Variance.INVARIANT));
            }
            this.f51566r0 = new ClassTypeConstructorImpl(this, this.f51564p0, arrayList, LockBasedStorageManager.NO_LOCKS);
        }
        ClassTypeConstructorImpl classTypeConstructorImpl = this.f51566r0;
        if (classTypeConstructorImpl != null) {
            return classTypeConstructorImpl;
        }
        m18146a(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedInnerClassesScope() {
        MemberScope unsubstitutedInnerClassesScope = this.f51561Y.getUnsubstitutedInnerClassesScope();
        if (unsubstitutedInnerClassesScope != null) {
            return unsubstitutedInnerClassesScope;
        }
        m18146a(28);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedMemberScope() {
        MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this.f51561Y)));
        if (unsubstitutedMemberScope != null) {
            return unsubstitutedMemberScope;
        }
        m18146a(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo22584getUnsubstitutedPrimaryConstructor() {
        return this.f51561Y.mo22584getUnsubstitutedPrimaryConstructor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        ValueClassRepresentation<SimpleType> valueClassRepresentation = this.f51561Y.getValueClassRepresentation();
        if (valueClassRepresentation == null) {
            return null;
        }
        return valueClassRepresentation.mapUnderlyingType(new C1756x(this, 4));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility visibility = this.f51561Y.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        m18146a(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.f51561Y.isActual();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return this.f51561Y.isCompanionObject();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return this.f51561Y.isData();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.f51561Y.isExpect();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f51561Y.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return this.f51561Y.isFun();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return this.f51561Y.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.f51561Y.isInner();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return this.f51561Y.isValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            m18146a(13);
            throw null;
        }
        MemberScope unsubstitutedMemberScope = this.f51561Y.getUnsubstitutedMemberScope(kotlinTypeRefiner);
        if (!this.f51562Z.isEmpty()) {
            return new SubstitutingScope(unsubstitutedMemberScope, m18147b());
        }
        if (unsubstitutedMemberScope != null) {
            return unsubstitutedMemberScope;
        }
        m18146a(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public ClassDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.isEmpty() ? this : new LazySubstitutingClassDescriptor(this, TypeSubstitutor.createChainedSubstitutor(typeSubstitutor.getSubstitution(), m18147b().getSubstitution()));
        }
        m18146a(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public ClassDescriptor getOriginal() {
        ClassDescriptor original = this.f51561Y.getOriginal();
        if (original != null) {
            return original;
        }
        m18146a(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getMemberScope(TypeSubstitution typeSubstitution) {
        if (typeSubstitution != null) {
            MemberScope memberScope = getMemberScope(typeSubstitution, DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this)));
            if (memberScope != null) {
                return memberScope;
            }
            m18146a(11);
            throw null;
        }
        m18146a(10);
        throw null;
    }
}
