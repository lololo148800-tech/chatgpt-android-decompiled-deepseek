package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p909nm.AbstractC17665J;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeAttributes extends ErasureTypeAttributes {

    /* JADX INFO: renamed from: d */
    public final TypeUsage f51961d;

    /* JADX INFO: renamed from: e */
    public final JavaTypeFlexibility f51962e;

    /* JADX INFO: renamed from: f */
    public final boolean f51963f;

    /* JADX INFO: renamed from: g */
    public final boolean f51964g;

    /* JADX INFO: renamed from: h */
    public final Set f51965h;

    /* JADX INFO: renamed from: i */
    public final SimpleType f51966i;

    public /* synthetic */ JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z6, boolean z10, Set set, SimpleType simpleType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i10 & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i10 & 4) != 0 ? false : z6, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : set, (i10 & 32) != 0 ? null : simpleType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JavaTypeAttributes copy$default(JavaTypeAttributes javaTypeAttributes, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z6, boolean z10, Set set, SimpleType simpleType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeUsage = javaTypeAttributes.f51961d;
        }
        if ((i10 & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.f51962e;
        }
        JavaTypeFlexibility javaTypeFlexibility2 = javaTypeFlexibility;
        if ((i10 & 4) != 0) {
            z6 = javaTypeAttributes.f51963f;
        }
        boolean z11 = z6;
        if ((i10 & 8) != 0) {
            z10 = javaTypeAttributes.f51964g;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            set = javaTypeAttributes.f51965h;
        }
        Set set2 = set;
        if ((i10 & 32) != 0) {
            simpleType = javaTypeAttributes.f51966i;
        }
        return javaTypeAttributes.copy(typeUsage, javaTypeFlexibility2, z11, z12, set2, simpleType);
    }

    public final JavaTypeAttributes copy(TypeUsage howThisTypeIsUsed, JavaTypeFlexibility flexibility, boolean z6, boolean z10, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        AbstractC16544l.m18094g(howThisTypeIsUsed, "howThisTypeIsUsed");
        AbstractC16544l.m18094g(flexibility, "flexibility");
        return new JavaTypeAttributes(howThisTypeIsUsed, flexibility, z6, z10, set, simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public boolean equals(Object obj) {
        if (!(obj instanceof JavaTypeAttributes)) {
            return false;
        }
        JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj;
        return AbstractC16544l.m18089b(javaTypeAttributes.getDefaultType(), getDefaultType()) && javaTypeAttributes.getHowThisTypeIsUsed() == getHowThisTypeIsUsed() && javaTypeAttributes.f51962e == this.f51962e && javaTypeAttributes.f51963f == this.f51963f && javaTypeAttributes.f51964g == this.f51964g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public SimpleType getDefaultType() {
        return this.f51966i;
    }

    public final JavaTypeFlexibility getFlexibility() {
        return this.f51962e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public TypeUsage getHowThisTypeIsUsed() {
        return this.f51961d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public Set<TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.f51965h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public int hashCode() {
        SimpleType defaultType = getDefaultType();
        int iHashCode = defaultType != null ? defaultType.hashCode() : 0;
        int iHashCode2 = getHowThisTypeIsUsed().hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f51962e.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i10 = (iHashCode3 * 31) + (this.f51963f ? 1 : 0) + iHashCode3;
        return (i10 * 31) + (this.f51964g ? 1 : 0) + i10;
    }

    public final boolean isForAnnotationParameter() {
        return this.f51964g;
    }

    public final boolean isRaw() {
        return this.f51963f;
    }

    public final JavaTypeAttributes markIsRaw(boolean z6) {
        return copy$default(this, null, null, z6, false, null, null, 59, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f51961d + ", flexibility=" + this.f51962e + ", isRaw=" + this.f51963f + ", isForAnnotationParameter=" + this.f51964g + ", visitedTypeParameters=" + this.f51965h + ", defaultType=" + this.f51966i + ')';
    }

    public JavaTypeAttributes withDefaultType(SimpleType simpleType) {
        return copy$default(this, null, null, false, false, null, simpleType, 31, null);
    }

    public final JavaTypeAttributes withFlexibility(JavaTypeFlexibility flexibility) {
        AbstractC16544l.m18094g(flexibility, "flexibility");
        return copy$default(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public JavaTypeAttributes withNewVisitedTypeParameter(TypeParameterDescriptor typeParameter) {
        AbstractC16544l.m18094g(typeParameter, "typeParameter");
        return copy$default(this, null, null, false, false, getVisitedTypeParameters() != null ? AbstractC17665J.m19267g(getVisitedTypeParameters(), typeParameter) : AbstractC17665J.m19268h(typeParameter), null, 47, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTypeAttributes(TypeUsage howThisTypeIsUsed, JavaTypeFlexibility flexibility, boolean z6, boolean z10, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        super(howThisTypeIsUsed, set, simpleType);
        AbstractC16544l.m18094g(howThisTypeIsUsed, "howThisTypeIsUsed");
        AbstractC16544l.m18094g(flexibility, "flexibility");
        this.f51961d = howThisTypeIsUsed;
        this.f51962e = flexibility;
        this.f51963f = z6;
        this.f51964g = z10;
        this.f51965h = set;
        this.f51966i = simpleType;
    }
}
