package p298Lm;

import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Lm.c0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5169c0 implements Type {

    /* JADX INFO: renamed from: Y */
    public final Type[] f16844Y;

    /* JADX INFO: renamed from: Z */
    public final int f16845Z;

    public C5169c0(Type[] types) {
        AbstractC16544l.m18094g(types, "types");
        this.f16844Y = types;
        this.f16845Z = Arrays.hashCode(types);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5169c0) {
            if (Arrays.equals(this.f16844Y, ((C5169c0) obj).f16844Y)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC17678l.m19283F(this.f16844Y, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.f16845Z;
    }

    public final String toString() {
        return getTypeName();
    }
}
