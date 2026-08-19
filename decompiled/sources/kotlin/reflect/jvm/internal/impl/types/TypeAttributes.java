package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.util.ArrayMap;
import kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl;
import kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap;
import kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3756d;
import p571X9.AbstractC9393x3;
import p817j$.util.concurrent.ConcurrentHashMap;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAttributes extends AttributeArrayOwner<TypeAttribute<?>, TypeAttribute<?>> implements Iterable<TypeAttribute<?>> {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: Z */
    public static final TypeAttributes f53192Z = new TypeAttributes(C17689w.f56480Y);

    public static final class Companion extends TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final Collection access$getIndices(Companion companion) {
            Collection collectionValues = companion.f53302a.values();
            AbstractC16544l.m18093f(collectionValues, "<get-values>(...)");
            return collectionValues;
        }

        public final TypeAttributes create(List<? extends TypeAttribute<?>> attributes) {
            AbstractC16544l.m18094g(attributes, "attributes");
            return attributes.isEmpty() ? getEmpty() : new TypeAttributes(attributes, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public int customComputeIfAbsent(ConcurrentHashMap<String, Integer> concurrentHashMap, String key, InterfaceC1436k compute) {
            int iIntValue;
            AbstractC16544l.m18094g(concurrentHashMap, "<this>");
            AbstractC16544l.m18094g(key, "key");
            AbstractC16544l.m18094g(compute, "compute");
            Integer num = concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(key);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Object objInvoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(((Number) objInvoke).intValue()));
                        iIntValue = ((Number) objInvoke).intValue();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iIntValue;
        }

        public final TypeAttributes getEmpty() {
            return TypeAttributes.f53192Z;
        }
    }

    public /* synthetic */ TypeAttributes(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    public final TypeAttributes add(TypeAttributes other) {
        TypeAttribute typeAttributeAdd;
        AbstractC16544l.m18094g(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.access$getIndices(Companion).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute typeAttribute = (TypeAttribute) this.f53285Y.get(iIntValue);
            TypeAttribute typeAttribute2 = (TypeAttribute) other.f53285Y.get(iIntValue);
            if (typeAttribute == null) {
                typeAttributeAdd = typeAttribute2 != null ? typeAttribute2.add(typeAttribute) : null;
            } else {
                typeAttributeAdd = typeAttribute.add(typeAttribute2);
            }
            CollectionsKt.addIfNotNull(arrayList, typeAttributeAdd);
        }
        return Companion.create(arrayList);
    }

    public final boolean contains(TypeAttribute<?> attribute) {
        AbstractC16544l.m18094g(attribute, "attribute");
        return this.f53285Y.get(Companion.getId(attribute.getKey())) != null;
    }

    public final TypeAttributes intersect(TypeAttributes other) {
        TypeAttribute typeAttributeIntersect;
        AbstractC16544l.m18094g(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.access$getIndices(Companion).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute typeAttribute = (TypeAttribute) this.f53285Y.get(iIntValue);
            TypeAttribute typeAttribute2 = (TypeAttribute) other.f53285Y.get(iIntValue);
            if (typeAttribute == null) {
                typeAttributeIntersect = typeAttribute2 != null ? typeAttribute2.intersect(typeAttribute) : null;
            } else {
                typeAttributeIntersect = typeAttribute.intersect(typeAttribute2);
            }
            CollectionsKt.addIfNotNull(arrayList, typeAttributeIntersect);
        }
        return Companion.create(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    /* JADX INFO: renamed from: j */
    public final Companion mo18424j() {
        return Companion;
    }

    public final TypeAttributes plus(TypeAttribute<?> attribute) {
        AbstractC16544l.m18094g(attribute, "attribute");
        if (contains(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new TypeAttributes(AbstractC9393x3.m9974d(attribute));
        }
        return Companion.create(AbstractC17680n.m19362l0(AbstractC17680n.m19322C0(this), attribute));
    }

    public final TypeAttributes remove(TypeAttribute<?> attribute) {
        AbstractC16544l.m18094g(attribute, "attribute");
        if (isEmpty()) {
            return this;
        }
        ArrayMap arrayMap = this.f53285Y;
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayMap) {
            if (!AbstractC16544l.m18089b((TypeAttribute) obj, attribute)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() == this.f53285Y.getSize() ? this : Companion.create(arrayList);
    }

    public TypeAttributes(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TypeAttribute typeAttribute = (TypeAttribute) it.next();
            InterfaceC3756d tClass = typeAttribute.getKey();
            AbstractC16544l.m18094g(tClass, "tClass");
            String strMo4447a = tClass.mo4447a();
            AbstractC16544l.m18091d(strMo4447a);
            int id2 = mo18424j().getId(strMo4447a);
            int size = this.f53285Y.getSize();
            if (size != 0) {
                if (size == 1) {
                    ArrayMap arrayMap = this.f53285Y;
                    try {
                        AbstractC16544l.m18092e(arrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                        OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap;
                        if (oneElementArrayMap.getIndex() == id2) {
                            this.f53285Y = new OneElementArrayMap(typeAttribute, id2);
                        } else {
                            ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                            this.f53285Y = arrayMapImpl;
                            arrayMapImpl.set(oneElementArrayMap.getIndex(), oneElementArrayMap.getValue());
                        }
                    } catch (ClassCastException e10) {
                        throw new IllegalStateException(m18445m(arrayMap, 1, "OneElementArrayMap"), e10);
                    }
                }
                this.f53285Y.set(id2, typeAttribute);
            } else {
                ArrayMap arrayMap2 = this.f53285Y;
                if (!(arrayMap2 instanceof EmptyArrayMap)) {
                    throw new IllegalStateException(m18445m(arrayMap2, 0, "EmptyArrayMap"));
                }
                this.f53285Y = new OneElementArrayMap(typeAttribute, id2);
            }
        }
    }
}
