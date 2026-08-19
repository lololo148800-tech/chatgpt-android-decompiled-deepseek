package p225Im;

import android.gov.nist.core.Separators;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Im.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C3747F implements ParameterizedType, Type {

    /* JADX INFO: renamed from: Y */
    public final Class f11404Y;

    /* JADX INFO: renamed from: Z */
    public final Type f11405Z;

    /* JADX INFO: renamed from: o0 */
    public final Type[] f11406o0;

    public C3747F(Class cls, Type type, ArrayList arrayList) {
        this.f11404Y = cls;
        this.f11405Z = type;
        this.f11406o0 = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (AbstractC16544l.m18089b(this.f11404Y, parameterizedType.getRawType()) && AbstractC16544l.m18089b(this.f11405Z, parameterizedType.getOwnerType())) {
                if (Arrays.equals(this.f11406o0, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f11406o0;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f11405Z;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f11404Y;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb2 = new StringBuilder();
        Class cls = this.f11404Y;
        Type type = this.f11405Z;
        if (type != null) {
            sb2.append(AbstractC3751J.m4440e(type));
            sb2.append("$");
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(AbstractC3751J.m4440e(cls));
        }
        Type[] typeArr = this.f11406o0;
        if (typeArr.length != 0) {
            AbstractC17678l.m19281D(typeArr, sb2, ", ", Separators.LESS_THAN, Separators.GREATER_THAN, -1, "...", C3746E.f11403Y);
        }
        return sb2.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f11404Y.hashCode();
        Type type = this.f11405Z;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f11406o0);
    }

    public final String toString() {
        return getTypeName();
    }
}
