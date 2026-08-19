package p394Q2;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p009A7.FlM.nkFZpTrMPpn;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p1061vb.C20513d;
import p128Em.InterfaceC2579b;
import p225Im.InterfaceC3776x;
import p273Kl.C4714D;
import p351O2.C6084G;
import p351O2.C6090d;
import p351O2.InterfaceC6088b;
import p417R2.C6792d;
import p417R2.C6793e;
import p417R2.C6794f;
import p571X9.AbstractC9393x3;
import p959q8.C18639a;

/* JADX INFO: renamed from: Q2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6562b implements InterfaceC2579b {

    /* JADX INFO: renamed from: a */
    public final C20513d f21230a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f21231b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0571F f21232c;

    /* JADX INFO: renamed from: d */
    public final Object f21233d = new Object();

    /* JADX INFO: renamed from: e */
    public volatile C6792d f21234e;

    public C6562b(C20513d c20513d, InterfaceC1436k interfaceC1436k, InterfaceC0571F interfaceC0571F) {
        this.f21230a = c20513d;
        this.f21231b = interfaceC1436k;
        this.f21232c = interfaceC0571F;
    }

    @Override // p128Em.InterfaceC2579b
    public final Object getValue(Object obj, InterfaceC3776x property) {
        C6792d c6792d;
        Context thisRef = (Context) obj;
        AbstractC16544l.m18094g(thisRef, "thisRef");
        AbstractC16544l.m18094g(property, "property");
        C6792d c6792d2 = this.f21234e;
        if (c6792d2 != null) {
            return c6792d2;
        }
        synchronized (this.f21233d) {
            try {
                if (this.f21234e == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    InterfaceC6088b c18639a = this.f21230a;
                    InterfaceC1436k interfaceC1436k = this.f21231b;
                    AbstractC16544l.m18093f(applicationContext, "applicationContext");
                    List list = (List) interfaceC1436k.invoke(applicationContext);
                    InterfaceC0571F interfaceC0571F = this.f21232c;
                    C4714D c4714d = new C4714D(applicationContext, 15, this);
                    AbstractC16544l.m18094g(list, nkFZpTrMPpn.lXqgeA);
                    C6794f c6794f = C6794f.f21803a;
                    C6793e c6793e = new C6793e(0, c4714d);
                    if (c18639a == null) {
                        c18639a = new C18639a(13);
                    }
                    this.f21234e = new C6792d(new C6084G(c6793e, c6794f, AbstractC9393x3.m9974d(new C6090d(list, null)), c18639a, interfaceC0571F));
                }
                c6792d = this.f21234e;
                AbstractC16544l.m18091d(c6792d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6792d;
    }
}
