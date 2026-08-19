package wf;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.InterfaceC0571F;
import p033B5.AbstractC0833q;
import p033B5.C0840x;
import p033B5.InterfaceC0829m;
import p033B5.InterfaceC0832p;
import p049Bm.InterfaceC1439n;
import p1039ud.C20198o;
import p1155zi.C21907E;
import p1155zi.C21941M1;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p374P5.C6350c;
import p374P5.C6351d;
import p374P5.C6354g;
import p374P5.C6363p;
import p374P5.InterfaceC6357j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: wf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20943c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public String f66712Y;

    /* JADX INFO: renamed from: Z */
    public int f66713Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f66714o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C20945e f66715p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20943c(String str, C20945e c20945e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f66714o0 = str;
        this.f66715p0 = c20945e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20943c(this.f66714o0, this.f66715p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20943c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strConcat;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66713Z;
        C20945e c20945e = this.f66715p0;
        Application application = c20945e.f66719a;
        if (i10 != 0) {
            if (i10 == 1) {
                strConcat = this.f66712Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        }
        AbstractC9233X.m9807c(obj);
        String str = this.f66714o0;
        String strM22337a = C21907E.m22337a(str);
        EnumC20941a[] enumC20941aArr = EnumC20941a.f66706Y;
        strConcat = strM22337a.concat(".jpg");
        C6351d c6351d = new C6351d(application);
        c6351d.f20623c = str;
        C6354g c6354gM6972a = c6351d.m6972a();
        InterfaceC0832p interfaceC0832p = c20945e.f66720b;
        this.f66712Y = strConcat;
        this.f66713Z = 1;
        obj = ((C0840x) interfaceC0832p).m1898b(c6354gM6972a, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        InterfaceC6357j interfaceC6357j = (InterfaceC6357j) obj;
        if (!(interfaceC6357j instanceof C6363p)) {
            AbstractC16544l.m18092e(interfaceC6357j, "null cannot be cast to non-null type coil3.request.ErrorResult");
            return new C21941M1(((C6350c) interfaceC6357j).f20620c);
        }
        InterfaceC0829m interfaceC0829m = ((C6363p) interfaceC6357j).f20707a;
        Resources resources = application.getResources();
        AbstractC16544l.m18093f(resources, "getResources(...)");
        Drawable drawableM1889b = AbstractC0833q.m1889b(interfaceC0829m, resources);
        AbstractC16544l.m18092e(drawableM1889b, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        C20198o c20198o = new C20198o(((BitmapDrawable) drawableM1889b).getBitmap(), 12);
        this.f66712Y = null;
        this.f66713Z = 2;
        C3516e c3516e = AbstractC0593T.f1824a;
        obj = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C20944d(c20945e, strConcat, c20198o, null), this);
        return obj == enumC19250a ? enumC19250a : obj;
    }
}
