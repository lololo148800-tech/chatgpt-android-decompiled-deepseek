package p1139z0;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0187M0;
import p003A1.C0190N0;
import p003A1.InterfaceC0300w1;
import p006A4.C0362w;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.EnumC0573G;
import p077Cn.EnumC1733a;
import p102Dm.AbstractC2119a;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.InterfaceC2211v0;
import p1071w0.C20709G;
import p1094x0.AbstractC21046e;
import p1140z1.AbstractC21690f;
import p204I1.C3578I;
import p204I1.C3581L;
import p350O1.C6045C;
import p350O1.C6065n;
import p350O1.InterfaceC6073v;
import p350O1.InterfaceC6074w;
import p547Wc.C8795g0;
import p759g1.C13801c;
import p860l0.C16663C;

/* JADX INFO: renamed from: z0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C21611e implements InterfaceC6074w {

    /* JADX INFO: renamed from: a */
    public C21587J f68452a;

    /* JADX INFO: renamed from: b */
    public C0564B0 f68453b;

    /* JADX INFO: renamed from: c */
    public C21591N f68454c;

    /* JADX INFO: renamed from: d */
    public C2127D0 f68455d;

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: a */
    public final void mo6614a(C6045C c6045c, InterfaceC6073v interfaceC6073v, C3578I c3578i, C8795g0 c8795g0, C13801c c13801c, C13801c c13801c2) {
        C21591N c21591n = this.f68454c;
        if (c21591n != null) {
            C21588K c21588k = c21591n.f68384m;
            synchronized (c21588k.f68355c) {
                try {
                    c21588k.f68362j = c6045c;
                    c21588k.f68364l = interfaceC6073v;
                    c21588k.f68363k = c3578i;
                    c21588k.f68365m = c13801c;
                    c21588k.f68366n = c13801c2;
                    if (c21588k.f68357e || c21588k.f68356d) {
                        c21588k.m21936a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: b */
    public final void mo6615b() {
        m21949j(null);
    }

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: c */
    public final void mo6616c() {
        InterfaceC0300w1 interfaceC0300w1;
        C21587J c21587j = this.f68452a;
        if (c21587j == null || (interfaceC0300w1 = (InterfaceC0300w1) AbstractC21690f.m22204i(c21587j, AbstractC0187M0.f712n)) == null) {
            return;
        }
        ((C0190N0) interfaceC0300w1).m572b();
    }

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: d */
    public final void mo6617d() {
        C0564B0 c0564b0 = this.f68453b;
        if (c0564b0 != null) {
            c0564b0.mo1275e(null);
        }
        this.f68453b = null;
        InterfaceC2211v0 interfaceC2211v0M21948i = m21948i();
        if (interfaceC2211v0M21948i != null) {
            ((C2127D0) interfaceC2211v0M21948i).mo3230e();
        }
    }

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: e */
    public final void mo6618e(C6045C c6045c, C6045C c6045c2) {
        C21591N c21591n = this.f68454c;
        if (c21591n != null) {
            boolean z6 = (C3581L.m4266b(c21591n.f68379h.f19683b, c6045c2.f19683b) && AbstractC16544l.m18089b(c21591n.f68379h.f19684c, c6045c2.f19684c)) ? false : true;
            c21591n.f68379h = c6045c2;
            int size = c21591n.f68381j.size();
            for (int i10 = 0; i10 < size; i10++) {
                InputConnectionC21594Q inputConnectionC21594Q = (InputConnectionC21594Q) ((WeakReference) c21591n.f68381j.get(i10)).get();
                if (inputConnectionC21594Q != null) {
                    inputConnectionC21594Q.f68396g = c6045c2;
                }
            }
            C21588K c21588k = c21591n.f68384m;
            synchronized (c21588k.f68355c) {
                c21588k.f68362j = null;
                c21588k.f68364l = null;
                c21588k.f68363k = null;
                c21588k.f68365m = null;
                c21588k.f68366n = null;
            }
            if (AbstractC16544l.m18089b(c6045c, c6045c2)) {
                if (z6) {
                    C21585H c21585h = c21591n.f68373b;
                    int iM4270f = C3581L.m4270f(c6045c2.f19683b);
                    int iM4269e = C3581L.m4269e(c6045c2.f19683b);
                    C3581L c3581l = c21591n.f68379h.f19684c;
                    int iM4270f2 = c3581l != null ? C3581L.m4270f(c3581l.f10908a) : -1;
                    C3581L c3581l2 = c21591n.f68379h.f19684c;
                    c21585h.m21930t().updateSelection((View) c21585h.f68344Z, iM4270f, iM4269e, iM4270f2, c3581l2 != null ? C3581L.m4269e(c3581l2.f10908a) : -1);
                    return;
                }
                return;
            }
            if (c6045c != null && (!AbstractC16544l.m18089b(c6045c.f19682a.f10934Y, c6045c2.f19682a.f10934Y) || (C3581L.m4266b(c6045c.f19683b, c6045c2.f19683b) && !AbstractC16544l.m18089b(c6045c.f19684c, c6045c2.f19684c)))) {
                C21585H c21585h2 = c21591n.f68373b;
                c21585h2.m21930t().restartInput((View) c21585h2.f68344Z);
                return;
            }
            int size2 = c21591n.f68381j.size();
            for (int i11 = 0; i11 < size2; i11++) {
                InputConnectionC21594Q inputConnectionC21594Q2 = (InputConnectionC21594Q) ((WeakReference) c21591n.f68381j.get(i11)).get();
                if (inputConnectionC21594Q2 != null) {
                    C6045C c6045c3 = c21591n.f68379h;
                    C21585H c21585h3 = c21591n.f68373b;
                    if (inputConnectionC21594Q2.f68400k) {
                        inputConnectionC21594Q2.f68396g = c6045c3;
                        if (inputConnectionC21594Q2.f68398i) {
                            c21585h3.m21930t().updateExtractedText((View) c21585h3.f68344Z, inputConnectionC21594Q2.f68397h, AbstractC21627m.m21960h(c6045c3));
                        }
                        C3581L c3581l3 = c6045c3.f19684c;
                        int iM4270f3 = c3581l3 != null ? C3581L.m4270f(c3581l3.f10908a) : -1;
                        C3581L c3581l4 = c6045c3.f19684c;
                        int iM4269e2 = c3581l4 != null ? C3581L.m4269e(c3581l4.f10908a) : -1;
                        long j10 = c6045c3.f19683b;
                        c21585h3.m21930t().updateSelection((View) c21585h3.f68344Z, C3581L.m4270f(j10), C3581L.m4269e(j10), iM4270f3, iM4269e2);
                    }
                }
            }
        }
    }

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: f */
    public final void mo6619f(C6045C c6045c, C6065n c6065n, C16663C c16663c, C20709G c20709g) {
        m21949j(new C0362w((Object) c6045c, (Object) this, (Object) c6065n, (Object) c16663c, (Object) c20709g, 16));
    }

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: g */
    public final void mo6620g(C13801c c13801c) {
        Rect rect;
        C21591N c21591n = this.f68454c;
        if (c21591n != null) {
            c21591n.f68383l = new Rect(AbstractC2119a.m3195i(c13801c.f43586a), AbstractC2119a.m3195i(c13801c.f43587b), AbstractC2119a.m3195i(c13801c.f43588c), AbstractC2119a.m3195i(c13801c.f43589d));
            if (!c21591n.f68381j.isEmpty() || (rect = c21591n.f68383l) == null) {
                return;
            }
            c21591n.f68372a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // p350O1.InterfaceC6074w
    /* JADX INFO: renamed from: h */
    public final void mo6621h() {
        InterfaceC0300w1 interfaceC0300w1;
        C21587J c21587j = this.f68452a;
        if (c21587j == null || (interfaceC0300w1 = (InterfaceC0300w1) AbstractC21690f.m22204i(c21587j, AbstractC0187M0.f712n)) == null) {
            return;
        }
        ((C0190N0) interfaceC0300w1).m571a();
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC2211v0 m21948i() {
        C2127D0 c2127d0 = this.f68455d;
        if (c2127d0 != null) {
            return c2127d0;
        }
        if (!AbstractC21046e.f66933a) {
            return null;
        }
        C2127D0 c2127d0M3203b = AbstractC2124C.m3203b(1, 0, EnumC1733a.f4963o0, 2);
        this.f68455d = c2127d0M3203b;
        return c2127d0M3203b;
    }

    /* JADX INFO: renamed from: j */
    public final void m21949j(C0362w c0362w) {
        C21587J c21587j = this.f68452a;
        if (c21587j == null) {
            return;
        }
        this.f68453b = c21587j.f30972y0 ? AbstractC0575H.m1156D(c21587j.m10935y0(), null, EnumC0573G.f1793p0, new C21586I(c21587j, new C21609d(c0362w, this, c21587j, null), null), 1) : null;
    }

    /* JADX INFO: renamed from: k */
    public final void m21950k(C21587J c21587j) {
        if (this.f68452a == c21587j) {
            this.f68452a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + c21587j + " but was " + this.f68452a).toString());
    }
}
