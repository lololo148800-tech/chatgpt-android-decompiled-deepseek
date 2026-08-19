package p481Tf;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p544W9.AbstractC8681n4;
import p857kl.C16447N;

/* JADX INFO: renamed from: Tf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C7396a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C7396a f23433Z = new C7396a(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C7396a f23434o0 = new C7396a(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C7396a f23435p0 = new C7396a(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C7396a f23436q0 = new C7396a(1, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23437Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7396a(int i10, int i11) {
        super(i10);
        this.f23437Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f23437Y) {
            case 0:
                C16447N url = (C16447N) obj;
                AbstractC16544l.m18094g(url, "$this$url");
                AbstractC8681n4.m9374c(url, new String[]{"subscription", "deregister"});
                break;
            case 1:
                C16447N url2 = (C16447N) obj;
                AbstractC16544l.m18094g(url2, "$this$url");
                AbstractC8681n4.m9374c(url2, new String[]{"settings"});
                break;
            case 2:
                C16447N url3 = (C16447N) obj;
                AbstractC16544l.m18094g(url3, "$this$url");
                AbstractC8681n4.m9374c(url3, new String[]{"subscription", "register"});
                break;
            default:
                C16447N url4 = (C16447N) obj;
                AbstractC16544l.m18094g(url4, "$this$url");
                AbstractC8681n4.m9374c(url4, new String[]{"settings"});
                break;
        }
        return C17296C.f55119a;
    }
}
