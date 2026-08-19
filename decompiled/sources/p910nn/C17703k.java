package p910nn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p909nm.C17689w;

/* JADX INFO: renamed from: nn.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C17703k implements InterfaceC17700h {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ InterfaceC3776x[] f56504o;

    /* JADX INFO: renamed from: a */
    public final List f56505a;

    /* JADX INFO: renamed from: b */
    public final List f56506b;

    /* JADX INFO: renamed from: c */
    public final List f56507c;

    /* JADX INFO: renamed from: d */
    public final NotNullLazyValue f56508d;

    /* JADX INFO: renamed from: e */
    public final NotNullLazyValue f56509e;

    /* JADX INFO: renamed from: f */
    public final NotNullLazyValue f56510f;

    /* JADX INFO: renamed from: g */
    public final NotNullLazyValue f56511g;

    /* JADX INFO: renamed from: h */
    public final NotNullLazyValue f56512h;

    /* JADX INFO: renamed from: i */
    public final NotNullLazyValue f56513i;

    /* JADX INFO: renamed from: j */
    public final NotNullLazyValue f56514j;

    /* JADX INFO: renamed from: k */
    public final NotNullLazyValue f56515k;

    /* JADX INFO: renamed from: l */
    public final NotNullLazyValue f56516l;

    /* JADX INFO: renamed from: m */
    public final NotNullLazyValue f56517m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ DeserializedMemberScope f56518n;

    static {
        C16553u c16553u = new C16553u(C17703k.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f56504o = new InterfaceC3776x[]{c16527d.mo5699h(c16553u), AbstractC3794B0.m4493r(C17703k.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0, c16527d), AbstractC3794B0.m4493r(C17703k.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0, c16527d), AbstractC3794B0.m4493r(C17703k.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0, c16527d), AbstractC3794B0.m4493r(C17703k.class, "allProperties", "getAllProperties()Ljava/util/List;", 0, c16527d), AbstractC3794B0.m4493r(C17703k.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0, c16527d), AbstractC3794B0.m4493r(C17703k.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0, c16527d), AbstractC3794B0.m4493r(C17703k.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0, c16527d), AbstractC3794B0.m4493r(C17703k.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0, c16527d), AbstractC3794B0.m4493r(C17703k.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, c16527d)};
    }

    public C17703k(DeserializedMemberScope deserializedMemberScope, List list, List list2, List list3) {
        this.f56518n = deserializedMemberScope;
        this.f56505a = list;
        this.f56506b = list2;
        this.f56507c = deserializedMemberScope.f53093a.getComponents().getConfiguration().getTypeAliasesAllowed() ? list3 : C17689w.f56480Y;
        DeserializationContext deserializationContext = deserializedMemberScope.f53093a;
        this.f56508d = deserializationContext.getStorageManager().createLazyValue(new C17701i(this, 0));
        this.f56509e = deserializationContext.getStorageManager().createLazyValue(new C17701i(this, 1));
        this.f56510f = deserializationContext.getStorageManager().createLazyValue(new C17701i(this, 2));
        this.f56511g = deserializationContext.getStorageManager().createLazyValue(new C17701i(this, 3));
        this.f56512h = deserializationContext.getStorageManager().createLazyValue(new C17701i(this, 4));
        this.f56513i = deserializationContext.getStorageManager().createLazyValue(new C17701i(this, 5));
        this.f56514j = deserializationContext.getStorageManager().createLazyValue(new C17701i(this, 6));
        this.f56515k = deserializationContext.getStorageManager().createLazyValue(new C17701i(this, 7));
        this.f56516l = deserializationContext.getStorageManager().createLazyValue(new C17702j(this, deserializedMemberScope, 0));
        this.f56517m = deserializationContext.getStorageManager().createLazyValue(new C17702j(this, deserializedMemberScope, 1));
    }

    @Override // p910nn.InterfaceC17700h
    /* JADX INFO: renamed from: a */
    public final Set mo19404a() {
        List list = this.f56507c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(NameResolverUtilKt.getName(this.f56518n.f53093a.getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) it.next())).getName()));
        }
        return linkedHashSet;
    }

    @Override // p910nn.InterfaceC17700h
    /* JADX INFO: renamed from: b */
    public final TypeAliasDescriptor mo19405b(Name name) {
        AbstractC16544l.m18094g(name, "name");
        return (TypeAliasDescriptor) ((Map) StorageKt.getValue(this.f56513i, this, f56504o[5])).get(name);
    }

    @Override // p910nn.InterfaceC17700h
    /* JADX INFO: renamed from: c */
    public final void mo19406c(ArrayList arrayList, DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter, NoLookupLocation location) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        AbstractC16544l.m18094g(location, "location");
        boolean zAcceptsKinds = kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK());
        InterfaceC3776x[] interfaceC3776xArr = f56504o;
        if (zAcceptsKinds) {
            for (Object obj : (List) StorageKt.getValue(this.f56512h, this, interfaceC3776xArr[4])) {
                Name name = ((PropertyDescriptor) obj).getName();
                AbstractC16544l.m18093f(name, "getName(...)");
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
            for (Object obj2 : (List) StorageKt.getValue(this.f56511g, this, interfaceC3776xArr[3])) {
                Name name2 = ((SimpleFunctionDescriptor) obj2).getName();
                AbstractC16544l.m18093f(name2, "getName(...)");
                if (((Boolean) nameFilter.invoke(name2)).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
        }
    }

    @Override // p910nn.InterfaceC17700h
    public final Collection getContributedFunctions(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        boolean zContains = getFunctionNames().contains(name);
        C17689w c17689w = C17689w.f56480Y;
        if (!zContains) {
            return c17689w;
        }
        Collection collection = (Collection) ((Map) StorageKt.getValue(this.f56514j, this, f56504o[6])).get(name);
        return collection == null ? c17689w : collection;
    }

    @Override // p910nn.InterfaceC17700h
    public final Collection getContributedVariables(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        boolean zContains = getVariableNames().contains(name);
        C17689w c17689w = C17689w.f56480Y;
        if (!zContains) {
            return c17689w;
        }
        Collection collection = (Collection) ((Map) StorageKt.getValue(this.f56515k, this, f56504o[7])).get(name);
        return collection == null ? c17689w : collection;
    }

    @Override // p910nn.InterfaceC17700h
    public final Set getFunctionNames() {
        return (Set) StorageKt.getValue(this.f56516l, this, f56504o[8]);
    }

    @Override // p910nn.InterfaceC17700h
    public final Set getVariableNames() {
        return (Set) StorageKt.getValue(this.f56517m, this, f56504o[9]);
    }
}
