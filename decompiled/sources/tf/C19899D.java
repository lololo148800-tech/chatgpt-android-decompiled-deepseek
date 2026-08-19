package tf;

import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Loading;
import coil3.compose.AsyncImagePainter$State$Success;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p054C0.C1499l;
import p204I1.C3578I;
import p349O0.InterfaceC5985X;
import p759g1.C13800b;
import p774h1.C14327E;

/* JADX INFO: renamed from: tf.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C19899D extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63047Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f63048Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19899D(InterfaceC5985X interfaceC5985X, int i10) {
        super(1);
        this.f63047Y = i10;
        this.f63048Z = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        InterfaceC5985X interfaceC5985X = this.f63048Z;
        switch (this.f63047Y) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                C14327E c14327e = AbstractC19905J.f63074a;
                interfaceC5985X.setValue(bool);
                break;
            case 1:
                C1499l c1499l = (C1499l) obj;
                interfaceC5985X.setValue(c1499l.f3979c ? c1499l.f3978b : c1499l.f3977a);
                break;
            case 2:
                List list = (List) obj;
                if (interfaceC5985X != null) {
                    interfaceC5985X.setValue(list);
                }
                break;
            case 3:
                ((InterfaceC1436k) interfaceC5985X.getValue()).invoke(new C13800b(((C13800b) obj).f43584a));
                break;
            case 4:
                AsyncImagePainter$State$Loading it = (AsyncImagePainter$State$Loading) obj;
                AbstractC16544l.m18094g(it, "it");
                interfaceC5985X.setValue(it);
                break;
            case 5:
                AsyncImagePainter$State$Success it2 = (AsyncImagePainter$State$Success) obj;
                AbstractC16544l.m18094g(it2, "it");
                interfaceC5985X.setValue(it2);
                break;
            case 6:
                AsyncImagePainter$State$Error it3 = (AsyncImagePainter$State$Error) obj;
                AbstractC16544l.m18094g(it3, "it");
                interfaceC5985X.setValue(it3);
                break;
            case 7:
                C3578I it4 = (C3578I) obj;
                AbstractC16544l.m18094g(it4, "it");
                interfaceC5985X.setValue(it4);
                break;
            case 8:
                AsyncImagePainter$State$Loading it5 = (AsyncImagePainter$State$Loading) obj;
                AbstractC16544l.m18094g(it5, "it");
                interfaceC5985X.setValue(it5);
                break;
            case 9:
                AsyncImagePainter$State$Success it6 = (AsyncImagePainter$State$Success) obj;
                AbstractC16544l.m18094g(it6, "it");
                interfaceC5985X.setValue(it6);
                break;
            default:
                AsyncImagePainter$State$Error it7 = (AsyncImagePainter$State$Error) obj;
                AbstractC16544l.m18094g(it7, "it");
                interfaceC5985X.setValue(it7);
                break;
        }
        return c17296c;
    }
}
