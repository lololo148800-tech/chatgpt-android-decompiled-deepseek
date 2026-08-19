package p749fd;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p033B5.AbstractC0833q;
import p033B5.C0840x;
import p033B5.InterfaceC0829m;
import p033B5.InterfaceC0832p;
import p049Bm.InterfaceC1439n;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21945N1;
import p1155zi.C21952P1;
import p374P5.AbstractC6356i;
import p374P5.C6350c;
import p374P5.C6351d;
import p374P5.C6354g;
import p374P5.C6363p;
import p374P5.InterfaceC6357j;
import p523V9.AbstractC7886F5;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: fd.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C13624i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f43043Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Context f43044Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13625j f43045o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC0832p f43046p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Uri f43047q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13624i(Context context, C13625j c13625j, InterfaceC0832p interfaceC0832p, Uri uri, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f43044Z = context;
        this.f43045o0 = c13625j;
        this.f43046p0 = interfaceC0832p;
        this.f43047q0 = uri;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13624i(this.f43044Z, this.f43045o0, this.f43046p0, this.f43047q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13624i) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        AbstractC21955Q1 c21945n1;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f43043Y;
        C13625j c13625j = this.f43045o0;
        Context context = this.f43044Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6351d c6351d = new C6351d(context);
            c6351d.f20623c = c13625j.f43048a;
            AbstractC6356i.m6974a(c6351d);
            C6354g c6354gM6972a = c6351d.m6972a();
            this.f43043Y = 1;
            obj = ((C0840x) this.f43046p0).m1898b(c6354gM6972a, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        InterfaceC6357j interfaceC6357j = (InterfaceC6357j) obj;
        boolean z6 = interfaceC6357j instanceof C6363p;
        Uri outputFile = this.f43047q0;
        if (z6) {
            InterfaceC0829m interfaceC0829m = ((C6363p) interfaceC6357j).f20707a;
            Resources resources = context.getResources();
            AbstractC16544l.m18093f(resources, "getResources(...)");
            Drawable drawableM1889b = AbstractC0833q.m1889b(interfaceC0829m, resources);
            AbstractC16544l.m18092e(drawableM1889b, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            Bitmap bitmap = ((BitmapDrawable) drawableM1889b).getBitmap();
            AbstractC16544l.m18091d(bitmap);
            C13616a c13616aM8180c = AbstractC7886F5.m8180c(c13625j, bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            AbstractC16544l.m18094g(outputFile, "outputFile");
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawColor(-1);
            AbstractC16544l.m18093f(bitmapCreateBitmap, "apply(...)");
            c21945n1 = AbstractC7886F5.m8181d(c13625j, context, c13616aM8180c, outputFile, bitmapCreateBitmap, -16777216, Bitmap.CompressFormat.PNG);
        } else {
            if (!(interfaceC6357j instanceof C6350c)) {
                throw new C0644w();
            }
            c21945n1 = new C21945N1(((C6350c) interfaceC6357j).f20620c);
        }
        if (c21945n1 instanceof C21952P1) {
            return new C21952P1(outputFile);
        }
        if ((c21945n1 instanceof C21929J1) || (c21945n1 instanceof AbstractC21933K1)) {
            return c21945n1;
        }
        throw new C0644w();
    }
}
