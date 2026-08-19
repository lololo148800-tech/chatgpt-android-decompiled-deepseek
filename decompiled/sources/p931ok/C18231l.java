package p931ok;

import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import io.sentry.internal.debugmeta.C15384c;
import p140Fa.C2700t;

/* JADX INFO: renamed from: ok.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C18231l extends C15384c {

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f58083p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ ThemeableLottieAnimationView f58084q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18231l(ThemeableLottieAnimationView themeableLottieAnimationView, int i10) {
        super(23);
        this.f58083p0 = i10;
        this.f58084q0 = themeableLottieAnimationView;
    }

    @Override // io.sentry.internal.debugmeta.C15384c
    /* JADX INFO: renamed from: q */
    public final Object mo8038q(C2700t c2700t) {
        switch (this.f58083p0) {
            case 0:
                Integer num = (Integer) this.f58084q0.f40895F0.get((Integer) c2700t.f8310f);
                return num == null ? (Integer) c2700t.f8311g : num;
            default:
                Integer num2 = (Integer) this.f58084q0.f40895F0.get((Integer) c2700t.f8310f);
                return num2 == null ? (Integer) c2700t.f8311g : num2;
        }
    }
}
