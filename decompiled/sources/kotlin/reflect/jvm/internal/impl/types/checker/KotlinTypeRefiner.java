package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p049Bm.InterfaceC1426a;
import p509Uk.lpqL.SfpOlmlMATQ;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KotlinTypeRefiner extends AbstractTypeRefiner {

    public static final class Default extends KotlinTypeRefiner {
        public static final Default INSTANCE = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public ClassDescriptor findClassAcrossModuleDependencies(ClassId classId) {
            AbstractC16544l.m18094g(classId, "classId");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public boolean isRefinementNeededForModule(ModuleDescriptor moduleDescriptor) {
            AbstractC16544l.m18094g(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public boolean isRefinementNeededForTypeConstructor(TypeConstructor typeConstructor) {
            AbstractC16544l.m18094g(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public ClassDescriptor refineDescriptor(DeclarationDescriptor descriptor) {
            AbstractC16544l.m18094g(descriptor, "descriptor");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public Collection<KotlinType> refineSupertypes(ClassDescriptor classDescriptor) {
            AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
            Collection<KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
            AbstractC16544l.m18093f(supertypes, "getSupertypes(...)");
            return supertypes;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public <S extends MemberScope> S getOrPutScopeForClass(ClassDescriptor classDescriptor, InterfaceC1426a interfaceC1426a) {
            AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
            AbstractC16544l.m18094g(interfaceC1426a, SfpOlmlMATQ.pVjLNwDNTM);
            return (S) interfaceC1426a.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
        public KotlinType refineType(KotlinTypeMarker type) {
            AbstractC16544l.m18094g(type, "type");
            return (KotlinType) type;
        }
    }

    public abstract ClassDescriptor findClassAcrossModuleDependencies(ClassId classId);

    public abstract <S extends MemberScope> S getOrPutScopeForClass(ClassDescriptor classDescriptor, InterfaceC1426a interfaceC1426a);

    public abstract boolean isRefinementNeededForModule(ModuleDescriptor moduleDescriptor);

    public abstract boolean isRefinementNeededForTypeConstructor(TypeConstructor typeConstructor);

    public abstract ClassifierDescriptor refineDescriptor(DeclarationDescriptor declarationDescriptor);

    public abstract Collection<KotlinType> refineSupertypes(ClassDescriptor classDescriptor);

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
    public abstract KotlinType refineType(KotlinTypeMarker kotlinTypeMarker);
}
