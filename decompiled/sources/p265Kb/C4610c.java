package p265Kb;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Kb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4610c implements WildcardType, Serializable {

    /* JADX INFO: renamed from: Y */
    public final Type f15030Y;

    /* JADX INFO: renamed from: Z */
    public final Type f15031Z;

    public C4610c(Type[] typeArr, Type[] typeArr2) {
        AbstractC4611d.m5343b(typeArr2.length <= 1);
        AbstractC4611d.m5343b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC4611d.m5344c(typeArr[0]);
            this.f15031Z = null;
            this.f15030Y = AbstractC4611d.m5342a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC4611d.m5344c(typeArr2[0]);
        AbstractC4611d.m5343b(typeArr[0] == Object.class);
        this.f15031Z = AbstractC4611d.m5342a(typeArr2[0]);
        this.f15030Y = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC4611d.m5345d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f15031Z;
        return type != null ? new Type[]{type} : AbstractC4611d.f15032a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f15030Y};
    }

    public final int hashCode() {
        Type type = this.f15031Z;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f15030Y.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f15031Z;
        if (type != null) {
            return "? super " + AbstractC4611d.m5352k(type);
        }
        Type type2 = this.f15030Y;
        if (type2 == Object.class) {
            return Separators.QUESTION;
        }
        return "? extends " + AbstractC4611d.m5352k(type2);
    }
}
