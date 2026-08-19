package p254K0;

import kotlin.jvm.internal.AbstractC16546n;
import p042Bf.AbstractC1274p;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p492U1.InterfaceC7537b;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8494I2;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: K0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C4510g extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC7537b f14717Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4518o f14718Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f14719o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f14720p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4510g(InterfaceC7537b interfaceC7537b, C4518o c4518o, float f10, float f11) {
        super(2);
        float f12 = AbstractC1274p.f3385a;
        this.f14717Y = interfaceC7537b;
        this.f14718Z = c4518o;
        this.f14719o0 = f10;
        this.f14720p0 = f11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        float f10 = AbstractC1274p.f3385a;
        InterfaceC7537b interfaceC7537b = this.f14717Y;
        float fMo7864b0 = interfaceC7537b.mo7864b0(f10);
        int iIntValue = ((Number) ((InterfaceC1426a) this.f14718Z.f14760a.getValue()).invoke()).intValue();
        float fMo7864b1 = interfaceC7537b.mo7864b0(this.f14719o0);
        float fMo7864b2 = interfaceC7537b.mo7864b0(this.f14720p0);
        if (fFloatValue == 0.0f || fMo7864b0 == 0.0f) {
            return C4520q.f14769s0;
        }
        int[] iArr = {1};
        int[] iArr2 = {1, 0};
        float fMin = Math.min(fMo7864b0, fFloatValue);
        float fM8920k = AbstractC8301I.m8920k(fMin / 3.0f, fMo7864b1, fMo7864b2);
        float f11 = (fMin + fM8920k) / 2.0f;
        float f12 = 2;
        int[] iArr3 = fFloatValue < fMo7864b1 * f12 ? new int[]{0} : iArr;
        int iMax = Math.max(1, (int) Math.floor(((fFloatValue - (AbstractC17678l.m19285H(iArr2) * f11)) - (AbstractC17678l.m19285H(iArr3) * fMo7864b2)) / fMin));
        int iCeil = (int) Math.ceil(fFloatValue / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr4 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr4[i11] = iCeil - i11;
        }
        float fMo7864b3 = interfaceC7537b.mo7864b0(AbstractC4505b.f14703c);
        C4504a c4504aM9152a = AbstractC8494I2.m9152a(fFloatValue, fFloatValue2, fM8920k, fMo7864b1, fMo7864b2, iArr3, f11, iArr2, fMin, iArr4);
        if (c4504aM9152a != null) {
            int i12 = c4504aM9152a.f14700g;
            int i13 = c4504aM9152a.f14698e;
            int i14 = c4504aM9152a.f14696c;
            if (i12 + i13 + i14 > iIntValue) {
                for (int i15 = ((i12 + i13) + i14) - iIntValue; i15 > 0; i15--) {
                    if (i14 > 0) {
                        i14--;
                    } else if (i13 > 1) {
                        i13--;
                    }
                }
                c4504aM9152a = AbstractC8494I2.m9152a(fFloatValue, fFloatValue2, fM8920k, fMo7864b1, fMo7864b2, new int[]{i14}, f11, new int[]{i13}, fMin, iArr4);
            }
        }
        if (c4504aM9152a == null) {
            return C4520q.f14769s0;
        }
        C4523t c4523t = new C4523t(fMo7864b3, c4504aM9152a, fMo7864b3);
        C4522s c4522s = new C4522s();
        c4523t.invoke(c4522s);
        int iM5265c = c4522s.m5265c();
        int i16 = c4522s.f14778a;
        float f13 = c4522s.f14779b;
        return new C4520q(C4522s.m5263b(i16, f13 / f12, i16, iM5265c, f13, fFloatValue, fFloatValue2, c4522s.f14780c));
    }
}
