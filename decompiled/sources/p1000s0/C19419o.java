package p1000s0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1440o;
import p492U1.EnumC7546k;
import p544W9.AbstractC8478F4;
import p544W9.AbstractC8484G4;
import p860l0.EnumC16673F0;
import p881m0.AbstractC17136m;

/* JADX INFO: renamed from: s0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C19419o extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19408d f61541Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ EnumC7546k f61542Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f61543o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19419o(C19408d c19408d, EnumC7546k enumC7546k, float f10) {
        super(3);
        this.f61541Y = c19408d;
        this.f61542Z = enumC7546k;
        this.f61543o0 = f10;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zM9137d;
        int i10;
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        float fFloatValue3 = ((Number) obj3).floatValue();
        C19408d c19408d = this.f61541Y;
        if (c19408d.m20499k().f61601e == EnumC16673F0.f53401Y) {
            zM9137d = AbstractC8484G4.m9137d(c19408d);
        } else {
            if (this.f61542Z == EnumC7546k.f23904Y) {
                zM9137d = AbstractC8484G4.m9137d(c19408d);
            } else {
                zM9137d = !AbstractC8484G4.m9137d(c19408d);
            }
        }
        int i11 = c19408d.m20499k().f61598b;
        float fM9136c = i11 == 0 ? 0.0f : AbstractC8484G4.m9136c(c19408d) / i11;
        float f10 = fM9136c - ((int) fM9136c);
        if (Math.abs(fFloatValue) < c19408d.f61453p.mo7864b0(AbstractC17136m.f54799a)) {
            i10 = 0;
        } else {
            i10 = fFloatValue > 0.0f ? 1 : 2;
        }
        if (AbstractC8478F4.m9119b(i10, 0)) {
            fFloatValue2 = Math.abs(f10) > this.f61543o0 ? fFloatValue3 : fFloatValue3;
        } else if (!AbstractC8478F4.m9119b(i10, 1)) {
            if (!AbstractC8478F4.m9119b(i10, 2)) {
                fFloatValue2 = 0.0f;
            }
        }
        return Float.valueOf(fFloatValue2);
    }
}
