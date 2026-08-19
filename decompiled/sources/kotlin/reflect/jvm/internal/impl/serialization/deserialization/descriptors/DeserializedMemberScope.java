package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kn.C16479a;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p298Lm.C5140G;
import p910nn.C17703k;
import p910nn.C17706n;
import p910nn.InterfaceC17700h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeserializedMemberScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC3776x[] f53092e;

    /* JADX INFO: renamed from: a */
    public final DeserializationContext f53093a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17700h f53094b;

    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue f53095c;

    /* JADX INFO: renamed from: d */
    public final NullableLazyValue f53096d;

    static {
        C16553u c16553u = new C16553u(DeserializedMemberScope.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f53092e = new InterfaceC3776x[]{c16527d.mo5699h(c16553u), AbstractC3794B0.m4493r(DeserializedMemberScope.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0, c16527d)};
    }

    public DeserializedMemberScope(DeserializationContext c9, List list, List list2, List list3, InterfaceC1426a classNames) {
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(classNames, "classNames");
        this.f53093a = c9;
        this.f53094b = c9.getComponents().getConfiguration().getPreserveDeclarationsOrdering() ? new C17703k(this, list, list2, list3) : new C17706n(this, list, list2, list3);
        this.f53095c = c9.getStorageManager().createLazyValue(new C16479a(1, classNames));
        this.f53096d = c9.getStorageManager().createNullableLazyValue(new C5140G(this, 28));
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo18381a(ArrayList arrayList, InterfaceC1436k interfaceC1436k);

    /* JADX INFO: renamed from: b */
    public final Collection m18382b(DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter, NoLookupLocation location) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        AbstractC16544l.m18094g(location, "location");
        ArrayList arrayList = new ArrayList(0);
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (kindFilter.acceptsKinds(companion.getSINGLETON_CLASSIFIERS_MASK())) {
            mo18381a(arrayList, nameFilter);
        }
        InterfaceC17700h interfaceC17700h = this.f53094b;
        interfaceC17700h.mo19406c(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.acceptsKinds(companion.getCLASSIFIERS_MASK())) {
            for (Name name : getClassNames$deserialization()) {
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    CollectionsKt.addIfNotNull(arrayList, this.f53093a.getComponents().deserializeClass(mo18385e(name)));
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getTYPE_ALIASES_MASK())) {
            for (Name name2 : interfaceC17700h.mo19404a()) {
                if (((Boolean) nameFilter.invoke(name2)).booleanValue()) {
                    CollectionsKt.addIfNotNull(arrayList, interfaceC17700h.mo19405b(name2));
                }
            }
        }
        return CollectionsKt.compact(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public void mo18383c(Name name, ArrayList arrayList) {
        AbstractC16544l.m18094g(name, "name");
    }

    /* JADX INFO: renamed from: d */
    public void mo18384d(Name name, ArrayList arrayList) {
        AbstractC16544l.m18094g(name, "name");
    }

    /* JADX INFO: renamed from: e */
    public abstract ClassId mo18385e(Name name);

    /* JADX INFO: renamed from: f */
    public abstract Set mo18386f();

    /* JADX INFO: renamed from: g */
    public abstract Set mo18387g();

    public final Set<Name> getClassNames$deserialization() {
        return (Set) StorageKt.getValue(this.f53095c, this, f53092e[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return (Set) StorageKt.getValue(this.f53096d, this, f53092e[1]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo22590getContributedClassifier(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        if (mo18389i(name)) {
            return this.f53093a.getComponents().deserializeClass(mo18385e(name));
        }
        InterfaceC17700h interfaceC17700h = this.f53094b;
        if (interfaceC17700h.mo19404a().contains(name)) {
            return interfaceC17700h.mo19405b(name);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return this.f53094b.getContributedFunctions(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return this.f53094b.getContributedVariables(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return this.f53094b.getFunctionNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return this.f53094b.getVariableNames();
    }

    /* JADX INFO: renamed from: h */
    public abstract Set mo18388h();

    /* JADX INFO: renamed from: i */
    public boolean mo18389i(Name name) {
        AbstractC16544l.m18094g(name, "name");
        return getClassNames$deserialization().contains(name);
    }

    /* JADX INFO: renamed from: j */
    public boolean mo18390j(SimpleFunctionDescriptor function) {
        AbstractC16544l.m18094g(function, "function");
        return true;
    }
}
