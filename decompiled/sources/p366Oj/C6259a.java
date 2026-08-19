package p366Oj;

import android.content.Context;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.C0295v;
import p049Bm.InterfaceC1441p;
import p544W9.AbstractC8718u;
import p769gj.C14183y;

/* JADX INFO: renamed from: Oj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6259a extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public static final C6259a f20349Y = new C6259a(4);

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C6263e initialRendering = (C6263e) obj;
        C14183y initialEnv = (C14183y) obj2;
        Context context = (Context) obj3;
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        AbstractC16544l.m18094g(initialEnv, "initialEnv");
        AbstractC16544l.m18094g(context, "context");
        C6262d c6262d = new C6262d(context);
        c6262d.setId(R.id.pi2_disableable_container);
        c6262d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC8718u.m9432a(c6262d, initialRendering, initialEnv, new C0295v(2, c6262d, C6262d.class, "update", "update(Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 5));
        return c6262d;
    }
}
