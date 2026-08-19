package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3776x;
import p298Lm.C5140G;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GivenFunctionsMemberScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ InterfaceC3776x[] f52930c = {AbstractC16526C.f51263a.mo5699h(new C16553u(GivenFunctionsMemberScope.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a */
    public final ClassDescriptor f52931a;

    /* JADX INFO: renamed from: b */
    public final NotNullLazyValue f52932b;

    public GivenFunctionsMemberScope(StorageManager storageManager, ClassDescriptor containingClass) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(containingClass, "containingClass");
        this.f52931a = containingClass;
        this.f52932b = storageManager.createLazyValue(new C5140G(this, 22));
    }

    /* JADX INFO: renamed from: a */
    public abstract List mo5681a();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        if (!kindFilter.acceptsKinds(DescriptorKindFilter.CALLABLES.getKindMask())) {
            return C17689w.f56480Y;
        }
        return (List) StorageKt.getValue(this.f52932b, this, f52930c[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        Collection<SimpleFunctionDescriptor> collection;
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        List list = (List) StorageKt.getValue(this.f52932b, this, f52930c[0]);
        if (list.isEmpty()) {
            collection = C17689w.f56480Y;
        } else {
            SmartList smartList = new SmartList();
            for (Object obj : list) {
                if ((obj instanceof SimpleFunctionDescriptor) && AbstractC16544l.m18089b(((SimpleFunctionDescriptor) obj).getName(), name)) {
                    smartList.add(obj);
                }
            }
            collection = smartList;
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        Collection<PropertyDescriptor> collection;
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        List list = (List) StorageKt.getValue(this.f52932b, this, f52930c[0]);
        if (list.isEmpty()) {
            collection = C17689w.f56480Y;
        } else {
            SmartList smartList = new SmartList();
            for (Object obj : list) {
                if ((obj instanceof PropertyDescriptor) && AbstractC16544l.m18089b(((PropertyDescriptor) obj).getName(), name)) {
                    smartList.add(obj);
                }
            }
            collection = smartList;
        }
        return collection;
    }
}
