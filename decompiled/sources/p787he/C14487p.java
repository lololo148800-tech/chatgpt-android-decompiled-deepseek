package p787he;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1126yd.C21446V;
import p315Me.C5328h;
import p315Me.C5333m;

/* JADX INFO: renamed from: he.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C14487p extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f45647Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14459O f45648Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f45649o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14487p(C14459O c14459o, String str, int i10) {
        super(1);
        this.f45647Y = i10;
        this.f45648Z = c14459o;
        this.f45649o0 = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f45647Y) {
            case 0:
                String it = (String) obj;
                AbstractC16544l.m18094g(it, "it");
                C5328h c5328h = (C5328h) this.f45648Z.f45507f.f17542d.get(new C5333m(this.f45649o0));
                if (c5328h != null) {
                    c5328h.f17529l = it;
                }
                break;
            default:
                C21446V it2 = (C21446V) obj;
                AbstractC16544l.m18094g(it2, "it");
                C5328h c5328h2 = (C5328h) this.f45648Z.f45507f.f17542d.get(new C5333m(this.f45649o0));
                if (c5328h2 != null) {
                    c5328h2.f17526i = it2.f68030o;
                }
                break;
        }
        return C17296C.f55119a;
    }
}
