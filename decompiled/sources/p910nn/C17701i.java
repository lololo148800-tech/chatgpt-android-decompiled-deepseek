package p910nn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3776x;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: nn.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C17701i implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56499Y;

    /* JADX INFO: renamed from: Z */
    public final C17703k f56500Z;

    public /* synthetic */ C17701i(C17703k c17703k, int i10) {
        this.f56499Y = i10;
        this.f56500Z = c17703k;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f56499Y) {
            case 0:
                C17703k c17703k = this.f56500Z;
                List<MessageLite> list = c17703k.f56505a;
                ArrayList arrayList = new ArrayList();
                for (MessageLite messageLite : list) {
                    DeserializedMemberScope deserializedMemberScope = c17703k.f56518n;
                    SimpleFunctionDescriptor simpleFunctionDescriptorLoadFunction = deserializedMemberScope.f53093a.getMemberDeserializer().loadFunction((ProtoBuf.Function) messageLite);
                    if (!deserializedMemberScope.mo18390j(simpleFunctionDescriptorLoadFunction)) {
                        simpleFunctionDescriptorLoadFunction = null;
                    }
                    if (simpleFunctionDescriptorLoadFunction != null) {
                        arrayList.add(simpleFunctionDescriptorLoadFunction);
                    }
                }
                return arrayList;
            case 1:
                C17703k c17703k2 = this.f56500Z;
                List list2 = c17703k2.f56506b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    PropertyDescriptor propertyDescriptorLoadProperty = c17703k2.f56518n.f53093a.getMemberDeserializer().loadProperty((ProtoBuf.Property) ((MessageLite) it.next()));
                    if (propertyDescriptorLoadProperty != null) {
                        arrayList2.add(propertyDescriptorLoadProperty);
                    }
                }
                return arrayList2;
            case 2:
                C17703k c17703k3 = this.f56500Z;
                List list3 = c17703k3.f56507c;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    TypeAliasDescriptor typeAliasDescriptorLoadTypeAlias = c17703k3.f56518n.f53093a.getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it2.next()));
                    if (typeAliasDescriptorLoadTypeAlias != null) {
                        arrayList3.add(typeAliasDescriptorLoadTypeAlias);
                    }
                }
                return arrayList3;
            case 3:
                C17703k c17703k4 = this.f56500Z;
                c17703k4.getClass();
                InterfaceC3776x interfaceC3776x = C17703k.f56504o[0];
                NotNullLazyValue notNullLazyValue = c17703k4.f56508d;
                List list4 = (List) StorageKt.getValue(notNullLazyValue, c17703k4, interfaceC3776x);
                DeserializedMemberScope deserializedMemberScope2 = c17703k4.f56518n;
                Set<Name> setMo18387g = deserializedMemberScope2.mo18387g();
                ArrayList arrayList4 = new ArrayList();
                for (Name name : setMo18387g) {
                    List list5 = (List) StorageKt.getValue(notNullLazyValue, c17703k4, C17703k.f56504o[0]);
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : list5) {
                        if (AbstractC16544l.m18089b(((DeclarationDescriptor) obj).getName(), name)) {
                            arrayList5.add(obj);
                        }
                    }
                    int size = arrayList5.size();
                    deserializedMemberScope2.mo18383c(name, arrayList5);
                    AbstractC17686t.m19398v(arrayList5.subList(size, arrayList5.size()), arrayList4);
                }
                return AbstractC17680n.m19361k0(arrayList4, list4);
            case 4:
                C17703k c17703k5 = this.f56500Z;
                c17703k5.getClass();
                InterfaceC3776x interfaceC3776x2 = C17703k.f56504o[1];
                NotNullLazyValue notNullLazyValue2 = c17703k5.f56509e;
                List list6 = (List) StorageKt.getValue(notNullLazyValue2, c17703k5, interfaceC3776x2);
                DeserializedMemberScope deserializedMemberScope3 = c17703k5.f56518n;
                Set<Name> setMo18388h = deserializedMemberScope3.mo18388h();
                ArrayList arrayList6 = new ArrayList();
                for (Name name2 : setMo18388h) {
                    List list7 = (List) StorageKt.getValue(notNullLazyValue2, c17703k5, C17703k.f56504o[1]);
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj2 : list7) {
                        if (AbstractC16544l.m18089b(((DeclarationDescriptor) obj2).getName(), name2)) {
                            arrayList7.add(obj2);
                        }
                    }
                    int size2 = arrayList7.size();
                    deserializedMemberScope3.mo18384d(name2, arrayList7);
                    AbstractC17686t.m19398v(arrayList7.subList(size2, arrayList7.size()), arrayList6);
                }
                return AbstractC17680n.m19361k0(arrayList6, list6);
            case 5:
                C17703k c17703k6 = this.f56500Z;
                c17703k6.getClass();
                List list8 = (List) StorageKt.getValue(c17703k6.f56510f, c17703k6, C17703k.f56504o[2]);
                int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list8, 10));
                if (iM19257b < 16) {
                    iM19257b = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
                for (Object obj3 : list8) {
                    Name name3 = ((TypeAliasDescriptor) obj3).getName();
                    AbstractC16544l.m18093f(name3, "getName(...)");
                    linkedHashMap.put(name3, obj3);
                }
                return linkedHashMap;
            case 6:
                C17703k c17703k7 = this.f56500Z;
                c17703k7.getClass();
                List list9 = (List) StorageKt.getValue(c17703k7.f56511g, c17703k7, C17703k.f56504o[3]);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj4 : list9) {
                    Name name4 = ((SimpleFunctionDescriptor) obj4).getName();
                    AbstractC16544l.m18093f(name4, "getName(...)");
                    Object arrayList8 = linkedHashMap2.get(name4);
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                        linkedHashMap2.put(name4, arrayList8);
                    }
                    ((List) arrayList8).add(obj4);
                }
                return linkedHashMap2;
            default:
                C17703k c17703k8 = this.f56500Z;
                c17703k8.getClass();
                List list10 = (List) StorageKt.getValue(c17703k8.f56512h, c17703k8, C17703k.f56504o[4]);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : list10) {
                    Name name5 = ((PropertyDescriptor) obj5).getName();
                    AbstractC16544l.m18093f(name5, "getName(...)");
                    Object arrayList9 = linkedHashMap3.get(name5);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        linkedHashMap3.put(name5, arrayList9);
                    }
                    ((List) arrayList9).add(obj5);
                }
                return linkedHashMap3;
        }
    }
}
