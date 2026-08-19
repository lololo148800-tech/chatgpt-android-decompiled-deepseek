package p544W9;

import com.google.protobuf.AbstractC12107L1;
import java.io.File;
import p022Ak.C0549j;
import p022Ak.EnumC0548i;
import p025An.C0644w;
import p647ak.AbstractC10729t;

/* JADX INFO: renamed from: W9.z2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8751z2 {
    /* JADX INFO: renamed from: a */
    public static float m9504a(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX INFO: renamed from: b */
    public static float m9505b(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* JADX INFO: renamed from: c */
    public static int m9506c(float f10, int i10, int i11) {
        if (i10 == i11 || f10 <= 0.0f) {
            return i10;
        }
        if (f10 >= 1.0f) {
            return i11;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float f12 = ((i11 >> 24) & 255) / 255.0f;
        float fM9504a = m9504a(((i10 >> 16) & 255) / 255.0f);
        float fM9504a2 = m9504a(((i10 >> 8) & 255) / 255.0f);
        float fM9504a3 = m9504a((i10 & 255) / 255.0f);
        float fM9504a4 = m9504a(((i11 >> 16) & 255) / 255.0f);
        float fM9504a5 = m9504a(((i11 >> 8) & 255) / 255.0f);
        float fM9504a6 = m9504a((i11 & 255) / 255.0f);
        float fM13818i = AbstractC12107L1.m13818i(f12, f11, f10, f11);
        float fM13818i2 = AbstractC12107L1.m13818i(fM9504a4, fM9504a, f10, fM9504a);
        float fM13818i3 = AbstractC12107L1.m13818i(fM9504a5, fM9504a2, f10, fM9504a2);
        float fM13818i4 = AbstractC12107L1.m13818i(fM9504a6, fM9504a3, f10, fM9504a3);
        float fM9505b = m9505b(fM13818i2) * 255.0f;
        float fM9505b2 = m9505b(fM13818i3) * 255.0f;
        return Math.round(m9505b(fM13818i4) * 255.0f) | (Math.round(fM9505b) << 16) | (Math.round(fM13818i * 255.0f) << 24) | (Math.round(fM9505b2) << 8);
    }

    /* JADX INFO: renamed from: d */
    public static final C0549j m9507d(AbstractC10729t abstractC10729t) {
        EnumC0548i enumC0548i;
        if (!new File(abstractC10729t.mo11035a()).exists()) {
            return null;
        }
        int iOrdinal = abstractC10729t.mo11036b().ordinal();
        if (iOrdinal == 0) {
            enumC0548i = EnumC0548i.f1749Z;
        } else {
            if (iOrdinal != 1) {
                throw new C0644w();
            }
            enumC0548i = EnumC0548i.f1748Y;
        }
        return new C0549j(enumC0548i, new File(abstractC10729t.mo11035a()));
    }
}
