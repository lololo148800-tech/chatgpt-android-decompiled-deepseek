package kotlin.reflect.jvm.internal.impl.resolve.constants;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassLiteralValue {

    /* JADX INFO: renamed from: a */
    public final ClassId f52876a;

    /* JADX INFO: renamed from: b */
    public final int f52877b;

    public ClassLiteralValue(ClassId classId, int i10) {
        AbstractC16544l.m18094g(classId, "classId");
        this.f52876a = classId;
        this.f52877b = i10;
    }

    public final ClassId component1() {
        return this.f52876a;
    }

    public final int component2() {
        return this.f52877b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return AbstractC16544l.m18089b(this.f52876a, classLiteralValue.f52876a) && this.f52877b == classLiteralValue.f52877b;
    }

    public final int getArrayNestedness() {
        return this.f52877b;
    }

    public final ClassId getClassId() {
        return this.f52876a;
    }

    public int hashCode() {
        return (this.f52876a.hashCode() * 31) + this.f52877b;
    }

    public String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            i10 = this.f52877b;
            if (i11 >= i10) {
                break;
            }
            sb2.append("kotlin/Array<");
            i11++;
        }
        sb2.append(this.f52876a);
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(Separators.GREATER_THAN);
        }
        return sb2.toString();
    }
}
