package p772h;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11112u;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0283r;
import p909nm.C17677k;

/* JADX INFO: renamed from: h.F */
/* JADX INFO: loaded from: classes.dex */
public final class C14215F {

    /* JADX INFO: renamed from: a */
    public final Runnable f44641a;

    /* JADX INFO: renamed from: b */
    public final C17677k f44642b = new C17677k();

    /* JADX INFO: renamed from: c */
    public AbstractC14242x f44643c;

    /* JADX INFO: renamed from: d */
    public final OnBackInvokedCallback f44644d;

    /* JADX INFO: renamed from: e */
    public OnBackInvokedDispatcher f44645e;

    /* JADX INFO: renamed from: f */
    public boolean f44646f;

    /* JADX INFO: renamed from: g */
    public boolean f44647g;

    public C14215F(Runnable runnable) {
        this.f44641a = runnable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f44644d = i10 >= 34 ? C14212C.f44634a.m15515a(new C14243y(this, 0), new C14243y(this, 1), new C14244z(this, 0), new C14244z(this, 1)) : C14210A.f44629a.m15512a(new C14244z(this, 2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15516a(InterfaceC11112u owner, AbstractC14242x onBackPressedCallback) {
        AbstractC16544l.m18094g(owner, "owner");
        AbstractC16544l.m18094g(onBackPressedCallback, "onBackPressedCallback");
        AbstractC11105n abstractC11105nMo7809i = owner.mo7809i();
        if (abstractC11105nMo7809i.mo7807b() == EnumC11104m.f33474Y) {
            return;
        }
        onBackPressedCallback.f44697b.add(new C14213D(this, abstractC11105nMo7809i, onBackPressedCallback));
        m15520e();
        onBackPressedCallback.f44698c = new C0283r(0, this, C14215F.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 8);
    }

    /* JADX INFO: renamed from: b */
    public final void m15517b() {
        Object objPrevious;
        if (this.f44643c == null) {
            C17677k c17677k = this.f44642b;
            ListIterator<E> listIterator = c17677k.listIterator(c17677k.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((AbstractC14242x) objPrevious).f44696a);
        }
        this.f44643c = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m15518c() {
        Object objPrevious;
        AbstractC14242x abstractC14242x = this.f44643c;
        if (abstractC14242x == null) {
            C17677k c17677k = this.f44642b;
            ListIterator listIterator = c17677k.listIterator(c17677k.mo7371f());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((AbstractC14242x) objPrevious).f44696a);
            abstractC14242x = (AbstractC14242x) objPrevious;
        }
        this.f44643c = null;
        if (abstractC14242x != null) {
            abstractC14242x.mo10143a();
        } else {
            this.f44641a.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15519d(boolean z6) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f44645e;
        OnBackInvokedCallback onBackInvokedCallback = this.f44644d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C14210A c14210a = C14210A.f44629a;
        if (z6 && !this.f44646f) {
            c14210a.m15513b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f44646f = true;
        } else {
            if (z6 || !this.f44646f) {
                return;
            }
            c14210a.m15514c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f44646f = false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m15520e() {
        boolean z6 = this.f44647g;
        C17677k c17677k = this.f44642b;
        boolean z10 = false;
        if (!(c17677k instanceof Collection) || !c17677k.isEmpty()) {
            Iterator it = c17677k.iterator();
            while (it.hasNext()) {
                if (((AbstractC14242x) it.next()).f44696a) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f44647g = z10;
        if (z10 == z6 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m15519d(z10);
    }
}
