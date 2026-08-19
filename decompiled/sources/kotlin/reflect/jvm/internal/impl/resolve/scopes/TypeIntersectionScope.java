package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kn.C16480b;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeIntersectionScope extends AbstractScopeAdapter {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final MemberScope f52947a;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final MemberScope create(String message, Collection<? extends KotlinType> types) {
            AbstractC16544l.m18094g(message, "message");
            AbstractC16544l.m18094g(types, "types");
            Collection<? extends KotlinType> collection = types;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((KotlinType) it.next()).getMemberScope());
            }
            SmartList<MemberScope> smartListListOfNonEmptyScopes = ScopeUtilsKt.listOfNonEmptyScopes(arrayList);
            MemberScope memberScopeCreateOrSingle$descriptors = ChainedMemberScope.Companion.createOrSingle$descriptors(message, smartListListOfNonEmptyScopes);
            return smartListListOfNonEmptyScopes.size() <= 1 ? memberScopeCreateOrSingle$descriptors : new TypeIntersectionScope(message, memberScopeCreateOrSingle$descriptors, null);
        }
    }

    public TypeIntersectionScope(String str, MemberScope memberScope, DefaultConstructorMarker defaultConstructorMarker) {
        this.f52947a = memberScope;
    }

    public static final MemberScope create(String str, Collection<? extends KotlinType> collection) {
        return Companion.create(str, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    /* JADX INFO: renamed from: a */
    public final MemberScope mo18363a() {
        return this.f52947a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        Collection<DeclarationDescriptor> contributedDescriptors = super.getContributedDescriptors(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : contributedDescriptors) {
            if (((DeclarationDescriptor) obj) instanceof CallableDescriptor) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return AbstractC17680n.m19361k0(arrayList2, OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(arrayList, C16480b.f51123q0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedFunctions(name, location), C16480b.f51121o0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedVariables(name, location), C16480b.f51122p0);
    }
}
