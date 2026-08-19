package p247Jj;

import com.withpersona.sdk2.inquiry.internal.InquiryActivity;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Jj.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C4468z extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14609Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InquiryActivity f14610Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4468z(InquiryActivity inquiryActivity, int i10) {
        super(0);
        this.f14609Y = i10;
        this.f14610Z = inquiryActivity;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f14609Y) {
            case 0:
                return new C4377D(this.f14610Z.getIntent().getExtras());
            case 1:
                return this.f14610Z.mo10152e();
            default:
                return this.f14610Z.mo10150c();
        }
    }
}
