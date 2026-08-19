package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoTypeTableUtilKt {
    public static final ProtoBuf.Type abbreviatedType(ProtoBuf.Type type, TypeTable typeTable) {
        AbstractC16544l.m18094g(type, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        if (type.hasAbbreviatedType()) {
            return type.getAbbreviatedType();
        }
        if (type.hasAbbreviatedTypeId()) {
            return typeTable.get(type.getAbbreviatedTypeId());
        }
        return null;
    }

    public static final List<ProtoBuf.Type> contextReceiverTypes(ProtoBuf.Class r6, TypeTable typeTable) {
        AbstractC16544l.m18094g(r6, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        List<ProtoBuf.Type> contextReceiverTypeList = r6.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = r6.getContextReceiverTypeIdList();
            AbstractC16544l.m18093f(contextReceiverTypeIdList, "getContextReceiverTypeIdList(...)");
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(AbstractC17682p.m19389r(list, 10));
            for (Integer num : list) {
                AbstractC16544l.m18091d(num);
                contextReceiverTypeList.add(typeTable.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    public static final ProtoBuf.Type expandedType(ProtoBuf.TypeAlias typeAlias, TypeTable typeTable) {
        AbstractC16544l.m18094g(typeAlias, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        if (typeAlias.hasExpandedType()) {
            ProtoBuf.Type expandedType = typeAlias.getExpandedType();
            AbstractC16544l.m18093f(expandedType, "getExpandedType(...)");
            return expandedType;
        }
        if (typeAlias.hasExpandedTypeId()) {
            return typeTable.get(typeAlias.getExpandedTypeId());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final ProtoBuf.Type flexibleUpperBound(ProtoBuf.Type type, TypeTable typeTable) {
        AbstractC16544l.m18094g(type, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        if (type.hasFlexibleUpperBound()) {
            return type.getFlexibleUpperBound();
        }
        if (type.hasFlexibleUpperBoundId()) {
            return typeTable.get(type.getFlexibleUpperBoundId());
        }
        return null;
    }

    public static final boolean hasReceiver(ProtoBuf.Function function) {
        AbstractC16544l.m18094g(function, "<this>");
        return function.hasReceiverType() || function.hasReceiverTypeId();
    }

    public static final ProtoBuf.Type inlineClassUnderlyingType(ProtoBuf.Class r6, TypeTable typeTable) {
        AbstractC16544l.m18094g(r6, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        if (r6.hasInlineClassUnderlyingType()) {
            return r6.getInlineClassUnderlyingType();
        }
        if (r6.hasInlineClassUnderlyingTypeId()) {
            return typeTable.get(r6.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type outerType(ProtoBuf.Type type, TypeTable typeTable) {
        AbstractC16544l.m18094g(type, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        if (type.hasOuterType()) {
            return type.getOuterType();
        }
        if (type.hasOuterTypeId()) {
            return typeTable.get(type.getOuterTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type receiverType(ProtoBuf.Function function, TypeTable typeTable) {
        AbstractC16544l.m18094g(function, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        if (function.hasReceiverType()) {
            return function.getReceiverType();
        }
        if (function.hasReceiverTypeId()) {
            return typeTable.get(function.getReceiverTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type returnType(ProtoBuf.Function function, TypeTable typeTable) {
        AbstractC16544l.m18094g(function, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        if (function.hasReturnType()) {
            ProtoBuf.Type returnType = function.getReturnType();
            AbstractC16544l.m18093f(returnType, "getReturnType(...)");
            return returnType;
        }
        if (function.hasReturnTypeId()) {
            return typeTable.get(function.getReturnTypeId());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final List<ProtoBuf.Type> supertypes(ProtoBuf.Class r6, TypeTable typeTable) {
        AbstractC16544l.m18094g(r6, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        List<ProtoBuf.Type> supertypeList = r6.getSupertypeList();
        if (supertypeList.isEmpty()) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            List<Integer> supertypeIdList = r6.getSupertypeIdList();
            AbstractC16544l.m18093f(supertypeIdList, "getSupertypeIdList(...)");
            List<Integer> list = supertypeIdList;
            supertypeList = new ArrayList<>(AbstractC17682p.m19389r(list, 10));
            for (Integer num : list) {
                AbstractC16544l.m18091d(num);
                supertypeList.add(typeTable.get(num.intValue()));
            }
        }
        return supertypeList;
    }

    public static final ProtoBuf.Type type(ProtoBuf.Type.Argument argument, TypeTable typeTable) {
        AbstractC16544l.m18094g(argument, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return typeTable.get(argument.getTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type underlyingType(ProtoBuf.TypeAlias typeAlias, TypeTable typeTable) {
        AbstractC16544l.m18094g(typeAlias, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        if (typeAlias.hasUnderlyingType()) {
            ProtoBuf.Type underlyingType = typeAlias.getUnderlyingType();
            AbstractC16544l.m18093f(underlyingType, "getUnderlyingType(...)");
            return underlyingType;
        }
        if (typeAlias.hasUnderlyingTypeId()) {
            return typeTable.get(typeAlias.getUnderlyingTypeId());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final List<ProtoBuf.Type> upperBounds(ProtoBuf.TypeParameter typeParameter, TypeTable typeTable) {
        AbstractC16544l.m18094g(typeParameter, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        List<ProtoBuf.Type> upperBoundList = typeParameter.getUpperBoundList();
        if (upperBoundList.isEmpty()) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            List<Integer> upperBoundIdList = typeParameter.getUpperBoundIdList();
            AbstractC16544l.m18093f(upperBoundIdList, "getUpperBoundIdList(...)");
            List<Integer> list = upperBoundIdList;
            upperBoundList = new ArrayList<>(AbstractC17682p.m19389r(list, 10));
            for (Integer num : list) {
                AbstractC16544l.m18091d(num);
                upperBoundList.add(typeTable.get(num.intValue()));
            }
        }
        return upperBoundList;
    }

    public static final ProtoBuf.Type varargElementType(ProtoBuf.ValueParameter valueParameter, TypeTable typeTable) {
        AbstractC16544l.m18094g(valueParameter, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        if (valueParameter.hasVarargElementType()) {
            return valueParameter.getVarargElementType();
        }
        if (valueParameter.hasVarargElementTypeId()) {
            return typeTable.get(valueParameter.getVarargElementTypeId());
        }
        return null;
    }

    public static final boolean hasReceiver(ProtoBuf.Property property) {
        AbstractC16544l.m18094g(property, "<this>");
        return property.hasReceiverType() || property.hasReceiverTypeId();
    }

    public static final ProtoBuf.Type receiverType(ProtoBuf.Property property, TypeTable typeTable) {
        AbstractC16544l.m18094g(property, "<this>");
        AbstractC16544l.m18094g(typeTable, HJrCuD.PvIoxXmIwpfNr);
        if (property.hasReceiverType()) {
            return property.getReceiverType();
        }
        if (property.hasReceiverTypeId()) {
            return typeTable.get(property.getReceiverTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type type(ProtoBuf.ValueParameter valueParameter, TypeTable typeTable) {
        AbstractC16544l.m18094g(valueParameter, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        if (valueParameter.hasType()) {
            ProtoBuf.Type type = valueParameter.getType();
            AbstractC16544l.m18093f(type, "getType(...)");
            return type;
        }
        if (valueParameter.hasTypeId()) {
            return typeTable.get(valueParameter.getTypeId());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final ProtoBuf.Type returnType(ProtoBuf.Property property, TypeTable typeTable) {
        AbstractC16544l.m18094g(property, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        if (property.hasReturnType()) {
            ProtoBuf.Type returnType = property.getReturnType();
            AbstractC16544l.m18093f(returnType, "getReturnType(...)");
            return returnType;
        }
        if (property.hasReturnTypeId()) {
            return typeTable.get(property.getReturnTypeId());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final List<ProtoBuf.Type> contextReceiverTypes(ProtoBuf.Function function, TypeTable typeTable) {
        AbstractC16544l.m18094g(function, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        List<ProtoBuf.Type> contextReceiverTypeList = function.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = function.getContextReceiverTypeIdList();
            AbstractC16544l.m18093f(contextReceiverTypeIdList, "getContextReceiverTypeIdList(...)");
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(AbstractC17682p.m19389r(list, 10));
            for (Integer num : list) {
                AbstractC16544l.m18091d(num);
                contextReceiverTypeList.add(typeTable.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    public static final List<ProtoBuf.Type> contextReceiverTypes(ProtoBuf.Property property, TypeTable typeTable) {
        AbstractC16544l.m18094g(property, "<this>");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        List<ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = property.getContextReceiverTypeIdList();
            AbstractC16544l.m18093f(contextReceiverTypeIdList, "getContextReceiverTypeIdList(...)");
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(AbstractC17682p.m19389r(list, 10));
            for (Integer num : list) {
                AbstractC16544l.m18091d(num);
                contextReceiverTypeList.add(typeTable.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }
}
