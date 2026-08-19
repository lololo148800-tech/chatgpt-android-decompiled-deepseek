package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p049Bm.InterfaceC1436k;
import p909nm.C17689w;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public class SubpackagesScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: a */
    public final ModuleDescriptor f51636a;

    /* JADX INFO: renamed from: b */
    public final FqName f51637b;

    public SubpackagesScope(ModuleDescriptor moduleDescriptor, FqName fqName) {
        AbstractC16544l.m18094g(moduleDescriptor, "moduleDescriptor");
        AbstractC16544l.m18094g(fqName, "fqName");
        this.f51636a = moduleDescriptor;
        this.f51637b = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return C17691y.f56482Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        boolean zAcceptsKinds = kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getPACKAGES_MASK());
        C17689w c17689w = C17689w.f56480Y;
        if (!zAcceptsKinds) {
            return c17689w;
        }
        FqName fqName = this.f51637b;
        if (fqName.isRoot() && kindFilter.getExcludes().contains(DescriptorKindExclude.TopLevelPackages.INSTANCE)) {
            return c17689w;
        }
        ModuleDescriptor moduleDescriptor = this.f51636a;
        Collection<FqName> subPackagesOf = moduleDescriptor.getSubPackagesOf(fqName, nameFilter);
        ArrayList arrayList = new ArrayList(subPackagesOf.size());
        Iterator<FqName> it = subPackagesOf.iterator();
        while (it.hasNext()) {
            Name name = it.next().shortName();
            if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                AbstractC16544l.m18094g(name, "name");
                PackageViewDescriptor packageViewDescriptor = null;
                if (!name.isSpecial()) {
                    PackageViewDescriptor packageViewDescriptor2 = moduleDescriptor.getPackage(fqName.child(name));
                    if (!packageViewDescriptor2.isEmpty()) {
                        packageViewDescriptor = packageViewDescriptor2;
                    }
                }
                CollectionsKt.addIfNotNull(arrayList, packageViewDescriptor);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "subpackages of " + this.f51637b + " from " + this.f51636a;
    }
}
