package p910nn;

import androidx.fragment.app.OwC.wNrQXvwLiB;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1091wn.AbstractC21031l;
import p909nm.C17689w;

/* JADX INFO: renamed from: nn.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C17704l implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56519Y;

    /* JADX INFO: renamed from: Z */
    public final C17706n f56520Z;

    public /* synthetic */ C17704l(C17706n c17706n, int i10) {
        this.f56519Y = i10;
        this.f56520Z = c17706n;
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.util.Map] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Collection<ProtoBuf.Function> collectionM21499w;
        Collection<ProtoBuf.Property> collectionM21499w2;
        Name it = (Name) obj;
        switch (this.f56519Y) {
            case 0:
                AbstractC16544l.m18094g(it, wNrQXvwLiB.EzvqHkqZSA);
                C17706n c17706n = this.f56520Z;
                LinkedHashMap linkedHashMap = c17706n.f56525a;
                final Parser<ProtoBuf.Function> PARSER = ProtoBuf.Function.PARSER;
                AbstractC16544l.m18093f(PARSER, "PARSER");
                byte[] bArr = (byte[]) linkedHashMap.get(it);
                final DeserializedMemberScope deserializedMemberScope = c17706n.f56533i;
                if (bArr != null) {
                    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    collectionM21499w = AbstractC21031l.m21499w(AbstractC21031l.m21491o(new InterfaceC1426a() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                        @Override // p049Bm.InterfaceC1426a
                        public final MessageLite invoke() {
                            return (MessageLite) PARSER.parseDelimitedFrom(byteArrayInputStream, deserializedMemberScope.f53093a.getComponents().getExtensionRegistryLite());
                        }
                    }));
                } else {
                    collectionM21499w = C17689w.f56480Y;
                }
                ArrayList arrayList = new ArrayList(collectionM21499w.size());
                for (ProtoBuf.Function function : collectionM21499w) {
                    MemberDeserializer memberDeserializer = deserializedMemberScope.f53093a.getMemberDeserializer();
                    AbstractC16544l.m18091d(function);
                    SimpleFunctionDescriptor simpleFunctionDescriptorLoadFunction = memberDeserializer.loadFunction(function);
                    if (!deserializedMemberScope.mo18390j(simpleFunctionDescriptorLoadFunction)) {
                        simpleFunctionDescriptorLoadFunction = null;
                    }
                    if (simpleFunctionDescriptorLoadFunction != null) {
                        arrayList.add(simpleFunctionDescriptorLoadFunction);
                    }
                }
                deserializedMemberScope.mo18383c(it, arrayList);
                return CollectionsKt.compact(arrayList);
            case 1:
                AbstractC16544l.m18094g(it, "it");
                C17706n c17706n2 = this.f56520Z;
                LinkedHashMap linkedHashMap2 = c17706n2.f56526b;
                final Parser<ProtoBuf.Property> PARSER2 = ProtoBuf.Property.PARSER;
                AbstractC16544l.m18093f(PARSER2, "PARSER");
                byte[] bArr2 = (byte[]) linkedHashMap2.get(it);
                final DeserializedMemberScope deserializedMemberScope2 = c17706n2.f56533i;
                if (bArr2 != null) {
                    final ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr2);
                    collectionM21499w2 = AbstractC21031l.m21499w(AbstractC21031l.m21491o(new InterfaceC1426a() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                        @Override // p049Bm.InterfaceC1426a
                        public final MessageLite invoke() {
                            return (MessageLite) PARSER2.parseDelimitedFrom(byteArrayInputStream2, deserializedMemberScope2.f53093a.getComponents().getExtensionRegistryLite());
                        }
                    }));
                } else {
                    collectionM21499w2 = C17689w.f56480Y;
                }
                ArrayList arrayList2 = new ArrayList(collectionM21499w2.size());
                for (ProtoBuf.Property property : collectionM21499w2) {
                    MemberDeserializer memberDeserializer2 = deserializedMemberScope2.f53093a.getMemberDeserializer();
                    AbstractC16544l.m18091d(property);
                    PropertyDescriptor propertyDescriptorLoadProperty = memberDeserializer2.loadProperty(property);
                    if (propertyDescriptorLoadProperty != null) {
                        arrayList2.add(propertyDescriptorLoadProperty);
                    }
                }
                deserializedMemberScope2.mo18384d(it, arrayList2);
                return CollectionsKt.compact(arrayList2);
            default:
                AbstractC16544l.m18094g(it, "it");
                C17706n c17706n3 = this.f56520Z;
                byte[] bArr3 = (byte[]) c17706n3.f56527c.get(it);
                if (bArr3 == null) {
                    return null;
                }
                ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(bArr3);
                DeserializedMemberScope deserializedMemberScope3 = c17706n3.f56533i;
                ProtoBuf.TypeAlias delimitedFrom = ProtoBuf.TypeAlias.parseDelimitedFrom(byteArrayInputStream3, deserializedMemberScope3.f53093a.getComponents().getExtensionRegistryLite());
                if (delimitedFrom == null) {
                    return null;
                }
                return deserializedMemberScope3.f53093a.getMemberDeserializer().loadTypeAlias(delimitedFrom);
        }
    }
}
