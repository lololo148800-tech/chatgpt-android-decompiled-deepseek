package p455Sf;

import com.openai.feature.notification.NotificationTaskViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p571X9.AbstractC9106B3;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Sf.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C7128m extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22681Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f22682Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ NotificationTaskViewModel f22683o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f22684p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7128m(InterfaceC10459q interfaceC10459q, NotificationTaskViewModel notificationTaskViewModel, int i10, int i11) {
        super(2);
        this.f22681Y = i11;
        this.f22682Z = interfaceC10459q;
        this.f22683o0 = notificationTaskViewModel;
        this.f22684p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f22681Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f22684p0 | 1);
                AbstractC9106B3.m9635a(this.f22682Z, this.f22683o0, c6021p, iM6447d0);
                break;
            default:
                AbstractC9106B3.m9635a(this.f22682Z, this.f22683o0, c6021p, C5997d.m6447d0(this.f22684p0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
