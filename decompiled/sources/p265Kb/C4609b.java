package p265Kb;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import p548Wd.p549VF.zakks;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Kb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4609b implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: Y */
    public final Type f15027Y;

    /* JADX INFO: renamed from: Z */
    public final Type f15028Z;

    /* JADX INFO: renamed from: o0 */
    public final Type[] f15029o0;

    public C4609b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z6 = true;
            boolean z10 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z10) {
                z6 = false;
            }
            AbstractC4611d.m5343b(z6);
        }
        this.f15027Y = type == null ? null : AbstractC4611d.m5342a(type);
        this.f15028Z = AbstractC4611d.m5342a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f15029o0 = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.f15029o0[i10]);
            AbstractC4611d.m5344c(this.f15029o0[i10]);
            Type[] typeArr3 = this.f15029o0;
            typeArr3[i10] = AbstractC4611d.m5342a(typeArr3[i10]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC4611d.m5345d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f15029o0.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f15027Y;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f15028Z;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f15029o0) ^ this.f15028Z.hashCode();
        Type type = this.f15027Y;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f15029o0;
        int length = typeArr.length;
        Type type = this.f15028Z;
        if (length == 0) {
            return AbstractC4611d.m5352k(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(AbstractC4611d.m5352k(type));
        sb2.append(Separators.LESS_THAN);
        sb2.append(AbstractC4611d.m5352k(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(zakks.ocQPJNp);
            sb2.append(AbstractC4611d.m5352k(typeArr[i10]));
        }
        sb2.append(Separators.GREATER_THAN);
        return sb2.toString();
    }
}
