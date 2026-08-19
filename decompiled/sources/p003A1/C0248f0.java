package p003A1;

import android.content.res.Configuration;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Loading;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p000.C12941d;
import p017Af.EnumC0463J;
import p040Bd.C1011U4;
import p040Bd.C1126m1;
import p049Bm.InterfaceC1436k;
import p080D0.C1824q;
import p1095x1.InterfaceC21098s;
import p1139z0.C21585H;
import p1140z1.C21660F;
import p316Mf.AbstractC5340g;
import p339Nf.AbstractC5741w;
import p339Nf.EnumC5742x;
import p349O0.C5950F;
import p349O0.C6037x;
import p349O0.InterfaceC5985X;
import p492U1.C7545j;
import p523V9.AbstractC8088f6;
import p759g1.C13803e;
import p773h0.C14311u;
import p821j1.C16037b;

/* JADX INFO: renamed from: A1.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0248f0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f939Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f940Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0248f0(InterfaceC5985X interfaceC5985X, int i10) {
        super(1);
        this.f939Y = i10;
        this.f940Z = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        InterfaceC5985X interfaceC5985X = this.f940Z;
        switch (this.f939Y) {
            case 0:
                Configuration configuration = new Configuration((Configuration) obj);
                C6037x c6037x = AndroidCompositionLocals_androidKt.f32824a;
                interfaceC5985X.setValue(configuration);
                return c17296c;
            case 1:
                EnumC0463J it = (EnumC0463J) obj;
                AbstractC16544l.m18094g(it, "it");
                interfaceC5985X.setValue(it);
                return c17296c;
            case 2:
                interfaceC5985X.setValue((C1126m1) obj);
                return c17296c;
            case 3:
                interfaceC5985X.setValue(Integer.valueOf(((Number) obj).intValue()));
                return c17296c;
            case 4:
                interfaceC5985X.setValue(Integer.valueOf(((Number) obj).intValue()));
                return c17296c;
            case 5:
                C5950F DisposableEffect = (C5950F) obj;
                AbstractC16544l.m18094g(DisposableEffect, "$this$DisposableEffect");
                return new C12941d(interfaceC5985X, 0);
            case 6:
                C1011U4 it2 = (C1011U4) obj;
                AbstractC16544l.m18094g(it2, "it");
                interfaceC5985X.setValue(it2);
                return c17296c;
            case 7:
                interfaceC5985X.setValue(Integer.valueOf((int) (((C7545j) obj).f23903a >> 32)));
                return c17296c;
            case 8:
                interfaceC5985X.setValue((C1824q) obj);
                return c17296c;
            case 9:
                ((Boolean) obj).getClass();
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 10:
                ((Boolean) obj).getClass();
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 11:
                interfaceC5985X.setValue(new C7545j(((C7545j) obj).f23903a));
                return c17296c;
            case 12:
                interfaceC5985X.setValue(new C7545j(((C7545j) obj).f23903a));
                return c17296c;
            case 13:
                InterfaceC21098s it3 = (InterfaceC21098s) obj;
                AbstractC16544l.m18094g(it3, "it");
                interfaceC5985X.setValue(it3);
                return c17296c;
            case 14:
                InterfaceC21098s it4 = (InterfaceC21098s) obj;
                AbstractC16544l.m18094g(it4, "it");
                interfaceC5985X.setValue(it4);
                return c17296c;
            case 15:
                InterfaceC21098s it5 = (InterfaceC21098s) obj;
                AbstractC16544l.m18094g(it5, "it");
                interfaceC5985X.setValue(it5);
                return c17296c;
            case 16:
                AbstractC16544l.m18094g((Throwable) obj, "it");
                interfaceC5985X.setValue(Boolean.TRUE);
                return c17296c;
            case 17:
                C21660F c21660f = (C21660F) obj;
                c21660f.m22080a();
                float fMo7864b0 = c21660f.mo7864b0(((C14311u) interfaceC5985X.getValue()).f44928a);
                C16037b c16037b = c21660f.f68674Y;
                float fM15331c = C13803e.m15331c(c16037b.f49479Z.m15202x()) - (fMo7864b0 / 2);
                c21660f.mo17594a0(((C14311u) interfaceC5985X.getValue()).f44929b, AbstractC8088f6.m8536b(0.0f, fM15331c), AbstractC8088f6.m8536b(C13803e.m15333e(c16037b.f49479Z.m15202x()), fM15331c), fMo7864b0, (432 & 16) != 0 ? 0 : 0, (432 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                return c17296c;
            case 18:
                interfaceC5985X.setValue((InterfaceC21098s) obj);
                return c17296c;
            case 19:
                C5950F DisposableEffect2 = (C5950F) obj;
                AbstractC16544l.m18094g(DisposableEffect2, "$this$DisposableEffect");
                return new C12941d(interfaceC5985X, 1);
            case 20:
                AsyncImagePainter$State$Loading it6 = (AsyncImagePainter$State$Loading) obj;
                AbstractC16544l.m18094g(it6, "it");
                interfaceC5985X.setValue(it6);
                return c17296c;
            case 21:
                AsyncImagePainter$State$Error it7 = (AsyncImagePainter$State$Error) obj;
                AbstractC16544l.m18094g(it7, "it");
                interfaceC5985X.setValue(it7);
                return c17296c;
            case 22:
                ((Boolean) obj).getClass();
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 23:
                ((Boolean) obj).getClass();
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 24:
                ((Boolean) obj).getClass();
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 25:
                ((Boolean) obj).getClass();
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 26:
                interfaceC5985X.setValue(Float.valueOf((int) (((C7545j) obj).f23903a & 4294967295L)));
                return c17296c;
            case 27:
                String it8 = (String) obj;
                AbstractC16544l.m18094g(it8, "it");
                C21585H c21585h = AbstractC5340g.f17559a;
                interfaceC5985X.setValue(it8);
                return c17296c;
            case 28:
                EnumC5742x it9 = (EnumC5742x) obj;
                AbstractC16544l.m18094g(it9, "it");
                float f10 = AbstractC5741w.f18690a;
                interfaceC5985X.setValue(it9);
                return c17296c;
            default:
                AsyncImagePainter$State$Loading it10 = (AsyncImagePainter$State$Loading) obj;
                AbstractC16544l.m18094g(it10, "it");
                interfaceC5985X.setValue(it10);
                return c17296c;
        }
    }
}
