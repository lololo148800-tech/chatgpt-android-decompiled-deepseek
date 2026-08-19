package p474T8;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.AbstractActivityC10817a;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.InterfaceC11110s;
import androidx.lifecycle.InterfaceC11112u;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p772h.C14215F;
import p772h.C14224f;

/* JADX INFO: renamed from: T8.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7273k implements InterfaceC11110s {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23055Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f23056Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f23057o0;

    public /* synthetic */ C7273k(Object obj, int i10, Object obj2) {
        this.f23055Y = i10;
        this.f23056Z = obj;
        this.f23057o0 = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        switch (this.f23055Y) {
            case 0:
                if (enumC11103l == ((EnumC11103l) this.f23056Z)) {
                    C7268f c7268f = (C7268f) this.f23057o0;
                    if (!AbstractC16544l.m18089b(c7268f.mo7726a(), C7271i.f23054a)) {
                        c7268f.m7730e();
                    }
                }
                break;
            case 1:
                if (enumC11103l == ((EnumC11103l) this.f23056Z)) {
                    for (C7268f c7268f2 : (List) this.f23057o0) {
                        if (!AbstractC16544l.m18089b(c7268f2.mo7726a(), C7271i.f23054a)) {
                            c7268f2.m7730e();
                        }
                    }
                }
                break;
            default:
                C14215F c14215f = (C14215F) this.f23056Z;
                AbstractActivityC10817a abstractActivityC10817a = (AbstractActivityC10817a) this.f23057o0;
                if (enumC11103l == EnumC11103l.ON_CREATE) {
                    OnBackInvokedDispatcher invoker = C14224f.f44664a.m15526a(abstractActivityC10817a);
                    AbstractC16544l.m18094g(invoker, "invoker");
                    c14215f.f44645e = invoker;
                    c14215f.m15519d(c14215f.f44647g);
                }
                break;
        }
    }
}
