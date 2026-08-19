package p318Mh;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1143z4.C21788r;
import p1155zi.C21966U1;
import p1155zi.C21984a1;
import p1155zi.C22011h0;

/* JADX INFO: renamed from: Mh.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C5393d extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f17655Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f17656Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f17657o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5393d(int i10, String str, String str2) {
        super(1);
        this.f17655Y = i10;
        this.f17656Z = str;
        this.f17657o0 = str2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f17655Y) {
            case 0:
                C21788r navDeepLink = (C21788r) obj;
                AbstractC16544l.m18094g(navDeepLink, "$this$navDeepLink");
                navDeepLink.f69122b = this.f17656Z + Separators.SLASH + this.f17657o0;
                break;
            case 1:
                C5387a buildRoute = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute, "$this$buildRoute");
                C5411m.f17686g.getClass();
                buildRoute.m5900a(C5411m.f17687h, new C22011h0(this.f17656Z));
                buildRoute.m5900a(C5411m.f17688i, new C21984a1(this.f17657o0));
                break;
            case 2:
                C5387a buildRoute2 = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute2, "$this$buildRoute");
                C5431w.f17746g.getClass();
                buildRoute2.m5900a(C5431w.f17750k, new C21966U1(this.f17656Z));
                buildRoute2.m5900a(C5431w.f17747h, new C22011h0(this.f17657o0));
                break;
            default:
                C5387a buildRoute3 = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute3, "$this$buildRoute");
                C5432w0.f17762g.getClass();
                buildRoute3.m5900a(C5432w0.f17763h, new C22011h0(this.f17656Z));
                buildRoute3.m5900a(C5432w0.f17764i, new C21984a1(this.f17657o0));
                break;
        }
        return C17296C.f55119a;
    }
}
