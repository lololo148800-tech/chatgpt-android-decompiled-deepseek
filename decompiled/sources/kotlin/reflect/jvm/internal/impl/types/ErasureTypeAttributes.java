package kotlin.reflect.jvm.internal.impl.types;

import cn.UfGr.EhBykzn;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p909nm.AbstractC17665J;

/* JADX INFO: loaded from: classes2.dex */
public class ErasureTypeAttributes {

    /* JADX INFO: renamed from: a */
    public final TypeUsage f53159a;

    /* JADX INFO: renamed from: b */
    public final Set f53160b;

    /* JADX INFO: renamed from: c */
    public final SimpleType f53161c;

    public ErasureTypeAttributes(TypeUsage howThisTypeIsUsed, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        AbstractC16544l.m18094g(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f53159a = howThisTypeIsUsed;
        this.f53160b = set;
        this.f53161c = simpleType;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErasureTypeAttributes)) {
            return false;
        }
        ErasureTypeAttributes erasureTypeAttributes = (ErasureTypeAttributes) obj;
        return AbstractC16544l.m18089b(erasureTypeAttributes.getDefaultType(), getDefaultType()) && erasureTypeAttributes.getHowThisTypeIsUsed() == getHowThisTypeIsUsed();
    }

    public SimpleType getDefaultType() {
        return this.f53161c;
    }

    public TypeUsage getHowThisTypeIsUsed() {
        return this.f53159a;
    }

    public Set<TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.f53160b;
    }

    public int hashCode() {
        SimpleType defaultType = getDefaultType();
        int iHashCode = defaultType != null ? defaultType.hashCode() : 0;
        return getHowThisTypeIsUsed().hashCode() + (iHashCode * 31) + iHashCode;
    }

    public ErasureTypeAttributes withNewVisitedTypeParameter(TypeParameterDescriptor typeParameterDescriptor) {
        AbstractC16544l.m18094g(typeParameterDescriptor, EhBykzn.KDsZa);
        TypeUsage howThisTypeIsUsed = getHowThisTypeIsUsed();
        Set<TypeParameterDescriptor> visitedTypeParameters = getVisitedTypeParameters();
        return new ErasureTypeAttributes(howThisTypeIsUsed, visitedTypeParameters != null ? AbstractC17665J.m19267g(visitedTypeParameters, typeParameterDescriptor) : AbstractC17665J.m19268h(typeParameterDescriptor), getDefaultType());
    }
}
