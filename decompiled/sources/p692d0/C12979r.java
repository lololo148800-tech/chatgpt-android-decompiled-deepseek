package p692d0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p200Hm.C3508g;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: d0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C12979r {

    /* JADX INFO: renamed from: a */
    public float[] f41194a;

    /* JADX INFO: renamed from: b */
    public int f41195b;

    /* JADX INFO: renamed from: a */
    public final void m14675a(float f10) {
        int i10 = this.f41195b + 1;
        float[] fArr = this.f41194a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i10, (fArr.length * 3) / 2));
            AbstractC16544l.m18093f(fArrCopyOf, "copyOf(this, newSize)");
            this.f41194a = fArrCopyOf;
        }
        float[] fArr2 = this.f41194a;
        int i11 = this.f41195b;
        fArr2[i11] = f10;
        this.f41195b = i11 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final float m14676b(int i10) {
        if (i10 >= 0 && i10 < this.f41195b) {
            return this.f41194a[i10];
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index ", " must be in 0..");
        sbM11057o.append(this.f41195b - 1);
        throw new IndexOutOfBoundsException(sbM11057o.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12979r) {
            C12979r c12979r = (C12979r) obj;
            int i10 = c12979r.f41195b;
            int i11 = this.f41195b;
            if (i10 == i11) {
                float[] fArr = this.f41194a;
                float[] fArr2 = c12979r.f41194a;
                C3508g c3508gM8929t = AbstractC8301I.m8929t(0, i11);
                int i12 = c3508gM8929t.f10591Y;
                int i13 = c3508gM8929t.f10592Z;
                if (i12 > i13) {
                    return true;
                }
                while (fArr[i12] == fArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.f41194a;
        int i10 = this.f41195b;
        int iFloatToIntBits = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iFloatToIntBits += Float.floatToIntBits(fArr[i11]) * 31;
        }
        return iFloatToIntBits;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        float[] fArr = this.f41194a;
        int i10 = this.f41195b;
        for (int i11 = 0; i11 < i10; i11++) {
            float f10 = fArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(f10);
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }
}
