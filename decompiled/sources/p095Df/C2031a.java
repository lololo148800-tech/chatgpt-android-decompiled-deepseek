package p095Df;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C0937I1;
import p049Bm.InterfaceC1436k;
import p339Nf.AbstractC5722d;
import p988rc.C18919g;

/* JADX INFO: renamed from: Df.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2031a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6237Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0937I1 f6238Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2031a(C0937I1 c0937i1, int i10) {
        super(1);
        this.f6237Y = i10;
        this.f6238Z = c0937i1;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        String strM6157a;
        String strM6157a2;
        switch (this.f6237Y) {
            case 0:
                C18919g withGrayLinkFormat = (C18919g) obj;
                AbstractC16544l.m18094g(withGrayLinkFormat, "$this$withGrayLinkFormat");
                C0937I1 c0937i1 = this.f6238Z;
                String str = c0937i1.f2689e;
                if (str == null && (strM6157a = AbstractC5722d.m6157a((str = c0937i1.f2687c))) != null) {
                    str = strM6157a;
                }
                withGrayLinkFormat.m20269a(str);
                break;
            default:
                C18919g withGrayLinkFormat2 = (C18919g) obj;
                AbstractC16544l.m18094g(withGrayLinkFormat2, "$this$withGrayLinkFormat");
                C0937I1 c0937i2 = this.f6238Z;
                String str2 = c0937i2.f2689e;
                if (str2 == null && (strM6157a2 = AbstractC5722d.m6157a((str2 = c0937i2.f2687c))) != null) {
                    str2 = strM6157a2;
                }
                withGrayLinkFormat2.m20269a(str2);
                break;
        }
        return C17296C.f55119a;
    }
}
