package p988rc;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1113xn.AbstractC21322p;
import p204I1.C3578I;

/* JADX INFO: renamed from: rc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18914b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C18914b f60352Z = new C18914b(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18914b f60353o0 = new C18914b(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C18914b f60354p0 = new C18914b(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f60355Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18914b(int i10, int i11) {
        super(i10);
        this.f60355Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f60355Y) {
            case 0:
                AbstractC21068W layout = (AbstractC21068W) obj;
                AbstractC16544l.m18094g(layout, "$this$layout");
                return C17296C.f55119a;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC16544l.m18094g(entry, "<name for destructuring parameter 0>");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                String strM21688V = AbstractC21322p.m21688V(str, "inline:");
                if (strM21688V == str) {
                    strM21688V = null;
                }
                if (strM21688V == null) {
                    return null;
                }
                AbstractC16544l.m18092e(value, "null cannot be cast to non-null type com.halilibo.richtext.ui.string.InlineContent");
                return new C17309l(strM21688V, (C18913a) value);
            default:
                AbstractC16544l.m18094g((C3578I) obj, QzvfuIgrngtl.xbdd);
                return C17296C.f55119a;
        }
    }
}
