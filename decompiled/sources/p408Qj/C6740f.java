package p408Qj;

import android.content.Context;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.C0295v;
import p049Bm.InterfaceC1441p;
import p544W9.AbstractC8718u;
import p769gj.C14183y;

/* JADX INFO: renamed from: Qj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6740f extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public static final C6740f f21642Y = new C6740f(4);

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C6742h initialRendering = (C6742h) obj;
        C14183y initialEnv = (C14183y) obj2;
        Context contextForNewView = (Context) obj3;
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        AbstractC16544l.m18094g(initialEnv, "initialEnv");
        AbstractC16544l.m18094g(contextForNewView, "contextForNewView");
        C6741g c6741g = new C6741g(contextForNewView, null, 0, 0);
        c6741g.setId(R.id.pi2_modal_container);
        c6741g.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC8718u.m9432a(c6741g, initialRendering, initialEnv, new C0295v(2, c6741g, C6741g.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 6));
        return c6741g;
    }
}
