package p877ln;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: ln.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C17071c implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54548Y;

    /* JADX INFO: renamed from: Z */
    public final MemberDeserializer f54549Z;

    /* JADX INFO: renamed from: o0 */
    public final ProtoBuf.Property f54550o0;

    /* JADX INFO: renamed from: p0 */
    public final DeserializedPropertyDescriptor f54551p0;

    public /* synthetic */ C17071c(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor, int i10) {
        this.f54548Y = i10;
        this.f54549Z = memberDeserializer;
        this.f54550o0 = property;
        this.f54551p0 = deserializedPropertyDescriptor;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f54548Y) {
            case 0:
                MemberDeserializer memberDeserializer = this.f54549Z;
                return memberDeserializer.f53038a.getStorageManager().createNullableLazyValue(new C17071c(memberDeserializer, this.f54550o0, this.f54551p0, 2));
            case 1:
                MemberDeserializer memberDeserializer2 = this.f54549Z;
                return memberDeserializer2.f53038a.getStorageManager().createNullableLazyValue(new C17071c(memberDeserializer2, this.f54550o0, this.f54551p0, 3));
            case 2:
                MemberDeserializer memberDeserializer3 = this.f54549Z;
                ProtoContainer protoContainerM18369a = memberDeserializer3.m18369a(memberDeserializer3.f53038a.getContainingDeclaration());
                AbstractC16544l.m18091d(protoContainerM18369a);
                AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = memberDeserializer3.f53038a.getComponents().getAnnotationAndConstantLoader();
                KotlinType returnType = this.f54551p0.getReturnType();
                AbstractC16544l.m18093f(returnType, "getReturnType(...)");
                return annotationAndConstantLoader.loadPropertyConstant(protoContainerM18369a, this.f54550o0, returnType);
            default:
                MemberDeserializer memberDeserializer4 = this.f54549Z;
                ProtoContainer protoContainerM18369a2 = memberDeserializer4.m18369a(memberDeserializer4.f53038a.getContainingDeclaration());
                AbstractC16544l.m18091d(protoContainerM18369a2);
                AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader2 = memberDeserializer4.f53038a.getComponents().getAnnotationAndConstantLoader();
                KotlinType returnType2 = this.f54551p0.getReturnType();
                AbstractC16544l.m18093f(returnType2, "getReturnType(...)");
                return annotationAndConstantLoader2.loadAnnotationDefaultValue(protoContainerM18369a2, this.f54550o0, returnType2);
        }
    }
}
