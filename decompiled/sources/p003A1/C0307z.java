package p003A1;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p296Lk.C5107d;
import p737f1.AbstractC13512d;
import p737f1.C13526r;
import p853kd.C16371f;
import p977r0.C18845q;

/* JADX INFO: renamed from: A1.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0307z extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1079Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f1080Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0307z(int i10, int i11) {
        super(1);
        this.f1079Y = i11;
        this.f1080Z = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f1079Y) {
            case 0:
                Boolean boolM15030C = AbstractC13512d.m15030C((C13526r) obj, this.f1080Z);
                return Boolean.valueOf(boolM15030C != null ? boolM15030C.booleanValue() : false);
            case 1:
                ((Number) obj).intValue();
                return Integer.valueOf(this.f1080Z);
            case 2:
                ((Number) obj).intValue();
                return Integer.valueOf(this.f1080Z);
            case 3:
                Boolean boolM15030C2 = AbstractC13512d.m15030C((C13526r) obj, this.f1080Z);
                return Boolean.valueOf(boolM15030C2 != null ? boolM15030C2.booleanValue() : false);
            case 4:
                C16371f it = (C16371f) obj;
                AbstractC16544l.m18094g(it, "it");
                return new C16371f(this.f1080Z);
            case 5:
                int iIntValue = ((Number) obj).intValue();
                int i10 = this.f1080Z;
                return new C5107d(iIntValue % i10, (iIntValue / i10) + 1);
            default:
                return Integer.valueOf(((C18845q) obj).f60006a - this.f1080Z);
        }
    }
}
