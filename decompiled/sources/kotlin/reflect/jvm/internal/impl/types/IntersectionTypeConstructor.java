package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import p049Bm.InterfaceC1436k;
import p077Cn.C1756x;
import p165G9.AbstractC3021g;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import pn.C18516c;

/* JADX INFO: loaded from: classes2.dex */
public final class IntersectionTypeConstructor implements TypeConstructor, IntersectionTypeConstructorMarker {

    /* JADX INFO: renamed from: a */
    public KotlinType f53170a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f53171b;

    /* JADX INFO: renamed from: c */
    public final int f53172c;

    public IntersectionTypeConstructor(Collection<? extends KotlinType> typesToIntersect) {
        AbstractC16544l.m18094g(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.f53171b = linkedHashSet;
        this.f53172c = linkedHashSet.hashCode();
    }

    public static /* synthetic */ String makeDebugNameForIntersectionType$default(IntersectionTypeConstructor intersectionTypeConstructor, InterfaceC1436k interfaceC1436k, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC1436k = C18516c.f59005o0;
        }
        return intersectionTypeConstructor.makeDebugNameForIntersectionType(interfaceC1436k);
    }

    public final MemberScope createScopeForKotlinType() {
        return TypeIntersectionScope.Companion.create("member scope for intersection type", this.f53171b);
    }

    public final SimpleType createType() {
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), this, C17689w.f56480Y, false, createScopeForKotlinType(), new C1756x(this, 27));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntersectionTypeConstructor) {
            return AbstractC16544l.m18089b(this.f53171b, ((IntersectionTypeConstructor) obj).f53171b);
        }
        return false;
    }

    public final KotlinType getAlternativeType() {
        return this.f53170a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = ((KotlinType) this.f53171b.iterator().next()).getConstructor().getBuiltIns();
        AbstractC16544l.m18093f(builtIns, "getBuiltIns(...)");
        return builtIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo22589getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> getSupertypes() {
        return this.f53171b;
    }

    public int hashCode() {
        return this.f53172c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public final String makeDebugNameForIntersectionType(final InterfaceC1436k getProperTypeRelatedToStringify) {
        AbstractC16544l.m18094g(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return AbstractC17680n.m19349Y(AbstractC17680n.m19370t0(this.f53171b, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                KotlinType kotlinType = (KotlinType) t10;
                AbstractC16544l.m18091d(kotlinType);
                InterfaceC1436k interfaceC1436k = getProperTypeRelatedToStringify;
                String string = interfaceC1436k.invoke(kotlinType).toString();
                KotlinType kotlinType2 = (KotlinType) t11;
                AbstractC16544l.m18091d(kotlinType2);
                return AbstractC3021g.m3873a(string, interfaceC1436k.invoke(kotlinType2).toString());
            }
        }), " & ", "{", "}", 0, null, new C1756x(getProperTypeRelatedToStringify, 26), 24);
    }

    public final IntersectionTypeConstructor setAlternative(KotlinType kotlinType) {
        IntersectionTypeConstructor intersectionTypeConstructor = new IntersectionTypeConstructor(this.f53171b);
        intersectionTypeConstructor.f53170a = kotlinType;
        return intersectionTypeConstructor;
    }

    public String toString() {
        return makeDebugNameForIntersectionType$default(this, null, 1, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public IntersectionTypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection<KotlinType> supertypes = getSupertypes();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(supertypes, 10));
        Iterator<T> it = supertypes.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).refine(kotlinTypeRefiner));
            z6 = true;
        }
        IntersectionTypeConstructor alternative = null;
        if (z6) {
            KotlinType alternativeType = getAlternativeType();
            alternative = new IntersectionTypeConstructor(arrayList).setAlternative(alternativeType != null ? alternativeType.refine(kotlinTypeRefiner) : null);
        }
        return alternative == null ? this : alternative;
    }
}
