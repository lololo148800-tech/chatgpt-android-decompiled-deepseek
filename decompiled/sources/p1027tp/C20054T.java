package p1027tp;

import android.gov.nist.core.Separators;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import p817j$.util.Objects;

/* JADX INFO: renamed from: tp.T */
/* JADX INFO: loaded from: classes2.dex */
public final class C20054T implements ParameterizedType {

    /* JADX INFO: renamed from: Y */
    public final Type f63540Y;

    /* JADX INFO: renamed from: Z */
    public final Type f63541Z;

    /* JADX INFO: renamed from: o0 */
    public final Type[] f63542o0;

    public C20054T(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            AbstractC20056V.m20876b(type3);
        }
        this.f63540Y = type;
        this.f63541Z = type2;
        this.f63542o0 = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC20056V.m20877c(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f63542o0.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f63540Y;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f63541Z;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f63542o0) ^ this.f63541Z.hashCode();
        Type type = this.f63540Y;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f63542o0;
        int length = typeArr.length;
        Type type = this.f63541Z;
        if (length == 0) {
            return AbstractC20056V.m20890p(type);
        }
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(AbstractC20056V.m20890p(type));
        sb2.append(Separators.LESS_THAN);
        sb2.append(AbstractC20056V.m20890p(typeArr[0]));
        for (int i10 = 1; i10 < typeArr.length; i10++) {
            sb2.append(", ");
            sb2.append(AbstractC20056V.m20890p(typeArr[i10]));
        }
        sb2.append(Separators.GREATER_THAN);
        return sb2.toString();
    }
}
