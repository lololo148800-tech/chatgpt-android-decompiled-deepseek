package p041Be;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1071w0.AbstractC20734X;
import p1126yd.C21470f;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p523V9.AbstractC8056b6;
import p544W9.AbstractC8651i4;
import p544W9.AbstractC8681n4;
import p754fl.C13693c;
import p857kl.AbstractC16457e;
import p857kl.C16447N;
import p857kl.C16460h;

/* JADX INFO: renamed from: Be.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C1209B extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3180Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13693c f3181Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f3182o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209B(C13693c c13693c, String str) {
        super(1);
        this.f3180Y = 0;
        this.f3182o0 = str;
        this.f3181Z = c13693c;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3180Y) {
            case 0:
                C16447N url = (C16447N) obj;
                AbstractC16544l.m18094g(url, "$this$url");
                AbstractC8681n4.m9374c(url, new String[]{this.f3182o0, "async-status"});
                C16460h c16460h = AbstractC16457e.f51060a;
                C13693c c13693c = this.f3181Z;
                AbstractC8651i4.m9327e(c13693c, c16460h);
                InterfaceC3777y interfaceC3777yM18075c = null;
                c13693c.f43198d = new C21470f(null);
                InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C21470f.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(C21470f.class);
                    break;
                } catch (Throwable unused) {
                }
                AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c, c13693c);
                break;
            case 1:
                C16447N url2 = (C16447N) obj;
                AbstractC16544l.m18094g(url2, "$this$url");
                AbstractC8681n4.m9374c(url2, new String[]{"search"});
                AbstractC8056b6.m8452c(this.f3181Z, "query", this.f3182o0);
                break;
            default:
                AbstractC16544l.m18094g((C16447N) obj, "$this$url");
                C16460h c16460h2 = AbstractC16457e.f51060a;
                C13693c c13693c2 = this.f3181Z;
                AbstractC8651i4.m9327e(c13693c2, c16460h2);
                InterfaceC3777y interfaceC3777yM18075c2 = null;
                c13693c2.f43198d = new C1226T(this.f3182o0);
                InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C1226T.class);
                try {
                    interfaceC3777yM18075c2 = AbstractC16526C.m18075c(C1226T.class);
                    break;
                } catch (Throwable unused2) {
                }
                AbstractC20734X.m21226C(interfaceC3756dMo5693b2, interfaceC3777yM18075c2, c13693c2);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1209B(C13693c c13693c, String str, int i10) {
        super(1);
        this.f3180Y = i10;
        this.f3181Z = c13693c;
        this.f3182o0 = str;
    }
}
