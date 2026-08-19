package kotlin.reflect.jvm.internal.impl.resolve;

import gn.C14197b;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p001A.C0093v0;
import p049Bm.InterfaceC1439n;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorEquivalenceForOverrides {
    public static final DescriptorEquivalenceForOverrides INSTANCE = new DescriptorEquivalenceForOverrides();

    /* JADX INFO: renamed from: a */
    public static SourceElement m18339a(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            AbstractC16544l.m18093f(overriddenDescriptors, "getOverriddenDescriptors(...)");
            callableDescriptor = (CallableMemberDescriptor) AbstractC17680n.m19366p0(overriddenDescriptors);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.getSource();
    }

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z6, boolean z10, boolean z11, KotlinTypeRefiner kotlinTypeRefiner, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        return descriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent(callableDescriptor, callableDescriptor2, z6, z12, z11, kotlinTypeRefiner);
    }

    public static /* synthetic */ boolean areEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z6, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return descriptorEquivalenceForOverrides.areEquivalent(declarationDescriptor, declarationDescriptor2, z6, z10);
    }

    public static /* synthetic */ boolean areTypeParametersEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z6, InterfaceC1439n interfaceC1439n, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            interfaceC1439n = C14197b.f44608Z;
        }
        return descriptorEquivalenceForOverrides.areTypeParametersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, z6, interfaceC1439n);
    }

    public final boolean areCallableDescriptorsEquivalent(CallableDescriptor a10, CallableDescriptor b, boolean z6, boolean z10, boolean z11, KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(a10, "a");
        AbstractC16544l.m18094g(b, "b");
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (a10.equals(b)) {
            return true;
        }
        if (!AbstractC16544l.m18089b(a10.getName(), b.getName())) {
            return false;
        }
        if (z10 && (a10 instanceof MemberDescriptor) && (b instanceof MemberDescriptor) && ((MemberDescriptor) a10).isExpect() != ((MemberDescriptor) b).isExpect()) {
            return false;
        }
        if ((AbstractC16544l.m18089b(a10.getContainingDeclaration(), b.getContainingDeclaration()) && (!z6 || !AbstractC16544l.m18089b(m18339a(a10), m18339a(b)))) || DescriptorUtils.isLocal(a10) || DescriptorUtils.isLocal(b)) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = a10.getContainingDeclaration();
        DeclarationDescriptor containingDeclaration2 = b.getContainingDeclaration();
        if (!(((containingDeclaration instanceof CallableMemberDescriptor) || (containingDeclaration2 instanceof CallableMemberDescriptor)) ? false : areEquivalent$default(this, containingDeclaration, containingDeclaration2, z6, false, 8, null))) {
            return false;
        }
        OverridingUtil overridingUtilCreate = OverridingUtil.create(kotlinTypeRefiner, new C0093v0(a10, b, z6));
        AbstractC16544l.m18093f(overridingUtilCreate, "create(...)");
        boolean z12 = !z11;
        OverridingUtil.OverrideCompatibilityInfo.Result result = overridingUtilCreate.isOverridableBy(a10, b, null, z12).getResult();
        OverridingUtil.OverrideCompatibilityInfo.Result result2 = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        return result == result2 && overridingUtilCreate.isOverridableBy(b, a10, null, z12).getResult() == result2;
    }

    public final boolean areEquivalent(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z6, boolean z10) {
        if ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) {
            return AbstractC16544l.m18089b(((ClassDescriptor) declarationDescriptor).getTypeConstructor(), ((ClassDescriptor) declarationDescriptor2).getTypeConstructor());
        }
        if ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return areTypeParametersEquivalent$default(this, (TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z6, null, 8, null);
        }
        if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            return areCallableDescriptorsEquivalent$default(this, (CallableDescriptor) declarationDescriptor, (CallableDescriptor) declarationDescriptor2, z6, z10, false, KotlinTypeRefiner.Default.INSTANCE, 16, null);
        }
        return ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? AbstractC16544l.m18089b(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), ((PackageFragmentDescriptor) declarationDescriptor2).getFqName()) : AbstractC16544l.m18089b(declarationDescriptor, declarationDescriptor2);
    }

    public final boolean areTypeParametersEquivalent(TypeParameterDescriptor a10, TypeParameterDescriptor b, boolean z6) {
        AbstractC16544l.m18094g(a10, "a");
        AbstractC16544l.m18094g(b, "b");
        return areTypeParametersEquivalent$default(this, a10, b, z6, null, 8, null);
    }

    public final boolean areTypeParametersEquivalent(TypeParameterDescriptor a10, TypeParameterDescriptor b, boolean z6, InterfaceC1439n equivalentCallables) {
        AbstractC16544l.m18094g(a10, "a");
        AbstractC16544l.m18094g(b, "b");
        AbstractC16544l.m18094g(equivalentCallables, "equivalentCallables");
        if (a10.equals(b)) {
            return true;
        }
        if (AbstractC16544l.m18089b(a10.getContainingDeclaration(), b.getContainingDeclaration())) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = a10.getContainingDeclaration();
        DeclarationDescriptor containingDeclaration2 = b.getContainingDeclaration();
        return (((containingDeclaration instanceof CallableMemberDescriptor) || (containingDeclaration2 instanceof CallableMemberDescriptor)) ? ((Boolean) equivalentCallables.invoke(containingDeclaration, containingDeclaration2)).booleanValue() : areEquivalent$default(this, containingDeclaration, containingDeclaration2, z6, false, 8, null)) && a10.getIndex() == b.getIndex();
    }
}
