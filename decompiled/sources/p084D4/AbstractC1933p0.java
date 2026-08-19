package p084D4;

import android.gov.nist.core.Separators;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.bQBnquXS;

/* JADX INFO: renamed from: D4.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1933p0 {

    /* JADX INFO: renamed from: t */
    public static final List f5679t = Collections.emptyList();

    /* JADX INFO: renamed from: a */
    public final View f5680a;

    /* JADX INFO: renamed from: b */
    public WeakReference f5681b;

    /* JADX INFO: renamed from: j */
    public int f5689j;

    /* JADX INFO: renamed from: r */
    public RecyclerView f5697r;

    /* JADX INFO: renamed from: s */
    public AbstractC1893Q f5698s;

    /* JADX INFO: renamed from: c */
    public int f5682c = -1;

    /* JADX INFO: renamed from: d */
    public int f5683d = -1;

    /* JADX INFO: renamed from: e */
    public long f5684e = -1;

    /* JADX INFO: renamed from: f */
    public int f5685f = -1;

    /* JADX INFO: renamed from: g */
    public int f5686g = -1;

    /* JADX INFO: renamed from: h */
    public AbstractC1933p0 f5687h = null;

    /* JADX INFO: renamed from: i */
    public AbstractC1933p0 f5688i = null;

    /* JADX INFO: renamed from: k */
    public ArrayList f5690k = null;

    /* JADX INFO: renamed from: l */
    public List f5691l = null;

    /* JADX INFO: renamed from: m */
    public int f5692m = 0;

    /* JADX INFO: renamed from: n */
    public C1911e0 f5693n = null;

    /* JADX INFO: renamed from: o */
    public boolean f5694o = false;

    /* JADX INFO: renamed from: p */
    public int f5695p = 0;

    /* JADX INFO: renamed from: q */
    public int f5696q = -1;

    public AbstractC1933p0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f5680a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m3086a(int i10) {
        this.f5689j = i10 | this.f5689j;
    }

    /* JADX INFO: renamed from: b */
    public final int m3087b() {
        RecyclerView recyclerView;
        AbstractC1893Q adapter;
        int iM12261I;
        if (this.f5698s == null || (recyclerView = this.f5697r) == null || (adapter = recyclerView.getAdapter()) == null || (iM12261I = this.f5697r.m12261I(this)) == -1 || this.f5698s != adapter) {
            return -1;
        }
        return iM12261I;
    }

    /* JADX INFO: renamed from: c */
    public final int m3088c() {
        int i10 = this.f5686g;
        return i10 == -1 ? this.f5682c : i10;
    }

    /* JADX INFO: renamed from: d */
    public final List m3089d() {
        ArrayList arrayList;
        return ((this.f5689j & 1024) != 0 || (arrayList = this.f5690k) == null || arrayList.size() == 0) ? f5679t : this.f5691l;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3090e(int i10) {
        return (i10 & this.f5689j) != 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3091f() {
        View view = this.f5680a;
        return (view.getParent() == null || view.getParent() == this.f5697r) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3092g() {
        return (this.f5689j & 1) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3093h() {
        return (this.f5689j & 4) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3094i() {
        if ((this.f5689j & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            if (!this.f5680a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3095j() {
        return (this.f5689j & 8) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3096k() {
        return this.f5693n != null;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3097l() {
        return (this.f5689j & 256) != 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3098m() {
        return (this.f5689j & 2) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m3099n(int i10, boolean z6) {
        if (this.f5683d == -1) {
            this.f5683d = this.f5682c;
        }
        if (this.f5686g == -1) {
            this.f5686g = this.f5682c;
        }
        if (z6) {
            this.f5686g += i10;
        }
        this.f5682c += i10;
        View view = this.f5680a;
        if (view.getLayoutParams() != null) {
            ((C1901Z) view.getLayoutParams()).f5559c = true;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3100o() {
        if (RecyclerView.f33580K1 && m3097l()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f5689j = 0;
        this.f5682c = -1;
        this.f5683d = -1;
        this.f5684e = -1L;
        this.f5686g = -1;
        this.f5692m = 0;
        this.f5687h = null;
        this.f5688i = null;
        ArrayList arrayList = this.f5690k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f5689j &= -1025;
        this.f5695p = 0;
        this.f5696q = -1;
        RecyclerView.m12252l(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m3101p(boolean z6) {
        int i10 = this.f5692m;
        int i11 = z6 ? i10 - 1 : i10 + 1;
        this.f5692m = i11;
        if (i11 < 0) {
            this.f5692m = 0;
            if (RecyclerView.f33580K1) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            AbstractC15256t.m16465c("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z6 && i11 == 1) {
            this.f5689j |= 16;
        } else if (z6 && i11 == 0) {
            this.f5689j &= -17;
        }
        if (RecyclerView.f33581L1) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z6 + ":" + this);
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m3102q() {
        return (this.f5689j & 128) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3103r() {
        return (this.f5689j & 32) != 0;
    }

    public final String toString() {
        String simpleName;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(simpleName, "{");
        sbM9895n.append(Integer.toHexString(hashCode()));
        sbM9895n.append(" position=");
        sbM9895n.append(this.f5682c);
        sbM9895n.append(" id=");
        sbM9895n.append(this.f5684e);
        sbM9895n.append(", oldPos=");
        sbM9895n.append(this.f5683d);
        sbM9895n.append(", pLpos:");
        sbM9895n.append(this.f5686g);
        StringBuilder sb2 = new StringBuilder(sbM9895n.toString());
        if (m3096k()) {
            sb2.append(" scrap ");
            if (this.f5694o) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb2.append(str);
        }
        if (m3093h()) {
            sb2.append(" invalid");
        }
        if (!m3092g()) {
            sb2.append(bQBnquXS.GfA);
        }
        if ((this.f5689j & 2) != 0) {
            sb2.append(" update");
        }
        if (m3095j()) {
            sb2.append(" removed");
        }
        if (m3102q()) {
            sb2.append(" ignored");
        }
        if (m3097l()) {
            sb2.append(" tmpDetached");
        }
        if (!m3094i()) {
            sb2.append(" not recyclable(" + this.f5692m + Separators.RPAREN);
        }
        if ((this.f5689j & 512) != 0 || m3093h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f5680a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
