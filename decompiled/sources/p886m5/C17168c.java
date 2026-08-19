package p886m5;

import android.graphics.drawable.Drawable;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainter$State$Error;
import coil.compose.AsyncImagePainter$State$Success;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p1075w5.AbstractC20832j;
import p1075w5.C20826d;
import p1075w5.C20827e;
import p1075w5.C20830h;
import p1075w5.C20831i;
import p1075w5.C20838p;
import p1095x1.C21089j;
import p1095x1.InterfaceC21090k;
import p1098x5.EnumC21125d;
import p1098x5.EnumC21128g;
import p1121y5.C21388a;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p571X9.AbstractC9233X;
import p588Y2.C9642z;
import p604Yk.C10077b;
import p864l5.C16821h;
import p864l5.C16822i;
import p864l5.C16826m;
import p864l5.InterfaceC16818e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: m5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17168c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f54848Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f54849Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AsyncImagePainter f54850o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17168c(AsyncImagePainter asyncImagePainter, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54850o0 = asyncImagePainter;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17168c c17168c = new C17168c(this.f54850o0, interfaceC18770c);
        c17168c.f54849Z = obj;
        return c17168c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17168c) create((C20831i) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        AsyncImagePainter asyncImagePainter;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54848Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C20831i c20831i = (C20831i) this.f54849Z;
            AsyncImagePainter asyncImagePainter2 = this.f54850o0;
            InterfaceC16818e interfaceC16818e = (InterfaceC16818e) asyncImagePainter2.f35877F0.getValue();
            C20830h c20830hM21439a = C20831i.m21439a(c20831i);
            c20830hM21439a.f66188d = new C10077b(asyncImagePainter2, 13);
            c20830hM21439a.m21436b();
            C20826d c20826d = c20831i.f66208C;
            if (c20826d.f66176a == null) {
                c20830hM21439a.f66201q = new C9642z(asyncImagePainter2, 15);
                c20830hM21439a.m21436b();
            }
            if (c20826d.f66177b == null) {
                InterfaceC21090k interfaceC21090k = asyncImagePainter2.f35872A0;
                int i11 = AbstractC17174i.f54858a;
                c20830hM21439a.f66202r = (AbstractC16544l.m18089b(interfaceC21090k, C21089j.f67012o0) || AbstractC16544l.m18089b(interfaceC21090k, C21089j.f67013p0)) ? EnumC21128g.f67129Z : EnumC21128g.f67128Y;
            }
            if (c20826d.f66179d != EnumC21125d.f67121Y) {
                c20830hM21439a.f66190f = EnumC21125d.f67122Z;
            }
            C20831i c20831iM21435a = c20830hM21439a.m21435a();
            this.f54849Z = asyncImagePainter2;
            this.f54848Y = 1;
            C16826m c16826m = (C16826m) interfaceC16818e;
            c16826m.getClass();
            if (c20831iM21435a.f66212c instanceof C21388a) {
                obj = AbstractC0575H.m1183l(new C16821h(c16826m, null, c20831iM21435a), this);
            } else {
                C3516e c3516e = AbstractC0593T.f1824a;
                obj = AbstractC0575H.m1168P(AbstractC2935m.f8797a.f3819q0, new C16822i(c16826m, null, c20831iM21435a), this);
            }
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            asyncImagePainter = asyncImagePainter2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            asyncImagePainter = (AsyncImagePainter) this.f54849Z;
            AbstractC9233X.m9807c(obj);
        }
        AbstractC20832j abstractC20832j = (AbstractC20832j) obj;
        asyncImagePainter.getClass();
        if (abstractC20832j instanceof C20838p) {
            C20838p c20838p = (C20838p) abstractC20832j;
            return new AsyncImagePainter$State$Success(asyncImagePainter.m13130j(c20838p.f66255a), c20838p);
        }
        if (!(abstractC20832j instanceof C20827e)) {
            throw new C0644w();
        }
        C20827e c20827e = (C20827e) abstractC20832j;
        Drawable drawable = c20827e.f66180a;
        return new AsyncImagePainter$State$Error(drawable != null ? asyncImagePainter.m13130j(drawable) : null, c20827e);
    }
}
