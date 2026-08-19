package p910nn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17685s;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: renamed from: nn.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C17706n implements InterfaceC17700h {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ InterfaceC3776x[] f56524j;

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f56525a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f56526b;

    /* JADX INFO: renamed from: c */
    public final Object f56527c;

    /* JADX INFO: renamed from: d */
    public final MemoizedFunctionToNotNull f56528d;

    /* JADX INFO: renamed from: e */
    public final MemoizedFunctionToNotNull f56529e;

    /* JADX INFO: renamed from: f */
    public final MemoizedFunctionToNullable f56530f;

    /* JADX INFO: renamed from: g */
    public final NotNullLazyValue f56531g;

    /* JADX INFO: renamed from: h */
    public final NotNullLazyValue f56532h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ DeserializedMemberScope f56533i;

    static {
        C16553u c16553u = new C16553u(C17706n.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f56524j = new InterfaceC3776x[]{c16527d.mo5699h(c16553u), AbstractC3794B0.m4493r(C17706n.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, c16527d)};
    }

    public C17706n(DeserializedMemberScope deserializedMemberScope, List list, List list2, List list3) throws IOException {
        Object objM19407d;
        this.f56533i = deserializedMemberScope;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Name name = NameResolverUtilKt.getName(deserializedMemberScope.f53093a.getNameResolver(), ((ProtoBuf.Function) ((MessageLite) obj)).getName());
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f56525a = m19407d(linkedHashMap);
        DeserializedMemberScope deserializedMemberScope2 = this.f56533i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            Name name2 = NameResolverUtilKt.getName(deserializedMemberScope2.f53093a.getNameResolver(), ((ProtoBuf.Property) ((MessageLite) obj2)).getName());
            Object arrayList2 = linkedHashMap2.get(name2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(name2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.f56526b = m19407d(linkedHashMap2);
        if (this.f56533i.f53093a.getComponents().getConfiguration().getTypeAliasesAllowed()) {
            DeserializedMemberScope deserializedMemberScope3 = this.f56533i;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : list3) {
                Name name3 = NameResolverUtilKt.getName(deserializedMemberScope3.f53093a.getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) obj3)).getName());
                Object arrayList3 = linkedHashMap3.get(name3);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap3.put(name3, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            objM19407d = m19407d(linkedHashMap3);
        } else {
            objM19407d = C17690x.f56481Y;
        }
        this.f56527c = objM19407d;
        this.f56528d = this.f56533i.f53093a.getStorageManager().createMemoizedFunction(new C17704l(this, 0));
        this.f56529e = this.f56533i.f53093a.getStorageManager().createMemoizedFunction(new C17704l(this, 1));
        this.f56530f = this.f56533i.f53093a.getStorageManager().createMemoizedFunctionWithNullableValues(new C17704l(this, 2));
        this.f56531g = this.f56533i.f53093a.getStorageManager().createLazyValue(new C17705m(this, this.f56533i, 0));
        this.f56532h = this.f56533i.f53093a.getStorageManager().createLazyValue(new C17705m(this, this.f56533i, 1));
    }

    /* JADX INFO: renamed from: d */
    public static LinkedHashMap m19407d(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC17660E.m19257b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ((AbstractMessageLite) it.next()).writeDelimitedTo(byteArrayOutputStream);
                arrayList.add(C17296C.f55119a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p910nn.InterfaceC17700h
    /* JADX INFO: renamed from: a */
    public final Set mo19404a() {
        return this.f56527c.keySet();
    }

    @Override // p910nn.InterfaceC17700h
    /* JADX INFO: renamed from: b */
    public final TypeAliasDescriptor mo19405b(Name name) {
        AbstractC16544l.m18094g(name, "name");
        return (TypeAliasDescriptor) this.f56530f.invoke(name);
    }

    @Override // p910nn.InterfaceC17700h
    /* JADX INFO: renamed from: c */
    public final void mo19406c(ArrayList arrayList, DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter, NoLookupLocation location) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        AbstractC16544l.m18094g(location, "location");
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
            Set<Name> variableNames = getVariableNames();
            ArrayList arrayList2 = new ArrayList();
            for (Name name : variableNames) {
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    arrayList2.addAll(getContributedVariables(name, location));
                }
            }
            MemberComparator.NameAndTypeMemberComparator INSTANCE = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
            AbstractC16544l.m18093f(INSTANCE, "INSTANCE");
            AbstractC17685s.m19392u(arrayList2, INSTANCE);
            arrayList.addAll(arrayList2);
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
            Set<Name> functionNames = getFunctionNames();
            ArrayList arrayList3 = new ArrayList();
            for (Name name2 : functionNames) {
                if (((Boolean) nameFilter.invoke(name2)).booleanValue()) {
                    arrayList3.addAll(getContributedFunctions(name2, location));
                }
            }
            MemberComparator.NameAndTypeMemberComparator INSTANCE2 = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
            AbstractC16544l.m18093f(INSTANCE2, "INSTANCE");
            AbstractC17685s.m19392u(arrayList3, INSTANCE2);
            arrayList.addAll(arrayList3);
        }
    }

    @Override // p910nn.InterfaceC17700h
    public final Collection getContributedFunctions(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return !getFunctionNames().contains(name) ? C17689w.f56480Y : (Collection) this.f56528d.invoke(name);
    }

    @Override // p910nn.InterfaceC17700h
    public final Collection getContributedVariables(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return !getVariableNames().contains(name) ? C17689w.f56480Y : (Collection) this.f56529e.invoke(name);
    }

    @Override // p910nn.InterfaceC17700h
    public final Set getFunctionNames() {
        return (Set) StorageKt.getValue(this.f56531g, this, f56524j[0]);
    }

    @Override // p910nn.InterfaceC17700h
    public final Set getVariableNames() {
        return (Set) StorageKt.getValue(this.f56532h, this, f56524j[1]);
    }
}
