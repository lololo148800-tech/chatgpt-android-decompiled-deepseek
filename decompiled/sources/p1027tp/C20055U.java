package p1027tp;

import android.gov.nist.core.Separators;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: tp.U */
/* JADX INFO: loaded from: classes2.dex */
public final class C20055U implements WildcardType {

    /* JADX INFO: renamed from: Y */
    public final Type f63543Y;

    /* JADX INFO: renamed from: Z */
    public final Type f63544Z;

    public C20055U(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            AbstractC20056V.m20876b(typeArr[0]);
            this.f63544Z = null;
            this.f63543Y = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        AbstractC20056V.m20876b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f63544Z = typeArr2[0];
        this.f63543Y = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC20056V.m20877c(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f63544Z;
        return type != null ? new Type[]{type} : AbstractC20056V.f63545a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f63543Y};
    }

    public final int hashCode() {
        Type type = this.f63544Z;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f63543Y.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f63544Z;
        if (type != null) {
            return "? super " + AbstractC20056V.m20890p(type);
        }
        Type type2 = this.f63543Y;
        if (type2 == Object.class) {
            return Separators.QUESTION;
        }
        return "? extends " + AbstractC20056V.m20890p(type2);
    }
}
