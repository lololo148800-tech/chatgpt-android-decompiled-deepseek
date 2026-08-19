package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C16608e implements FieldSet$FieldDescriptorLite {

    /* JADX INFO: renamed from: Y */
    public final Internal.EnumLiteMap f52760Y;

    /* JADX INFO: renamed from: Z */
    public final int f52761Z;

    /* JADX INFO: renamed from: o0 */
    public final WireFormat.FieldType f52762o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f52763p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f52764q0;

    public C16608e(Internal.EnumLiteMap enumLiteMap, int i10, WireFormat.FieldType fieldType, boolean z6, boolean z10) {
        this.f52760Y = enumLiteMap;
        this.f52761Z = i10;
        this.f52762o0 = fieldType;
        this.f52763p0 = z6;
        this.f52764q0 = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f52761Z - ((C16608e) obj).f52761Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final WireFormat.JavaType getLiteJavaType() {
        return this.f52762o0.getJavaType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final WireFormat.FieldType getLiteType() {
        return this.f52762o0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final int getNumber() {
        return this.f52761Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
        return ((GeneratedMessageLite.Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isPacked() {
        return this.f52764q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isRepeated() {
        return this.f52763p0;
    }
}
