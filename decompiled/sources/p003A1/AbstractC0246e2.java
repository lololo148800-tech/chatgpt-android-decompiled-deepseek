package p003A1;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p650ui.platform.AndroidComposeView;
import com.openai.chatgpt.R;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p077Cn.C1743k;
import p1140z1.C21711p0;
import p349O0.AbstractC6025r;
import p349O0.C6029t;
import p523V9.AbstractC8017W3;
import p537W0.C8410b;
import p586Y0.AbstractC9562n;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: A1.e2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0246e2 {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f937a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX INFO: renamed from: a */
    public static final C0238c2 m815a(AbstractC0231b abstractC0231b, AbstractC6025r abstractC6025r, C8410b c8410b) {
        AndroidComposeView androidComposeView;
        C6029t c6029t;
        C0238c2 c0238c2;
        if (AbstractC0213V0.f810a.compareAndSet(false, true)) {
            C1743k c1743kM8337a = AbstractC8017W3.m8337a(1, 6, null);
            AbstractC0575H.m1156D(AbstractC0575H.m1174c((InterfaceC18776i) C0290t0.f1042x0.getValue()), null, null, new C0210U0(c1743kM8337a, null), 3);
            C0254h0 c0254h0 = new C0254h0(c1743kM8337a, 1);
            synchronized (AbstractC9562n.f28759b) {
                AbstractC9562n.f28765h = AbstractC17680n.m19362l0((Collection) AbstractC9562n.f28765h, c0254h0);
            }
            AbstractC9562n.m10077a();
        }
        if (abstractC0231b.getChildCount() > 0) {
            View childAt = abstractC0231b.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
            if (androidComposeView == null) {
                androidComposeView = new AndroidComposeView(abstractC0231b.getContext(), abstractC6025r.mo6490h());
                abstractC0231b.addView(androidComposeView.getView(), f937a);
            }
            c6029t = new C6029t(abstractC6025r, new C21711p0(androidComposeView.getRoot()));
            Object tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
            c0238c2 = tag instanceof C0238c2 ? (C0238c2) tag : null;
            if (c0238c2 == null) {
                c0238c2 = new C0238c2(androidComposeView, c6029t);
                androidComposeView.getView().setTag(R.id.wrapped_composition_tag, c0238c2);
            }
            c0238c2.m785a(c8410b);
            if (!AbstractC16544l.m18089b(androidComposeView.getCoroutineContext(), abstractC6025r.mo6490h())) {
                androidComposeView.setCoroutineContext(abstractC6025r.mo6490h());
            }
            return c0238c2;
        }
        abstractC0231b.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractC0231b.getContext(), abstractC6025r.mo6490h());
            abstractC0231b.addView(androidComposeView.getView(), f937a);
        }
        c6029t = new C6029t(abstractC6025r, new C21711p0(androidComposeView.getRoot()));
        Object tag2 = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof C0238c2) {
        }
        if (c0238c2 == null) {
            c0238c2 = new C0238c2(androidComposeView, c6029t);
            androidComposeView.getView().setTag(R.id.wrapped_composition_tag, c0238c2);
        }
        c0238c2.m785a(c8410b);
        if (!AbstractC16544l.m18089b(androidComposeView.getCoroutineContext(), abstractC6025r.mo6490h())) {
            androidComposeView.setCoroutineContext(abstractC6025r.mo6490h());
        }
        return c0238c2;
    }
}
