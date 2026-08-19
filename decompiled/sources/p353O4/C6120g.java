package p353O4;

import android.animation.TypeEvaluator;
import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: O4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6120g implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    public static final C6120g f19922a = new C6120g();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f11 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f12 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fM13818i = AbstractC12107L1.m13818i(f12, f11, f10, f11);
        float fM13818i2 = AbstractC12107L1.m13818i(fPow4, fPow, f10, fPow);
        float fM13818i3 = AbstractC12107L1.m13818i(fPow5, fPow2, f10, fPow2);
        float fM13818i4 = AbstractC12107L1.m13818i(fPow6, fPow3, f10, fPow3);
        float fPow7 = ((float) Math.pow(fM13818i2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fM13818i3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fM13818i4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM13818i * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
