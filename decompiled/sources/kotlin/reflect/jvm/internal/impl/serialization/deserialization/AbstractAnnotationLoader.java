package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractAnnotationLoader<A> implements AnnotationLoader<A> {

    /* JADX INFO: renamed from: a */
    public final SerializerExtensionProtocol f52975a;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbstractAnnotationLoader(SerializerExtensionProtocol protocol) {
        AbstractC16544l.m18094g(protocol, "protocol");
        this.f52975a = protocol;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadCallableAnnotations(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        List list;
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(kind, "kind");
        boolean z6 = proto instanceof ProtoBuf.Constructor;
        SerializerExtensionProtocol serializerExtensionProtocol = this.f52975a;
        if (z6) {
            list = (List) ((ProtoBuf.Constructor) proto).getExtension(serializerExtensionProtocol.getConstructorAnnotation());
        } else if (proto instanceof ProtoBuf.Function) {
            list = (List) ((ProtoBuf.Function) proto).getExtension(serializerExtensionProtocol.getFunctionAnnotation());
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i10 == 1) {
                list = (List) ((ProtoBuf.Property) proto).getExtension(serializerExtensionProtocol.getPropertyAnnotation());
            } else if (i10 == 2) {
                list = (List) ((ProtoBuf.Property) proto).getExtension(serializerExtensionProtocol.getPropertyGetterAnnotation());
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((ProtoBuf.Property) proto).getExtension(serializerExtensionProtocol.getPropertySetterAnnotation());
            }
        }
        if (list == null) {
            list = C17689w.f56480Y;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadClassAnnotations(ProtoContainer.Class container) {
        AbstractC16544l.m18094g(container, "container");
        Iterable iterable = (List) container.getClassProto().getExtension(this.f52975a.getClassAnnotation());
        if (iterable == null) {
            iterable = C17689w.f56480Y;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadEnumEntryAnnotations(ProtoContainer container, ProtoBuf.EnumEntry proto) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(proto, "proto");
        Iterable iterable = (List) proto.getExtension(this.f52975a.getEnumEntryAnnotation());
        if (iterable == null) {
            iterable = C17689w.f56480Y;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadExtensionReceiverParameterAnnotations(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(kind, "kind");
        boolean z6 = proto instanceof ProtoBuf.Function;
        List list = null;
        SerializerExtensionProtocol serializerExtensionProtocol = this.f52975a;
        if (z6) {
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> functionExtensionReceiverAnnotation = serializerExtensionProtocol.getFunctionExtensionReceiverAnnotation();
            if (functionExtensionReceiverAnnotation != null) {
                list = (List) ((ProtoBuf.Function) proto).getExtension(functionExtensionReceiverAnnotation);
            }
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyExtensionReceiverAnnotation = serializerExtensionProtocol.getPropertyExtensionReceiverAnnotation();
            if (propertyExtensionReceiverAnnotation != null) {
                list = (List) ((ProtoBuf.Property) proto).getExtension(propertyExtensionReceiverAnnotation);
            }
        }
        if (list == null) {
            list = C17689w.f56480Y;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyBackingFieldAnnotations(ProtoContainer container, ProtoBuf.Property proto) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(proto, "proto");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyBackingFieldAnnotation = this.f52975a.getPropertyBackingFieldAnnotation();
        List list = propertyBackingFieldAnnotation != null ? (List) proto.getExtension(propertyBackingFieldAnnotation) : null;
        if (list == null) {
            list = C17689w.f56480Y;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyDelegateFieldAnnotations(ProtoContainer container, ProtoBuf.Property proto) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(proto, "proto");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyDelegatedFieldAnnotation = this.f52975a.getPropertyDelegatedFieldAnnotation();
        List list = propertyDelegatedFieldAnnotation != null ? (List) proto.getExtension(propertyDelegatedFieldAnnotation) : null;
        if (list == null) {
            list = C17689w.f56480Y;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeAnnotations(ProtoBuf.Type proto, NameResolver nameResolver) {
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.getExtension(this.f52975a.getTypeAnnotation());
        if (iterable == null) {
            iterable = C17689w.f56480Y;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeParameterAnnotations(ProtoBuf.TypeParameter proto, NameResolver nameResolver) {
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.getExtension(this.f52975a.getTypeParameterAnnotation());
        if (iterable == null) {
            iterable = C17689w.f56480Y;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadValueParameterAnnotations(ProtoContainer container, MessageLite callableProto, AnnotatedCallableKind kind, int i10, ProtoBuf.ValueParameter proto) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(callableProto, "callableProto");
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(proto, "proto");
        Iterable iterable = (List) proto.getExtension(this.f52975a.getParameterAnnotation());
        if (iterable == null) {
            iterable = C17689w.f56480Y;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }
}
