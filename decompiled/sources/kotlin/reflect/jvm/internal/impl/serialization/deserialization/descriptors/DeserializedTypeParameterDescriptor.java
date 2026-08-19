package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p298Lm.C5140G;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* JADX INFO: renamed from: w0 */
    public final DeserializationContext f53122w0;

    /* JADX INFO: renamed from: x0 */
    public final ProtoBuf.TypeParameter f53123x0;

    /* JADX INFO: renamed from: y0 */
    public final DeserializedAnnotations f53124y0;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeParameterDescriptor(DeserializationContext c9, ProtoBuf.TypeParameter proto, int i10) {
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(proto, "proto");
        StorageManager storageManager = c9.getStorageManager();
        DeclarationDescriptor containingDeclaration = c9.getContainingDeclaration();
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = NameResolverUtilKt.getName(c9.getNameResolver(), proto.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.TypeParameter.Variance variance = proto.getVariance();
        AbstractC16544l.m18093f(variance, "getVariance(...)");
        super(storageManager, containingDeclaration, empty, name, protoEnumFlags.variance(variance), proto.getReified(), i10, SourceElement.NO_SOURCE, SupertypeLoopChecker.EMPTY.INSTANCE);
        this.f53122w0 = c9;
        this.f53123x0 = proto;
        this.f53124y0 = new DeserializedAnnotations(c9.getStorageManager(), new C5140G(this, 29));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: c */
    public final List mo18135c() {
        DeserializationContext deserializationContext = this.f53122w0;
        List<ProtoBuf.Type> listUpperBounds = ProtoTypeTableUtilKt.upperBounds(this.f53123x0, deserializationContext.getTypeTable());
        if (listUpperBounds.isEmpty()) {
            return AbstractC9393x3.m9974d(DescriptorUtilsKt.getBuiltIns(this).getDefaultBound());
        }
        List<ProtoBuf.Type> list = listUpperBounds;
        TypeDeserializer typeDeserializer = deserializationContext.getTypeDeserializer();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializer.type((ProtoBuf.Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public void reportSupertypeLoopError(KotlinType type) {
        AbstractC16544l.m18094g(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public DeserializedAnnotations getAnnotations() {
        return this.f53124y0;
    }
}
