package p772h;

import kotlin.jvm.internal.AbstractC16544l;
import p909nm.C17677k;

/* JADX INFO: renamed from: h.E */
/* JADX INFO: loaded from: classes.dex */
public final class C14214E implements InterfaceC14221c {

    /* JADX INFO: renamed from: Y */
    public final AbstractC14242x f44639Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14215F f44640Z;

    public C14214E(C14215F c14215f, AbstractC14242x onBackPressedCallback) {
        AbstractC16544l.m18094g(onBackPressedCallback, "onBackPressedCallback");
        this.f44640Z = c14215f;
        this.f44639Y = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Bm.a, kotlin.jvm.internal.i] */
    @Override // p772h.InterfaceC14221c
    public final void cancel() {
        C14215F c14215f = this.f44640Z;
        C17677k c17677k = c14215f.f44642b;
        AbstractC14242x abstractC14242x = this.f44639Y;
        c17677k.remove(abstractC14242x);
        if (AbstractC16544l.m18089b(c14215f.f44643c, abstractC14242x)) {
            abstractC14242x.getClass();
            c14215f.f44643c = null;
        }
        abstractC14242x.f44697b.remove(this);
        ?? r6 = abstractC14242x.f44698c;
        if (r6 != 0) {
            r6.invoke();
        }
        abstractC14242x.f44698c = null;
    }
}
