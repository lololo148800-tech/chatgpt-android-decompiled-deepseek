package p328N1;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17311n;
import p025An.C0624m;
import p064Ca.C1620b;
import p523V9.AbstractC8154o0;
import p544W9.AbstractC8566U3;
import p544W9.AbstractC8578W3;
import p571X9.AbstractC9233X;
import p955q2.AbstractC18619k;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: N1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5586b {

    /* JADX INFO: renamed from: a */
    public final Context f18097a;

    public C5586b(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f18097a = context;
                break;
            default:
                this.f18097a = context.getApplicationContext();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m5986a(C5576C c5576c, AbstractC19687c abstractC19687c) {
        C5585a c5585a;
        C5586b c5586b;
        if (abstractC19687c instanceof C5585a) {
            c5585a = (C5585a) abstractC19687c;
            int i10 = c5585a.f18096q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5585a.f18096q0 = i10 - Integer.MIN_VALUE;
            } else {
                c5585a = new C5585a(this, abstractC19687c);
            }
        } else {
            c5585a = new C5585a(this, abstractC19687c);
        }
        Object objM1261q = c5585a.f18094o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5585a.f18096q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM1261q);
            if (!(c5576c instanceof C5576C)) {
                throw new IllegalArgumentException("Unknown font type: " + c5576c);
            }
            c5585a.f18092Y = this;
            c5585a.f18093Z = c5576c;
            c5585a.f18096q0 = 2;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c5585a));
            c0624m.m1262r();
            int i12 = c5576c.f18077a;
            C1620b c1620b = new C1620b(c0624m, c5576c);
            ThreadLocal threadLocal = AbstractC18619k.f59299a;
            Context context = this.f18097a;
            if (context.isRestricted()) {
                c1620b.m19969a(-4);
            } else {
                AbstractC18619k.m19976c(context, i12, new TypedValue(), 0, c1620b, false, false);
            }
            objM1261q = c0624m.m1261q();
            if (objM1261q == enumC19250a) {
                return enumC19250a;
            }
            c5586b = this;
        } else {
            if (i11 == 1) {
                AbstractC9233X.m9807c(objM1261q);
                return objM1261q;
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5576c = c5585a.f18093Z;
            c5586b = c5585a.f18092Y;
            AbstractC9233X.m9807c(objM1261q);
        }
        return AbstractC8578W3.m9245b((Typeface) objM1261q, c5576c.f18080d, c5586b.f18097a);
    }

    /* JADX INFO: renamed from: b */
    public Typeface m5987b(C5576C c5576c) {
        Object objM9806b;
        Typeface typefaceM19975b;
        if (!(c5576c instanceof C5576C)) {
            return null;
        }
        int i10 = c5576c.f18081e;
        boolean zM9232b = AbstractC8566U3.m9232b(i10, 0);
        Context context = this.f18097a;
        if (zM9232b) {
            typefaceM19975b = AbstractC18619k.m19975b(context, c5576c.f18077a);
            AbstractC16544l.m18091d(typefaceM19975b);
        } else {
            if (!AbstractC8566U3.m9232b(i10, 1)) {
                if (AbstractC8566U3.m9232b(i10, 2)) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) AbstractC8566U3.m9233c(c5576c.f18081e)));
            }
            try {
                objM9806b = AbstractC18619k.m19975b(context, c5576c.f18077a);
                AbstractC16544l.m18091d(objM9806b);
            } catch (Throwable th2) {
                objM9806b = AbstractC9233X.m9806b(th2);
            }
            typefaceM19975b = (Typeface) (objM9806b instanceof C17311n ? null : objM9806b);
        }
        return AbstractC8578W3.m9245b(typefaceM19975b, c5576c.f18080d, context);
    }
}
