package p586Y0;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p692d0.C12954G;

/* JADX INFO: renamed from: Y0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9551c extends C9550b {

    /* JADX INFO: renamed from: o */
    public final C9550b f28731o;

    /* JADX INFO: renamed from: p */
    public boolean f28732p;

    public C9551c(int i10, C9560l c9560l, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C9550b c9550b) {
        super(i10, c9560l, interfaceC1436k, interfaceC1436k2);
        this.f28731o = c9550b;
        c9550b.mo10050k();
    }

    @Override // p586Y0.C9550b, p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: c */
    public final void mo10043c() {
        if (this.f28740c) {
            return;
        }
        super.mo10043c();
        if (this.f28732p) {
            return;
        }
        this.f28732p = true;
        this.f28731o.mo10051l();
    }

    @Override // p586Y0.C9550b
    /* JADX INFO: renamed from: v */
    public final AbstractC9567s mo10058v() {
        C9550b c9550b = this.f28731o;
        if (c9550b.f28730m || c9550b.f28740c) {
            return new C9557i(this);
        }
        C12954G c12954g = this.f28725h;
        int i10 = this.f28739b;
        HashMap mapM10079c = c12954g != null ? AbstractC9562n.m10079c(c9550b, this, c9550b.mo10045e()) : null;
        synchronized (AbstractC9562n.f28759b) {
            try {
                AbstractC9562n.m10080d(this);
                if (c12954g == null || c12954g.f41146d == 0) {
                    m10069a();
                } else {
                    AbstractC9567s abstractC9567sM10066y = m10066y(this.f28731o.mo10044d(), mapM10079c, this.f28731o.mo10045e());
                    if (!abstractC9567sM10066y.equals(C9558j.f28743c)) {
                        return abstractC9567sM10066y;
                    }
                    C12954G c12954gMo10059w = this.f28731o.mo10059w();
                    if (c12954gMo10059w != null) {
                        c12954gMo10059w.m14632i(c12954g);
                    } else {
                        this.f28731o.mo10040B(c12954g);
                        this.f28725h = null;
                    }
                }
                if (this.f28731o.mo10044d() < i10) {
                    this.f28731o.m10065u();
                }
                C9550b c9550b2 = this.f28731o;
                c9550b2.mo10055r(c9550b2.mo10045e().m10073j(i10).m10072f(this.f28727j));
                this.f28731o.m10067z(i10);
                C9550b c9550b3 = this.f28731o;
                int i11 = this.f28741d;
                this.f28741d = -1;
                if (i11 >= 0) {
                    int[] iArr = c9550b3.f28728k;
                    AbstractC16544l.m18094g(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i11;
                    c9550b3.f28728k = iArrCopyOf;
                } else {
                    c9550b3.getClass();
                }
                this.f28731o.m10062A(this.f28727j);
                C9550b c9550b4 = this.f28731o;
                int[] iArr2 = this.f28728k;
                c9550b4.getClass();
                if (iArr2.length != 0) {
                    int[] iArr3 = c9550b4.f28728k;
                    if (iArr3.length != 0) {
                        int length2 = iArr3.length;
                        int length3 = iArr2.length;
                        int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                        System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                        AbstractC16544l.m18091d(iArrCopyOf2);
                        iArr2 = iArrCopyOf2;
                    }
                    c9550b4.f28728k = iArr2;
                }
                this.f28730m = true;
                if (!this.f28732p) {
                    this.f28732p = true;
                    this.f28731o.mo10051l();
                }
                return C9558j.f28743c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
