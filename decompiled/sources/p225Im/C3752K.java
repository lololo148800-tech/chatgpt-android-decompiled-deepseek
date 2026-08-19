package p225Im;

import android.gov.nist.core.Separators;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Im.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C3752K implements WildcardType, Type {

    /* JADX INFO: renamed from: o0 */
    public static final C3752K f11410o0 = new C3752K(null, null);

    /* JADX INFO: renamed from: Y */
    public final Type f11411Y;

    /* JADX INFO: renamed from: Z */
    public final Type f11412Z;

    public C3752K(Type type, Type type2) {
        this.f11411Y = type;
        this.f11412Z = type2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f11412Z;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f11412Z;
        if (type != null) {
            return "? super " + AbstractC3751J.m4440e(type);
        }
        Type type2 = this.f11411Y;
        if (type2 == null || AbstractC16544l.m18089b(type2, Object.class)) {
            return Separators.QUESTION;
        }
        return "? extends " + AbstractC3751J.m4440e(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f11411Y;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
