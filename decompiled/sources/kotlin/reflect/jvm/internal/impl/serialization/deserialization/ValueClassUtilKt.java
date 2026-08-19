package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class ValueClassUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [Bm.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    public static final <T extends RigidTypeMarker> ValueClassRepresentation<T> loadValueClassRepresentation(ProtoBuf.Class r6, NameResolver nameResolver, TypeTable typeTable, InterfaceC1436k typeDeserializer, InterfaceC1436k typeOfPublicProperty) {
        RigidTypeMarker rigidTypeMarker;
        ?? multiFieldValueClassUnderlyingTypeList;
        AbstractC16544l.m18094g(r6, "<this>");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        AbstractC16544l.m18094g(typeDeserializer, "typeDeserializer");
        AbstractC16544l.m18094g(typeOfPublicProperty, "typeOfPublicProperty");
        if (r6.getMultiFieldValueClassUnderlyingNameCount() <= 0) {
            if (!r6.hasInlineClassUnderlyingPropertyName()) {
                return null;
            }
            Name name = NameResolverUtilKt.getName(nameResolver, r6.getInlineClassUnderlyingPropertyName());
            ProtoBuf.Type typeInlineClassUnderlyingType = ProtoTypeTableUtilKt.inlineClassUnderlyingType(r6, typeTable);
            if ((typeInlineClassUnderlyingType != null && (rigidTypeMarker = (RigidTypeMarker) typeDeserializer.invoke(typeInlineClassUnderlyingType)) != null) || (rigidTypeMarker = (RigidTypeMarker) typeOfPublicProperty.invoke(name)) != null) {
                return new InlineClassRepresentation(name, rigidTypeMarker);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.getName(nameResolver, r6.getFqName()) + " with property " + name).toString());
        }
        List<Integer> multiFieldValueClassUnderlyingNameList = r6.getMultiFieldValueClassUnderlyingNameList();
        AbstractC16544l.m18093f(multiFieldValueClassUnderlyingNameList, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list = multiFieldValueClassUnderlyingNameList;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (Integer num : list) {
            AbstractC16544l.m18091d(num);
            arrayList.add(NameResolverUtilKt.getName(nameResolver, num.intValue()));
        }
        C17309l c17309l = new C17309l(Integer.valueOf(r6.getMultiFieldValueClassUnderlyingTypeIdCount()), Integer.valueOf(r6.getMultiFieldValueClassUnderlyingTypeCount()));
        if (c17309l.equals(new C17309l(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> multiFieldValueClassUnderlyingTypeIdList = r6.getMultiFieldValueClassUnderlyingTypeIdList();
            AbstractC16544l.m18093f(multiFieldValueClassUnderlyingTypeIdList, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list2 = multiFieldValueClassUnderlyingTypeIdList;
            multiFieldValueClassUnderlyingTypeList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
            for (Integer num2 : list2) {
                AbstractC16544l.m18091d(num2);
                multiFieldValueClassUnderlyingTypeList.add(typeTable.get(num2.intValue()));
            }
        } else {
            if (!c17309l.equals(new C17309l(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + NameResolverUtilKt.getName(nameResolver, r6.getFqName()) + " has illegal multi-field value class representation").toString());
            }
            multiFieldValueClassUnderlyingTypeList = r6.getMultiFieldValueClassUnderlyingTypeList();
        }
        AbstractC16544l.m18091d(multiFieldValueClassUnderlyingTypeList);
        Iterable iterable = (Iterable) multiFieldValueClassUnderlyingTypeList;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.invoke(it.next()));
        }
        return new MultiFieldValueClassRepresentation(AbstractC17680n.m19334J0(arrayList, arrayList2));
    }
}
