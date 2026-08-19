package kotlin.reflect.jvm.internal.impl.builtins.functions;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import mm.C17296C;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class FunctionClassDescriptor extends AbstractClassDescriptor {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: x0 */
    public static final ClassId f51322x0;

    /* JADX INFO: renamed from: y0 */
    public static final ClassId f51323y0;

    /* JADX INFO: renamed from: q0 */
    public final StorageManager f51324q0;

    /* JADX INFO: renamed from: r0 */
    public final PackageFragmentDescriptor f51325r0;

    /* JADX INFO: renamed from: s0 */
    public final FunctionTypeKind f51326s0;

    /* JADX INFO: renamed from: t0 */
    public final int f51327t0;

    /* JADX INFO: renamed from: u0 */
    public final C16560a f51328u0;

    /* JADX INFO: renamed from: v0 */
    public final FunctionClassScope f51329v0;

    /* JADX INFO: renamed from: w0 */
    public final List f51330w0;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        FqName fqName = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
        Name nameIdentifier = Name.identifier("Function");
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        f51322x0 = new ClassId(fqName, nameIdentifier);
        FqName fqName2 = StandardNames.KOTLIN_REFLECT_FQ_NAME;
        Name nameIdentifier2 = Name.identifier("KFunction");
        AbstractC16544l.m18093f(nameIdentifier2, "identifier(...)");
        f51323y0 = new ClassId(fqName2, nameIdentifier2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassDescriptor(StorageManager storageManager, PackageFragmentDescriptor containingDeclaration, FunctionTypeKind functionTypeKind, int i10) {
        super(storageManager, functionTypeKind.numberedClassName(i10));
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
        AbstractC16544l.m18094g(functionTypeKind, "functionTypeKind");
        this.f51324q0 = storageManager;
        this.f51325r0 = containingDeclaration;
        this.f51326s0 = functionTypeKind;
        this.f51327t0 = i10;
        this.f51328u0 = new C16560a(this);
        this.f51329v0 = new FunctionClassScope(storageManager, this);
        ArrayList arrayList = new ArrayList();
        C3508g c3508g = new C3508g(1, i10, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(c3508g, 10));
        C3507f it = c3508g.iterator();
        while (it.f10596o0) {
            int iMo4199a = it.mo4199a();
            arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, Annotations.Companion.getEMPTY(), false, Variance.IN_VARIANCE, Name.identifier(AbstractC10763a.m11048f(iMo4199a, "P")), arrayList.size(), this.f51324q0));
            arrayList2.add(C17296C.f55119a);
        }
        arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, Annotations.Companion.getEMPTY(), false, Variance.OUT_VARIANCE, Name.identifier(TokenNames.f32017R), arrayList.size(), this.f51324q0));
        this.f51330w0 = AbstractC17680n.m19322C0(arrayList);
        FunctionClassKind.Companion.getFunctionClassKind(this.f51326s0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    public final int getArity() {
        return this.f51327t0;
    }

    public Void getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.f51330w0;
    }

    public final FunctionTypeKind getFunctionTypeKind() {
        return this.f51326s0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        return ClassKind.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        return Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        AbstractC16544l.m18093f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.f51328u0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f51329v0;
    }

    public Void getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility PUBLIC = DescriptorVisibilities.PUBLIC;
        AbstractC16544l.m18093f(PUBLIC, "PUBLIC");
        return PUBLIC;
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
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
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    public String toString() {
        String strAsString = getName().asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        return strAsString;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassDescriptor mo22583getCompanionObjectDescriptor() {
        return (ClassDescriptor) getCompanionObjectDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ClassConstructorDescriptor> getConstructors() {
        return C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public PackageFragmentDescriptor getContainingDeclaration() {
        return this.f51325r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ClassDescriptor> getSealedSubclasses() {
        return C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope.Empty getStaticScope() {
        return MemberScope.Empty.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassConstructorDescriptor mo22584getUnsubstitutedPrimaryConstructor() {
        return (ClassConstructorDescriptor) getUnsubstitutedPrimaryConstructor();
    }
}
