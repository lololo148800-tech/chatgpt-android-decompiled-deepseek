package p588Y2;

import androidx.fragment.app.AbstractC11002c;
import androidx.navigation.AbstractC11122c;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p769gj.ViewOnAttachStateChangeListenerC14169k;
import p772h.AbstractC14242x;

/* JADX INFO: renamed from: Y2.A */
/* JADX INFO: loaded from: classes.dex */
public final class C9597A extends AbstractC14242x {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f28888d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f28889e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9597A(Object obj, int i10) {
        super(false);
        this.f28888d = i10;
        this.f28889e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p772h.AbstractC14242x
    /* JADX INFO: renamed from: a */
    public final void mo10143a() {
        switch (this.f28888d) {
            case 0:
                AbstractC11002c abstractC11002c = (AbstractC11002c) this.f28889e;
                abstractC11002c.m11815y(true);
                if (!abstractC11002c.f33191h.f44696a) {
                    abstractC11002c.f33190g.m15518c();
                } else {
                    abstractC11002c.m11776M();
                }
                break;
            case 1:
                ((ViewOnAttachStateChangeListenerC14169k) this.f28889e).f44552Z.invoke();
                break;
            case 2:
                ((AbstractC16546n) this.f28889e).invoke(this);
                break;
            default:
                ((AbstractC11122c) this.f28889e).m12196p();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C9597A(InterfaceC1436k interfaceC1436k, boolean z6) {
        super(z6);
        this.f28888d = 2;
        this.f28889e = (AbstractC16546n) interfaceC1436k;
    }
}
