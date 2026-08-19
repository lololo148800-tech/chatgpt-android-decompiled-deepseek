package p877ln;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: ln.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C17075g implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54565Y;

    /* JADX INFO: renamed from: Z */
    public final TypeDeserializer f54566Z;

    public /* synthetic */ C17075g(TypeDeserializer typeDeserializer, int i10) {
        this.f54565Y = i10;
        this.f54566Z = typeDeserializer;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f54565Y) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                DeserializationContext deserializationContext = this.f54566Z.f53053a;
                ClassId classId = NameResolverUtilKt.getClassId(deserializationContext.getNameResolver(), iIntValue);
                return classId.isLocal() ? deserializationContext.getComponents().deserializeClass(classId) : FindClassInModuleKt.findClassifierAcrossModuleDependencies(deserializationContext.getComponents().getModuleDescriptor(), classId);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                DeserializationContext deserializationContext2 = this.f54566Z.f53053a;
                ClassId classId2 = NameResolverUtilKt.getClassId(deserializationContext2.getNameResolver(), iIntValue2);
                if (classId2.isLocal()) {
                    return null;
                }
                return FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(deserializationContext2.getComponents().getModuleDescriptor(), classId2);
            default:
                ProtoBuf.Type it = (ProtoBuf.Type) obj;
                AbstractC16544l.m18094g(it, "it");
                return ProtoTypeTableUtilKt.outerType(it, this.f54566Z.f53053a.getTypeTable());
        }
    }
}
