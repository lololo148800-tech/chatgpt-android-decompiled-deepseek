package kotlin.reflect.jvm.internal.impl.descriptors;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p388Pm.C6512f;
import p388Pm.C6513g;
import p509Uk.lpqL.SfpOlmlMATQ;
import p530Vi.AbstractC8301I;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public final class NotFoundClasses {

    /* JADX INFO: renamed from: a */
    public final StorageManager f51405a;

    /* JADX INFO: renamed from: b */
    public final ModuleDescriptor f51406b;

    /* JADX INFO: renamed from: c */
    public final MemoizedFunctionToNotNull f51407c;

    /* JADX INFO: renamed from: d */
    public final MemoizedFunctionToNotNull f51408d;

    public static final class MockClassDescriptor extends ClassDescriptorBase {

        /* JADX INFO: renamed from: t0 */
        public final boolean f51409t0;

        /* JADX INFO: renamed from: u0 */
        public final ArrayList f51410u0;

        /* JADX INFO: renamed from: v0 */
        public final ClassTypeConstructorImpl f51411v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(StorageManager storageManager, DeclarationDescriptor container, Name name, boolean z6, int i10) {
            super(storageManager, container, name, SourceElement.NO_SOURCE, false);
            AbstractC16544l.m18094g(storageManager, "storageManager");
            AbstractC16544l.m18094g(container, "container");
            AbstractC16544l.m18094g(name, "name");
            this.f51409t0 = z6;
            C3508g c3508gM8929t = AbstractC8301I.m8929t(0, i10);
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c3508gM8929t, 10));
            C3507f it = c3508gM8929t.iterator();
            while (it.f10596o0) {
                int iMo4199a = it.mo4199a();
                arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, Annotations.Companion.getEMPTY(), false, Variance.INVARIANT, Name.identifier(TokenNames.f32019T + iMo4199a), iMo4199a, storageManager));
            }
            this.f51410u0 = arrayList;
            this.f51411v0 = new ClassTypeConstructorImpl(this, TypeParameterUtilsKt.computeConstructorTypeParameters(this), AbstractC17665J.m19268h(DescriptorUtilsKt.getModule(this).getBuiltIns().getAnyType()), storageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        public Annotations getAnnotations() {
            return Annotations.Companion.getEMPTY();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        /* JADX INFO: renamed from: getCompanionObjectDescriptor */
        public ClassDescriptor mo22583getCompanionObjectDescriptor() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public Collection<ClassConstructorDescriptor> getConstructors() {
            return C17691y.f56482Y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
            return this.f51410u0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public ClassKind getKind() {
            return ClassKind.CLASS;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public Modality getModality() {
            return Modality.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public Collection<ClassDescriptor> getSealedSubclasses() {
            return C17689w.f56480Y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
        public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
            AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return MemberScope.Empty.INSTANCE;
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

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
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
            return this.f51409t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isValue() {
            return false;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public MemberScope.Empty getStaticScope() {
            return MemberScope.Empty.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        public ClassTypeConstructorImpl getTypeConstructor() {
            return this.f51411v0;
        }
    }

    public NotFoundClasses(StorageManager storageManager, ModuleDescriptor module) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(module, "module");
        this.f51405a = storageManager;
        this.f51406b = module;
        this.f51407c = storageManager.createMemoizedFunction(new C6512f(this, 0));
        this.f51408d = storageManager.createMemoizedFunction(new C6512f(this, 1));
    }

    public final ClassDescriptor getClass(ClassId classId, List<Integer> list) {
        AbstractC16544l.m18094g(classId, "classId");
        AbstractC16544l.m18094g(list, SfpOlmlMATQ.NHaIwtFk);
        return (ClassDescriptor) this.f51408d.invoke(new C6513g(classId, list));
    }
}
