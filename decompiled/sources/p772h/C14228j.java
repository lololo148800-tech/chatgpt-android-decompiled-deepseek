package p772h;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.AbstractActivityC10817a;
import com.auth0.android.request.internal.RunnableC11843b;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p474T8.C7273k;

/* JADX INFO: renamed from: h.j */
/* JADX INFO: loaded from: classes.dex */
public final class C14228j extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44678Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractActivityC10817a f44679Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14228j(AbstractActivityC10817a abstractActivityC10817a, int i10) {
        super(0);
        this.f44678Y = i10;
        this.f44679Z = abstractActivityC10817a;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f44678Y) {
            case 0:
                this.f44679Z.reportFullyDrawn();
                return C17296C.f55119a;
            case 1:
                AbstractActivityC10817a abstractActivityC10817a = this.f44679Z;
                return new C14236r(abstractActivityC10817a.f32066r0, new C14228j(abstractActivityC10817a, 0));
            default:
                AbstractActivityC10817a abstractActivityC10817a2 = this.f44679Z;
                C14215F c14215f = new C14215F(new RunnableC14222d(abstractActivityC10817a2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC16544l.m18089b(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC10817a2.f55801Y.mo7806a(new C7273k(c14215f, 2, abstractActivityC10817a2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC11843b(abstractActivityC10817a2, 6, c14215f));
                    }
                }
                return c14215f;
        }
    }
}
