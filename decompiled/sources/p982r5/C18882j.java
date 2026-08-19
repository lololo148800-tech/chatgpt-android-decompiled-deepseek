package p982r5;

import android.content.Context;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.util.ArrayList;
import p1075w5.AbstractC20832j;
import p1075w5.C20831i;
import p1075w5.C20833k;
import p1098x5.C21129h;
import p571X9.AbstractC9233X;
import p864l5.C16816c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: r5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C18882j {

    /* JADX INFO: renamed from: a */
    public final C20831i f60185a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f60186b;

    /* JADX INFO: renamed from: c */
    public final int f60187c;

    /* JADX INFO: renamed from: d */
    public final C20831i f60188d;

    /* JADX INFO: renamed from: e */
    public final C21129h f60189e;

    /* JADX INFO: renamed from: f */
    public final C16816c f60190f;

    /* JADX INFO: renamed from: g */
    public final boolean f60191g;

    public C18882j(C20831i c20831i, ArrayList arrayList, int i10, C20831i c20831i2, C21129h c21129h, C16816c c16816c, boolean z6) {
        this.f60185a = c20831i;
        this.f60186b = arrayList;
        this.f60187c = i10;
        this.f60188d = c20831i2;
        this.f60189e = c21129h;
        this.f60190f = c16816c;
        this.f60191g = z6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m20201b(C20831i c20831i, AbstractC19687c abstractC19687c) {
        C18881i c18881i;
        C18882j c18882j;
        C18880h c18880h;
        if (abstractC19687c instanceof C18881i) {
            c18881i = (C18881i) abstractC19687c;
            int i10 = c18881i.f60184q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18881i.f60184q0 = i10 - Integer.MIN_VALUE;
            } else {
                c18881i = new C18881i(this, abstractC19687c);
            }
        } else {
            c18881i = new C18881i(this, abstractC19687c);
        }
        Object objM20199d = c18881i.f60182o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18881i.f60184q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM20199d);
            ArrayList arrayList = this.f60186b;
            int i12 = this.f60187c;
            if (i12 > 0) {
                m20200a(c20831i, (C18880h) arrayList.get(i12 - 1));
            }
            C18880h c18880h2 = (C18880h) arrayList.get(i12);
            C18882j c18882j2 = new C18882j(this.f60185a, arrayList, i12 + 1, c20831i, this.f60189e, this.f60190f, this.f60191g);
            c18881i.f60180Y = this;
            c18881i.f60181Z = c18880h2;
            c18881i.f60184q0 = 1;
            objM20199d = c18880h2.m20199d(c18882j2, c18881i);
            if (objM20199d == enumC19250a) {
                return enumC19250a;
            }
            c18882j = this;
            c18880h = c18880h2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c18880h = c18881i.f60181Z;
            c18882j = c18881i.f60180Y;
            AbstractC9233X.m9807c(objM20199d);
        }
        AbstractC20832j abstractC20832j = (AbstractC20832j) objM20199d;
        c18882j.m20200a(abstractC20832j.mo21434b(), c18880h);
        return abstractC20832j;
    }

    /* JADX INFO: renamed from: a */
    public final void m20200a(C20831i c20831i, C18880h c18880h) {
        Context context = c20831i.f66210a;
        C20831i c20831i2 = this.f60185a;
        Context context2 = c20831i2.f66210a;
        String str = YladLSetV.otyCSKXhZi;
        if (context != context2) {
            throw new IllegalStateException((str + c18880h + "' cannot modify the request's context.").toString());
        }
        if (c20831i.f66211b == C20833k.f66236b) {
            throw new IllegalStateException((str + c18880h + "' cannot set the request's data to null.").toString());
        }
        if (c20831i.f66212c != c20831i2.f66212c) {
            throw new IllegalStateException((str + c18880h + "' cannot modify the request's target.").toString());
        }
        if (c20831i.f66232w != c20831i2.f66232w) {
            throw new IllegalStateException((str + c18880h + "' cannot modify the request's lifecycle.").toString());
        }
        if (c20831i.f66233x == c20831i2.f66233x) {
            return;
        }
        throw new IllegalStateException((str + c18880h + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }
}
